package com.codigodebarra.controller;

import com.codigodebarra.config.Disenio;
import com.codigodebarra.dao.ProductoDao;
import com.codigodebarra.dao.UsuarioDao;
import com.codigodebarra.dao.daoimpl.ProductoDaoImpl;
import com.codigodebarra.dao.daoimpl.UsuarioDaoImpl;
import com.codigodebarra.model.Producto;
import com.codigodebarra.model.Usuario;
import com.codigodebarra.util.ApiProductos;
import com.codigodebarra.util.Barras;
import com.codigodebarra.util.filtro.SoloNumero;
import com.codigodebarra.view.JInformacion;
import com.codigodebarra.view.JInterfazPrincipal;
import com.codigodebarra.view.JLogin;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AbstractDocument;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public final class PrincipalController implements ActionListener {

    JInterfazPrincipal vistaIp;
    JInformacion vistaInfo;
    ProductoDao productoDao;
    ApiProductos api;
    Producto productoGlobal;
    Usuario usuario;
    DefaultTableModel modelo, modeloDv, modeloDv2;
    int xMouse, yMouse, stockGlobal = 0;
    UsuarioDao usuarioDao;

    public PrincipalController(JInterfazPrincipal vistaIp, Usuario usuario) {
        this.vistaIp = vistaIp;
        //Se necesita que la vistaIp ya haya sida creada
        this.usuario = usuario;
        bienvenida(usuario);
        this.vistaIp.setVisible(true);
        this.vistaIp.setLocationRelativeTo(null);

        vistaInfo = new JInformacion(vistaIp, true);
        productoDao = new ProductoDaoImpl();
        api = new ApiProductos();
        Disenio.getDesignWindows();
        modelo = new DefaultTableModel();
        modeloDv = new DefaultTableModel();
        modeloDv2 = new DefaultTableModel();
        usuarioDao = new UsuarioDaoImpl();
        acciones();
    }

    public void acciones() {
        //Configuración en el TabbedPane y en el la barra para poder deslizar la ventana, e incluso la adioión de paneles
        configuracionTabbedPane();
        //Menu lateral - > paneles
        navegacionTabbedPane();
        //Tabla
        disenioTablaInventario();
        //Boton en info al encontrar el producto
        pnlAgregarOActualizaProducto();
        //Agregar producto
        gestionProductoIp();
        //Generar archivo PDF
        generarPdfProductos();

        vistaIp.getBtnOkEscanear().addActionListener(this);
        vistaInfo.getBtnCancelar().addActionListener(this);
        metodosDVenta();
    }

    /**
     * PANEL PRINCIPAL.
     */
    public void bienvenida(Usuario usuario) {
        vistaIp.getLblNombre().setText(String.format("%s, %s", usuario.getApellido(), usuario.getNombre()));
    }

    public void mostrarElementosEnTabla(List<Producto> listaProductos) {
        modelo.setRowCount(0);
        for (Producto p : listaProductos) {
            Object[] fila = {p.getCodBarra(), p.getNombre(), p.getMarca(), p.getCont(), p.getPrecio(), p.getStock()};
            modelo.addRow(fila);
        }
        vistaIp.getTxtValorProd().setText("");
    }

    /**
     * TABLA INVENTARIO.
     */
    private void disenioTablaInventario() {

        String[] tituloColumnas = {"Cod. Barra", "Nombre", "Marca", "Contenido", "Precio", "Cantidad"};

        //Poner nombre a las columnas de la tabla
        modelo.setColumnIdentifiers(tituloColumnas);

        vistaIp.getTablaProductos().setModel(modelo);

        /**
         * Se usa el new DefaultTableCellRenderer para crear un objeto que nos
         * permita modificar el diseño de las celdas de una tabla Se puede usar
         * solo el setDefautlRenderer para asignar un nuevo defaultTable de
         * manera que no necesite una configuración avanzada.
         *
         */
        vistaIp.getTablaProductos().getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {

            /**
             * En caso que haya limitaciones, o quisieses hacer algún metodo
             * dependiendo de la acción Se necesita sobreescribir este metodo
             * para hacer modificaciones Es una modificación más avanzada,
             * debido a la restricción que hay con el cambio de color, por el
             * opaque(null) -> Lo cual hace que el color del fondo no se muestre
             * por ser un label (Esa es la configuración de la renderización del
             * JLabel).
             */
            /**
             * Por lo tanto, el getTableCellRendererComponent, permite
             * personalizar de manera más específica, a parte de lo que
             * DefautlTableCellRenderer ofrece por defecto.
             */
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

                Component c = super.getTableCellRendererComponent(vistaIp.getTablaProductos(), value, isSelected, hasFocus, row, column);
                c.setBackground(new Color(70, 70, 70));
                c.setForeground(Color.WHITE);
                //Retorna el componente personalizado (el JLabel)
                return c;
            }
        });
        //==============

        vistaIp.getCbNombresColumnasProd().addItem("<Seleccione un campo>");
        //Ponemos los nombres de las columnas, al combobox para hacer busquedas
        for (String i : tituloColumnas) {
            vistaIp.getCbNombresColumnasProd().addItem(i);
        }

        //=============
        //Agregar elementos de la bd, a la tabla
        List<Producto> productos = productoDao.selectAll();

        mostrarElementosEnTabla(productos);
        //============= Referencia: ComboBox y TextField de busqueda
        informacionBusqueda();
        limpiarSeleccionFilaTablaClicPanel();
        //Hacer que se limpie las filas de la tabla que se encontraba seleccionada, al hacer clic en los distintos paneles
    }

    public void limpiarSeleccionFilaTablaClicPanel() {
        vistaIp.getjPanel4().addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                vistaIp.getTablaProductos().clearSelection();
            }
        });
        vistaIp.getPanelInventario().addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                vistaIp.getTablaProductos().clearSelection();
            }
        });
        vistaIp.getPnlTablaProductos().addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                vistaIp.getTablaProductos().clearSelection();
            }
        });
    }

    public void generarPdfProductos() {
        vistaIp.getLblPdfProd().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Obtener el archivo jasper configurado
                JasperPrint jp = productoDao.reportAllProducts();
                //Codigo para que al cerrar la visualización no se cierre todo el sistema.
                JasperViewer viewReport = new JasperViewer(jp, false);
                viewReport.setDefaultCloseOperation(vistaIp.DISPOSE_ON_CLOSE);
                viewReport.setVisible(true);
            }
        });
    }

    public void informacionBusqueda() {
        vistaIp.getPnlBuscarProd().addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                List<Producto> productos = productoDao.selectAll();
                int nombreColumna = vistaIp.getCbNombresColumnasProd().getSelectedIndex();

                switch (nombreColumna) {
                    case 0 -> {
                        JOptionPane.showMessageDialog(null, "Seleccione un campo que sea valido");
                        mostrarElementosEnTabla(productos);
                    }
                    case 1 -> {
                        Producto p = null;
                        if (vistaIp.getTxtValorProd().getText() == null || vistaIp.getTxtValorProd().getText().equals("")) {
                            modelo.setNumRows(0);
                        } else {
                            p = productoDao.findByCodeProduct(vistaIp.getTxtValorProd().getText());
                            modelo.setNumRows(0);
                            Object[] fila = {p.getCodBarra(), p.getNombre(), p.getMarca(), p.getCont(), p.getPrecio(), p.getStock()};
                            modelo.addRow(fila);
                        }
                    }
                    case 2 -> {
                        List<Producto> listaProductos = productoDao.findByName(vistaIp.getTxtValorProd().getText());
                        mostrarElementosEnTabla(listaProductos);
                    }
                    case 3 -> {
                        List<Producto> listaProductos = productoDao.findByBrand(vistaIp.getTxtValorProd().getText());
                        mostrarElementosEnTabla(listaProductos);
                    }
                    case 4 -> {
                        List<Producto> listaProductos = productoDao.findByContent(vistaIp.getTxtValorProd().getText());
                        mostrarElementosEnTabla(listaProductos);
                    }
                    case 5 -> {
                        List<Producto> listaProductos = productoDao.findByPrice(vistaIp.getTxtValorProd().getText());
                        mostrarElementosEnTabla(listaProductos);
                    }
                    case 6 -> {
                        List<Producto> listaProductos = productoDao.findByQuantity(vistaIp.getTxtValorProd().getText());
                        mostrarElementosEnTabla(listaProductos);
                    }
                    default -> {
                        mostrarElementosEnTabla(productos);
                    }
                }
            }
        });
    }

    //True -> Panel agregar de GP
    //False -> Los demás paneles de GP
    public void alternarPanelesGP(boolean valor) {
        vistaIp.getPnlAgregarGP().setEnabled(valor);
        vistaIp.getTxtCodBarraGP().setEditable(valor);
        vistaIp.getPnlActualizarGP().setEnabled(!valor);
        vistaIp.getPnlEliminarGP().setEnabled(!valor);
        vistaIp.getPnlLimpiarGP().setEnabled(!valor);

        if (valor == true) {
            vistaIp.getPnlAgregarGP().setBackground(new Color(255, 255, 255));
            vistaIp.getPnlActualizarGP().setBackground(new Color(200, 200, 200));
            vistaIp.getPnlEliminarGP().setBackground(new Color(200, 200, 200));
            vistaIp.getPnlLimpiarGP().setBackground(new Color(200, 200, 200));
            limpiezaTextFieldsGP();
        } else {
            vistaIp.getPnlAgregarGP().setBackground(new Color(200, 200, 200));
            vistaIp.getPnlActualizarGP().setBackground(new Color(255, 255, 255));
            vistaIp.getPnlEliminarGP().setBackground(new Color(255, 255, 255));
            vistaIp.getPnlLimpiarGP().setBackground(new Color(255, 255, 255));
        }
    }

    public void alternarPanelesDv(boolean valor) {
        vistaIp.getPnlLimpiarDv().setEnabled(valor);
        vistaIp.getPnlAgregarDv().setEnabled(valor);
        //vistaIp.getTxtCodBarraGP().setEditable(valor);
        vistaIp.getPnlActualizarDv().setEnabled(!valor);
        vistaIp.getPnlEliminarDv().setEnabled(!valor);

        if (valor == true) {
            vistaIp.getPnlAgregarDv().setBackground(new Color(255, 255, 255));
            vistaIp.getPnlActualizarDv().setBackground(new Color(200, 200, 200));
            vistaIp.getPnlEliminarDv().setBackground(new Color(200, 200, 200));
            vistaIp.getPnlLimpiarDv().setBackground(new Color(255, 255, 255));

            limpiezaTextFieldsGP();
        } else {
            vistaIp.getPnlAgregarDv().setBackground(new Color(200, 200, 200));
            vistaIp.getPnlActualizarDv().setBackground(new Color(255, 255, 255));
            vistaIp.getPnlEliminarDv().setBackground(new Color(255, 255, 255));
            vistaIp.getPnlLimpiarDv().setBackground(new Color(200, 200, 200));
        }
    }

    public void gestionProductoIp() {
        //Por default, los paneles en la gestión de producto deben estar así
        alternarPanelesGP(true);

        MouseAdapter ma = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent ev) {
                String codigoB = vistaIp.getTxtCodBarraGP().getText();

                //Lógica para agregar producto
                if (!codigoB.isEmpty()) {
                    if (productoDao.findByCodeProduct(codigoB) == null) {
                        String nombreP = vistaIp.getTxtNombreGP().getText();
                        String marcaP = vistaIp.getTxtMarcaGP().getText();
                        String contenidoP = vistaIp.getTxtContenidoGP().getText();
                        double precioP = ((Number) vistaIp.getSpnPrecioGP().getValue()).doubleValue();
                        int cantidadP = (int) vistaIp.getSpnCantidadGP().getValue();

                        Producto p = new Producto();
                        p.setCodBarra(codigoB);
                        p.setNombre(nombreP);
                        p.setMarca(marcaP);
                        p.setCont(contenidoP);
                        p.setPrecio(precioP);
                        p.setStock(cantidadP);

                        if (productoDao.insert(p) != 0) {
                            System.out.println("Se agregó exitosamente");
                        } else {
                            System.out.println("Error en la inserción del producto, desde GP");
                        }
                        List<Producto> productos = productoDao.selectAll();
                        mostrarElementosEnTabla(productos);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se aceptan códigos de barras duplicados");
                    }
                    limpiezaTextFieldsGP();
                } else {
                    JOptionPane.showMessageDialog(null, "Agregue un valor para el código de barra");
                }

            }
        }; // Fin del mouseAdapter
        vistaIp.getPnlAgregarGP().addMouseListener(ma);

        //Esta logica funcionará si en todo cas se selecciona o se deselecciona una fila de la tabla
        vistaIp.getTablaProductos().getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            //Se ejecutará cuando escuche un cambio en la tabla
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {

                    int fila = vistaIp.getTablaProductos().getSelectedRow();

                    //Si en caso selecciona una fila
                    if (fila != -1) {

                        alternarPanelesGP(false);
                        vistaIp.getPnlAgregarGP().removeMouseListener(ma);

                        String codBarra = mostrarValoresFilaSelecionada(fila);
                        //============================================================
                        //Metodos accion
                        //============================================================
                        /**
                         * Cada vez que se seleccione una fila de la tabla, se
                         * ejecuta el valueChanged, creandose así varios
                         * mouseListener, esto dependiendo de la cantidad de
                         * veces que seleccione las filas de la tabla.
                         */
                        /**
                         * Para ello, se tienen que eliminar todos los
                         * mouseListener creados, para solo tener uno solo, al
                         * momento de realizar el click al panel que desee.
                         */
                        //1. Eliminar
                        for (MouseListener ml : vistaIp.getPnlEliminarGP().getMouseListeners()) {
                            vistaIp.getPnlEliminarGP().removeMouseListener(ml);
                        }
                        vistaIp.getPnlEliminarGP().addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent ev) {
                                int fila = vistaIp.getTablaProductos().getSelectedRow();
                                if (fila != -1) {
                                    modelo.removeRow(fila);
                                    if (productoDao.deleteByCodeBar(codBarra)) {
                                        System.out.println("Elemento eliminado");
                                    } else {
                                        System.out.println("Fila no eliminada");
                                    }
                                }
                            }
                        });
                        // 2. Limpiar
                        for (MouseListener ml : vistaIp.getPnlLimpiarGP().getMouseListeners()) {
                            vistaIp.getPnlLimpiarGP().removeMouseListener(ml);
                        }
                        vistaIp.getPnlLimpiarGP().addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent ev) {
                                limpiezaTextFieldsGP();
                            }
                        });

                        // 3. Actualizar
                        for (MouseListener ml : vistaIp.getPnlActualizarGP().getMouseListeners()) {
                            vistaIp.getPnlActualizarGP().removeMouseListener(ml);
                        }

                        vistaIp.getPnlActualizarGP().addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent ev) {
                                //Código de actualizar
                                int fila = vistaIp.getTablaProductos().getSelectedRow();
                                if (fila > -1) {

                                    try {
                                        //Forzar a que se utilice el valor escrito manualmente (textField)
                                        vistaIp.getSpnCantidadGP().commitEdit();
                                        vistaIp.getSpnPrecioGP().commitEdit();
                                    } catch (ParseException pe) {
                                        pe.printStackTrace();
                                    }

                                    modelo.setValueAt(vistaIp.getTxtNombreGP().getText(), fila, 1);
                                    modelo.setValueAt(vistaIp.getTxtMarcaGP().getText(), fila, 2);
                                    modelo.setValueAt(vistaIp.getTxtContenidoGP().getText(), fila, 3);
                                    modelo.setValueAt(vistaIp.getSpnPrecioGP().getValue(), fila, 4);
                                    modelo.setValueAt(((Number) vistaIp.getSpnCantidadGP().getValue()).intValue(), fila, 5);

                                    Producto p = new Producto();
                                    p.setCodBarra(vistaIp.getTxtCodBarraGP().getText());
                                    p.setNombre(vistaIp.getTxtNombreGP().getText());
                                    p.setMarca(vistaIp.getTxtMarcaGP().getText());
                                    p.setCont(vistaIp.getTxtContenidoGP().getText());
                                    p.setStock(((Number) vistaIp.getSpnCantidadGP().getValue()).intValue());
                                    p.setPrecio(((Number) vistaIp.getSpnPrecioGP().getValue()).doubleValue());

                                    productoDao.updateByCodeBar(p);

                                    /**
                                     * Se tiene que deseleccionar la fila de la
                                     * tabla despues de haber realizado la
                                     * acción de actualizar o de eliminar.
                                     */
                                    JOptionPane.showMessageDialog(null, "Producto actualizado");
                                    vistaIp.getTablaProductos().clearSelection();
                                    limpiezaTextFieldsGP();
                                }

                            }
                        }
                        );

                    } else {
                        alternarPanelesGP(true);
                        //Agregar producto
                        vistaIp.getPnlAgregarGP().addMouseListener(ma);
                    } //Fin en caso se seleccione o no una fila de la tabla
                }
            }//Fin del ValueChanged
        }
        );

    } // Fin de la GP

    public String mostrarValoresFilaSelecionada(int fila) {
        String codBarra = (String) vistaIp.getTablaProductos().getValueAt(fila, 0);
        String nombre = (String) vistaIp.getTablaProductos().getValueAt(fila, 1);
        String marca = (String) vistaIp.getTablaProductos().getValueAt(fila, 2);
        String contenido = (String) vistaIp.getTablaProductos().getValueAt(fila, 3);
        double precio = ((Number) vistaIp.getTablaProductos().getValueAt(fila, 4)).doubleValue();
        int cantidad = ((Number) vistaIp.getTablaProductos().getValueAt(fila, 5)).intValue();

        Producto pr = new Producto();
        //Mostrar valores en los textFields
        vistaIp.getTxtCodBarraGP().setText(codBarra);
        vistaIp.getTxtNombreGP().setText(nombre);
        vistaIp.getTxtMarcaGP().setText(marca);
        vistaIp.getTxtContenidoGP().setText(contenido);
        vistaIp.getSpnPrecioGP().setValue(precio);
        vistaIp.getSpnCantidadGP().setValue(cantidad);

        return codBarra;
    }

    /**
     * ESCANEAR CODIGO.
     *
     * @throws java.net.MalformedURLException
     */
    public void escanearCodigo() throws MalformedURLException {
        Producto productoApi = api.consumirApi(vistaIp.getTxtCodigoEscanear().getText());
        Producto producto_bd = productoDao.findByCodeProduct(vistaIp.getTxtCodigoEscanear().getText());

        if (productoApi.getCodBarra() != null) {

            System.out.println("Funciono la api");

            /*Si no hay info en la Api, pue bueno analicemos la bd, sino existe la bd entonces '--'*/
            condicionalBrindarDatosProductoApiOBd(productoApi, producto_bd);

            //Se va a consultar en el daoProducto para ver si existe o no en la base de datos
            //Separar la lógica si existe o no el producto en la base de datos
            if (producto_bd != null) {
                System.out.println("Si existe en la base de datos");
                vistaInfo.getLblPreguntar().setText("El producto ya está almacenado. ¿Desea aumentar su cantidad?");
                vistaInfo.getBtnAceptar().setActionCommand("aumentar");
                this.productoGlobal = producto_bd;
            } else {
                System.out.println("No existe en la base de datos");
                vistaInfo.getLblPreguntar().setText("El producto es nuevo. ¿Desea agregarlo?");
                vistaInfo.getBtnAceptar().setActionCommand("agregar");

                this.productoGlobal = productoApi;
            }
            vistaInfo.getLblCodigoBarra().setText(productoApi.getCodBarra());
            vistaInfo.setLocationRelativeTo(null);
            vistaInfo.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el producto");
            System.out.println("No funciono la api");
        }

        vistaIp.getTxtCodigoEscanear().setText("");
    }

    /**
     * CONFIGURACIÓN GENERAL.
     */
    public void popMenuVenta() {
        //Se crean los items
        JMenuItem gDetallePedido = new JMenuItem("Gestionar Detalle de Venta");
        JMenuItem pedidos = new JMenuItem("Ver Ventas");

        //Se agregan al popmenu
        vistaIp.getPmVenta().add(gDetallePedido);
        vistaIp.getPmVenta().add(pedidos);

        //Se agrega al componente el cual al hacer clic derecho mostrará el popmenu con los items
        vistaIp.getPnlVenta().setComponentPopupMenu(vistaIp.getPmVenta());

        vistaIp.getPnlVenta().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                if (e.getButton() == MouseEvent.BUTTON1 || e.getButton() == MouseEvent.BUTTON3) {
                    vistaIp.getPmVenta().show(e.getComponent(), e.getX(), e.getY());
                }
            }

            @Override
            public void mouseEntered(MouseEvent event) {
                vistaIp.getPnlVenta().setBackground(new Color(220, 220, 220));
            }

            @Override
            public void mouseExited(MouseEvent event) {
                vistaIp.getPnlVenta().setBackground(new Color(255, 255, 255));
            }
        });

        //Acciones de los items
        gDetallePedido.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaIp.getjTabbedPane1().setSelectedIndex(3);
            }
        });

        pedidos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaIp.getjTabbedPane1().setSelectedIndex(4);
                mostrarElementosEnTabla(productoDao.selectAll());
            }
        });
    }

    public void popMenuInventario() {
        //Se crean los items
        JMenuItem escanearProducto = new JMenuItem("Escanear Producto");
        JMenuItem controlInventario = new JMenuItem("Gestionar Inventario");

        //Se agregan al popmenu
        vistaIp.getPmInventario().add(escanearProducto);
        vistaIp.getPmInventario().add(controlInventario);

        //Se agrega al componente el cual al hacer clic derecho mostrará el popmenu con los items
        vistaIp.getPnlInventario().setComponentPopupMenu(vistaIp.getPmInventario());
        //Configurar para mostrar el popmenu con el clic izquierdo y derecho
        vistaIp.getPnlInventario().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                if (e.getButton() == MouseEvent.BUTTON1 || e.getButton() == MouseEvent.BUTTON3) {
                    vistaIp.getPmInventario().show(e.getComponent(), e.getX(), e.getY());
                }
            }

            @Override
            public void mouseEntered(MouseEvent event) {
                vistaIp.getPnlInventario().setBackground(new Color(220, 220, 220));
            }

            @Override
            public void mouseExited(MouseEvent event) {
                vistaIp.getPnlInventario().setBackground(new Color(255, 255, 255));
            }
        });
        //Acciones de los items
        escanearProducto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaIp.getjTabbedPane1().setSelectedIndex(1);
            }
        });
        controlInventario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaIp.getjTabbedPane1().setSelectedIndex(2);
                mostrarElementosEnTabla(productoDao.selectAll());
            }
        });
    }

    private void ocultarPestaniasTdP(JTabbedPane tbdPane) {
        tbdPane.setUI(new javax.swing.plaf.basic.BasicTabbedPaneUI() {
            @Override
            protected int calculateTabAreaHeight(int tabPlacement, int runCount, int maxTabHeight) {
                return 0; // Ocultar las pestañas
            }
        });
    }

    private void configuracionTabbedPane() {
        //Ocultar las pestañas del TabbedPane
        ocultarPestaniasTdP(vistaIp.getjTabbedPane1());
        //Barra superior
        vistaIp.getPnlBarraDeOpciones().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent event) {
                xMouse = event.getX();
                yMouse = event.getY();
            }
        });

        vistaIp.getPnlBarraDeOpciones().addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent event) {
                int x = event.getXOnScreen();
                int y = event.getYOnScreen();

                vistaIp.setLocation(x - xMouse, y - yMouse);
            }
        });

        vistaIp.getPnlXLogin().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas cerrar sesión?");
                if (respuesta == 0) {
                    vistaIp.dispose();
                    JLogin login = new JLogin();
                    LoginController lc = new LoginController(login);
                }
            }

            @Override
            public void mouseEntered(MouseEvent event) {
                vistaIp.getPnlXLogin().setBackground(new Color(254, 57, 57));
            }

            @Override
            public void mouseExited(MouseEvent event) {
                vistaIp.getPnlXLogin().setBackground(new Color(51, 51, 51));
            }
        });

        vistaIp.getPnlFSLogin().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                if (vistaIp.getExtendedState() != vistaIp.MAXIMIZED_BOTH) {
                    vistaIp.setExtendedState(vistaIp.MAXIMIZED_BOTH);
//                  vistaLogin.getPnlAll().setMaximumSize(vistaLogin.getMaximumSize());
                } else {
                    vistaIp.setExtendedState(vistaIp.NORMAL);
                }
            }

            @Override
            public void mouseEntered(MouseEvent event) {
                vistaIp.getPnlFSLogin().setBackground(new Color(95, 92, 93));
            }

            @Override
            public void mouseExited(MouseEvent event) {
                vistaIp.getPnlFSLogin().setBackground(new Color(51, 51, 51));
            }
        });

        vistaIp.getPnlMinusLogin().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                if ((vistaIp.getExtendedState() == vistaIp.NORMAL) || (vistaIp.getExtendedState() == vistaIp.MAXIMIZED_BOTH)) {
                    vistaIp.setExtendedState(vistaIp.HIDE_ON_CLOSE);
                }
            }

            @Override
            public void mouseEntered(MouseEvent event) {
                vistaIp.getPnlMinusLogin().setBackground(new Color(95, 92, 93));
            }

            @Override
            public void mouseExited(MouseEvent event) {
                vistaIp.getPnlMinusLogin().setBackground(new Color(51, 51, 51));
            }

        });
    }

    private void navegacionTabbedPane() {
        vistaIp.getPnlPrincipal().addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent event) {
                vistaIp.getjTabbedPane1().setSelectedIndex(0);
            }

            @Override
            public void mouseEntered(MouseEvent event) {
                vistaIp.getPnlPrincipal().setBackground(new Color(220, 220, 220));
            }

            @Override
            public void mouseExited(MouseEvent event) {
                vistaIp.getPnlPrincipal().setBackground(new Color(255, 255, 255));
            }
        });
        popMenuInventario();
        popMenuVenta();

        vistaIp.getPnlCerrarSesion().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {

                int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas cerrar sesión?");
                /**
                 * -1: Clic en la x | 0: Si | 1: Cancelar | 2: No
                 */
                if (respuesta == 0) {
                    vistaIp.dispose();
                    JLogin login = new JLogin();
                    LoginController lc = new LoginController(login);
                }
            }

            @Override
            public void mouseEntered(MouseEvent event) {
                vistaIp.getPnlCerrarSesion().setBackground(new Color(220, 220, 220));
            }

            @Override
            public void mouseExited(MouseEvent event) {
                vistaIp.getPnlCerrarSesion().setBackground(new Color(255, 255, 255));
            }
        });
    }

    public void limpiezaTextFieldsGP() {
        vistaIp.getTxtCodBarraGP().setText("");
        vistaIp.getTxtNombreGP().setText("");
        vistaIp.getTxtMarcaGP().setText("");
        vistaIp.getTxtContenidoGP().setText("");
        vistaIp.getSpnPrecioGP().setValue(0);
        vistaIp.getSpnCantidadGP().setValue(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaIp.getCheckBoxDescuentoDv()) {
            if (vistaIp.getCheckBoxDescuentoDv().isSelected()) {
                vistaIp.getTxtDescuentoDv().setEditable(true);
            } else {
                vistaIp.getTxtDescuentoDv().setEditable(false);
            }
        }
        if (e.getSource() == vistaIp.getCbInfoProduDv()) {

            mostrarInfoCb(vistaIp.getCbInfoProduDv().getSelectedItem());

        }
        if (e.getSource() == vistaIp.getBtnOkEscanear()) {

            try {
                escanearCodigo();
            } catch (MalformedURLException ex) {
                Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //
        if (e.getSource() == vistaInfo.getBtnCancelar()) {
            vistaInfo.dispose();
        }
        if (e.getSource() == vistaIp.getRbFactura() || e.getSource() == vistaIp.getRbFactura1()) {
            vistaIp.getTbpTablaDv().setSelectedIndex(2);
            int rpta = JOptionPane.showConfirmDialog(null, "¿Desear realizar una factura?");
            if (rpta == JOptionPane.NO_OPTION) {
                vistaIp.getTbpTablaDv().setSelectedIndex(0);
                vistaIp.getSeleccionTVenta().clearSelection();
            } else if (rpta == JOptionPane.CANCEL_OPTION) {
                vistaIp.getTbpTablaDv().setSelectedIndex(0);
                vistaIp.getSeleccionTVenta().clearSelection();
            } else if (rpta == JOptionPane.CLOSED_OPTION) {
                vistaIp.getTbpTablaDv().setSelectedIndex(0);
                vistaIp.getSeleccionTVenta().clearSelection();
            } else {
                vistaIp.getLblDinamiTipoVenta().setText("Tipo de venta seleccionado");
                vistaIp.getRbFactura1().setSelected(true);
                vistaIp.getRbFactura1().setEnabled(false);
                vistaIp.getRbBoleta1().setSelected(false);
                vistaIp.getRbBoleta1().setEnabled(false);
            }
        }
        if (e.getSource() == vistaIp.getRbBoleta() || e.getSource() == vistaIp.getRbBoleta1()) {
            vistaIp.getTbpTablaDv().setSelectedIndex(1);
            int rpta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar una boleta?");

            if (rpta == JOptionPane.NO_OPTION) {
                vistaIp.getTbpTablaDv().setSelectedIndex(0);
                vistaIp.getSeleccionTVenta().clearSelection();
            } else if (rpta == JOptionPane.CANCEL_OPTION) {
                vistaIp.getTbpTablaDv().setSelectedIndex(0);
                vistaIp.getSeleccionTVenta().clearSelection();
            } else if (rpta == JOptionPane.CLOSED_OPTION) {
                vistaIp.getTbpTablaDv().setSelectedIndex(0);
                vistaIp.getSeleccionTVenta().clearSelection();
            } else {
                vistaIp.getLblDinamiTipoVenta().setText("Tipo de venta seleccionado");
                vistaIp.getRbBoleta1().setSelected(true);
                vistaIp.getRbBoleta1().setEnabled(false);
                vistaIp.getRbFactura1().setSelected(false);
                vistaIp.getRbFactura1().setEnabled(false);
            }
        }
    }

    public void obtenerPDF() {
        Barras ba = new Barras();
        List<Producto> productos = productoDao.selectAll();
        System.out.println(productos);
        for (Producto ps : productos) {
            ba.generarCodBarras(ps.getCodBarra(), "EAN-13");
        }
    }

    /**
     * VISTA INFO.
     */
    public void pnlAgregarOActualizaProducto() {
        vistaInfo.getBtnAceptar().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //Ayudará a separar la lógica del botón
                String command = e.getActionCommand();
                if (command.equals("aumentar")) {
                    int cantidadActualizada = productoDao.updateQuantityAfterInsert(productoGlobal.getIdProducto());
                    vistaInfo.getTxtCantidadProd().setText(String.valueOf(cantidadActualizada));

                    JOptionPane.showMessageDialog(null, "Cantidad incrementada con éxito");
                } else if (command.equals("agregar")) {
                    System.out.println("Se va a agregar");

                    /**
                     * El productoGlobal trae el objeto producto seteado con los
                     * valores obtenidos de la API y se muestra en los
                     * TextFields, pero en todo caso devuelve valores nulos, se
                     * evalua con la bd (bueno eso es otra historia). Lo que
                     * pasa es que se está trayendo los valores de la API
                     * incluso con los valores vacíos, por ende se debe de leer
                     * los texFields, cuando se de en el botón de agregar, para
                     * setear los cambios del productoGobal y crear el producto.
                     *
                     */
                    productoGlobal.setNombre(vistaInfo.getTxtNombreProd().getText());
                    productoGlobal.setMarca(vistaInfo.getTxtMarcaProd().getText());
                    productoGlobal.setCont(vistaInfo.getTxtContenidoProd().getText());

                    int idObtenido = productoDao.insert(productoGlobal);

                    if (idObtenido > 0) {
                        productoDao.updateQuantityAfterInsert(idObtenido);
                        JOptionPane.showMessageDialog(null, "Producto agregado con éxito");
                        vistaInfo.dispose();
                    } else {
                        System.out.println("No se agregó");
                    }
                }
            }
        });
    }

    public void cargarImagenPorURL(String url_imagen) throws MalformedURLException {
        URL url = new URL(url_imagen);

        // Cargar la imagen desde la URL
        ImageIcon imagen = new ImageIcon(url);

        // Redimensionar la imagen
        Image img = imagen.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        //Volver a crear la imagen pero con la escala actualizada
        imagen = new ImageIcon(img);

        // Asignar la imagen al JLabel
        vistaInfo.getLblImagen().setIcon(imagen);
        vistaInfo.getLblImagen().setText("");
    }

    public void condicionalBrindarDatosProductoApiOBd(Producto productoApi, Producto producto_bd) throws MalformedURLException {
        //Corregir porque a la primera llamada aparecen los text field con --
        if (productoApi.getNombre().isEmpty()) {

            if (producto_bd == null) {
                vistaInfo.getTxtNombreProd().setEditable(true);
                vistaInfo.getTxtNombreProd().setText("--");
            } else {
                vistaInfo.getTxtNombreProd().setEditable(false);
                vistaInfo.getTxtNombreProd().setText(producto_bd.getNombre());
            }
        } else {
            vistaInfo.getTxtNombreProd().setEditable(false);

            if (producto_bd == null) {
                vistaInfo.getTxtNombreProd().setText(productoApi.getNombre());
            } else {
                //Si el producto existe en la api pero, hice alguna actualizacion entonces traeme de la bd
                vistaInfo.getTxtNombreProd().setText(producto_bd.getNombre());
            }
        }

        //==========================================
        //Si en caso el producto no retorna el nombre de la compania
        if (productoApi.getMarca().isEmpty()) {
            if (producto_bd == null) {
                vistaInfo.getTxtMarcaProd().setEditable(true);
                vistaInfo.getTxtMarcaProd().setText("--");
            } else {
                vistaInfo.getTxtMarcaProd().setEditable(false);
                vistaInfo.getTxtMarcaProd().setText(producto_bd.getNombre());
            }
        } else {
            //Si en caso se haga cambios al resultado dado de la API
            vistaInfo.getTxtMarcaProd().setEditable(false);
            if (producto_bd == null) {
                vistaInfo.getTxtMarcaProd().setText(productoApi.getMarca());
            } else {
                vistaInfo.getTxtMarcaProd().setText(producto_bd.getMarca());
            }
        }

        if (productoApi.getCont().isEmpty()) {

            if (producto_bd == null) {
                vistaInfo.getTxtContenidoProd().setEditable(true);
                vistaInfo.getTxtContenidoProd().setText("--");
            } else {
                vistaInfo.getTxtContenidoProd().setEditable(false);
                vistaInfo.getTxtContenidoProd().setText(producto_bd.getCont());
            }
        } else {
            vistaInfo.getTxtContenidoProd().setEditable(false);
            if (producto_bd == null) {
                vistaInfo.getTxtContenidoProd().setText(productoApi.getCont());
            } else {
                vistaInfo.getTxtContenidoProd().setText(producto_bd.getCont());
            }
        }
        //Esto es así porque no se hace una consulta directa a la API para obtener la cantidad del producto (stock)
        vistaInfo.getTxtCantidadProd().setEditable(false);
        if (producto_bd == null) {
            vistaInfo.getTxtCantidadProd().setText("0");
        } else {
            vistaInfo.getTxtCantidadProd().setText(String.valueOf(producto_bd.getStock()));
        }

        //vistaInfo.getTxtAreaInformacion().setText(sb.toString());
        //Almacenamos en la variable global para ver los cambios al actualizar
        //this.textAreaInfo = sb;
        if (productoApi.getImagenUrl() != null) {
            if (producto_bd == null) {
                cargarImagenPorURL(productoApi.getImagenUrl());
            } else {
                cargarImagenPorURL(producto_bd.getImagenUrl());
            }
        } else {
            if (producto_bd == null) {
                vistaInfo.getLblImagen().setText("Imagen no encontrada");
            } else {
                vistaInfo.getLblImagen().setText(producto_bd.getImagenUrl());
            }
        }
    }

    public void metodosDVenta() {
        disenioTablaDVenta();
        mostrarValoresSwingComponents();
    }

    public void disenioTablaDVenta() {
        String[] nombreColumnas = {"Cód. Barra", "Nombre", "Marca", "Cont.", "Precio", "Cant.", "Importe", "Desc.", "Subtotal"};
        modeloDv.setColumnIdentifiers(nombreColumnas);
        vistaIp.getTablaDetalleVenta().setModel(modeloDv);

        String[] nombreColumnas2 = {"Cód. Barra", "Nombre", "Marca", "Cont.", "Precio Sin IGV", "Cant.", "Importe sin IGV", "IGV", "Importe con IGV", "Desc.", "Subtotal con desc."};
        modeloDv2.setColumnIdentifiers(nombreColumnas2);
        vistaIp.getTablaDv2().setModel(modeloDv2);
    }

    public void actualizarHora(DateTimeFormatter formatoHora) {
        vistaIp.getLblHora().setText(String.valueOf(LocalTime.now().format(formatoHora)));
    }

    public void operacionesDv() {
        vistaIp.getPnlAgregarDv().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (vistaIp.getRbBoleta().isSelected()) {

                    if (vistaIp.getCbInfoProduDv().getSelectedItem() != null && vistaIp.getCbInfoProduDv().getSelectedItem() != "<Seleccione info producto>") {

                        String desc = "0";

                        try {
                            vistaIp.getSpnCantidadDv().commitEdit();
                        } catch (ParseException pe) {
                            pe.getMessage();
                        }

                        if (vistaIp.getCheckBoxDescuentoDv().isSelected()) {
                            if (!vistaIp.getTxtDescuentoDv().equals("")) {
                                desc = vistaIp.getTxtDescuentoDv().getText();
                            }
                        }

                        String[] retInfo = obtenerInfoCbInfoProdu();
                        Producto p = productoDao.findSpecificByNameBrandContent(retInfo[0], retInfo[1], retInfo[2]);

                        String precio = String.valueOf(p.getPrecio());
                        String cant = String.valueOf(vistaIp.getSpnCantidadDv().getValue());
                        String codBarra = p.getCodBarra();
                        double importe = p.getPrecio() * Double.parseDouble(vistaIp.getSpnCantidadDv().getValue().toString());
                        //----
                        Object[] filaTdetV = {codBarra, retInfo[0], retInfo[1], retInfo[2], precio, cant, String.valueOf(importe), desc, importe - Double.parseDouble(desc)};

                        modeloDv.addRow(filaTdetV);
                        vistaIp.getTablaDetalleVenta().setModel(modeloDv);
                        limpiezaTextFieldDv();
                        double importeT = 0;
                        double descT = 0;
                        //Falta el total
                        for (int i = 0; i < vistaIp.getTablaDetalleVenta().getRowCount(); i++) {
                            importeT += Double.parseDouble(vistaIp.getTablaDetalleVenta().getValueAt(i, 6).toString());
                            descT += Double.parseDouble(vistaIp.getTablaDetalleVenta().getValueAt(i, 7).toString());
                        }
                        BigDecimal impTbd = new BigDecimal(String.valueOf(importeT));
                        BigDecimal descTbd = new BigDecimal(String.valueOf(descT));

                        vistaIp.getTxtImpTotalDv().setText(String.valueOf(impTbd));
                        vistaIp.getTxtDescuentoTotalDv().setText(String.valueOf(descTbd));
                        double totalDv = importeT - descT;
                        BigDecimal totalDvbd = new BigDecimal(String.valueOf(totalDv));
                        vistaIp.getTxtTotalPagarDv().setText(String.valueOf(totalDvbd));
                    }
                } else if (vistaIp.getRbFactura().isSelected()) {
                    if (vistaIp.getCbInfoProduDv().getSelectedItem() != null && vistaIp.getCbInfoProduDv().getSelectedItem() != "<Seleccione info producto>") {
                        String desc = "0";

                        if (vistaIp.getCheckBoxDescuentoDv().isSelected()) {
                            desc = vistaIp.getTxtDescuentoDv().getText();
                        }

                        String[] retInfo = obtenerInfoCbInfoProdu();
                        Producto p = productoDao.findSpecificByNameBrandContent(retInfo[0], retInfo[1], retInfo[2]);

                        String precio = String.valueOf(p.getPrecio());
                        String cant = String.valueOf(vistaIp.getSpnCantidadDv().getValue());
                        String codBarra = p.getCodBarra();
                        double importe = p.getPrecio() * Double.parseDouble(vistaIp.getSpnCantidadDv().getValue().toString());
                        //----"Cód. Barra", "Nombre", "Marca", "Cont.", "Precio Sin IGV", "Cant.", "Importe sin IGV", "IGV", "Importe con IGV", "Desc.", "Subtotal con desc."
                        double prSnIgv = 0;
                        //Logica para quitar el 18% del igv para mostrarlo 
                        if (p.getIgvAplicable() == true) {
                            prSnIgv = p.getPrecio() / 1.18;
                        } else {
                            prSnIgv = p.getPrecio();
                        }
                        double impSnIgv = prSnIgv * Double.parseDouble(cant);
                        double igv = impSnIgv * 0.18;
                        double impCnIgv = impSnIgv + igv;
                        Object[] filaTdetV2 = {codBarra, retInfo[0], retInfo[1], retInfo[2], String.valueOf(prSnIgv), cant, String.valueOf(impSnIgv), String.valueOf(igv), String.valueOf(impCnIgv), desc, String.valueOf(impCnIgv - Double.parseDouble(desc))};
                        modeloDv2.addRow(filaTdetV2);
                        vistaIp.getTablaDv2().setModel(modeloDv2);
                        limpiezaTextFieldDv();
                        double importeTsn = 0;
                        double importeTcn = 0;
                        double igvT = 0;
                        double descT = 0;
                        //Falta el total
                        for (int i = 0; i < vistaIp.getTablaDv2().getRowCount(); i++) {
                            importeTsn += Double.parseDouble(vistaIp.getTablaDv2().getValueAt(i, 6).toString());
                            igvT += Double.parseDouble(vistaIp.getTablaDv2().getValueAt(i, 7).toString());
                            importeTcn += Double.parseDouble(vistaIp.getTablaDv2().getValueAt(i, 8).toString());
                            descT += Double.parseDouble(vistaIp.getTablaDv2().getValueAt(i, 9).toString());
                        }

                        BigDecimal impTsnbd = new BigDecimal(String.valueOf(importeTsn));
                        BigDecimal igvTbd = new BigDecimal(String.valueOf(igvT));
                        BigDecimal impTcnbd = new BigDecimal(String.valueOf(importeTcn));
                        BigDecimal descTbd = new BigDecimal(String.valueOf(descT));

                        vistaIp.getTxtImpTotalSinIgv().setText(String.valueOf(impTsnbd));
                        vistaIp.getTxtIgvTotal().setText(String.valueOf(igvTbd));
                        vistaIp.getTxtImpTotalConIgv2Dv().setText(String.valueOf(impTcnbd));
                        vistaIp.getTxtDescuentoTotal2Dv().setText(String.valueOf(descTbd));
                        double totalDv2 = importeTcn - descT;

                        BigDecimal totbd2 = new BigDecimal(String.valueOf(totalDv2));
                        vistaIp.getTxtTotalPagar2Dv().setText(String.valueOf(totbd2));
                    }
                }
            }

        });
    }

    public void limpiezaTextFieldDv() {
        vistaIp.getCbInfoProduDv().setSelectedIndex(0);
        vistaIp.getCheckBoxDescuentoDv().setSelected(false);
        vistaIp.getTxtDescuentoDv().setText("");
        vistaIp.getTxtDescuentoDv().setEditable(false);
        vistaIp.getTxtContenidoDv().setText("");
        vistaIp.getTxtPrecioDv().setText("");
        vistaIp.getTxtStockDv().setText("");
        vistaIp.getCbMetPagoDv().setSelectedIndex(0);
        vistaIp.getSpnCantidadDv().setValue(0);
    }

    public String[] obtenerInfoCbInfoProdu() {
        String[] recortes = vistaIp.getCbInfoProduDv().getSelectedItem().toString().split(" - ");

        String nombre = recortes[0];
        String marca = recortes[1];
        String contenido = recortes[2];
        String concatenado = null;
        boolean concatenar = false;
        /**
         * Si en caso se obtiene el contenido de un producto con ' - '.
         */
        for (int i = 3; i < recortes.length; i++) {
            concatenado = contenido.concat(" - " + recortes[i]);
            concatenar = true;
        }
        if (concatenar == true) {
            contenido = concatenado;
        }
        String[] retornar = {nombre, marca, contenido};
        return retornar;
    }

    public void mostrarValoresSwingComponents() {
        alternarPanelesDv(true);
        ((AbstractDocument) vistaIp.getTxtDescuentoDv().getDocument()).setDocumentFilter(new SoloNumero());

        operacionesDv();
        vistaIp.getPnlEscanearCodBarraDv().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String codEscan = JOptionPane.showInputDialog("Escanee el producto", "");
                if (codEscan != null) {
                    Producto p = productoDao.findByCodeProduct(codEscan);
                    //String codBarra = p.getCodBarra();
                    String marca = p.getMarca();
                    String nombre = p.getNombre();
                    String cont = p.getCont();
                    String stock = String.valueOf(p.getStock());
                    String precio = String.valueOf(p.getPrecio());

                    for (int i = 1; i < vistaIp.getCbInfoProduDv().getItemCount(); i++) {

                        String item = vistaIp.getCbInfoProduDv().getItemAt(i);

                        String[] recortes = item.split(" - ");

                        String nombreR = recortes[0];
                        String marcaR = recortes[1];
                        String contenidoR = recortes[2];

                        String concatenado = null;
                        boolean concatenar = false;
                        /**
                         * Si en caso se obtiene el contenido de un producto con
                         * ' - '.
                         */
                        for (int x = 3; x < recortes.length; x++) {
                            concatenado = contenidoR.concat(" - " + recortes[x]);
                            concatenar = true;
                        }
                        if (concatenar == true) {
                            contenidoR = concatenado;
                        }

                        if (nombre.equals(nombreR) && marca.equals(marcaR) && cont.equals(contenidoR)) {

                            vistaIp.getCbInfoProduDv().setSelectedIndex(i);
                            vistaIp.getTxtStockDv().setText(stock);
                            vistaIp.getTxtContenidoDv().setText(cont);
                            vistaIp.getTxtPrecioDv().setText(precio);
                            return;
                        } else {
                            if (i == vistaIp.getCbInfoProduDv().getItemCount() - 1) {
                                JOptionPane.showMessageDialog(null, "No se encontró el producto");
                            }
                        }
                    }
                }

            }
        });

        //-----------
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        vistaIp.getLblFecha().setText(String.valueOf(LocalDate.now().format(formatoFecha)));

        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        //Timer que actualiza la hora cada segundo
        Timer timer = new Timer(1000, e -> actualizarHora(formatoHora));
        timer.start();
        actualizarHora(formatoHora);

        vistaIp.getRbBoleta().addActionListener(this);
        vistaIp.getRbFactura().addActionListener(this);
        vistaIp.getRbBoleta1().addActionListener(this);
        vistaIp.getRbFactura1().addActionListener(this);
        vistaIp.getCbInfoProduDv().addActionListener(this);
        vistaIp.getLblDinamiTipoVenta().setText("Seleccione el tipo de venta");
        ocultarPestaniasTdP(vistaIp.getTbpTablaDv());

        vistaIp.getTxtTrabajadorDv().setText(String.format("%s, %s", usuario.getApellido(), usuario.getNombre()));

        //-------------------
        vistaIp.getCbInfoProduDv().addItem("<Seleccione info producto>");
        List<Producto> productos = productoDao.selectAll();
        for (Producto p : productos) {
            if (p.getPrecio() != 0.0 && p.getStock() != 0) {
                vistaIp.getCbInfoProduDv().addItem(String.format("%s - %s - %s", p.getNombre(), p.getMarca(), p.getCont()));
            }
        }
        vistaIp.getCbMetPagoDv().addItem("<Seleccione>");
        vistaIp.getCbMetPagoDv().addItem("Efectivo");
        vistaIp.getCbMetPagoDv().addItem("Tarjeta");
        vistaIp.getCbMetPagoDv().addItem("Yape");
        vistaIp.getCbMetPagoDv().addItem("Plin");
        vistaIp.getCbMetPagoDv().addItem("Transacción");
        vistaIp.getCbMetPagoDv().addItem("Fiado");

        vistaIp.getSeleccionTVenta().add(vistaIp.getRbBoleta());
        vistaIp.getSeleccionTVenta().add(vistaIp.getRbFactura());
        vistaIp.getSeleccionTVenta().add(vistaIp.getRbBoleta1());
        vistaIp.getSeleccionTVenta().add(vistaIp.getRbFactura1());
        //vistaIp.getRbBoleta().setSelected(true);

        vistaIp.getCheckBoxDescuentoDv().addActionListener(this);

        vistaIp.getSpnCantidadDv().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                SpinnerNumberModel spnNModel = new SpinnerNumberModel(((Number) vistaIp.getSpnCantidadDv().getValue()).intValue(), 0, stockGlobal, 1);
                vistaIp.getSpnCantidadDv().setModel(spnNModel);
                if (vistaIp.getTxtStockDv().getText() != null && !vistaIp.getTxtStockDv().getText().equals("")) {

//                    int stockModelo = Integer.parseInt(vistaIp.getTxtStockDv().getText());
                    int valorStock = Integer.parseInt(vistaIp.getTxtStockDv().getText());
                    if (valorStock >= 0) {
                        int valor = ((Number) vistaIp.getSpnCantidadDv().getValue()).intValue();

                        int diferencia = stockGlobal - valor;

                        vistaIp.getTxtStockDv().setText(String.valueOf(diferencia));

                    }

                    //vistaIp.getSpnCantidadDv().setValue(diferencia);
                } else {
                    vistaIp.getSpnCantidadDv().setValue(0);
                }
            }
        }); //Fin del ChangeListener

    }

    public void mostrarInfoCb(Object item) {
        String infoProducto = item.toString();
        if (!infoProducto.equals("<Seleccione info producto>")) {
            String[] recortes = infoProducto.split(" - ");

            String nombre = recortes[0];
            String marca = recortes[1];
            String contenido = recortes[2];
            String concatenado = null;
            boolean concatenar = false;
            /**
             * Si en caso se obtiene el contenido de un producto con ' - '.
             */
            for (int i = 3; i < recortes.length; i++) {
                concatenado = contenido.concat(" - " + recortes[i]);
                concatenar = true;
            }
            if (concatenar == true) {
                contenido = concatenado;
            }

            Producto atributosE = productoDao.findSpecificByNameBrandContent(nombre, marca, contenido);

            /**
             * Mostramos el valor del item del combobox seleccionado.
             */
            vistaIp.getTxtContenidoDv().setText(contenido);
            String precio = String.valueOf(atributosE.getPrecio());
            String stock = String.valueOf(atributosE.getStock());

            vistaIp.getTxtPrecioDv().setText(precio);
            vistaIp.getTxtStockDv().setText(stock);

            stockGlobal = atributosE.getStock();
        } else {
            vistaIp.getTxtContenidoDv().setText("");
            vistaIp.getTxtPrecioDv().setText("");
            vistaIp.getTxtStockDv().setText("");
        }
    }
}
