package com.codigodebarra.view;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JInterfazPrincipal extends javax.swing.JFrame {

    public JInterfazPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pmInventario = new javax.swing.JPopupMenu();
        pmVenta = new javax.swing.JPopupMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        seleccionTVenta = new javax.swing.ButtonGroup();
        btnGroupContieneIgv = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        pnlNorth = new javax.swing.JPanel();
        pnlBarraDeOpciones = new javax.swing.JPanel();
        pnlMinusLogin = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        pnlFSLogin = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        pnlXLogin = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        pnlLeft = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlPrincipal = new javax.swing.JPanel();
        lblPrincipal = new javax.swing.JLabel();
        pnlCategoria = new javax.swing.JPanel();
        lblInventario = new javax.swing.JLabel();
        pnlVenta = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        pnlCerrarSesion = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        pnlInventario = new javax.swing.JPanel();
        lblInventarioPnl = new javax.swing.JLabel();
        pnlEstadistica = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        pnlProducto = new javax.swing.JPanel();
        lblInventario1 = new javax.swing.JLabel();
        pnlCenter = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelPrincipal = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        panelEscanear = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        panelProducto = new javax.swing.JPanel();
        pnlProductoTitulo = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        pnlIzquierdaOperacionesProducto = new javax.swing.JPanel();
        pnlOperacionesProducto = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        txtNombreGP = new javax.swing.JTextField();
        txtMarcaGP = new javax.swing.JTextField();
        txtContenidoGP = new javax.swing.JTextField();
        spnPrecioGP = new javax.swing.JSpinner();
        spnCantidadGP = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        pnlAgregarGP = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        pnlActualizarGP = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        pnlEliminarGP = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        pnlLimpiarGP = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        txtCodBarraGP = new javax.swing.JTextField();
        jPanel32 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        rbSiContieneIgv = new javax.swing.JRadioButton();
        rbNoContieneIgv = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        btnEscanearProduGP = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lblPdfProd = new javax.swing.JLabel();
        lblExcelProd = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        cbNombresColumnasProd = new javax.swing.JComboBox<>();
        txtValorProd = new javax.swing.JTextField();
        pnlBuscarProd = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pnlTablaProductos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        panelDetalleVenta = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        cbInfoProduDv = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        checkBoxDescuentoDv = new javax.swing.JCheckBox();
        cbMetPagoDv = new javax.swing.JComboBox<>();
        txtDescuentoDv = new javax.swing.JTextField();
        spnCantidadDv = new javax.swing.JSpinner();
        jLabel37 = new javax.swing.JLabel();
        txtPrecioDv = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtStockDv = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        pnlAgregarDv = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        pnlEliminarDv = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        pnlActualizarDv = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        txtContenidoDv = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        pnlLimpiarDv = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        txtTrabajadorDv = new javax.swing.JTextField();
        pnlEscanearCodBarraDv = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaObservacion = new javax.swing.JTextArea();
        btnGuardarVenta = new javax.swing.JButton();
        btnCancelarVenta = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        tbpTablaDv = new javax.swing.JTabbedPane();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        rbBoleta = new javax.swing.JRadioButton();
        rbFactura = new javax.swing.JRadioButton();
        jSeparator11 = new javax.swing.JSeparator();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaDetalleVenta = new javax.swing.JTable();
        jPanel21 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtDescuentoTotalDv = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jTextField5 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        txtTotalPagarDv = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jTextField7 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        txtImpTotalDv = new javax.swing.JTextField();
        jPanel26 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jTextField9 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaDv2 = new javax.swing.JTable();
        jPanel40 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jTextField11 = new javax.swing.JTextField();
        lblPdfDv = new javax.swing.JLabel();
        lblExcelDv = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        txtDescuentoTotal2Dv = new javax.swing.JTextField();
        jPanel45 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jTextField13 = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        txtTotalPagar2Dv = new javax.swing.JTextField();
        jPanel47 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jTextField15 = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        jSeparator17 = new javax.swing.JSeparator();
        txtImpTotalSinIgv = new javax.swing.JTextField();
        jPanel49 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        jTextField17 = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        txtIgvTotal = new javax.swing.JTextField();
        jPanel51 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        jTextField19 = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        jPanel52 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();
        jTextField21 = new javax.swing.JTextField();
        jPanel54 = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jSeparator23 = new javax.swing.JSeparator();
        jTextField22 = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jSeparator24 = new javax.swing.JSeparator();
        txtImpTotalConIgv2Dv = new javax.swing.JTextField();
        jPanel39 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        lblDinamiTipoVenta = new javax.swing.JLabel();
        rbBoleta1 = new javax.swing.JRadioButton();
        rbFactura1 = new javax.swing.JRadioButton();
        panelVenta = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaVenta = new javax.swing.JTable();
        cbOrdenarV = new javax.swing.JComboBox<>();
        btnOrdenarV = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 1453));
        setUndecorated(true);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1080, 910));
        jPanel1.setLayout(new java.awt.BorderLayout());

        pnlNorth.setBackground(new java.awt.Color(51, 51, 51));
        pnlNorth.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlNorth.setMaximumSize(new java.awt.Dimension(32767, 40));
        pnlNorth.setPreferredSize(new java.awt.Dimension(1065, 50));
        pnlNorth.setLayout(new java.awt.CardLayout());

        pnlBarraDeOpciones.setBackground(new java.awt.Color(51, 51, 51));

        pnlMinusLogin.setBackground(new java.awt.Color(51, 51, 51));
        pnlMinusLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlMinusLogin.setPreferredSize(new java.awt.Dimension(56, 50));

        jLabel15.setBackground(new java.awt.Color(51, 51, 51));
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minus.png"))); // NOI18N
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlMinusLoginLayout = new javax.swing.GroupLayout(pnlMinusLogin);
        pnlMinusLogin.setLayout(pnlMinusLoginLayout);
        pnlMinusLoginLayout.setHorizontalGroup(
            pnlMinusLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );
        pnlMinusLoginLayout.setVerticalGroup(
            pnlMinusLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlFSLogin.setBackground(new java.awt.Color(51, 51, 51));
        pnlFSLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlFSLogin.setPreferredSize(new java.awt.Dimension(56, 50));

        jLabel14.setBackground(new java.awt.Color(51, 51, 51));
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/full_screen.png"))); // NOI18N

        javax.swing.GroupLayout pnlFSLoginLayout = new javax.swing.GroupLayout(pnlFSLogin);
        pnlFSLogin.setLayout(pnlFSLoginLayout);
        pnlFSLoginLayout.setHorizontalGroup(
            pnlFSLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );
        pnlFSLoginLayout.setVerticalGroup(
            pnlFSLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlXLogin.setBackground(new java.awt.Color(51, 51, 51));
        pnlXLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel13.setBackground(new java.awt.Color(51, 51, 51));
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.png"))); // NOI18N

        javax.swing.GroupLayout pnlXLoginLayout = new javax.swing.GroupLayout(pnlXLogin);
        pnlXLogin.setLayout(pnlXLoginLayout);
        pnlXLoginLayout.setHorizontalGroup(
            pnlXLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );
        pnlXLoginLayout.setVerticalGroup(
            pnlXLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlBarraDeOpcionesLayout = new javax.swing.GroupLayout(pnlBarraDeOpciones);
        pnlBarraDeOpciones.setLayout(pnlBarraDeOpcionesLayout);
        pnlBarraDeOpcionesLayout.setHorizontalGroup(
            pnlBarraDeOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBarraDeOpcionesLayout.createSequentialGroup()
                .addContainerGap(1682, Short.MAX_VALUE)
                .addComponent(pnlMinusLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlFSLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlXLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlBarraDeOpcionesLayout.setVerticalGroup(
            pnlBarraDeOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBarraDeOpcionesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlBarraDeOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlFSLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlXLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlMinusLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pnlNorth.add(pnlBarraDeOpciones, "card2");

        jPanel1.add(pnlNorth, java.awt.BorderLayout.NORTH);

        pnlLeft.setBackground(new java.awt.Color(51, 51, 51));
        pnlLeft.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlLeft.setMinimumSize(new java.awt.Dimension(200, 0));
        pnlLeft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tienda_icono.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setToolTipText("");
        pnlLeft.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 118, 114));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LA CANASTA");
        pnlLeft.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 130, -1));

        lblPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        lblPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        lblPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrincipal.setText("Principal");
        lblPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlLeft.add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 200, -1));

        pnlCategoria.setForeground(new java.awt.Color(255, 255, 255));

        lblInventario.setBackground(new java.awt.Color(0, 0, 0));
        lblInventario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblInventario.setForeground(new java.awt.Color(0, 0, 0));
        lblInventario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInventario.setText("Categoría");
        lblInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlCategoriaLayout = new javax.swing.GroupLayout(pnlCategoria);
        pnlCategoria.setLayout(pnlCategoriaLayout);
        pnlCategoriaLayout.setHorizontalGroup(
            pnlCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInventario, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        pnlCategoriaLayout.setVerticalGroup(
            pnlCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInventario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        pnlLeft.add(pnlCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 200, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Venta");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlVentaLayout = new javax.swing.GroupLayout(pnlVenta);
        pnlVenta.setLayout(pnlVentaLayout);
        pnlVentaLayout.setHorizontalGroup(
            pnlVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(pnlVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
        );
        pnlVentaLayout.setVerticalGroup(
            pnlVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(pnlVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        pnlLeft.add(pnlVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 200, 40));

        pnlCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cerrar sesión");

        javax.swing.GroupLayout pnlCerrarSesionLayout = new javax.swing.GroupLayout(pnlCerrarSesion);
        pnlCerrarSesion.setLayout(pnlCerrarSesionLayout);
        pnlCerrarSesionLayout.setHorizontalGroup(
            pnlCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCerrarSesionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlCerrarSesionLayout.setVerticalGroup(
            pnlCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        pnlLeft.add(pnlCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 200, 40));

        lblInventarioPnl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblInventarioPnl.setForeground(new java.awt.Color(0, 0, 0));
        lblInventarioPnl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInventarioPnl.setText("Inventario");

        javax.swing.GroupLayout pnlInventarioLayout = new javax.swing.GroupLayout(pnlInventario);
        pnlInventario.setLayout(pnlInventarioLayout);
        pnlInventarioLayout.setHorizontalGroup(
            pnlInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInventarioPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        pnlInventarioLayout.setVerticalGroup(
            pnlInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInventarioPnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        pnlLeft.add(pnlInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 40));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Estadística");

        javax.swing.GroupLayout pnlEstadisticaLayout = new javax.swing.GroupLayout(pnlEstadistica);
        pnlEstadistica.setLayout(pnlEstadisticaLayout);
        pnlEstadisticaLayout.setHorizontalGroup(
            pnlEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        pnlEstadisticaLayout.setVerticalGroup(
            pnlEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        pnlLeft.add(pnlEstadistica, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 200, 40));

        pnlProducto.setForeground(new java.awt.Color(255, 255, 255));

        lblInventario1.setBackground(new java.awt.Color(0, 0, 0));
        lblInventario1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblInventario1.setForeground(new java.awt.Color(0, 0, 0));
        lblInventario1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInventario1.setText("Producto");
        lblInventario1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlProductoLayout = new javax.swing.GroupLayout(pnlProducto);
        pnlProducto.setLayout(pnlProductoLayout);
        pnlProductoLayout.setHorizontalGroup(
            pnlProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInventario1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        pnlProductoLayout.setVerticalGroup(
            pnlProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInventario1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        pnlLeft.add(pnlProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 200, 40));

        jPanel1.add(pnlLeft, java.awt.BorderLayout.WEST);

        pnlCenter.setBackground(new java.awt.Color(51, 255, 255));
        pnlCenter.setLayout(new java.awt.GridLayout(1, 0));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(1650, 110));
        jPanel4.setPreferredSize(new java.awt.Dimension(1650, 110));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        panelPrincipal.setBackground(new java.awt.Color(51, 51, 51));
        panelPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIENDA DE ABARROTES - LA CANASTA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1650, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
        );

        panelPrincipal.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.setPreferredSize(new java.awt.Dimension(753, 100));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Bienvenido(a), ");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 14, -1, 60));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel5.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 28, 570, 33));
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 510, 20));

        panelPrincipal.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 92, 1650, 860));

        jTabbedPane1.addTab("tab1", panelPrincipal);

        panelEscanear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelEscanear.setOpaque(false);
        panelEscanear.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(240, 240, 240));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel33.setText("Inventario");
        jPanel17.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 150, 30));

        jPanel2.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 230, 50));

        panelEscanear.add(jPanel2, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("tab2", panelEscanear);
        panelEscanear.getAccessibleContext().setAccessibleDescription("");

        panelProducto.setBackground(new java.awt.Color(255, 255, 255));
        panelProducto.setPreferredSize(new java.awt.Dimension(1900, 2000));
        panelProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlProductoTitulo.setBackground(new java.awt.Color(255, 255, 255));
        pnlProductoTitulo.setForeground(new java.awt.Color(255, 255, 255));
        pnlProductoTitulo.setLayout(new java.awt.GridLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("GESTIÓN DE PRODUCTOS");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlProductoTitulo.add(jLabel11);

        panelProducto.add(pnlProductoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 0, 1490, 71));

        pnlIzquierdaOperacionesProducto.setBackground(new java.awt.Color(255, 255, 102));
        pnlIzquierdaOperacionesProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlOperacionesProducto.setBackground(new java.awt.Color(102, 102, 102));
        pnlOperacionesProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombreGP.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        txtNombreGP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreGPActionPerformed(evt);
            }
        });
        jPanel11.add(txtNombreGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 300, 40));

        txtMarcaGP.setBorder(javax.swing.BorderFactory.createTitledBorder("Marca"));
        jPanel11.add(txtMarcaGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 300, 40));

        txtContenidoGP.setBorder(javax.swing.BorderFactory.createTitledBorder("Contenido"));
        jPanel11.add(txtContenidoGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 160, 40));

        spnPrecioGP.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 0.1d));
        spnPrecioGP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel11.add(spnPrecioGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 328, 140, 30));

        spnCantidadGP.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel11.add(spnCantidadGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 328, 140, 30));

        jLabel20.setText("Precio");
        jPanel11.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 312, -1, -1));

        jLabel21.setText("Stock");
        jPanel11.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 312, 60, -1));

        pnlAgregarGP.setBackground(new java.awt.Color(255, 255, 255));

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Agregar");
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlAgregarGPLayout = new javax.swing.GroupLayout(pnlAgregarGP);
        pnlAgregarGP.setLayout(pnlAgregarGPLayout);
        pnlAgregarGPLayout.setHorizontalGroup(
            pnlAgregarGPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlAgregarGPLayout.setVerticalGroup(
            pnlAgregarGPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel11.add(pnlAgregarGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 110, 30));
        jPanel11.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 300, 10));

        pnlActualizarGP.setBackground(new java.awt.Color(255, 255, 255));

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Actualizar");
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlActualizarGPLayout = new javax.swing.GroupLayout(pnlActualizarGP);
        pnlActualizarGP.setLayout(pnlActualizarGPLayout);
        pnlActualizarGPLayout.setHorizontalGroup(
            pnlActualizarGPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlActualizarGPLayout.setVerticalGroup(
            pnlActualizarGPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel11.add(pnlActualizarGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 110, 30));

        pnlEliminarGP.setBackground(new java.awt.Color(255, 255, 255));

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Eliminar");
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlEliminarGPLayout = new javax.swing.GroupLayout(pnlEliminarGP);
        pnlEliminarGP.setLayout(pnlEliminarGPLayout);
        pnlEliminarGPLayout.setHorizontalGroup(
            pnlEliminarGPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlEliminarGPLayout.setVerticalGroup(
            pnlEliminarGPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel11.add(pnlEliminarGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 110, 30));

        pnlLimpiarGP.setBackground(new java.awt.Color(255, 255, 255));

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Limpiar");
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlLimpiarGPLayout = new javax.swing.GroupLayout(pnlLimpiarGP);
        pnlLimpiarGP.setLayout(pnlLimpiarGPLayout);
        pnlLimpiarGPLayout.setHorizontalGroup(
            pnlLimpiarGPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlLimpiarGPLayout.setVerticalGroup(
            pnlLimpiarGPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel11.add(pnlLimpiarGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 110, 30));

        txtCodBarraGP.setBorder(javax.swing.BorderFactory.createTitledBorder("Cód. de barra"));
        jPanel11.add(txtCodBarraGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 220, 40));

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel62.setText("¿Contiene IGV?");
        jPanel32.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        rbSiContieneIgv.setBackground(new java.awt.Color(255, 255, 255));
        rbSiContieneIgv.setText("Si");
        rbSiContieneIgv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel32.add(rbSiContieneIgv, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, 20));

        rbNoContieneIgv.setBackground(new java.awt.Color(255, 255, 255));
        rbNoContieneIgv.setText("No, está exonerado");
        rbNoContieneIgv.setToolTipText("Generalmente productos naturales");
        rbNoContieneIgv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbNoContieneIgv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoContieneIgvActionPerformed(evt);
            }
        });
        jPanel32.add(rbNoContieneIgv, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 130, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconoInfo.png"))); // NOI18N
        jLabel6.setToolTipText("Por defecto todo producto debe tener IGV, a excepción de los productos exonerados");
        jPanel32.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, 20));

        jPanel11.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 253, 300, 50));

        btnEscanearProduGP.setBackground(new java.awt.Color(255, 255, 255));
        btnEscanearProduGP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escanear_codigo_30x30.png"))); // NOI18N
        btnEscanearProduGP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel11.add(btnEscanearProduGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 70, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel11.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 208, 130, 30));

        jLabel4.setText("Categoría");
        jPanel11.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 192, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("AGREGAR/ACTUALIZAR/ELIMINAR");
        jPanel11.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 10, 320, 30));

        pnlOperacionesProducto.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 420, 480));

        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setText("Se descargará la información de los elementos actuales de la tabla");
        jPanel16.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setText("Descargar información");
        jPanel16.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 220, -1));

        lblPdfProd.setBackground(new java.awt.Color(255, 255, 255));
        lblPdfProd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPdfProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf.png"))); // NOI18N
        lblPdfProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel16.add(lblPdfProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 50, 50));

        lblExcelProd.setBackground(new java.awt.Color(255, 255, 255));
        lblExcelProd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExcelProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excel.png"))); // NOI18N
        lblExcelProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel16.add(lblExcelProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 50, 50));

        pnlOperacionesProducto.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 420, 120));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbNombresColumnasProd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbNombresColumnasProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNombresColumnasProdActionPerformed(evt);
            }
        });
        jPanel6.add(cbNombresColumnasProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 64, 140, 30));

        txtValorProd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel6.add(txtValorProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 64, 140, 30));

        pnlBuscarProd.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Buscar");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlBuscarProdLayout = new javax.swing.GroupLayout(pnlBuscarProd);
        pnlBuscarProd.setLayout(pnlBuscarProdLayout);
        pnlBuscarProdLayout.setHorizontalGroup(
            pnlBuscarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlBuscarProdLayout.setVerticalGroup(
            pnlBuscarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel6.add(pnlBuscarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 80, 30));

        jLabel17.setText("Columna");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 47, -1, -1));

        jLabel18.setText("Valor");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 47, 40, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("BUSCAR PRODUCTO");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 230, -1));

        pnlOperacionesProducto.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 160));

        pnlIzquierdaOperacionesProducto.add(pnlOperacionesProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 790));

        panelProducto.add(pnlIzquierdaOperacionesProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 71, 420, 790));

        pnlTablaProductos.setBackground(new java.awt.Color(204, 204, 204));
        pnlTablaProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaProductos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaProductos.setShowGrid(false);
        jScrollPane1.setViewportView(tablaProductos);

        pnlTablaProductos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 960, 780));

        panelProducto.add(pnlTablaProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 71, 1020, -1));

        jTabbedPane1.addTab("tab3", panelProducto);

        panelDetalleVenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel51.setText("#00000000000");
        jPanel9.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 13, 190, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel31.setText("Venta");
        jPanel9.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 7, 110, 40));

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 380, 60));

        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.add(cbInfoProduDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 230, 30));

        jLabel34.setText("Información del producto");
        jPanel13.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 150, -1));

        jLabel35.setText("Trabajador");
        jPanel13.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 120, 20));

        jLabel36.setText("Cantidad");
        jPanel13.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        checkBoxDescuentoDv.setText("Descuento");
        checkBoxDescuentoDv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel13.add(checkBoxDescuentoDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, 30));

        jPanel13.add(cbMetPagoDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 130, 30));

        txtDescuentoDv.setEditable(false);
        jPanel13.add(txtDescuentoDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 170, 30));

        spnCantidadDv.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel13.add(spnCantidadDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 130, 30));

        jLabel37.setText("Método de pago");
        jPanel13.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        txtPrecioDv.setEditable(false);
        txtPrecioDv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel13.add(txtPrecioDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 80, -1));

        jLabel38.setText("Precio");
        jPanel13.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        txtStockDv.setEditable(false);
        txtStockDv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel13.add(txtStockDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 80, -1));

        jLabel39.setText("Stock");
        jPanel13.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        pnlAgregarDv.setBackground(new java.awt.Color(255, 255, 255));
        pnlAgregarDv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("Agregar");
        jLabel59.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel59.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlAgregarDv.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        jPanel13.add(pnlAgregarDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 100, 30));

        pnlEliminarDv.setBackground(new java.awt.Color(255, 255, 255));

        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("Eliminar");
        jLabel60.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlEliminarDvLayout = new javax.swing.GroupLayout(pnlEliminarDv);
        pnlEliminarDv.setLayout(pnlEliminarDvLayout);
        pnlEliminarDvLayout.setHorizontalGroup(
            pnlEliminarDvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlEliminarDvLayout.setVerticalGroup(
            pnlEliminarDvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel13.add(pnlEliminarDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 100, 30));

        pnlActualizarDv.setBackground(new java.awt.Color(255, 255, 255));

        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("Actualizar");
        jLabel61.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlActualizarDvLayout = new javax.swing.GroupLayout(pnlActualizarDv);
        pnlActualizarDv.setLayout(pnlActualizarDvLayout);
        pnlActualizarDvLayout.setHorizontalGroup(
            pnlActualizarDvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlActualizarDvLayout.setVerticalGroup(
            pnlActualizarDvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel13.add(pnlActualizarDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 100, 30));

        txtContenidoDv.setEditable(false);
        txtContenidoDv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel13.add(txtContenidoDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 100, 26));

        jLabel50.setText("Contenido");
        jPanel13.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        pnlLimpiarDv.setBackground(new java.awt.Color(255, 255, 255));
        pnlLimpiarDv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("Limpiar");
        jLabel66.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel66.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlLimpiarDv.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        jPanel13.add(pnlLimpiarDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 100, 30));

        txtTrabajadorDv.setEditable(false);
        txtTrabajadorDv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel13.add(txtTrabajadorDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 300, 30));

        pnlEscanearCodBarraDv.setBackground(new java.awt.Color(204, 204, 204));
        pnlEscanearCodBarraDv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setBackground(new java.awt.Color(153, 153, 153));
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escanear_codigo_30x30.png"))); // NOI18N
        jLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlEscanearCodBarraDv.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 30));

        jPanel13.add(pnlEscanearCodBarraDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 60, 30));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconoInfo.png"))); // NOI18N
        jLabel25.setToolTipText("Solo productos con información completa y stock mayor a 0");
        jPanel13.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 68, -1, -1));

        jPanel8.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 380, 410));

        jPanel27.setBackground(new java.awt.Color(204, 204, 204));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAreaObservacion.setColumns(20);
        txtAreaObservacion.setRows(5);
        jScrollPane2.setViewportView(txtAreaObservacion);

        jPanel27.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 320, 120));

        btnGuardarVenta.setText("Guardar");
        btnGuardarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel27.add(btnGuardarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 100, 40));

        btnCancelarVenta.setText("Cancelar");
        btnCancelarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel27.add(btnCancelarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 100, 40));

        jPanel8.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 380, 200));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 0));
        jLabel52.setText("Si ya agregaste todos los productos");
        jPanel8.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 320, -1));
        jPanel8.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 330, 10));

        panelDetalleVenta.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 420, 790));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setForeground(new java.awt.Color(0, 0, 0));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("GESTIONAR DETALLE DE VENTA");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 1654, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 246, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        panelDetalleVenta.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 90));

        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel58.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("Seleccione el tipo de venta, antes de empezar");
        jPanel29.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 721, 50));

        rbBoleta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbBoleta.setText("Boleta");
        rbBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBoletaActionPerformed(evt);
            }
        });
        jPanel29.add(rbBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        rbFactura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbFactura.setText("Factura");
        rbFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFacturaActionPerformed(evt);
            }
        });
        jPanel29.add(rbFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, -1));
        jPanel29.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 520, 10));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(260, Short.MAX_VALUE))
        );

        tbpTablaDv.addTab("tab3", jPanel28);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaDetalleVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaDetalleVenta);

        jPanel19.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 1060, 590));

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel41.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("(S/.)");
        jPanel21.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 70, -1));
        jPanel21.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 120, 20));

        txtDescuentoTotalDv.setEditable(false);
        txtDescuentoTotalDv.setBackground(new java.awt.Color(255, 255, 255));
        txtDescuentoTotalDv.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtDescuentoTotalDv.setForeground(new java.awt.Color(60, 63, 65));
        txtDescuentoTotalDv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDescuentoTotalDv.setBorder(null);
        jPanel21.add(txtDescuentoTotalDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 120, 20));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Total a pagar (S/.) : ");
        jPanel22.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel22.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 45, 140, 20));

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel22.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 24, 130, 20));

        jPanel21.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 670, 370, 70));

        jLabel55.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel55.setText("DESCUENTO");
        jPanel21.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, -1));

        jLabel56.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel56.setText("TOTAL");
        jPanel21.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 120, -1));

        jPanel19.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 610, 350, 70));

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 0));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("(S/.)");
        jPanel23.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));
        jPanel23.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 130, 10));

        txtTotalPagarDv.setEditable(false);
        txtTotalPagarDv.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalPagarDv.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtTotalPagarDv.setForeground(new java.awt.Color(60, 63, 65));
        txtTotalPagarDv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalPagarDv.setBorder(null);
        jPanel23.add(txtTotalPagarDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 140, 20));

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel44.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Total a pagar (S/.) : ");
        jPanel24.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel24.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 45, 140, 20));

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel24.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 24, 130, 20));

        jPanel23.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 670, 370, 70));

        jLabel54.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel54.setText("A PAGAR");
        jPanel23.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, -1));

        jLabel57.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel57.setText("TOTAL");
        jPanel23.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 120, -1));

        jPanel19.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 610, 360, 70));

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("(S/.)");
        jPanel25.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 70, -1));
        jPanel25.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 110, 20));

        txtImpTotalDv.setEditable(false);
        txtImpTotalDv.setBackground(new java.awt.Color(255, 255, 255));
        txtImpTotalDv.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtImpTotalDv.setForeground(new java.awt.Color(60, 63, 65));
        txtImpTotalDv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtImpTotalDv.setBorder(null);
        jPanel25.add(txtImpTotalDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 110, 20));

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel46.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 0));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Total a pagar (S/.) : ");
        jPanel26.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel26.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 45, 140, 20));

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel26.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 24, 130, 20));

        jPanel25.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 670, 370, 70));

        jLabel48.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel48.setText("TOTAL");
        jPanel25.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 120, -1));

        jLabel53.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel53.setText("IMPORTE");
        jPanel25.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 120, -1));

        jPanel19.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 610, 310, 70));

        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf.png"))); // NOI18N
        jPanel12.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 60, 50));

        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excel.png"))); // NOI18N
        jPanel12.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 60, 50));

        jPanel19.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 60, 130));

        tbpTablaDv.addTab("tab1", jPanel19);

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));
        jPanel37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaDv2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tablaDv2);

        jPanel37.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1170, 440));

        jPanel40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel42.setBackground(new java.awt.Color(255, 255, 255));
        jPanel42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel43.setBackground(new java.awt.Color(255, 255, 255));
        jPanel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel64.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(0, 0, 0));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("Total a pagar (S/.) : ");
        jPanel43.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel43.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 45, 140, 20));

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel43.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 24, 130, 20));

        jPanel42.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 670, 370, 70));

        lblPdfDv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf.png"))); // NOI18N
        lblPdfDv.setText("PDF");
        jPanel42.add(lblPdfDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 60, 50));

        lblExcelDv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excel.png"))); // NOI18N
        lblExcelDv.setText("EXCEL");
        jPanel42.add(lblExcelDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 80, 50));

        jPanel40.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 340, 70));

        jPanel44.setBackground(new java.awt.Color(255, 255, 255));
        jPanel44.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel67.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(0, 0, 0));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("(S/.)");
        jPanel44.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 70, -1));
        jPanel44.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 120, 20));

        txtDescuentoTotal2Dv.setEditable(false);
        txtDescuentoTotal2Dv.setBackground(new java.awt.Color(255, 255, 255));
        txtDescuentoTotal2Dv.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtDescuentoTotal2Dv.setForeground(new java.awt.Color(60, 63, 65));
        txtDescuentoTotal2Dv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDescuentoTotal2Dv.setBorder(null);
        jPanel44.add(txtDescuentoTotal2Dv, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 120, 20));

        jPanel45.setBackground(new java.awt.Color(255, 255, 255));
        jPanel45.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel68.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(0, 0, 0));
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("Total a pagar (S/.) : ");
        jPanel45.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel45.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 45, 140, 20));

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel45.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 24, 130, 20));

        jPanel44.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 670, 370, 70));

        jLabel69.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel69.setText("DESCUENTO");
        jPanel44.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 120, -1));

        jLabel70.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel70.setText("TOTAL");
        jPanel44.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 90, -1));

        jPanel40.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 350, 70));

        jPanel46.setBackground(new java.awt.Color(255, 255, 255));
        jPanel46.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel71.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(0, 0, 0));
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("(S/.)");
        jPanel46.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));
        jPanel46.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 140, 10));

        txtTotalPagar2Dv.setEditable(false);
        txtTotalPagar2Dv.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalPagar2Dv.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtTotalPagar2Dv.setForeground(new java.awt.Color(60, 63, 65));
        txtTotalPagar2Dv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalPagar2Dv.setBorder(null);
        jPanel46.add(txtTotalPagar2Dv, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 150, 20));

        jPanel47.setBackground(new java.awt.Color(255, 255, 255));
        jPanel47.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel72.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(0, 0, 0));
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("Total a pagar (S/.) : ");
        jPanel47.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel47.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 45, 140, 20));

        jTextField15.setEditable(false);
        jTextField15.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel47.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 24, 130, 20));

        jPanel46.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 670, 370, 70));

        jLabel73.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel73.setText("A PAGAR");
        jPanel46.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 100, -1));

        jLabel74.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel74.setText("TOTAL");
        jPanel46.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 100, -1));

        jPanel40.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 360, 70));

        jPanel48.setBackground(new java.awt.Color(255, 255, 255));
        jPanel48.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel48.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 90, 20));

        txtImpTotalSinIgv.setEditable(false);
        txtImpTotalSinIgv.setBackground(new java.awt.Color(255, 255, 255));
        txtImpTotalSinIgv.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtImpTotalSinIgv.setForeground(new java.awt.Color(60, 63, 65));
        txtImpTotalSinIgv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtImpTotalSinIgv.setBorder(null);
        txtImpTotalSinIgv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImpTotalSinIgvActionPerformed(evt);
            }
        });
        jPanel48.add(txtImpTotalSinIgv, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 90, 20));

        jPanel49.setBackground(new java.awt.Color(255, 255, 255));
        jPanel49.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel76.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(0, 0, 0));
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setText("Total a pagar (S/.) : ");
        jPanel49.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel49.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 45, 140, 20));

        jTextField17.setEditable(false);
        jTextField17.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel49.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 24, 130, 20));

        jPanel48.add(jPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 670, 370, 70));

        jLabel78.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setText("IMPORTE TOTAL");
        jPanel48.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, 150, -1));

        jLabel87.setText("SIN IGV O EXONERADO");
        jPanel48.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 35, -1, -1));

        jLabel88.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(0, 0, 0));
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setText("(S/.)");
        jPanel48.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 70, -1));

        jPanel40.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 340, 70));

        jPanel50.setBackground(new java.awt.Color(255, 255, 255));
        jPanel50.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel79.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(0, 0, 0));
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setText("(S/.)");
        jPanel50.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 70, -1));
        jPanel50.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 120, 20));

        txtIgvTotal.setEditable(false);
        txtIgvTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtIgvTotal.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtIgvTotal.setForeground(new java.awt.Color(60, 63, 65));
        txtIgvTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIgvTotal.setBorder(null);
        jPanel50.add(txtIgvTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 120, 20));

        jPanel51.setBackground(new java.awt.Color(255, 255, 255));
        jPanel51.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel80.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(0, 0, 0));
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel80.setText("Total a pagar (S/.) : ");
        jPanel51.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel51.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 45, 140, 20));

        jTextField19.setEditable(false);
        jTextField19.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel51.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 24, 130, 20));

        jPanel50.add(jPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 670, 370, 70));

        jLabel81.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setText("IGV TOTAL");
        jPanel50.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, -1));

        jPanel40.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 350, 70));

        jPanel52.setBackground(new java.awt.Color(255, 255, 255));
        jPanel52.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel53.setBackground(new java.awt.Color(255, 255, 255));
        jPanel53.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel84.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(0, 0, 0));
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setText("Total a pagar (S/.) : ");
        jPanel53.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel53.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 45, 140, 20));

        jTextField21.setEditable(false);
        jTextField21.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel53.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 24, 130, 20));

        jPanel52.add(jPanel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 670, 370, 70));

        jPanel54.setBackground(new java.awt.Color(255, 255, 255));
        jPanel54.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel55.setBackground(new java.awt.Color(255, 255, 255));
        jPanel55.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel89.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(0, 0, 0));
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setText("Total a pagar (S/.) : ");
        jPanel55.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel55.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 45, 140, 20));

        jTextField22.setEditable(false);
        jTextField22.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel55.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 24, 130, 20));

        jPanel54.add(jPanel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 670, 370, 70));

        jPanel52.add(jPanel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 360, 70));

        jLabel82.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setText("IMPORTE TOTAL");
        jPanel52.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, 150, -1));

        jLabel90.setText("MÁS IGV");
        jPanel52.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 35, 60, -1));

        jLabel91.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(0, 0, 0));
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setText("(S/.)");
        jPanel52.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 70, -1));
        jPanel52.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 90, 20));

        txtImpTotalConIgv2Dv.setEditable(false);
        txtImpTotalConIgv2Dv.setBackground(new java.awt.Color(255, 255, 255));
        txtImpTotalConIgv2Dv.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtImpTotalConIgv2Dv.setForeground(new java.awt.Color(60, 63, 65));
        txtImpTotalConIgv2Dv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtImpTotalConIgv2Dv.setBorder(null);
        txtImpTotalConIgv2Dv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImpTotalConIgv2DvActionPerformed(evt);
            }
        });
        jPanel52.add(txtImpTotalConIgv2Dv, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 90, 20));

        jPanel40.add(jPanel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 360, 70));

        jPanel37.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 1170, 220));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
        );

        tbpTablaDv.addTab("tab2", jPanel35);

        panelDetalleVenta.add(tbpTablaDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 1210, 730));

        jPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFecha.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFecha.setText("fecha");
        jPanel10.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 30));

        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHora.setText("hora");
        jPanel10.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 150, -1));

        jPanel39.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 330, 60));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel39.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -40, -1, -1));

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDinamiTipoVenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDinamiTipoVenta.setText("Seleccione el tipo de venta");
        jPanel31.add(lblDinamiTipoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 180, -1));

        rbBoleta1.setBackground(new java.awt.Color(255, 255, 255));
        rbBoleta1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbBoleta1.setText("Boleta");
        rbBoleta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBoleta1ActionPerformed(evt);
            }
        });
        jPanel31.add(rbBoleta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 18, -1, -1));

        rbFactura1.setBackground(new java.awt.Color(255, 255, 255));
        rbFactura1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbFactura1.setText("Factura");
        rbFactura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFactura1ActionPerformed(evt);
            }
        });
        jPanel31.add(rbFactura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 18, -1, -1));

        jPanel39.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 60));

        panelDetalleVenta.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 1210, 60));

        jTabbedPane1.addTab("tab4", panelDetalleVenta);

        panelVenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel32.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("VENTAS REALIZADAS");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1650, -1));

        jPanel18.setBackground(new java.awt.Color(204, 204, 204));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tablaVenta);

        jPanel18.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 184, 1120, 650));

        jPanel18.add(cbOrdenarV, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 340, 40));

        btnOrdenarV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnOrdenarV.setText("Ordenar");
        jPanel18.add(btnOrdenarV, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 100, 40));

        jPanel14.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1650, 880));

        panelVenta.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1650, 880));

        jTabbedPane1.addTab("tab5", panelVenta);

        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("ESTADÍSTICA");
        jPanel34.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 300, 72));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel34.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 350, 40));

        jButton1.setText("jButton1");
        jPanel34.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 90, 120, 40));

        jPanel20.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1650, 880));

        jTabbedPane1.addTab("tab6", jPanel20);

        jPanel4.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1650, 910));

        pnlCenter.add(jPanel4);

        jPanel1.add(pnlCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFacturaActionPerformed

    private void rbBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBoletaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbBoletaActionPerformed

    private void txtImpTotalSinIgvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImpTotalSinIgvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImpTotalSinIgvActionPerformed

    private void txtImpTotalConIgv2DvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImpTotalConIgv2DvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImpTotalConIgv2DvActionPerformed

    private void rbBoleta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBoleta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbBoleta1ActionPerformed

    private void rbFactura1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFactura1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFactura1ActionPerformed

    private void rbNoContieneIgvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoContieneIgvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbNoContieneIgvActionPerformed

    private void cbNombresColumnasProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNombresColumnasProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNombresColumnasProdActionPerformed

    private void txtNombreGPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreGPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreGPActionPerformed

    public JButton getBtnCancelarVenta() {
        return btnCancelarVenta;
    }

    public void setBtnCancelarVenta(JButton btnCancelarVenta) {
        this.btnCancelarVenta = btnCancelarVenta;
    }

    public JButton getBtnEscanearProduGP() {
        return btnEscanearProduGP;
    }

    public void setBtnEscanearProduGP(JButton btnEscanearProduGP) {
        this.btnEscanearProduGP = btnEscanearProduGP;
    }

    public ButtonGroup getBtnGroupContieneIgv() {
        return btnGroupContieneIgv;
    }

    public void setBtnGroupContieneIgv(ButtonGroup btnGroupContieneIgv) {
        this.btnGroupContieneIgv = btnGroupContieneIgv;
    }

    public JButton getBtnGuardarVenta() {
        return btnGuardarVenta;
    }

    public void setBtnGuardarVenta(JButton btnGuardarVenta) {
        this.btnGuardarVenta = btnGuardarVenta;
    }

    public JButton getBtnOrdenarV() {
        return btnOrdenarV;
    }

    public void setBtnOrdenarV(JButton btnOrdenarV) {
        this.btnOrdenarV = btnOrdenarV;
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public void setButtonGroup1(ButtonGroup buttonGroup1) {
        this.buttonGroup1 = buttonGroup1;
    }

    public JComboBox<String> getCbInfoProduDv() {
        return cbInfoProduDv;
    }

    public void setCbInfoProduDv(JComboBox<String> cbInfoProduDv) {
        this.cbInfoProduDv = cbInfoProduDv;
    }

    public JComboBox<String> getCbMetPagoDv() {
        return cbMetPagoDv;
    }

    public void setCbMetPagoDv(JComboBox<String> cbMetPagoDv) {
        this.cbMetPagoDv = cbMetPagoDv;
    }

    public JComboBox<String> getCbNombresColumnasProd() {
        return cbNombresColumnasProd;
    }

    public void setCbNombresColumnasProd(JComboBox<String> cbNombresColumnasProd) {
        this.cbNombresColumnasProd = cbNombresColumnasProd;
    }

    public JComboBox<String> getCbOrdenarV() {
        return cbOrdenarV;
    }

    public void setCbOrdenarV(JComboBox<String> cbOrdenarV) {
        this.cbOrdenarV = cbOrdenarV;
    }

    public JCheckBox getCheckBoxDescuentoDv() {
        return checkBoxDescuentoDv;
    }

    public void setCheckBoxDescuentoDv(JCheckBox checkBoxDescuentoDv) {
        this.checkBoxDescuentoDv = checkBoxDescuentoDv;
    }

    public JComboBox<String> getjComboBox1() {
        return jComboBox1;
    }

    public void setjComboBox1(JComboBox<String> jComboBox1) {
        this.jComboBox1 = jComboBox1;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public JLabel getjLabel11() {
        return jLabel11;
    }

    public void setjLabel11(JLabel jLabel11) {
        this.jLabel11 = jLabel11;
    }

    public JLabel getjLabel13() {
        return jLabel13;
    }

    public void setjLabel13(JLabel jLabel13) {
        this.jLabel13 = jLabel13;
    }

    public JLabel getjLabel14() {
        return jLabel14;
    }

    public void setjLabel14(JLabel jLabel14) {
        this.jLabel14 = jLabel14;
    }

    public JLabel getjLabel15() {
        return jLabel15;
    }

    public void setjLabel15(JLabel jLabel15) {
        this.jLabel15 = jLabel15;
    }

    public JLabel getjLabel16() {
        return jLabel16;
    }

    public void setjLabel16(JLabel jLabel16) {
        this.jLabel16 = jLabel16;
    }

    public JLabel getjLabel17() {
        return jLabel17;
    }

    public void setjLabel17(JLabel jLabel17) {
        this.jLabel17 = jLabel17;
    }

    public JLabel getjLabel18() {
        return jLabel18;
    }

    public void setjLabel18(JLabel jLabel18) {
        this.jLabel18 = jLabel18;
    }

    public JLabel getjLabel19() {
        return jLabel19;
    }

    public void setjLabel19(JLabel jLabel19) {
        this.jLabel19 = jLabel19;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel20() {
        return jLabel20;
    }

    public void setjLabel20(JLabel jLabel20) {
        this.jLabel20 = jLabel20;
    }

    public JLabel getjLabel21() {
        return jLabel21;
    }

    public void setjLabel21(JLabel jLabel21) {
        this.jLabel21 = jLabel21;
    }

    public JLabel getjLabel22() {
        return jLabel22;
    }

    public void setjLabel22(JLabel jLabel22) {
        this.jLabel22 = jLabel22;
    }

    public JLabel getjLabel23() {
        return jLabel23;
    }

    public void setjLabel23(JLabel jLabel23) {
        this.jLabel23 = jLabel23;
    }

    public JLabel getjLabel24() {
        return jLabel24;
    }

    public void setjLabel24(JLabel jLabel24) {
        this.jLabel24 = jLabel24;
    }

    public JLabel getjLabel25() {
        return jLabel25;
    }

    public void setjLabel25(JLabel jLabel25) {
        this.jLabel25 = jLabel25;
    }

    public JLabel getjLabel26() {
        return jLabel26;
    }

    public void setjLabel26(JLabel jLabel26) {
        this.jLabel26 = jLabel26;
    }

    public JLabel getjLabel27() {
        return jLabel27;
    }

    public void setjLabel27(JLabel jLabel27) {
        this.jLabel27 = jLabel27;
    }

    public JLabel getjLabel28() {
        return jLabel28;
    }

    public void setjLabel28(JLabel jLabel28) {
        this.jLabel28 = jLabel28;
    }

    public JLabel getjLabel29() {
        return jLabel29;
    }

    public void setjLabel29(JLabel jLabel29) {
        this.jLabel29 = jLabel29;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel30() {
        return jLabel30;
    }

    public void setjLabel30(JLabel jLabel30) {
        this.jLabel30 = jLabel30;
    }

    public JLabel getjLabel31() {
        return jLabel31;
    }

    public void setjLabel31(JLabel jLabel31) {
        this.jLabel31 = jLabel31;
    }

    public JLabel getjLabel32() {
        return jLabel32;
    }

    public void setjLabel32(JLabel jLabel32) {
        this.jLabel32 = jLabel32;
    }

    public JLabel getjLabel33() {
        return jLabel33;
    }

    public void setjLabel33(JLabel jLabel33) {
        this.jLabel33 = jLabel33;
    }

    public JLabel getjLabel34() {
        return jLabel34;
    }

    public void setjLabel34(JLabel jLabel34) {
        this.jLabel34 = jLabel34;
    }

    public JLabel getjLabel35() {
        return jLabel35;
    }

    public void setjLabel35(JLabel jLabel35) {
        this.jLabel35 = jLabel35;
    }

    public JLabel getjLabel36() {
        return jLabel36;
    }

    public void setjLabel36(JLabel jLabel36) {
        this.jLabel36 = jLabel36;
    }

    public JLabel getjLabel37() {
        return jLabel37;
    }

    public void setjLabel37(JLabel jLabel37) {
        this.jLabel37 = jLabel37;
    }

    public JLabel getjLabel38() {
        return jLabel38;
    }

    public void setjLabel38(JLabel jLabel38) {
        this.jLabel38 = jLabel38;
    }

    public JLabel getjLabel39() {
        return jLabel39;
    }

    public void setjLabel39(JLabel jLabel39) {
        this.jLabel39 = jLabel39;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel41() {
        return jLabel41;
    }

    public void setjLabel41(JLabel jLabel41) {
        this.jLabel41 = jLabel41;
    }

    public JLabel getjLabel42() {
        return jLabel42;
    }

    public void setjLabel42(JLabel jLabel42) {
        this.jLabel42 = jLabel42;
    }

    public JLabel getjLabel43() {
        return jLabel43;
    }

    public void setjLabel43(JLabel jLabel43) {
        this.jLabel43 = jLabel43;
    }

    public JLabel getjLabel44() {
        return jLabel44;
    }

    public void setjLabel44(JLabel jLabel44) {
        this.jLabel44 = jLabel44;
    }

    public JLabel getjLabel45() {
        return jLabel45;
    }

    public void setjLabel45(JLabel jLabel45) {
        this.jLabel45 = jLabel45;
    }

    public JLabel getjLabel46() {
        return jLabel46;
    }

    public void setjLabel46(JLabel jLabel46) {
        this.jLabel46 = jLabel46;
    }

    public JLabel getjLabel48() {
        return jLabel48;
    }

    public void setjLabel48(JLabel jLabel48) {
        this.jLabel48 = jLabel48;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel50() {
        return jLabel50;
    }

    public void setjLabel50(JLabel jLabel50) {
        this.jLabel50 = jLabel50;
    }

    public JLabel getjLabel51() {
        return jLabel51;
    }

    public void setjLabel51(JLabel jLabel51) {
        this.jLabel51 = jLabel51;
    }

    public JLabel getjLabel52() {
        return jLabel52;
    }

    public void setjLabel52(JLabel jLabel52) {
        this.jLabel52 = jLabel52;
    }

    public JLabel getjLabel53() {
        return jLabel53;
    }

    public void setjLabel53(JLabel jLabel53) {
        this.jLabel53 = jLabel53;
    }

    public JLabel getjLabel54() {
        return jLabel54;
    }

    public void setjLabel54(JLabel jLabel54) {
        this.jLabel54 = jLabel54;
    }

    public JLabel getjLabel55() {
        return jLabel55;
    }

    public void setjLabel55(JLabel jLabel55) {
        this.jLabel55 = jLabel55;
    }

    public JLabel getjLabel56() {
        return jLabel56;
    }

    public void setjLabel56(JLabel jLabel56) {
        this.jLabel56 = jLabel56;
    }

    public JLabel getjLabel57() {
        return jLabel57;
    }

    public void setjLabel57(JLabel jLabel57) {
        this.jLabel57 = jLabel57;
    }

    public JLabel getjLabel58() {
        return jLabel58;
    }

    public void setjLabel58(JLabel jLabel58) {
        this.jLabel58 = jLabel58;
    }

    public JLabel getjLabel59() {
        return jLabel59;
    }

    public void setjLabel59(JLabel jLabel59) {
        this.jLabel59 = jLabel59;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel60() {
        return jLabel60;
    }

    public void setjLabel60(JLabel jLabel60) {
        this.jLabel60 = jLabel60;
    }

    public JLabel getjLabel61() {
        return jLabel61;
    }

    public void setjLabel61(JLabel jLabel61) {
        this.jLabel61 = jLabel61;
    }

    public JLabel getjLabel62() {
        return jLabel62;
    }

    public void setjLabel62(JLabel jLabel62) {
        this.jLabel62 = jLabel62;
    }

    public JLabel getjLabel63() {
        return jLabel63;
    }

    public void setjLabel63(JLabel jLabel63) {
        this.jLabel63 = jLabel63;
    }

    public JLabel getjLabel64() {
        return jLabel64;
    }

    public void setjLabel64(JLabel jLabel64) {
        this.jLabel64 = jLabel64;
    }

    public JLabel getjLabel65() {
        return jLabel65;
    }

    public void setjLabel65(JLabel jLabel65) {
        this.jLabel65 = jLabel65;
    }

    public JLabel getjLabel66() {
        return jLabel66;
    }

    public void setjLabel66(JLabel jLabel66) {
        this.jLabel66 = jLabel66;
    }

    public JLabel getjLabel67() {
        return jLabel67;
    }

    public void setjLabel67(JLabel jLabel67) {
        this.jLabel67 = jLabel67;
    }

    public JLabel getjLabel68() {
        return jLabel68;
    }

    public void setjLabel68(JLabel jLabel68) {
        this.jLabel68 = jLabel68;
    }

    public JLabel getjLabel69() {
        return jLabel69;
    }

    public void setjLabel69(JLabel jLabel69) {
        this.jLabel69 = jLabel69;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JLabel getjLabel70() {
        return jLabel70;
    }

    public void setjLabel70(JLabel jLabel70) {
        this.jLabel70 = jLabel70;
    }

    public JLabel getjLabel71() {
        return jLabel71;
    }

    public void setjLabel71(JLabel jLabel71) {
        this.jLabel71 = jLabel71;
    }

    public JLabel getjLabel72() {
        return jLabel72;
    }

    public void setjLabel72(JLabel jLabel72) {
        this.jLabel72 = jLabel72;
    }

    public JLabel getjLabel73() {
        return jLabel73;
    }

    public void setjLabel73(JLabel jLabel73) {
        this.jLabel73 = jLabel73;
    }

    public JLabel getjLabel74() {
        return jLabel74;
    }

    public void setjLabel74(JLabel jLabel74) {
        this.jLabel74 = jLabel74;
    }

    public JLabel getjLabel76() {
        return jLabel76;
    }

    public void setjLabel76(JLabel jLabel76) {
        this.jLabel76 = jLabel76;
    }

    public JLabel getjLabel78() {
        return jLabel78;
    }

    public void setjLabel78(JLabel jLabel78) {
        this.jLabel78 = jLabel78;
    }

    public JLabel getjLabel79() {
        return jLabel79;
    }

    public void setjLabel79(JLabel jLabel79) {
        this.jLabel79 = jLabel79;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public JLabel getjLabel80() {
        return jLabel80;
    }

    public void setjLabel80(JLabel jLabel80) {
        this.jLabel80 = jLabel80;
    }

    public JLabel getjLabel81() {
        return jLabel81;
    }

    public void setjLabel81(JLabel jLabel81) {
        this.jLabel81 = jLabel81;
    }

    public JLabel getjLabel82() {
        return jLabel82;
    }

    public void setjLabel82(JLabel jLabel82) {
        this.jLabel82 = jLabel82;
    }

    public JLabel getjLabel84() {
        return jLabel84;
    }

    public void setjLabel84(JLabel jLabel84) {
        this.jLabel84 = jLabel84;
    }

    public JLabel getjLabel87() {
        return jLabel87;
    }

    public void setjLabel87(JLabel jLabel87) {
        this.jLabel87 = jLabel87;
    }

    public JLabel getjLabel88() {
        return jLabel88;
    }

    public void setjLabel88(JLabel jLabel88) {
        this.jLabel88 = jLabel88;
    }

    public JLabel getjLabel89() {
        return jLabel89;
    }

    public void setjLabel89(JLabel jLabel89) {
        this.jLabel89 = jLabel89;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public JLabel getjLabel90() {
        return jLabel90;
    }

    public void setjLabel90(JLabel jLabel90) {
        this.jLabel90 = jLabel90;
    }

    public JLabel getjLabel91() {
        return jLabel91;
    }

    public void setjLabel91(JLabel jLabel91) {
        this.jLabel91 = jLabel91;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel10() {
        return jPanel10;
    }

    public void setjPanel10(JPanel jPanel10) {
        this.jPanel10 = jPanel10;
    }

    public JPanel getjPanel11() {
        return jPanel11;
    }

    public void setjPanel11(JPanel jPanel11) {
        this.jPanel11 = jPanel11;
    }

    public JPanel getjPanel12() {
        return jPanel12;
    }

    public void setjPanel12(JPanel jPanel12) {
        this.jPanel12 = jPanel12;
    }

    public JPanel getjPanel13() {
        return jPanel13;
    }

    public void setjPanel13(JPanel jPanel13) {
        this.jPanel13 = jPanel13;
    }

    public JPanel getjPanel14() {
        return jPanel14;
    }

    public void setjPanel14(JPanel jPanel14) {
        this.jPanel14 = jPanel14;
    }

    public JPanel getjPanel15() {
        return jPanel15;
    }

    public void setjPanel15(JPanel jPanel15) {
        this.jPanel15 = jPanel15;
    }

    public JPanel getjPanel16() {
        return jPanel16;
    }

    public void setjPanel16(JPanel jPanel16) {
        this.jPanel16 = jPanel16;
    }

    public JPanel getjPanel17() {
        return jPanel17;
    }

    public void setjPanel17(JPanel jPanel17) {
        this.jPanel17 = jPanel17;
    }

    public JPanel getjPanel18() {
        return jPanel18;
    }

    public void setjPanel18(JPanel jPanel18) {
        this.jPanel18 = jPanel18;
    }

    public JPanel getjPanel19() {
        return jPanel19;
    }

    public void setjPanel19(JPanel jPanel19) {
        this.jPanel19 = jPanel19;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JPanel getjPanel21() {
        return jPanel21;
    }

    public void setjPanel21(JPanel jPanel21) {
        this.jPanel21 = jPanel21;
    }

    public JPanel getjPanel22() {
        return jPanel22;
    }

    public void setjPanel22(JPanel jPanel22) {
        this.jPanel22 = jPanel22;
    }

    public JPanel getjPanel23() {
        return jPanel23;
    }

    public void setjPanel23(JPanel jPanel23) {
        this.jPanel23 = jPanel23;
    }

    public JPanel getjPanel24() {
        return jPanel24;
    }

    public void setjPanel24(JPanel jPanel24) {
        this.jPanel24 = jPanel24;
    }

    public JPanel getjPanel25() {
        return jPanel25;
    }

    public void setjPanel25(JPanel jPanel25) {
        this.jPanel25 = jPanel25;
    }

    public JPanel getjPanel26() {
        return jPanel26;
    }

    public void setjPanel26(JPanel jPanel26) {
        this.jPanel26 = jPanel26;
    }

    public JPanel getjPanel27() {
        return jPanel27;
    }

    public void setjPanel27(JPanel jPanel27) {
        this.jPanel27 = jPanel27;
    }

    public JPanel getjPanel28() {
        return jPanel28;
    }

    public void setjPanel28(JPanel jPanel28) {
        this.jPanel28 = jPanel28;
    }

    public JPanel getjPanel29() {
        return jPanel29;
    }

    public void setjPanel29(JPanel jPanel29) {
        this.jPanel29 = jPanel29;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public JPanel getjPanel30() {
        return jPanel30;
    }

    public void setjPanel30(JPanel jPanel30) {
        this.jPanel30 = jPanel30;
    }

    public JPanel getjPanel31() {
        return jPanel31;
    }

    public void setjPanel31(JPanel jPanel31) {
        this.jPanel31 = jPanel31;
    }

    public JPanel getjPanel32() {
        return jPanel32;
    }

    public void setjPanel32(JPanel jPanel32) {
        this.jPanel32 = jPanel32;
    }

    public JPanel getjPanel35() {
        return jPanel35;
    }

    public void setjPanel35(JPanel jPanel35) {
        this.jPanel35 = jPanel35;
    }

    public JPanel getjPanel37() {
        return jPanel37;
    }

    public void setjPanel37(JPanel jPanel37) {
        this.jPanel37 = jPanel37;
    }

    public JPanel getjPanel39() {
        return jPanel39;
    }

    public void setjPanel39(JPanel jPanel39) {
        this.jPanel39 = jPanel39;
    }

    public JPanel getjPanel4() {
        return jPanel4;
    }

    public void setjPanel4(JPanel jPanel4) {
        this.jPanel4 = jPanel4;
    }

    public JPanel getjPanel40() {
        return jPanel40;
    }

    public void setjPanel40(JPanel jPanel40) {
        this.jPanel40 = jPanel40;
    }

    public JPanel getjPanel42() {
        return jPanel42;
    }

    public void setjPanel42(JPanel jPanel42) {
        this.jPanel42 = jPanel42;
    }

    public JPanel getjPanel43() {
        return jPanel43;
    }

    public void setjPanel43(JPanel jPanel43) {
        this.jPanel43 = jPanel43;
    }

    public JPanel getjPanel44() {
        return jPanel44;
    }

    public void setjPanel44(JPanel jPanel44) {
        this.jPanel44 = jPanel44;
    }

    public JPanel getjPanel45() {
        return jPanel45;
    }

    public void setjPanel45(JPanel jPanel45) {
        this.jPanel45 = jPanel45;
    }

    public JPanel getjPanel46() {
        return jPanel46;
    }

    public void setjPanel46(JPanel jPanel46) {
        this.jPanel46 = jPanel46;
    }

    public JPanel getjPanel47() {
        return jPanel47;
    }

    public void setjPanel47(JPanel jPanel47) {
        this.jPanel47 = jPanel47;
    }

    public JPanel getjPanel48() {
        return jPanel48;
    }

    public void setjPanel48(JPanel jPanel48) {
        this.jPanel48 = jPanel48;
    }

    public JPanel getjPanel49() {
        return jPanel49;
    }

    public void setjPanel49(JPanel jPanel49) {
        this.jPanel49 = jPanel49;
    }

    public JPanel getjPanel5() {
        return jPanel5;
    }

    public void setjPanel5(JPanel jPanel5) {
        this.jPanel5 = jPanel5;
    }

    public JPanel getjPanel50() {
        return jPanel50;
    }

    public void setjPanel50(JPanel jPanel50) {
        this.jPanel50 = jPanel50;
    }

    public JPanel getjPanel51() {
        return jPanel51;
    }

    public void setjPanel51(JPanel jPanel51) {
        this.jPanel51 = jPanel51;
    }

    public JPanel getjPanel52() {
        return jPanel52;
    }

    public void setjPanel52(JPanel jPanel52) {
        this.jPanel52 = jPanel52;
    }

    public JPanel getjPanel53() {
        return jPanel53;
    }

    public void setjPanel53(JPanel jPanel53) {
        this.jPanel53 = jPanel53;
    }

    public JPanel getjPanel54() {
        return jPanel54;
    }

    public void setjPanel54(JPanel jPanel54) {
        this.jPanel54 = jPanel54;
    }

    public JPanel getjPanel55() {
        return jPanel55;
    }

    public void setjPanel55(JPanel jPanel55) {
        this.jPanel55 = jPanel55;
    }

    public JPanel getjPanel6() {
        return jPanel6;
    }

    public void setjPanel6(JPanel jPanel6) {
        this.jPanel6 = jPanel6;
    }

    public JPanel getjPanel7() {
        return jPanel7;
    }

    public void setjPanel7(JPanel jPanel7) {
        this.jPanel7 = jPanel7;
    }

    public JPanel getjPanel8() {
        return jPanel8;
    }

    public void setjPanel8(JPanel jPanel8) {
        this.jPanel8 = jPanel8;
    }

    public JPanel getjPanel9() {
        return jPanel9;
    }

    public void setjPanel9(JPanel jPanel9) {
        this.jPanel9 = jPanel9;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public void setjScrollPane3(JScrollPane jScrollPane3) {
        this.jScrollPane3 = jScrollPane3;
    }

    public JScrollPane getjScrollPane4() {
        return jScrollPane4;
    }

    public void setjScrollPane4(JScrollPane jScrollPane4) {
        this.jScrollPane4 = jScrollPane4;
    }

    public JScrollPane getjScrollPane5() {
        return jScrollPane5;
    }

    public void setjScrollPane5(JScrollPane jScrollPane5) {
        this.jScrollPane5 = jScrollPane5;
    }

    public JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public void setjSeparator1(JSeparator jSeparator1) {
        this.jSeparator1 = jSeparator1;
    }

    public JSeparator getjSeparator10() {
        return jSeparator10;
    }

    public void setjSeparator10(JSeparator jSeparator10) {
        this.jSeparator10 = jSeparator10;
    }

    public JSeparator getjSeparator11() {
        return jSeparator11;
    }

    public void setjSeparator11(JSeparator jSeparator11) {
        this.jSeparator11 = jSeparator11;
    }

    public JSeparator getjSeparator12() {
        return jSeparator12;
    }

    public void setjSeparator12(JSeparator jSeparator12) {
        this.jSeparator12 = jSeparator12;
    }

    public JSeparator getjSeparator13() {
        return jSeparator13;
    }

    public void setjSeparator13(JSeparator jSeparator13) {
        this.jSeparator13 = jSeparator13;
    }

    public JSeparator getjSeparator14() {
        return jSeparator14;
    }

    public void setjSeparator14(JSeparator jSeparator14) {
        this.jSeparator14 = jSeparator14;
    }

    public JSeparator getjSeparator15() {
        return jSeparator15;
    }

    public void setjSeparator15(JSeparator jSeparator15) {
        this.jSeparator15 = jSeparator15;
    }

    public JSeparator getjSeparator16() {
        return jSeparator16;
    }

    public void setjSeparator16(JSeparator jSeparator16) {
        this.jSeparator16 = jSeparator16;
    }

    public JSeparator getjSeparator17() {
        return jSeparator17;
    }

    public void setjSeparator17(JSeparator jSeparator17) {
        this.jSeparator17 = jSeparator17;
    }

    public JSeparator getjSeparator18() {
        return jSeparator18;
    }

    public void setjSeparator18(JSeparator jSeparator18) {
        this.jSeparator18 = jSeparator18;
    }

    public JSeparator getjSeparator19() {
        return jSeparator19;
    }

    public void setjSeparator19(JSeparator jSeparator19) {
        this.jSeparator19 = jSeparator19;
    }

    public JSeparator getjSeparator2() {
        return jSeparator2;
    }

    public void setjSeparator2(JSeparator jSeparator2) {
        this.jSeparator2 = jSeparator2;
    }

    public JSeparator getjSeparator20() {
        return jSeparator20;
    }

    public void setjSeparator20(JSeparator jSeparator20) {
        this.jSeparator20 = jSeparator20;
    }

    public JSeparator getjSeparator22() {
        return jSeparator22;
    }

    public void setjSeparator22(JSeparator jSeparator22) {
        this.jSeparator22 = jSeparator22;
    }

    public JSeparator getjSeparator23() {
        return jSeparator23;
    }

    public void setjSeparator23(JSeparator jSeparator23) {
        this.jSeparator23 = jSeparator23;
    }

    public JSeparator getjSeparator24() {
        return jSeparator24;
    }

    public void setjSeparator24(JSeparator jSeparator24) {
        this.jSeparator24 = jSeparator24;
    }

    public JSeparator getjSeparator3() {
        return jSeparator3;
    }

    public void setjSeparator3(JSeparator jSeparator3) {
        this.jSeparator3 = jSeparator3;
    }

    public JSeparator getjSeparator5() {
        return jSeparator5;
    }

    public void setjSeparator5(JSeparator jSeparator5) {
        this.jSeparator5 = jSeparator5;
    }

    public JSeparator getjSeparator6() {
        return jSeparator6;
    }

    public void setjSeparator6(JSeparator jSeparator6) {
        this.jSeparator6 = jSeparator6;
    }

    public JSeparator getjSeparator7() {
        return jSeparator7;
    }

    public void setjSeparator7(JSeparator jSeparator7) {
        this.jSeparator7 = jSeparator7;
    }

    public JSeparator getjSeparator8() {
        return jSeparator8;
    }

    public void setjSeparator8(JSeparator jSeparator8) {
        this.jSeparator8 = jSeparator8;
    }

    public JSeparator getjSeparator9() {
        return jSeparator9;
    }

    public void setjSeparator9(JSeparator jSeparator9) {
        this.jSeparator9 = jSeparator9;
    }

    public JTabbedPane getjTabbedPane1() {
        return jTabbedPane1;
    }

    public void setjTabbedPane1(JTabbedPane jTabbedPane1) {
        this.jTabbedPane1 = jTabbedPane1;
    }

    public JTextField getjTextField11() {
        return jTextField11;
    }

    public void setjTextField11(JTextField jTextField11) {
        this.jTextField11 = jTextField11;
    }

    public JTextField getjTextField13() {
        return jTextField13;
    }

    public void setjTextField13(JTextField jTextField13) {
        this.jTextField13 = jTextField13;
    }

    public JTextField getjTextField15() {
        return jTextField15;
    }

    public void setjTextField15(JTextField jTextField15) {
        this.jTextField15 = jTextField15;
    }

    public JTextField getjTextField17() {
        return jTextField17;
    }

    public void setjTextField17(JTextField jTextField17) {
        this.jTextField17 = jTextField17;
    }

    public JTextField getjTextField19() {
        return jTextField19;
    }

    public void setjTextField19(JTextField jTextField19) {
        this.jTextField19 = jTextField19;
    }

    public JTextField getjTextField21() {
        return jTextField21;
    }

    public void setjTextField21(JTextField jTextField21) {
        this.jTextField21 = jTextField21;
    }

    public JTextField getjTextField22() {
        return jTextField22;
    }

    public void setjTextField22(JTextField jTextField22) {
        this.jTextField22 = jTextField22;
    }

    public JTextField getjTextField5() {
        return jTextField5;
    }

    public void setjTextField5(JTextField jTextField5) {
        this.jTextField5 = jTextField5;
    }

    public JTextField getjTextField7() {
        return jTextField7;
    }

    public void setjTextField7(JTextField jTextField7) {
        this.jTextField7 = jTextField7;
    }

    public JTextField getjTextField9() {
        return jTextField9;
    }

    public void setjTextField9(JTextField jTextField9) {
        this.jTextField9 = jTextField9;
    }

    public JLabel getLblDinamiTipoVenta() {
        return lblDinamiTipoVenta;
    }

    public void setLblDinamiTipoVenta(JLabel lblDinamiTipoVenta) {
        this.lblDinamiTipoVenta = lblDinamiTipoVenta;
    }

    public JLabel getLblExcelDv() {
        return lblExcelDv;
    }

    public void setLblExcelDv(JLabel lblExcelDv) {
        this.lblExcelDv = lblExcelDv;
    }

    public JLabel getLblExcelProd() {
        return lblExcelProd;
    }

    public void setLblExcelProd(JLabel lblExcelProd) {
        this.lblExcelProd = lblExcelProd;
    }

    public JLabel getLblFecha() {
        return lblFecha;
    }

    public void setLblFecha(JLabel lblFecha) {
        this.lblFecha = lblFecha;
    }

    public JLabel getLblHora() {
        return lblHora;
    }

    public void setLblHora(JLabel lblHora) {
        this.lblHora = lblHora;
    }

    public JLabel getLblInventario() {
        return lblInventario;
    }

    public void setLblInventario(JLabel lblInventario) {
        this.lblInventario = lblInventario;
    }

    public JLabel getLblInventario1() {
        return lblInventario1;
    }

    public void setLblInventario1(JLabel lblInventario1) {
        this.lblInventario1 = lblInventario1;
    }

    public JLabel getLblInventarioPnl() {
        return lblInventarioPnl;
    }

    public void setLblInventarioPnl(JLabel lblInventarioPnl) {
        this.lblInventarioPnl = lblInventarioPnl;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblPdfDv() {
        return lblPdfDv;
    }

    public void setLblPdfDv(JLabel lblPdfDv) {
        this.lblPdfDv = lblPdfDv;
    }

    public JLabel getLblPdfProd() {
        return lblPdfProd;
    }

    public void setLblPdfProd(JLabel lblPdfProd) {
        this.lblPdfProd = lblPdfProd;
    }

    public JLabel getLblPrincipal() {
        return lblPrincipal;
    }

    public void setLblPrincipal(JLabel lblPrincipal) {
        this.lblPrincipal = lblPrincipal;
    }

    public JPanel getPanelDetalleVenta() {
        return panelDetalleVenta;
    }

    public void setPanelDetalleVenta(JPanel panelDetalleVenta) {
        this.panelDetalleVenta = panelDetalleVenta;
    }

    public JPanel getPanelEscanear() {
        return panelEscanear;
    }

    public void setPanelEscanear(JPanel panelEscanear) {
        this.panelEscanear = panelEscanear;
    }

    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }

    public void setPanelPrincipal(JPanel panelPrincipal) {
        this.panelPrincipal = panelPrincipal;
    }

    public JPanel getPanelProducto() {
        return panelProducto;
    }

    public void setPanelProducto(JPanel panelProducto) {
        this.panelProducto = panelProducto;
    }

    public JPanel getPanelVenta() {
        return panelVenta;
    }

    public void setPanelVenta(JPanel panelVenta) {
        this.panelVenta = panelVenta;
    }

    public JPopupMenu getPmInventario() {
        return pmInventario;
    }

    public void setPmInventario(JPopupMenu pmInventario) {
        this.pmInventario = pmInventario;
    }

    public JPopupMenu getPmVenta() {
        return pmVenta;
    }

    public void setPmVenta(JPopupMenu pmVenta) {
        this.pmVenta = pmVenta;
    }

    public JPanel getPnlActualizarDv() {
        return pnlActualizarDv;
    }

    public void setPnlActualizarDv(JPanel pnlActualizarDv) {
        this.pnlActualizarDv = pnlActualizarDv;
    }

    public JPanel getPnlActualizarGP() {
        return pnlActualizarGP;
    }

    public void setPnlActualizarGP(JPanel pnlActualizarGP) {
        this.pnlActualizarGP = pnlActualizarGP;
    }

    public JPanel getPnlAgregarDv() {
        return pnlAgregarDv;
    }

    public void setPnlAgregarDv(JPanel pnlAgregarDv) {
        this.pnlAgregarDv = pnlAgregarDv;
    }

    public JPanel getPnlAgregarGP() {
        return pnlAgregarGP;
    }

    public void setPnlAgregarGP(JPanel pnlAgregarGP) {
        this.pnlAgregarGP = pnlAgregarGP;
    }

    public JPanel getPnlBarraDeOpciones() {
        return pnlBarraDeOpciones;
    }

    public void setPnlBarraDeOpciones(JPanel pnlBarraDeOpciones) {
        this.pnlBarraDeOpciones = pnlBarraDeOpciones;
    }

    public JPanel getPnlBuscarProd() {
        return pnlBuscarProd;
    }

    public void setPnlBuscarProd(JPanel pnlBuscarProd) {
        this.pnlBuscarProd = pnlBuscarProd;
    }

    public JPanel getPnlCategoria() {
        return pnlCategoria;
    }

    public void setPnlCategoria(JPanel pnlCategoria) {
        this.pnlCategoria = pnlCategoria;
    }

    public JPanel getPnlCenter() {
        return pnlCenter;
    }

    public void setPnlCenter(JPanel pnlCenter) {
        this.pnlCenter = pnlCenter;
    }

    public JPanel getPnlCerrarSesion() {
        return pnlCerrarSesion;
    }

    public void setPnlCerrarSesion(JPanel pnlCerrarSesion) {
        this.pnlCerrarSesion = pnlCerrarSesion;
    }

    public JPanel getPnlEliminarDv() {
        return pnlEliminarDv;
    }

    public void setPnlEliminarDv(JPanel pnlEliminarDv) {
        this.pnlEliminarDv = pnlEliminarDv;
    }

    public JPanel getPnlEliminarGP() {
        return pnlEliminarGP;
    }

    public void setPnlEliminarGP(JPanel pnlEliminarGP) {
        this.pnlEliminarGP = pnlEliminarGP;
    }

    public JPanel getPnlEscanearCodBarraDv() {
        return pnlEscanearCodBarraDv;
    }

    public void setPnlEscanearCodBarraDv(JPanel pnlEscanearCodBarraDv) {
        this.pnlEscanearCodBarraDv = pnlEscanearCodBarraDv;
    }

    public JPanel getPnlEstadistica() {
        return pnlEstadistica;
    }

    public void setPnlEstadistica(JPanel pnlEstadistica) {
        this.pnlEstadistica = pnlEstadistica;
    }

    public JPanel getPnlFSLogin() {
        return pnlFSLogin;
    }

    public void setPnlFSLogin(JPanel pnlFSLogin) {
        this.pnlFSLogin = pnlFSLogin;
    }

    public JPanel getPnlInventario() {
        return pnlInventario;
    }

    public void setPnlInventario(JPanel pnlInventario) {
        this.pnlInventario = pnlInventario;
    }

    public JPanel getPnlIzquierdaOperacionesProducto() {
        return pnlIzquierdaOperacionesProducto;
    }

    public void setPnlIzquierdaOperacionesProducto(JPanel pnlIzquierdaOperacionesProducto) {
        this.pnlIzquierdaOperacionesProducto = pnlIzquierdaOperacionesProducto;
    }

    public JPanel getPnlLeft() {
        return pnlLeft;
    }

    public void setPnlLeft(JPanel pnlLeft) {
        this.pnlLeft = pnlLeft;
    }

    public JPanel getPnlLimpiarDv() {
        return pnlLimpiarDv;
    }

    public void setPnlLimpiarDv(JPanel pnlLimpiarDv) {
        this.pnlLimpiarDv = pnlLimpiarDv;
    }

    public JPanel getPnlLimpiarGP() {
        return pnlLimpiarGP;
    }

    public void setPnlLimpiarGP(JPanel pnlLimpiarGP) {
        this.pnlLimpiarGP = pnlLimpiarGP;
    }

    public JPanel getPnlMinusLogin() {
        return pnlMinusLogin;
    }

    public void setPnlMinusLogin(JPanel pnlMinusLogin) {
        this.pnlMinusLogin = pnlMinusLogin;
    }

    public JPanel getPnlNorth() {
        return pnlNorth;
    }

    public void setPnlNorth(JPanel pnlNorth) {
        this.pnlNorth = pnlNorth;
    }

    public JPanel getPnlOperacionesProducto() {
        return pnlOperacionesProducto;
    }

    public void setPnlOperacionesProducto(JPanel pnlOperacionesProducto) {
        this.pnlOperacionesProducto = pnlOperacionesProducto;
    }

    public JPanel getPnlPrincipal() {
        return pnlPrincipal;
    }

    public void setPnlPrincipal(JPanel pnlPrincipal) {
        this.pnlPrincipal = pnlPrincipal;
    }

    public JPanel getPnlProducto() {
        return pnlProducto;
    }

    public void setPnlProducto(JPanel pnlProducto) {
        this.pnlProducto = pnlProducto;
    }

    public JPanel getPnlProductoTitulo() {
        return pnlProductoTitulo;
    }

    public void setPnlProductoTitulo(JPanel pnlProductoTitulo) {
        this.pnlProductoTitulo = pnlProductoTitulo;
    }

    public JPanel getPnlTablaProductos() {
        return pnlTablaProductos;
    }

    public void setPnlTablaProductos(JPanel pnlTablaProductos) {
        this.pnlTablaProductos = pnlTablaProductos;
    }

    public JPanel getPnlVenta() {
        return pnlVenta;
    }

    public void setPnlVenta(JPanel pnlVenta) {
        this.pnlVenta = pnlVenta;
    }

    public JPanel getPnlXLogin() {
        return pnlXLogin;
    }

    public void setPnlXLogin(JPanel pnlXLogin) {
        this.pnlXLogin = pnlXLogin;
    }

    public JRadioButton getRbBoleta() {
        return rbBoleta;
    }

    public void setRbBoleta(JRadioButton rbBoleta) {
        this.rbBoleta = rbBoleta;
    }

    public JRadioButton getRbBoleta1() {
        return rbBoleta1;
    }

    public void setRbBoleta1(JRadioButton rbBoleta1) {
        this.rbBoleta1 = rbBoleta1;
    }

    public JRadioButton getRbFactura() {
        return rbFactura;
    }

    public void setRbFactura(JRadioButton rbFactura) {
        this.rbFactura = rbFactura;
    }

    public JRadioButton getRbFactura1() {
        return rbFactura1;
    }

    public void setRbFactura1(JRadioButton rbFactura1) {
        this.rbFactura1 = rbFactura1;
    }

    public JRadioButton getRbNoContieneIgv() {
        return rbNoContieneIgv;
    }

    public void setRbNoContieneIgv(JRadioButton rbNoContieneIgv) {
        this.rbNoContieneIgv = rbNoContieneIgv;
    }

    public JRadioButton getRbSiContieneIgv() {
        return rbSiContieneIgv;
    }

    public void setRbSiContieneIgv(JRadioButton rbSiContieneIgv) {
        this.rbSiContieneIgv = rbSiContieneIgv;
    }

    public ButtonGroup getSeleccionTVenta() {
        return seleccionTVenta;
    }

    public void setSeleccionTVenta(ButtonGroup seleccionTVenta) {
        this.seleccionTVenta = seleccionTVenta;
    }

    public JSpinner getSpnCantidadDv() {
        return spnCantidadDv;
    }

    public void setSpnCantidadDv(JSpinner spnCantidadDv) {
        this.spnCantidadDv = spnCantidadDv;
    }

    public JSpinner getSpnCantidadGP() {
        return spnCantidadGP;
    }

    public void setSpnCantidadGP(JSpinner spnCantidadGP) {
        this.spnCantidadGP = spnCantidadGP;
    }

    public JSpinner getSpnPrecioGP() {
        return spnPrecioGP;
    }

    public void setSpnPrecioGP(JSpinner spnPrecioGP) {
        this.spnPrecioGP = spnPrecioGP;
    }

    public JTable getTablaDetalleVenta() {
        return tablaDetalleVenta;
    }

    public void setTablaDetalleVenta(JTable tablaDetalleVenta) {
        this.tablaDetalleVenta = tablaDetalleVenta;
    }

    public JTable getTablaDv2() {
        return tablaDv2;
    }

    public void setTablaDv2(JTable tablaDv2) {
        this.tablaDv2 = tablaDv2;
    }

    public JTable getTablaProductos() {
        return tablaProductos;
    }

    public void setTablaProductos(JTable tablaProductos) {
        this.tablaProductos = tablaProductos;
    }

    public JTable getTablaVenta() {
        return tablaVenta;
    }

    public void setTablaVenta(JTable tablaVenta) {
        this.tablaVenta = tablaVenta;
    }

    public JTabbedPane getTbpTablaDv() {
        return tbpTablaDv;
    }

    public void setTbpTablaDv(JTabbedPane tbpTablaDv) {
        this.tbpTablaDv = tbpTablaDv;
    }

    public JTextArea getTxtAreaObservacion() {
        return txtAreaObservacion;
    }

    public void setTxtAreaObservacion(JTextArea txtAreaObservacion) {
        this.txtAreaObservacion = txtAreaObservacion;
    }

    public JTextField getTxtCodBarraGP() {
        return txtCodBarraGP;
    }

    public void setTxtCodBarraGP(JTextField txtCodBarraGP) {
        this.txtCodBarraGP = txtCodBarraGP;
    }

    public JTextField getTxtContenidoDv() {
        return txtContenidoDv;
    }

    public void setTxtContenidoDv(JTextField txtContenidoDv) {
        this.txtContenidoDv = txtContenidoDv;
    }

    public JTextField getTxtContenidoGP() {
        return txtContenidoGP;
    }

    public void setTxtContenidoGP(JTextField txtContenidoGP) {
        this.txtContenidoGP = txtContenidoGP;
    }

    public JTextField getTxtDescuentoDv() {
        return txtDescuentoDv;
    }

    public void setTxtDescuentoDv(JTextField txtDescuentoDv) {
        this.txtDescuentoDv = txtDescuentoDv;
    }

    public JTextField getTxtDescuentoTotal2Dv() {
        return txtDescuentoTotal2Dv;
    }

    public void setTxtDescuentoTotal2Dv(JTextField txtDescuentoTotal2Dv) {
        this.txtDescuentoTotal2Dv = txtDescuentoTotal2Dv;
    }

    public JTextField getTxtDescuentoTotalDv() {
        return txtDescuentoTotalDv;
    }

    public void setTxtDescuentoTotalDv(JTextField txtDescuentoTotalDv) {
        this.txtDescuentoTotalDv = txtDescuentoTotalDv;
    }

    public JTextField getTxtIgvTotal() {
        return txtIgvTotal;
    }

    public void setTxtIgvTotal(JTextField txtIgvTotal) {
        this.txtIgvTotal = txtIgvTotal;
    }

    public JTextField getTxtImpTotalConIgv2Dv() {
        return txtImpTotalConIgv2Dv;
    }

    public void setTxtImpTotalConIgv2Dv(JTextField txtImpTotalConIgv2Dv) {
        this.txtImpTotalConIgv2Dv = txtImpTotalConIgv2Dv;
    }

    public JTextField getTxtImpTotalDv() {
        return txtImpTotalDv;
    }

    public void setTxtImpTotalDv(JTextField txtImpTotalDv) {
        this.txtImpTotalDv = txtImpTotalDv;
    }

    public JTextField getTxtImpTotalSinIgv() {
        return txtImpTotalSinIgv;
    }

    public void setTxtImpTotalSinIgv(JTextField txtImpTotalSinIgv) {
        this.txtImpTotalSinIgv = txtImpTotalSinIgv;
    }

    public JTextField getTxtMarcaGP() {
        return txtMarcaGP;
    }

    public void setTxtMarcaGP(JTextField txtMarcaGP) {
        this.txtMarcaGP = txtMarcaGP;
    }

    public JTextField getTxtNombreGP() {
        return txtNombreGP;
    }

    public void setTxtNombreGP(JTextField txtNombreGP) {
        this.txtNombreGP = txtNombreGP;
    }

    public JTextField getTxtPrecioDv() {
        return txtPrecioDv;
    }

    public void setTxtPrecioDv(JTextField txtPrecioDv) {
        this.txtPrecioDv = txtPrecioDv;
    }

    public JTextField getTxtStockDv() {
        return txtStockDv;
    }

    public void setTxtStockDv(JTextField txtStockDv) {
        this.txtStockDv = txtStockDv;
    }

    public JTextField getTxtTotalPagar2Dv() {
        return txtTotalPagar2Dv;
    }

    public void setTxtTotalPagar2Dv(JTextField txtTotalPagar2Dv) {
        this.txtTotalPagar2Dv = txtTotalPagar2Dv;
    }

    public JTextField getTxtTotalPagarDv() {
        return txtTotalPagarDv;
    }

    public void setTxtTotalPagarDv(JTextField txtTotalPagarDv) {
        this.txtTotalPagarDv = txtTotalPagarDv;
    }

    public JTextField getTxtTrabajadorDv() {
        return txtTrabajadorDv;
    }

    public void setTxtTrabajadorDv(JTextField txtTrabajadorDv) {
        this.txtTrabajadorDv = txtTrabajadorDv;
    }

    public JTextField getTxtValorProd() {
        return txtValorProd;
    }

    public void setTxtValorProd(JTextField txtValorProd) {
        this.txtValorProd = txtValorProd;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarVenta;
    private javax.swing.JButton btnEscanearProduGP;
    private javax.swing.ButtonGroup btnGroupContieneIgv;
    private javax.swing.JButton btnGuardarVenta;
    private javax.swing.JButton btnOrdenarV;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbInfoProduDv;
    private javax.swing.JComboBox<String> cbMetPagoDv;
    private javax.swing.JComboBox<String> cbNombresColumnasProd;
    private javax.swing.JComboBox<String> cbOrdenarV;
    private javax.swing.JCheckBox checkBoxDescuentoDv;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblDinamiTipoVenta;
    private javax.swing.JLabel lblExcelDv;
    private javax.swing.JLabel lblExcelProd;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblInventario;
    private javax.swing.JLabel lblInventario1;
    private javax.swing.JLabel lblInventarioPnl;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPdfDv;
    private javax.swing.JLabel lblPdfProd;
    private javax.swing.JLabel lblPrincipal;
    private javax.swing.JPanel panelDetalleVenta;
    private javax.swing.JPanel panelEscanear;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelProducto;
    private javax.swing.JPanel panelVenta;
    private javax.swing.JPopupMenu pmInventario;
    private javax.swing.JPopupMenu pmVenta;
    private javax.swing.JPanel pnlActualizarDv;
    private javax.swing.JPanel pnlActualizarGP;
    private javax.swing.JPanel pnlAgregarDv;
    private javax.swing.JPanel pnlAgregarGP;
    private javax.swing.JPanel pnlBarraDeOpciones;
    private javax.swing.JPanel pnlBuscarProd;
    private javax.swing.JPanel pnlCategoria;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlCerrarSesion;
    private javax.swing.JPanel pnlEliminarDv;
    private javax.swing.JPanel pnlEliminarGP;
    private javax.swing.JPanel pnlEscanearCodBarraDv;
    private javax.swing.JPanel pnlEstadistica;
    private javax.swing.JPanel pnlFSLogin;
    private javax.swing.JPanel pnlInventario;
    private javax.swing.JPanel pnlIzquierdaOperacionesProducto;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlLimpiarDv;
    private javax.swing.JPanel pnlLimpiarGP;
    private javax.swing.JPanel pnlMinusLogin;
    private javax.swing.JPanel pnlNorth;
    private javax.swing.JPanel pnlOperacionesProducto;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlProducto;
    private javax.swing.JPanel pnlProductoTitulo;
    private javax.swing.JPanel pnlTablaProductos;
    private javax.swing.JPanel pnlVenta;
    private javax.swing.JPanel pnlXLogin;
    private javax.swing.JRadioButton rbBoleta;
    private javax.swing.JRadioButton rbBoleta1;
    private javax.swing.JRadioButton rbFactura;
    private javax.swing.JRadioButton rbFactura1;
    private javax.swing.JRadioButton rbNoContieneIgv;
    private javax.swing.JRadioButton rbSiContieneIgv;
    private javax.swing.ButtonGroup seleccionTVenta;
    private javax.swing.JSpinner spnCantidadDv;
    private javax.swing.JSpinner spnCantidadGP;
    private javax.swing.JSpinner spnPrecioGP;
    private javax.swing.JTable tablaDetalleVenta;
    private javax.swing.JTable tablaDv2;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTable tablaVenta;
    private javax.swing.JTabbedPane tbpTablaDv;
    private javax.swing.JTextArea txtAreaObservacion;
    private javax.swing.JTextField txtCodBarraGP;
    private javax.swing.JTextField txtContenidoDv;
    private javax.swing.JTextField txtContenidoGP;
    private javax.swing.JTextField txtDescuentoDv;
    private javax.swing.JTextField txtDescuentoTotal2Dv;
    private javax.swing.JTextField txtDescuentoTotalDv;
    private javax.swing.JTextField txtIgvTotal;
    private javax.swing.JTextField txtImpTotalConIgv2Dv;
    private javax.swing.JTextField txtImpTotalDv;
    private javax.swing.JTextField txtImpTotalSinIgv;
    private javax.swing.JTextField txtMarcaGP;
    private javax.swing.JTextField txtNombreGP;
    private javax.swing.JTextField txtPrecioDv;
    private javax.swing.JTextField txtStockDv;
    private javax.swing.JTextField txtTotalPagar2Dv;
    private javax.swing.JTextField txtTotalPagarDv;
    private javax.swing.JTextField txtTrabajadorDv;
    private javax.swing.JTextField txtValorProd;
    // End of variables declaration//GEN-END:variables
}
