package com.codigodebarra.controller;

import com.codigodebarra.dao.ProductoDao;
import com.codigodebarra.dao.daoimpl.ProductoDaoImpl;
import com.codigodebarra.model.Producto;
import com.codigodebarra.model.Usuario;
import com.codigodebarra.util.ApiProductos;
import com.codigodebarra.view.JInformacion;
import com.codigodebarra.view.JProducto;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.MalformedURLException;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class ProductoController implements ActionListener {

    JProducto vistaProdu;
    //JInformacion vistaInfo;
    DefaultTableModel modelo;
    ProductoDao productoDao;
    Usuario usuario;
    ApiProductos api;

    public ProductoController(JProducto vistaProdu, Usuario usuario) {
        this.vistaProdu = vistaProdu;
        this.vistaProdu.setVisible(true);
        this.vistaProdu.setLocationRelativeTo(null);
        this.usuario = usuario;
        productoDao = new ProductoDaoImpl(null);
        api = new ApiProductos();
        acciones();
    }

    public void acciones() {

    }

    private void disenioTablaProducto() {

        String[] tituloColumnas = {"Cód. Barra", "Nombre", "Marca", "Contenido", "Precio", "Stock", "Igv o exonerado"};

        //Poner nombre a las columnas de la tabla
        modelo.setColumnIdentifiers(tituloColumnas);

        vistaProdu.getTablaProductos().setModel(modelo);

        /**
         * Se usa el new DefaultTableCellRenderer para crear un objeto que nos
         * permita modificar el diseño de las celdas de una tabla Se puede usar
         * solo el setDefautlRenderer para asignar un nuevo defaultTable de
         * manera que no necesite una configuración avanzada.
         *
         */
        vistaProdu.getTablaProductos().getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {

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

                Component c = super.getTableCellRendererComponent(vistaProdu.getTablaProductos(), value, isSelected, hasFocus, row, column);
                c.setBackground(new Color(70, 70, 70));
                c.setForeground(Color.WHITE);
                //Retorna el componente personalizado (el JLabel)
                return c;
            }
        });
        //==============

        vistaProdu.getCbNombresColumnasProd().addItem("<Seleccione un campo>");
        //Ponemos los nombres de las columnas, al combobox para hacer busquedas
        for (String i : tituloColumnas) {
            vistaProdu.getCbNombresColumnasProd().addItem(i);
        }

        //=============
        //Agregar elementos de la bd, a la tabla
        mostrarElementosEnTabla(productoDao.selectAll());
        //============= Referencia: ComboBox y TextField de busqueda
        informacionBusqueda();
        //Hacer que se limpie las filas de la tabla que se encontraba seleccionada, al hacer clic en los distintos paneles
        limpiarSeleccionFilaTablaClicPanel();
    }

    public void mostrarElementosEnTabla(List<Producto> listaProductos) {
        modelo.setRowCount(0);
        String valVisual = "";
        for (Producto p : listaProductos) {
            if (p.getIgvAplicable() == true) {
                valVisual = "IGV";
            } else {
                valVisual = "Exo";
            }
            Object[] fila = {p.getCodBarra(), p.getNombre(), p.getMarca(), p.getCont(), precisionDouble(p.getPrecio()), p.getStock(), valVisual};
            modelo.addRow(fila);
        }
        vistaProdu.getTxtValorProd().setText("");
    }

    public String precisionDouble(double valorDouble) {
        /**
         * Lo que se hace es buscar reducir el valor obtenido. Reforzando a
         * través del setScale que permite redondear a 1 decimal, por medio del
         * redondeo standar que es si hay un mayor o igua a 5 para arriba se
         * aumenta la cantidad. Además, que si solo hay un número no se muestre
         * la característica del '.0'.
         */
        return BigDecimal.valueOf(valorDouble).setScale(1, RoundingMode.HALF_UP).stripTrailingZeros().toPlainString();
    }

    public void limpiarSeleccionFilaTablaClicPanel() {
//        vistaProdu.getjPanel4().addMouseListener(new MouseAdapter() {
//
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                vistaProdu.getTablaProductos().clearSelection();
//            }
//        });
        vistaProdu.getPanelProducto().addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                vistaProdu.getTablaProductos().clearSelection();
            }
        });
        vistaProdu.getPnlTablaProductos().addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                vistaProdu.getTablaProductos().clearSelection();
            }
        });
    }

    public void generarPdfProductos() {
        vistaProdu.getLblPdfProd().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Obtener el archivo jasper configurado
                JasperPrint jp = productoDao.reportAllProducts(usuario.getId_usuario(), "pdf");
//                String nombreDescarga = "reporte_productos_"+usuario.getNombre()+".pdf";
//                try {
//                    JasperExportManager.exportReportToPdfFile(jp, nombreDescarga);
//                } catch (JRException ex) {
//                    Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
//                }

                //Codigo para que al cerrar la visualización no se cierre todo el sistema.
                JasperViewer viewReport = new JasperViewer(jp, false);
                viewReport.setDefaultCloseOperation(vistaProdu.DISPOSE_ON_CLOSE);
                viewReport.setVisible(true);
            }
        });
        vistaProdu.getLblExcelProd().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                productoDao.reportAllProducts(usuario.getId_usuario(), "excel");
            }
        });
    }

    public void informacionBusqueda() {
        vistaProdu.getPnlBuscarProd().addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                List<Producto> productos = productoDao.selectAll();
                int nombreColumna = vistaProdu.getCbNombresColumnasProd().getSelectedIndex();

                switch (nombreColumna) {
                    case 0 -> {
                        JOptionPane.showMessageDialog(null, "Seleccione un campo que sea valido");
                        mostrarElementosEnTabla(productos);
                    }
                    case 1 -> {
                        Producto p = null;
                        if (vistaProdu.getTxtValorProd().getText() == null || vistaProdu.getTxtValorProd().getText().equals("")) {
                            modelo.setNumRows(0);
                        } else {
                            p = productoDao.findByCodeProduct(vistaProdu.getTxtValorProd().getText());
                            modelo.setNumRows(0);
                            Object[] fila = {p.getCodBarra(), p.getNombre(), p.getMarca(), p.getCont(), p.getPrecio(), p.getStock()};
                            modelo.addRow(fila);
                        }
                    }
                    case 2 -> {
                        List<Producto> listaProductos = productoDao.findByName(vistaProdu.getTxtValorProd().getText());
                        mostrarElementosEnTabla(listaProductos);
                    }
                    case 3 -> {
                        List<Producto> listaProductos = productoDao.findByBrand(vistaProdu.getTxtValorProd().getText());
                        mostrarElementosEnTabla(listaProductos);
                    }
                    case 4 -> {
                        List<Producto> listaProductos = productoDao.findByContent(vistaProdu.getTxtValorProd().getText());
                        mostrarElementosEnTabla(listaProductos);
                    }
                    case 5 -> {
                        List<Producto> listaProductos = productoDao.findByPrice(vistaProdu.getTxtValorProd().getText());
                        mostrarElementosEnTabla(listaProductos);
                    }
                    case 6 -> {
                        List<Producto> listaProductos = productoDao.findByQuantity(vistaProdu.getTxtValorProd().getText());
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
        vistaProdu.getPnlAgregarGP().setEnabled(valor);
        vistaProdu.getTxtCodBarraGP().setEditable(valor);
        vistaProdu.getPnlActualizarGP().setEnabled(!valor);
        vistaProdu.getPnlEliminarGP().setEnabled(!valor);

        if (valor == true) {
            vistaProdu.getPnlAgregarGP().setBackground(pnlGrisCO(true));
            vistaProdu.getPnlActualizarGP().setBackground(pnlGrisCO(false));
            vistaProdu.getPnlEliminarGP().setBackground(pnlGrisCO(false));

            limpiezaTextFieldsGP();
        } else {
            vistaProdu.getPnlAgregarGP().setBackground(pnlGrisCO(false));
            vistaProdu.getPnlActualizarGP().setBackground(pnlGrisCO(true));
            vistaProdu.getPnlEliminarGP().setBackground(pnlGrisCO(true));

        }
        vistaProdu.getPnlLimpiarGP().setBackground(pnlGrisCO(true));
    }

    public void limpiezaTextFieldsGP() {
        vistaProdu.getTxtCodBarraGP().setText("");
        vistaProdu.getTxtNombreGP().setText("");
        vistaProdu.getTxtMarcaGP().setText("");
        vistaProdu.getTxtContenidoGP().setText("");
        vistaProdu.getSpnPrecioGP().setValue(0);
        vistaProdu.getSpnCantidadGP().setValue(0);
        vistaProdu.getTablaProductos().clearSelection();
        vistaProdu.getBtnGroupContieneIgv().clearSelection();
    }

    public Color pnlGrisCO(boolean trufal) {
        //verdadero = claro
        if (trufal == true) {
            return new Color(255, 255, 255);
        }
        //false = oscuro
        return new Color(200, 200, 200);
    }

    public void gestionProductoIp() {
        //Por default, los paneles en la gestión de producto deben estar así
        alternarPanelesGP(true);

        vistaProdu.getBtnGroupContieneIgv().add(vistaProdu.getRbSiContieneIgv());
        vistaProdu.getBtnGroupContieneIgv().add(vistaProdu.getRbNoContieneIgv());
        //Al comienzo 
        MouseAdapter ma = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent ev) {
                String codigoB = vistaProdu.getTxtCodBarraGP().getText();

                //Lógica para agregar producto
                if (!codigoB.isEmpty()) {
                    if (productoDao.findByCodeProduct(codigoB) == null) {
                        try {
                            //Forzar a que se utilice el valor escrito manualmente (textField)
                            vistaProdu.getSpnCantidadGP().commitEdit();
                            vistaProdu.getSpnPrecioGP().commitEdit();
                        } catch (ParseException pe) {
                            pe.printStackTrace();
                        }
                        //int cantidadP = (int) vistaProdu.getSpnCantidadGP().getValue();
                        Producto p = new Producto();
                        p.setCodBarra(codigoB);
                        p.setNombre(vistaProdu.getTxtNombreGP().getText());
                        p.setMarca(vistaProdu.getTxtMarcaGP().getText());
                        p.setCont(vistaProdu.getTxtContenidoGP().getText());
                        p.setPrecio(((Number) vistaProdu.getSpnPrecioGP().getValue()).doubleValue());
                        p.setStock(((Number) vistaProdu.getSpnCantidadGP().getValue()).intValue());
                        if (vistaProdu.getRbSiContieneIgv().isSelected()) {
                            p.setIgvAplicable(true);
                        } else if (vistaProdu.getRbNoContieneIgv().isSelected()) {
                            p.setIgvAplicable(false);
                        }

                        if (productoDao.insert(p) != 0) {
                            ImageIcon icon = iconoResources("check.png");
                            JOptionPane.showMessageDialog(null, "Producto agregado", "Se agregó exitosamente", 1, icon);
                        } else {
                            ImageIcon x = iconoResources("xRoja.png");
                            JOptionPane.showMessageDialog(null, "Error: El producto no se pudo agregar", "Error", 1, x);
                        }

                        mostrarElementosEnTabla(productoDao.selectAll());
                    } else {
                        ImageIcon x = iconoResources("xRoja.png");
                        JOptionPane.showMessageDialog(null, "No se aceptan códigos de barras duplicados", "Error", 1, x);
                    }
                    limpiezaTextFieldsGP();
                } else {
                    ImageIcon x = iconoResources("xRoja.png");
                    JOptionPane.showMessageDialog(null, "Agregue un valor para el código de barra", "Complete el campo", 1, x);

                }

            }
        }; // Fin del mouseAdapter
        //Se asigna lo que se haría si se da clic en el botón agregar, desde el comienzo por default, luego dentro de la tabla cuando se deseleccione la fila de una tabla y se desee agregar un nuevo producto
        for (MouseListener ml : vistaProdu.getPnlAgregarGP().getMouseListeners()) {
            vistaProdu.getPnlAgregarGP().removeMouseListener(ml);
        }
        vistaProdu.getPnlAgregarGP().addMouseListener(ma);

        //Esta logica funcionará si en todo cas se selecciona o se deselecciona una fila de la tabla
        vistaProdu.getTablaProductos().getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            //Se ejecutará cuando escuche un cambio en la tabla
            @Override
            public void valueChanged(ListSelectionEvent e) {

                if (!e.getValueIsAdjusting()) {

                    int fila = vistaProdu.getTablaProductos().getSelectedRow();

                    //Si en caso selecciona una fila
                    if (fila != -1) {

                        alternarPanelesGP(false);
                        vistaProdu.getPnlAgregarGP().removeMouseListener(ma);

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
                        for (MouseListener ml : vistaProdu.getPnlEliminarGP().getMouseListeners()) {
                            vistaProdu.getPnlEliminarGP().removeMouseListener(ml);
                        }
                        vistaProdu.getPnlEliminarGP().addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent ev) {
                                int fila = vistaProdu.getTablaProductos().getSelectedRow();
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
                        for (MouseListener ml : vistaProdu.getPnlLimpiarGP().getMouseListeners()) {
                            vistaProdu.getPnlLimpiarGP().removeMouseListener(ml);
                        }
                        vistaProdu.getPnlLimpiarGP().addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent ev) {
                                limpiezaTextFieldsGP();
                            }
                        });

                        // 3. Actualizar
                        for (MouseListener ml : vistaProdu.getPnlActualizarGP().getMouseListeners()) {
                            vistaProdu.getPnlActualizarGP().removeMouseListener(ml);
                        }

                        vistaProdu.getPnlActualizarGP().addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent ev) {

                                //Código de actualizar
                                int fila = vistaProdu.getTablaProductos().getSelectedRow();
                                if (fila > -1) {
                                    try {
                                        //Forzar a que se utilice el valor escrito manualmente (textField)
                                        vistaProdu.getSpnCantidadGP().commitEdit();
                                        vistaProdu.getSpnPrecioGP().commitEdit();
                                    } catch (ParseException pe) {
                                        pe.printStackTrace();
                                    }
                                    modelo.setValueAt(vistaProdu.getTxtNombreGP().getText(), fila, 1);
                                    modelo.setValueAt(vistaProdu.getTxtMarcaGP().getText(), fila, 2);
                                    modelo.setValueAt(vistaProdu.getTxtContenidoGP().getText(), fila, 3);
                                    modelo.setValueAt(precisionDouble(((Number) vistaProdu.getSpnPrecioGP().getValue()).doubleValue()), fila, 4);
                                    modelo.setValueAt(((Number) vistaProdu.getSpnCantidadGP().getValue()).intValue(), fila, 5);

                                    if (vistaProdu.getRbSiContieneIgv().isSelected()) {
                                        modelo.setValueAt("IGV", fila, 6);
                                    } else if (vistaProdu.getRbNoContieneIgv().isSelected()) {
                                        modelo.setValueAt("Exo", fila, 6);
                                    }

                                    Producto p = new Producto();
                                    p.setCodBarra(vistaProdu.getTxtCodBarraGP().getText());
                                    p.setNombre(vistaProdu.getTxtNombreGP().getText());
                                    p.setMarca(vistaProdu.getTxtMarcaGP().getText());
                                    p.setCont(vistaProdu.getTxtContenidoGP().getText());
                                    p.setStock(((Number) vistaProdu.getSpnCantidadGP().getValue()).intValue());
                                    p.setPrecio(((Number) vistaProdu.getSpnPrecioGP().getValue()).doubleValue());

                                    if (vistaProdu.getRbSiContieneIgv().isSelected()) {
                                        p.setIgvAplicable(true);
                                    } else if (vistaProdu.getRbNoContieneIgv().isSelected()) {
                                        p.setIgvAplicable(false);
                                    }

                                    productoDao.updateByCodeBar(p);

                                    /**
                                     * Se tiene que deseleccionar la fila de la
                                     * tabla despues de haber realizado la
                                     * acción de actualizar o de eliminar.
                                     */
                                    ImageIcon icon = iconoResources("check.png");
                                    JOptionPane.showMessageDialog(null, "Producto actualizado", "Actualización completada", 1, icon);
                                    vistaProdu.getTablaProductos().clearSelection();
                                    limpiezaTextFieldsGP();

                                }
                            }
                        }
                        );
                    } else {
                        alternarPanelesGP(true);
                        //Agregar producto
                        for (MouseListener ml : vistaProdu.getPnlAgregarGP().getMouseListeners()) {
                            vistaProdu.getPnlAgregarGP().removeMouseListener(ml);
                        }
                        vistaProdu.getPnlAgregarGP().addMouseListener(ma);
                    } //Fin en caso se seleccione o no una fila de la tabla
                }
            }//Fin del ValueChanged
        }
        );

    } // Fin de la GP

    public ImageIcon iconoResources(String nombreIcono) {
        return new ImageIcon(getClass().getResource("/img/" + nombreIcono));
    }

    public String mostrarValoresFilaSelecionada(int fila) {
        String codBarra = (String) vistaProdu.getTablaProductos().getValueAt(fila, 0);
        String valVisual = ((String) vistaProdu.getTablaProductos().getValueAt(fila, 6));

        //Mostrar valores en los textFields
        vistaProdu.getTxtCodBarraGP().setText(codBarra);
        vistaProdu.getTxtNombreGP().setText((String) vistaProdu.getTablaProductos().getValueAt(fila, 1));
        vistaProdu.getTxtMarcaGP().setText((String) vistaProdu.getTablaProductos().getValueAt(fila, 2));
        vistaProdu.getTxtContenidoGP().setText((String) vistaProdu.getTablaProductos().getValueAt(fila, 3));
        vistaProdu.getSpnPrecioGP().setValue(Double.valueOf((vistaProdu.getTablaProductos().getValueAt(fila, 4).toString())));
        vistaProdu.getSpnCantidadGP().setValue(((Number) vistaProdu.getTablaProductos().getValueAt(fila, 5)).intValue());

        if (valVisual.equals("IGV")) {
            vistaProdu.getRbSiContieneIgv().setSelected(true);
        } else {
            vistaProdu.getRbNoContieneIgv().setSelected(true);
        }

        return codBarra;
    }

    /**
     * ESCANEAR CODIGO.
     *
     * @throws java.net.MalformedURLException
     */
    public void escanearCodigo() throws MalformedURLException {
        String codBarraProdu = JOptionPane.showInputDialog("Ingrese el código de barra del producto");
        if (codBarraProdu == null || codBarraProdu.equals("")) {
            return;
        }
        Producto productoApi = api.consumirApi(codBarraProdu);
        Producto producto_bd = productoDao.findByCodeProduct(codBarraProdu);

        if (productoApi.getCodBarra() != null) {

            JInformacion vistaInfo = new JInformacion(null, true);
            InfoController infoC = new InfoController(vistaInfo, vistaProdu, productoApi, producto_bd, modelo);

        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el producto");
            System.out.println("No funciono la api");
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaProdu.getBtnEscanearProduGP()) {

            try {
                escanearCodigo();
            } catch (MalformedURLException ex) {
                Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
