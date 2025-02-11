package com.codigodebarra.controller;

import com.codigodebarra.config.Disenio;
import com.codigodebarra.dao.ProductoDao;
import com.codigodebarra.dao.UsuarioDao;
import com.codigodebarra.dao.daoimpl.ProductoDaoImpl;
import com.codigodebarra.dao.daoimpl.UsuarioDaoImpl;
import com.codigodebarra.model.Producto;
import com.codigodebarra.model.Usuario;
import com.codigodebarra.model.Venta;
import com.codigodebarra.util.Barras;
import com.codigodebarra.util.filtro.SoloNumero;
import com.codigodebarra.view.JCategoria;
import com.codigodebarra.view.JEstadistica;
import com.codigodebarra.view.JInformacion;
import com.codigodebarra.view.JInterfazPrincipal;
import com.codigodebarra.view.JInventario;
import com.codigodebarra.view.JLogin;
import com.codigodebarra.view.JProducto;
import com.codigodebarra.view.JVenta;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Timestamp;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AbstractDocument;

public final class PrincipalController implements ActionListener {

    JInterfazPrincipal vistaIp;
    JInformacion vistaInfo;
    JCategoria vistaCate;
    JEstadistica vistaEstadistica;
    JInventario vistaInve;
    JProducto vistaProdu;
    JVenta vistaVenta;

    ProductoDao productoDao;

    Usuario usuario;
    DefaultTableModel modelo, modeloDv, modeloDv2;
    int xMouse, yMouse, stockGlobal = 0;
    UsuarioDao usuarioDao;

    public PrincipalController(JInterfazPrincipal vistaIp, Usuario usuario) {
        this.vistaIp = vistaIp;
        //Se necesita que la vistaIp ya haya sida creada
        this.usuario = usuario;
        //bienvenida(usuario);
        this.vistaIp.setVisible(true);
        this.vistaIp.setLocationRelativeTo(null);

        productoDao = new ProductoDaoImpl(usuario);

        Disenio.getDesignWindows();
        modelo = new DefaultTableModel();
        modeloDv = new DefaultTableModel();
        modeloDv2 = new DefaultTableModel();
        usuarioDao = new UsuarioDaoImpl();
        configuracionTabbedPane();
        navegacionPaneles();

    }

    public void acciones() {

//Configuración en el TabbedPane y en el la barra para poder deslizar la ventana, e incluso la adioión de paneles
        //Menu lateral - > paneles
        //Tabla
//        disenioTablaProducto();
//        //Boton en info al encontrar el producto
//        pnlAgregarOActualizaProducto();
//        //Agregar producto
//        gestionProductoIp();
//        //Generar archivo PDF
//        generarPdfProductos();
        //vistaIp.getBtnOkEscanear().addActionListener(this);
        //vistaIp.getBtnEscanearProduGP().addActionListener(this);
        //vistaIp.getBtnGuardarVenta().addActionListener(this);
        //vistaIp.getBtnCancelarVenta().addActionListener(this);
        //metodosDVenta();
    }

    /**
     * PANEL PRINCIPAL.
     */
//    public void bienvenida(Usuario usuario) {
//        vistaIp.getLblNombre().setText(String.format("%s, %s", usuario.getApellido(), usuario.getNombre()));
//    }
    /**
     * CONFIGURACIÓN GENERAL.
     */
    public void actualizarCBproductoInfoDv() {
        vistaIp.getCbInfoProduDv().removeAllItems();

        vistaIp.getCbInfoProduDv().addItem("<Seleccione info producto>");

        for (Producto p : productoDao.selectAll()) {
            if (p.getPrecio() != 0.0 && p.getStock() != 0 && !p.getCont().equals("--") && !p.getCont().equals("")) {
                vistaIp.getCbInfoProduDv().addItem(String.format("%s - %s - %s", p.getNombre(), p.getMarca(), p.getCont()));
            }
        }
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
        //ocultarPestaniasTdP(vistaIp.getjTabbedPane1());
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

    private void navegacionPaneles() {

        vistaIp.getPnlVenta().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                vistaVenta = new JVenta(vistaIp, true);
                VentaController vc = new VentaController(vistaVenta);

            }

            @Override
            public void mouseEntered(MouseEvent event) {
                vistaIp.getPnlCategoria().setBackground(new Color(220, 220, 220));
            }

            @Override
            public void mouseExited(MouseEvent event) {
                vistaIp.getPnlCategoria().setBackground(new Color(255, 255, 255));
            }
        });
        vistaIp.getPnlCategoria().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                vistaCate = new JCategoria(vistaIp, true);
                vistaCate.setLocationRelativeTo(null);
                vistaCate.setVisible(true);

            }

            @Override
            public void mouseEntered(MouseEvent event) {
                vistaIp.getPnlCategoria().setBackground(new Color(220, 220, 220));
            }

            @Override
            public void mouseExited(MouseEvent event) {
                vistaIp.getPnlCategoria().setBackground(new Color(255, 255, 255));
            }
        });
        vistaIp.getPnlInventario().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                vistaInve = new JInventario(vistaIp, true);

                vistaInve.setLocationRelativeTo(null);
                vistaInve.setVisible(true);
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
        vistaIp.getPnlProducto().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ProductoController pc = new ProductoController(new JProducto(vistaIp, true), usuario);
            }

            @Override
            public void mouseEntered(MouseEvent event) {
                vistaIp.getPnlProducto().setBackground(new Color(220, 220, 220));
            }

            @Override
            public void mouseExited(MouseEvent event) {
                vistaIp.getPnlProducto().setBackground(new Color(255, 255, 255));
            }
        });

        vistaIp.getPnlEstadistica().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                vistaEstadistica = new JEstadistica(vistaIp, true);

                vistaEstadistica.setLocationRelativeTo(null);
                vistaEstadistica.setVisible(true);
            }

            @Override
            public void mouseEntered(MouseEvent event) {
                vistaIp.getPnlEstadistica().setBackground(new Color(220, 220, 220));
            }

            @Override
            public void mouseExited(MouseEvent event) {
                vistaIp.getPnlEstadistica().setBackground(new Color(255, 255, 255));
            }
        });

//        vistaIp.getPnlCerrarSesion().addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent event) {
//
//                int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas cerrar sesión?");
//                /**
//                 * -1: Clic en la x | 0: Si | 1: Cancelar | 2: No
//                 */
//                if (respuesta == 0) {
//                    vistaIp.dispose();
//                    JLogin login = new JLogin();
//                    LoginController lc = new LoginController(login);
//                }
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent event) {
//                vistaIp.getPnlCerrarSesion().setBackground(new Color(220, 220, 220));
//            }
//
//            @Override
//            public void mouseExited(MouseEvent event) {
//                vistaIp.getPnlCerrarSesion().setBackground(new Color(255, 255, 255));
//            }
//        });
    }

    public void guardarVenta() {
        if (!vistaIp.getRbBoleta().isSelected() && !vistaIp.getRbBoleta2().isSelected() && !vistaIp.getRbFactura().isSelected() && !vistaIp.getRbFactura2().isSelected()) {
            JOptionPane.showMessageDialog(null, "Primero escoge que tipo de venta vas a realizar");
            return;
        }
        int resultado = JOptionPane.showConfirmDialog(null, "¿Deseas realizar la venta?");

        if (resultado == JOptionPane.YES_OPTION) {

            if (vistaIp.getRbBoleta().isSelected() || vistaIp.getRbBoleta2().isSelected()) {
                if (vistaIp.getTxtImpTotalDv().getText().equals("0") || vistaIp.getTxtTotalPagarDv().getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Agregue productos para permitir guardar la venta");
                    return;
                }
                double importeTotal = Double.parseDouble(vistaIp.getTxtImpTotalDv().getText());
                double desc = Double.parseDouble(vistaIp.getTxtDescuentoTotalDv().getText());
                double totalPago = Double.parseDouble(vistaIp.getTxtTotalPagarDv().getText());

                Venta ve = new Venta();
                ve.setImpTotMasIgv(importeTotal);
                ve.setDescTot(desc);
                ve.setTotal(totalPago);

                ve.setIdUsuario(usuario.getId_usuario());
                ve.setFechaVenta(Timestamp.valueOf(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
                //ve.setImpTotSnIgvOExo(totalPago);
            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaCate.getBtnAgregarCate()) {

        }
        if (e.getSource() == vistaCate.getBtnActuCate()) {

        }
        if (e.getSource() == vistaCate.getBtnEliminarCate()) {

        }
        if (e.getSource() == vistaCate.getBtnDesactivarCate()) {

        }
        if (e.getSource() == vistaIp.getBtnGuardarVenta()) {
            guardarVenta();
        }
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

        //
        if (e.getSource() == vistaInfo.getBtnCancelar()) {
            vistaInfo.dispose();
        }
        if (e.getSource() == vistaIp.getRbFactura() || e.getSource() == vistaIp.getRbFactura2()) {
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
                vistaIp.getRbFactura2().setSelected(true);
                vistaIp.getRbFactura2().setEnabled(false);
                vistaIp.getRbBoleta2().setSelected(false);
                vistaIp.getRbBoleta2().setEnabled(false);
            }
        }
        if (e.getSource() == vistaIp.getRbBoleta() || e.getSource() == vistaIp.getRbBoleta2()) {
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
                vistaIp.getRbBoleta2().setSelected(true);
                vistaIp.getRbBoleta2().setEnabled(false);
                vistaIp.getRbFactura2().setSelected(false);
                vistaIp.getRbFactura2().setEnabled(false);
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

    public void metodosDVenta() {
        disenioTablaDVenta();
        mostrarValoresSwingComponents();
    }

    public void disenioTablaDVenta() {
        String[] nombreColumnas = {"Cód. Barra", "Nombre", "Marca", "Cont.", "Precio", "Cant.", "Importe", "Desc.", "Subtotal"};
        modeloDv.setColumnIdentifiers(nombreColumnas);
        vistaIp.getTablaDv1().setModel(modeloDv);

        String[] nombreColumnas2 = {"Cód. Barra", "Nombre", "Marca", "Cont.", "Prec. sin IGV o exonerado", "Cant.", "Importe", "IGV", "Importe + IGV", "Desc.", "Subtot. con desc."};
        modeloDv2.setColumnIdentifiers(nombreColumnas2);
        vistaIp.getTablaDv2().setModel(modeloDv2);
        //Ajustar el tamaño de las columnas de la tabla para que se ajuste a su contenido
        FontMetrics fm = vistaIp.getTablaDv2().getFontMetrics(vistaIp.getTablaDv2().getFont());
        int anchoTitulo4 = fm.stringWidth(vistaIp.getTablaDv2().getColumnName(4));
        int anchoTitulo6 = fm.stringWidth(vistaIp.getTablaDv2().getColumnName(6));
        int anchoTitulo8 = fm.stringWidth(vistaIp.getTablaDv2().getColumnName(8));
        int anchoTitulo10 = fm.stringWidth(vistaIp.getTablaDv2().getColumnName(10));
        vistaIp.getTablaDv2().getColumnModel().getColumn(4).setPreferredWidth(anchoTitulo4);
        vistaIp.getTablaDv2().getColumnModel().getColumn(6).setPreferredWidth(anchoTitulo6);
        vistaIp.getTablaDv2().getColumnModel().getColumn(8).setPreferredWidth(anchoTitulo8);
        vistaIp.getTablaDv2().getColumnModel().getColumn(10).setPreferredWidth(anchoTitulo10);
    }

    public void actualizarHora(DateTimeFormatter formatoHora) {
        vistaIp.getLblHora().setText(String.valueOf(LocalTime.now().format(formatoHora)));
    }

    public void operacionesDv() {
        vistaIp.getPnlAgregarDv().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                /**
                 * Hay que aclarar que en todo caso las operaciones con double
                 * si o si darán un resultado diferente, es por ello que se
                 * tiene que agregar la función precisionDouble(). Porque el
                 * valor double se altera. Además es recomendable convertir de
                 * double a String y recien a BigDecimal.
                 */
                if (vistaIp.getCbInfoProduDv().getSelectedItem() != null && vistaIp.getCbInfoProduDv().getSelectedItem() != "<Seleccione info producto>") { //Si se selecciona el item del combobox válido
                    double desc = 0;
                    try {
                        vistaIp.getSpnCantidadDv().commitEdit();
                    } catch (ParseException pe) {
                        pe.getMessage();
                    }

                    boolean disponible = true;
                    String[] retInfo = obtenerInfoCbInfoProdu();
                    Producto p = productoDao.findSpecificByNameBrandContent(retInfo[0], retInfo[1], retInfo[2]);

                    double importe = p.getPrecio() * Double.parseDouble(vistaIp.getSpnCantidadDv().getValue().toString());
                    double impPreciso = Double.parseDouble(precisionDouble(importe));

                    if (((Number) vistaIp.getSpnCantidadDv().getValue()).intValue() == 0) {
                        JOptionPane.showMessageDialog(null, "Necesita agregar la cantidad para realizar la venta");
                        return;
                    }
                    /**
                     * Lógica acerca del checkbox y que el descuento no sea
                     * mayor que el importe obtenido.
                     */
                    if (vistaIp.getCheckBoxDescuentoDv().isSelected()) {
                        if (!vistaIp.getTxtDescuentoDv().getText().equals("")) {
                            BigDecimal dsctoExac = new BigDecimal(vistaIp.getTxtDescuentoDv().getText());
                            double dsctoExacto = Double.parseDouble(precisionDouble(Double.parseDouble(dsctoExac.toString())));

                            if (dsctoExacto > impPreciso) {
                                JOptionPane.showMessageDialog(null, String.format("El descuento '%s' no puede ser mayor que el importe '%s'", String.valueOf(dsctoExacto), String.valueOf(impPreciso)));
                                disponible = false;
                            } else {
                                desc = dsctoExacto;
                            }
                        } else {
                            desc = 0;
                        }
                    } else {
                        desc = 0;
                    }

                    /**
                     * Usamos la flag, para permitir o no la inserción del
                     * producto en la tabla.
                     * <br><Ahora = boleta/factura/></br>
                     */
                    if (disponible == true) {
                        if (vistaIp.getRbBoleta().isSelected() || vistaIp.getRbBoleta2().isSelected()) {
                            double valor = impPreciso - desc;
                            Object[] filaTdetV = {p.getCodBarra(), retInfo[0], retInfo[1], retInfo[2], precisionDouble(p.getPrecio()), vistaIp.getSpnCantidadDv().getValue(), precisionDouble(impPreciso), precisionDouble(desc), precisionDouble(valor)};

                            modeloDv.addRow(filaTdetV);
                            vistaIp.getTablaDv1().setModel(modeloDv);

                            limpiezaTextFieldDv();

                            /**
                             * Enfocado ahora en el total.
                             */
                            double importeT = 0;
                            double descT = 0;

                            for (int i = 0; i < vistaIp.getTablaDv1().getRowCount(); i++) {
                                importeT += Double.parseDouble(vistaIp.getTablaDv1().getValueAt(i, 6).toString());
                                descT += Double.parseDouble(vistaIp.getTablaDv1().getValueAt(i, 7).toString());
                            }

                            vistaIp.getTxtImpTotalDv().setText(precisionDouble(importeT));
                            vistaIp.getTxtDescuentoTotalDv().setText(precisionDouble(descT));
                            double totalDv = importeT - descT;
                            vistaIp.getTxtTotalPagarDv().setText(precisionDouble(totalDv));

                        } else if (vistaIp.getRbFactura().isSelected() || vistaIp.getRbFactura2().isSelected()) {
                            //----"Cód. Barra", "Nombre", "Marca", "Cont.", "Precio Sin IGV", "Cant.", "Importe sin IGV", "IGV", "Importe con IGV", "Desc.", "Subtotal con desc."
                            double prSnIgv = 0;
                            //Logica para quitar el 18% del igv para mostrarlo 
                            if (p.getIgvAplicable() == true) {
                                prSnIgv = p.getPrecio() / 1.18;
                            } else {
                                prSnIgv = p.getPrecio();
                            }
                            String cant = String.valueOf(vistaIp.getSpnCantidadDv().getValue());
                            double impSnIgv = prSnIgv * Double.parseDouble(cant);
                            double igv = impSnIgv * 0.18;
                            double impCnIgv = impSnIgv + igv;

                            Object[] filaTdetV2 = {p.getCodBarra(), retInfo[0], retInfo[1], retInfo[2], precisionDouble(prSnIgv), cant, precisionDouble(impSnIgv), precisionDouble(igv),
                                precisionDouble(impCnIgv), precisionDouble(desc), precisionDouble(impCnIgv - desc)};

                            modeloDv2.addRow(filaTdetV2);
                            vistaIp.getTablaDv2().setModel(modeloDv2);
                            limpiezaTextFieldDv();
                            /**
                             * Enfocado en el total.
                             */
                            double importeTsn = 0;
                            double igvT = 0;
                            double importeTcn = 0;
                            double descT = 0;

                            for (int i = 0; i < vistaIp.getTablaDv2().getRowCount(); i++) {
                                importeTsn += Double.parseDouble(vistaIp.getTablaDv2().getValueAt(i, 6).toString());
                                igvT += Double.parseDouble(vistaIp.getTablaDv2().getValueAt(i, 7).toString());
                                importeTcn += Double.parseDouble(vistaIp.getTablaDv2().getValueAt(i, 8).toString());
                                descT += Double.parseDouble(vistaIp.getTablaDv2().getValueAt(i, 9).toString());
                            }

                            vistaIp.getTxtImpTotalSinIgv().setText(precisionDouble(importeTsn));
                            vistaIp.getTxtIgvTotal().setText(precisionDouble(igvT));
                            vistaIp.getTxtImpTotalConIgv2Dv().setText(precisionDouble(importeTcn));
                            vistaIp.getTxtDescuentoTotal2Dv().setText(precisionDouble(descT));
                            double totalDv2 = importeTcn - descT;
                            vistaIp.getTxtTotalPagar2Dv().setText(precisionDouble(totalDv2));
                        }
                    }
                }
            } //Fin del metodo del mouseClicked
        }); //Fin del MouseListener del pnlAgregar
    } //Fin del método operaciones

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

    public void limpiezaTextFieldDv() {
        vistaIp.getCbInfoProduDv().setSelectedIndex(0);
        vistaIp.getTxtDescuentoDv().setText("");
        vistaIp.getCheckBoxDescuentoDv().setSelected(false);
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
        vistaIp.getRbBoleta2().addActionListener(this);
        vistaIp.getRbFactura2().addActionListener(this);
        vistaIp.getCbInfoProduDv().addActionListener(this);
        vistaIp.getLblDinamiTipoVenta().setText("Seleccione el tipo de venta");
        ocultarPestaniasTdP(vistaIp.getTbpTablaDv());

        vistaIp.getTxtTrabajadorDv().setText(String.format("%s, %s", usuario.getApellido(), usuario.getNombre()));

        //-------------------
        actualizarCBproductoInfoDv();
        //-------------------
        vistaIp.getCbMetPagoDv().addItem("<Seleccione>");
        vistaIp.getCbMetPagoDv().addItem("Efectivo");
        vistaIp.getCbMetPagoDv().addItem("Tarjeta");
        vistaIp.getCbMetPagoDv().addItem("Yape");
        vistaIp.getCbMetPagoDv().addItem("Plin");
        vistaIp.getCbMetPagoDv().addItem("Transacción");
        vistaIp.getCbMetPagoDv().addItem("Fiado");

        vistaIp.getSeleccionTVenta().add(vistaIp.getRbBoleta());
        vistaIp.getSeleccionTVenta().add(vistaIp.getRbFactura());
        vistaIp.getSeleccionTVenta().add(vistaIp.getRbBoleta2());
        vistaIp.getSeleccionTVenta().add(vistaIp.getRbFactura2());
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
        if (item == null || item.equals("")) {
            return;
        }
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

    public void alternarPanelesDv(boolean valor) {

        vistaIp.getPnlAgregarDv().setEnabled(valor);
        //vistaIp.getTxtCodBarraGP().setEditable(valor);
        vistaIp.getPnlActualizarDv().setEnabled(!valor);
        vistaIp.getPnlEliminarDv().setEnabled(!valor);

        if (valor == true) {
            vistaIp.getPnlAgregarDv().setBackground(pnlGrisCO(true));
            vistaIp.getPnlActualizarDv().setBackground(pnlGrisCO(false));
            vistaIp.getPnlEliminarDv().setBackground(pnlGrisCO(false));

            limpiezaTextFieldsGP();
        } else {
            vistaIp.getPnlAgregarDv().setBackground(pnlGrisCO(false));
            vistaIp.getPnlActualizarDv().setBackground(pnlGrisCO(true));
            vistaIp.getPnlEliminarDv().setBackground(pnlGrisCO(true));

        }
        vistaIp.getPnlLimpiarDv().setBackground(pnlGrisCO(true));
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
}
