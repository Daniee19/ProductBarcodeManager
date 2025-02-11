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
        barraTitulo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        barraMenu = new javax.swing.JPanel();
        pnlVenta = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        pnlInventario = new javax.swing.JPanel();
        lblInventario1 = new javax.swing.JLabel();
        pnlProducto = new javax.swing.JPanel();
        lblInventarioPnl = new javax.swing.JLabel();
        pnlCategoria = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        pnlEstadistica = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        pnlBarraDeOpciones = new javax.swing.JPanel();
        pnlMinusLogin = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        pnlFSLogin = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        pnlXLogin = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        pnlCenter = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        panelDetalleVenta1 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        cbInfoProduDv = new javax.swing.JComboBox<>();
        jLabel49 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        checkBoxDescuentoDv = new javax.swing.JCheckBox();
        cbMetPagoDv = new javax.swing.JComboBox<>();
        txtDescuentoDv = new javax.swing.JTextField();
        spnCantidadDv = new javax.swing.JSpinner();
        jLabel85 = new javax.swing.JLabel();
        txtPrecioDv = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        txtStockDv = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        pnlAgregarDv = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        pnlEliminarDv = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        pnlActualizarDv = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        txtContenidoDv = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        pnlLimpiarDv = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        txtTrabajadorDv = new javax.swing.JTextField();
        pnlEscanearCodBarraDv = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtAreaObservacion = new javax.swing.JTextArea();
        btnGuardarVenta = new javax.swing.JButton();
        btnCancelarVenta = new javax.swing.JButton();
        jLabel100 = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        jPanel56 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        tbpTablaDv = new javax.swing.JTabbedPane();
        jPanel57 = new javax.swing.JPanel();
        jPanel58 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        rbBoleta = new javax.swing.JRadioButton();
        rbFactura = new javax.swing.JRadioButton();
        jSeparator25 = new javax.swing.JSeparator();
        jPanel59 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaDv1 = new javax.swing.JTable();
        jPanel60 = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txtDescuentoTotalDv = new javax.swing.JTextField();
        jPanel61 = new javax.swing.JPanel();
        jLabel104 = new javax.swing.JLabel();
        jSeparator26 = new javax.swing.JSeparator();
        jTextField6 = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jPanel62 = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        jSeparator27 = new javax.swing.JSeparator();
        txtTotalPagarDv = new javax.swing.JTextField();
        jPanel63 = new javax.swing.JPanel();
        jLabel108 = new javax.swing.JLabel();
        jSeparator28 = new javax.swing.JSeparator();
        jTextField8 = new javax.swing.JTextField();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jPanel64 = new javax.swing.JPanel();
        jLabel111 = new javax.swing.JLabel();
        jSeparator29 = new javax.swing.JSeparator();
        txtImpTotalDv = new javax.swing.JTextField();
        jPanel65 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        jSeparator30 = new javax.swing.JSeparator();
        jTextField10 = new javax.swing.JTextField();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jPanel66 = new javax.swing.JPanel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jPanel67 = new javax.swing.JPanel();
        jPanel68 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablaDv2 = new javax.swing.JTable();
        jPanel69 = new javax.swing.JPanel();
        jPanel70 = new javax.swing.JPanel();
        jPanel71 = new javax.swing.JPanel();
        jLabel117 = new javax.swing.JLabel();
        jSeparator31 = new javax.swing.JSeparator();
        jTextField12 = new javax.swing.JTextField();
        lblPdfDv = new javax.swing.JLabel();
        lblExcelDv = new javax.swing.JLabel();
        jPanel72 = new javax.swing.JPanel();
        jLabel118 = new javax.swing.JLabel();
        jSeparator32 = new javax.swing.JSeparator();
        txtDescuentoTotal2Dv = new javax.swing.JTextField();
        jPanel73 = new javax.swing.JPanel();
        jLabel119 = new javax.swing.JLabel();
        jSeparator33 = new javax.swing.JSeparator();
        jTextField14 = new javax.swing.JTextField();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jPanel74 = new javax.swing.JPanel();
        jLabel122 = new javax.swing.JLabel();
        jSeparator34 = new javax.swing.JSeparator();
        txtTotalPagar2Dv = new javax.swing.JTextField();
        jPanel75 = new javax.swing.JPanel();
        jLabel123 = new javax.swing.JLabel();
        jSeparator35 = new javax.swing.JSeparator();
        jTextField16 = new javax.swing.JTextField();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jPanel76 = new javax.swing.JPanel();
        jSeparator36 = new javax.swing.JSeparator();
        txtImpTotalSinIgv = new javax.swing.JTextField();
        jPanel77 = new javax.swing.JPanel();
        jLabel126 = new javax.swing.JLabel();
        jSeparator37 = new javax.swing.JSeparator();
        jTextField18 = new javax.swing.JTextField();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jPanel78 = new javax.swing.JPanel();
        jLabel130 = new javax.swing.JLabel();
        jSeparator38 = new javax.swing.JSeparator();
        txtIgvTotal = new javax.swing.JTextField();
        jPanel79 = new javax.swing.JPanel();
        jLabel131 = new javax.swing.JLabel();
        jSeparator39 = new javax.swing.JSeparator();
        jTextField20 = new javax.swing.JTextField();
        jLabel132 = new javax.swing.JLabel();
        jPanel80 = new javax.swing.JPanel();
        jPanel81 = new javax.swing.JPanel();
        jLabel133 = new javax.swing.JLabel();
        jSeparator40 = new javax.swing.JSeparator();
        jTextField23 = new javax.swing.JTextField();
        jPanel82 = new javax.swing.JPanel();
        jPanel83 = new javax.swing.JPanel();
        jLabel134 = new javax.swing.JLabel();
        jSeparator41 = new javax.swing.JSeparator();
        jTextField24 = new javax.swing.JTextField();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jSeparator42 = new javax.swing.JSeparator();
        txtImpTotalConIgv2Dv = new javax.swing.JTextField();
        jPanel84 = new javax.swing.JPanel();
        jPanel85 = new javax.swing.JPanel();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jPanel87 = new javax.swing.JPanel();
        lblDinamiTipoVenta = new javax.swing.JLabel();
        rbBoleta2 = new javax.swing.JRadioButton();
        rbFactura2 = new javax.swing.JRadioButton();

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
        pnlNorth.setLayout(new java.awt.BorderLayout());

        barraTitulo.setBackground(new java.awt.Color(102, 102, 255));
        barraTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("LA CANASTA");
        barraTitulo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 150, 50));

        pnlNorth.add(barraTitulo, java.awt.BorderLayout.LINE_START);

        barraMenu.setBackground(new java.awt.Color(255, 204, 204));
        barraMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Venta");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlVentaLayout = new javax.swing.GroupLayout(pnlVenta);
        pnlVenta.setLayout(pnlVentaLayout);
        pnlVentaLayout.setHorizontalGroup(
            pnlVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        pnlVentaLayout.setVerticalGroup(
            pnlVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        barraMenu.add(pnlVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 50));

        pnlInventario.setForeground(new java.awt.Color(255, 255, 255));

        lblInventario1.setBackground(new java.awt.Color(0, 0, 0));
        lblInventario1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblInventario1.setForeground(new java.awt.Color(0, 0, 0));
        lblInventario1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInventario1.setText("Inventario");
        lblInventario1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlInventarioLayout = new javax.swing.GroupLayout(pnlInventario);
        pnlInventario.setLayout(pnlInventarioLayout);
        pnlInventarioLayout.setHorizontalGroup(
            pnlInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInventarioLayout.createSequentialGroup()
                .addComponent(lblInventario1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlInventarioLayout.setVerticalGroup(
            pnlInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInventario1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        barraMenu.add(pnlInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 200, 50));

        pnlProducto.setForeground(new java.awt.Color(255, 255, 255));

        lblInventarioPnl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblInventarioPnl.setForeground(new java.awt.Color(0, 0, 0));
        lblInventarioPnl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInventarioPnl.setText("Producto");
        lblInventarioPnl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlProductoLayout = new javax.swing.GroupLayout(pnlProducto);
        pnlProducto.setLayout(pnlProductoLayout);
        pnlProductoLayout.setHorizontalGroup(
            pnlProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInventarioPnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        pnlProductoLayout.setVerticalGroup(
            pnlProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInventarioPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        barraMenu.add(pnlProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 190, 50));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Categoría");
        jLabel40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlCategoriaLayout = new javax.swing.GroupLayout(pnlCategoria);
        pnlCategoria.setLayout(pnlCategoriaLayout);
        pnlCategoriaLayout.setHorizontalGroup(
            pnlCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        pnlCategoriaLayout.setVerticalGroup(
            pnlCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        barraMenu.add(pnlCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 220, 50));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Estadística");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlEstadisticaLayout = new javax.swing.GroupLayout(pnlEstadistica);
        pnlEstadistica.setLayout(pnlEstadisticaLayout);
        pnlEstadisticaLayout.setHorizontalGroup(
            pnlEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEstadisticaLayout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlEstadisticaLayout.setVerticalGroup(
            pnlEstadisticaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        barraMenu.add(pnlEstadistica, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 190, 50));

        pnlNorth.add(barraMenu, java.awt.BorderLayout.CENTER);

        pnlBarraDeOpciones.setBackground(new java.awt.Color(255, 255, 204));
        pnlBarraDeOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMinusLogin.setBackground(new java.awt.Color(255, 204, 153));
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
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        pnlMinusLoginLayout.setVerticalGroup(
            pnlMinusLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        pnlBarraDeOpciones.add(pnlMinusLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 50, -1));

        pnlFSLogin.setBackground(new java.awt.Color(255, 255, 102));
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
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        pnlFSLoginLayout.setVerticalGroup(
            pnlFSLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlBarraDeOpciones.add(pnlFSLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 60, 50));

        pnlXLogin.setBackground(new java.awt.Color(204, 204, 255));
        pnlXLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel13.setBackground(new java.awt.Color(51, 51, 51));
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.png"))); // NOI18N

        javax.swing.GroupLayout pnlXLoginLayout = new javax.swing.GroupLayout(pnlXLogin);
        pnlXLogin.setLayout(pnlXLoginLayout);
        pnlXLoginLayout.setHorizontalGroup(
            pnlXLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlXLoginLayout.setVerticalGroup(
            pnlXLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlXLoginLayout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlBarraDeOpciones.add(pnlXLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 50, 50));

        pnlNorth.add(pnlBarraDeOpciones, java.awt.BorderLayout.EAST);

        jPanel1.add(pnlNorth, java.awt.BorderLayout.NORTH);

        pnlCenter.setBackground(new java.awt.Color(51, 255, 255));
        pnlCenter.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(1650, 110));
        jPanel4.setPreferredSize(new java.awt.Dimension(1650, 110));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelDetalleVenta1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel75.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel75.setText("#00000000000");
        jPanel36.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 13, 190, -1));

        jLabel47.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel47.setText("Venta");
        jPanel36.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 7, 110, 40));

        jPanel33.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 380, 60));

        jPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel38.add(cbInfoProduDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 230, 30));

        jLabel49.setText("Información del producto");
        jPanel38.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 150, -1));

        jLabel77.setText("Trabajador");
        jPanel38.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 120, 20));

        jLabel83.setText("Cantidad");
        jPanel38.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        checkBoxDescuentoDv.setText("Descuento");
        checkBoxDescuentoDv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel38.add(checkBoxDescuentoDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, 30));

        jPanel38.add(cbMetPagoDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 130, 30));

        txtDescuentoDv.setEditable(false);
        jPanel38.add(txtDescuentoDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 170, 30));

        spnCantidadDv.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel38.add(spnCantidadDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 130, 30));

        jLabel85.setText("Método de pago");
        jPanel38.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        txtPrecioDv.setEditable(false);
        txtPrecioDv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel38.add(txtPrecioDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 80, -1));

        jLabel86.setText("Precio");
        jPanel38.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        txtStockDv.setEditable(false);
        txtStockDv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel38.add(txtStockDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 80, -1));

        jLabel92.setText("Stock");
        jPanel38.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        pnlAgregarDv.setBackground(new java.awt.Color(255, 255, 255));
        pnlAgregarDv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel93.setText("Agregar");
        jLabel93.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel93.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlAgregarDv.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        jPanel38.add(pnlAgregarDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 100, 30));

        pnlEliminarDv.setBackground(new java.awt.Color(255, 255, 255));

        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel94.setText("Eliminar");
        jLabel94.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlEliminarDvLayout = new javax.swing.GroupLayout(pnlEliminarDv);
        pnlEliminarDv.setLayout(pnlEliminarDvLayout);
        pnlEliminarDvLayout.setHorizontalGroup(
            pnlEliminarDvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel94, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        pnlEliminarDvLayout.setVerticalGroup(
            pnlEliminarDvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel94, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel38.add(pnlEliminarDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 100, 30));

        pnlActualizarDv.setBackground(new java.awt.Color(255, 255, 255));

        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel95.setText("Actualizar");
        jLabel95.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlActualizarDvLayout = new javax.swing.GroupLayout(pnlActualizarDv);
        pnlActualizarDv.setLayout(pnlActualizarDvLayout);
        pnlActualizarDvLayout.setHorizontalGroup(
            pnlActualizarDvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        pnlActualizarDvLayout.setVerticalGroup(
            pnlActualizarDvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel95, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel38.add(pnlActualizarDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 100, 30));

        txtContenidoDv.setEditable(false);
        txtContenidoDv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel38.add(txtContenidoDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 100, 26));

        jLabel96.setText("Contenido");
        jPanel38.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        pnlLimpiarDv.setBackground(new java.awt.Color(255, 255, 255));
        pnlLimpiarDv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel97.setText("Limpiar");
        jLabel97.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel97.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlLimpiarDv.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        jPanel38.add(pnlLimpiarDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 100, 30));

        txtTrabajadorDv.setEditable(false);
        txtTrabajadorDv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel38.add(txtTrabajadorDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 300, 30));

        pnlEscanearCodBarraDv.setBackground(new java.awt.Color(204, 204, 204));
        pnlEscanearCodBarraDv.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel98.setBackground(new java.awt.Color(153, 153, 153));
        jLabel98.setForeground(new java.awt.Color(0, 0, 0));
        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escanear_codigo_30x30.png"))); // NOI18N
        jLabel98.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel98.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlEscanearCodBarraDv.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 30));

        jPanel38.add(pnlEscanearCodBarraDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 60, 30));

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconoInfo.png"))); // NOI18N
        jLabel99.setToolTipText("Solo productos con información completa y stock mayor a 0");
        jPanel38.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 68, -1, -1));

        jPanel33.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 380, 410));

        jPanel41.setBackground(new java.awt.Color(204, 204, 204));
        jPanel41.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAreaObservacion.setColumns(20);
        txtAreaObservacion.setRows(5);
        jScrollPane6.setViewportView(txtAreaObservacion);

        jPanel41.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 320, 120));

        btnGuardarVenta.setText("Guardar");
        btnGuardarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel41.add(btnGuardarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 100, 40));

        btnCancelarVenta.setText("Cancelar");
        btnCancelarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel41.add(btnCancelarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 100, 40));

        jPanel33.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 380, 200));

        jLabel100.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(0, 0, 0));
        jLabel100.setText("Si ya agregaste todos los productos");
        jPanel33.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 320, -1));
        jPanel33.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 330, 10));

        panelDetalleVenta1.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 420, 790));

        jPanel56.setBackground(new java.awt.Color(255, 255, 255));
        jPanel56.setForeground(new java.awt.Color(0, 0, 0));

        jLabel101.setBackground(new java.awt.Color(255, 255, 255));
        jLabel101.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(0, 0, 0));
        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel101.setText("GESTIONAR DETALLE DE VENTA");

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 1654, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 246, Short.MAX_VALUE))
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel101, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        panelDetalleVenta1.add(jPanel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 90));

        jPanel58.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel102.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel102.setText("Seleccione el tipo de venta, antes de empezar");
        jPanel58.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 721, 50));

        rbBoleta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbBoleta.setText("Boleta");
        rbBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBoletaActionPerformed(evt);
            }
        });
        jPanel58.add(rbBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        rbFactura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbFactura.setText("Factura");
        rbFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFacturaActionPerformed(evt);
            }
        });
        jPanel58.add(rbFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, -1));
        jPanel58.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 520, 10));

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(260, Short.MAX_VALUE))
        );

        tbpTablaDv.addTab("tab3", jPanel57);

        jPanel59.setBackground(new java.awt.Color(255, 255, 255));
        jPanel59.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaDv1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(tablaDv1);

        jPanel59.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 1060, 590));

        jPanel60.setBackground(new java.awt.Color(255, 255, 255));
        jPanel60.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel103.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(0, 0, 0));
        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel103.setText("(S/.)");
        jPanel60.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 70, -1));
        jPanel60.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 120, 20));

        txtDescuentoTotalDv.setEditable(false);
        txtDescuentoTotalDv.setBackground(new java.awt.Color(255, 255, 255));
        txtDescuentoTotalDv.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtDescuentoTotalDv.setForeground(new java.awt.Color(60, 63, 65));
        txtDescuentoTotalDv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDescuentoTotalDv.setBorder(null);
        jPanel60.add(txtDescuentoTotalDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 120, 20));

        jPanel61.setBackground(new java.awt.Color(255, 255, 255));
        jPanel61.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel104.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(0, 0, 0));
        jLabel104.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel104.setText("Total a pagar (S/.) : ");
        jPanel61.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel61.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 45, 140, 20));

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel61.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 24, 130, 20));

        jPanel60.add(jPanel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 670, 370, 70));

        jLabel105.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel105.setText("DESCUENTO");
        jPanel60.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, -1));

        jLabel106.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel106.setText("TOTAL");
        jPanel60.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 120, -1));

        jPanel59.add(jPanel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 610, 350, 70));

        jPanel62.setBackground(new java.awt.Color(255, 255, 255));
        jPanel62.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel107.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(0, 0, 0));
        jLabel107.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel107.setText("(S/.)");
        jPanel62.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));
        jPanel62.add(jSeparator27, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 130, 10));

        txtTotalPagarDv.setEditable(false);
        txtTotalPagarDv.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalPagarDv.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtTotalPagarDv.setForeground(new java.awt.Color(60, 63, 65));
        txtTotalPagarDv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalPagarDv.setBorder(null);
        jPanel62.add(txtTotalPagarDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 140, 20));

        jPanel63.setBackground(new java.awt.Color(255, 255, 255));
        jPanel63.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel108.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(0, 0, 0));
        jLabel108.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel108.setText("Total a pagar (S/.) : ");
        jPanel63.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel63.add(jSeparator28, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 45, 140, 20));

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel63.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 24, 130, 20));

        jPanel62.add(jPanel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 670, 370, 70));

        jLabel109.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel109.setText("A PAGAR");
        jPanel62.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, -1));

        jLabel110.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel110.setText("TOTAL");
        jPanel62.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 120, -1));

        jPanel59.add(jPanel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 610, 360, 70));

        jPanel64.setBackground(new java.awt.Color(255, 255, 255));
        jPanel64.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel111.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(0, 0, 0));
        jLabel111.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel111.setText("(S/.)");
        jPanel64.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 70, -1));
        jPanel64.add(jSeparator29, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 110, 20));

        txtImpTotalDv.setEditable(false);
        txtImpTotalDv.setBackground(new java.awt.Color(255, 255, 255));
        txtImpTotalDv.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtImpTotalDv.setForeground(new java.awt.Color(60, 63, 65));
        txtImpTotalDv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtImpTotalDv.setBorder(null);
        jPanel64.add(txtImpTotalDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 110, 20));

        jPanel65.setBackground(new java.awt.Color(255, 255, 255));
        jPanel65.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel112.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(0, 0, 0));
        jLabel112.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel112.setText("Total a pagar (S/.) : ");
        jPanel65.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel65.add(jSeparator30, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 45, 140, 20));

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel65.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 24, 130, 20));

        jPanel64.add(jPanel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 670, 370, 70));

        jLabel113.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel113.setText("TOTAL");
        jPanel64.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 120, -1));

        jLabel114.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel114.setText("IMPORTE");
        jPanel64.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 120, -1));

        jPanel59.add(jPanel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 610, 310, 70));

        jPanel66.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel115.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf.png"))); // NOI18N
        jPanel66.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 60, 50));

        jLabel116.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excel.png"))); // NOI18N
        jPanel66.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 60, 50));

        jPanel59.add(jPanel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 60, 130));

        tbpTablaDv.addTab("tab1", jPanel59);

        jPanel68.setBackground(new java.awt.Color(255, 255, 255));
        jPanel68.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane8.setViewportView(tablaDv2);

        jPanel68.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1170, 440));

        jPanel69.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel70.setBackground(new java.awt.Color(255, 255, 255));
        jPanel70.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel71.setBackground(new java.awt.Color(255, 255, 255));
        jPanel71.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel117.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(0, 0, 0));
        jLabel117.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel117.setText("Total a pagar (S/.) : ");
        jPanel71.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel71.add(jSeparator31, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 45, 140, 20));

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel71.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 24, 130, 20));

        jPanel70.add(jPanel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 670, 370, 70));

        lblPdfDv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf.png"))); // NOI18N
        lblPdfDv.setText("PDF");
        jPanel70.add(lblPdfDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 60, 50));

        lblExcelDv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excel.png"))); // NOI18N
        lblExcelDv.setText("EXCEL");
        jPanel70.add(lblExcelDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 80, 50));

        jPanel69.add(jPanel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 340, 70));

        jPanel72.setBackground(new java.awt.Color(255, 255, 255));
        jPanel72.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel118.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(0, 0, 0));
        jLabel118.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel118.setText("(S/.)");
        jPanel72.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 70, -1));
        jPanel72.add(jSeparator32, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 120, 20));

        txtDescuentoTotal2Dv.setEditable(false);
        txtDescuentoTotal2Dv.setBackground(new java.awt.Color(255, 255, 255));
        txtDescuentoTotal2Dv.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtDescuentoTotal2Dv.setForeground(new java.awt.Color(60, 63, 65));
        txtDescuentoTotal2Dv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDescuentoTotal2Dv.setBorder(null);
        jPanel72.add(txtDescuentoTotal2Dv, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 120, 20));

        jPanel73.setBackground(new java.awt.Color(255, 255, 255));
        jPanel73.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel119.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(0, 0, 0));
        jLabel119.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel119.setText("Total a pagar (S/.) : ");
        jPanel73.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel73.add(jSeparator33, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 45, 140, 20));

        jTextField14.setEditable(false);
        jTextField14.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel73.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 24, 130, 20));

        jPanel72.add(jPanel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 670, 370, 70));

        jLabel120.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel120.setText("DESCUENTO");
        jPanel72.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 120, -1));

        jLabel121.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel121.setText("TOTAL");
        jPanel72.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 90, -1));

        jPanel69.add(jPanel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 350, 70));

        jPanel74.setBackground(new java.awt.Color(255, 255, 255));
        jPanel74.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel122.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(0, 0, 0));
        jLabel122.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel122.setText("(S/.)");
        jPanel74.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));
        jPanel74.add(jSeparator34, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 140, 10));

        txtTotalPagar2Dv.setEditable(false);
        txtTotalPagar2Dv.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalPagar2Dv.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtTotalPagar2Dv.setForeground(new java.awt.Color(60, 63, 65));
        txtTotalPagar2Dv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalPagar2Dv.setBorder(null);
        jPanel74.add(txtTotalPagar2Dv, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 150, 20));

        jPanel75.setBackground(new java.awt.Color(255, 255, 255));
        jPanel75.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel123.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(0, 0, 0));
        jLabel123.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel123.setText("Total a pagar (S/.) : ");
        jPanel75.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel75.add(jSeparator35, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 45, 140, 20));

        jTextField16.setEditable(false);
        jTextField16.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel75.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 24, 130, 20));

        jPanel74.add(jPanel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 670, 370, 70));

        jLabel124.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel124.setText("A PAGAR");
        jPanel74.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 100, -1));

        jLabel125.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel125.setText("TOTAL");
        jPanel74.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 100, -1));

        jPanel69.add(jPanel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 360, 70));

        jPanel76.setBackground(new java.awt.Color(255, 255, 255));
        jPanel76.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel76.add(jSeparator36, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 90, 20));

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
        jPanel76.add(txtImpTotalSinIgv, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 90, 20));

        jPanel77.setBackground(new java.awt.Color(255, 255, 255));
        jPanel77.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel126.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(0, 0, 0));
        jLabel126.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel126.setText("Total a pagar (S/.) : ");
        jPanel77.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel77.add(jSeparator37, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 45, 140, 20));

        jTextField18.setEditable(false);
        jTextField18.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel77.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 24, 130, 20));

        jPanel76.add(jPanel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 670, 370, 70));

        jLabel127.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel127.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel127.setText("IMPORTE TOTAL");
        jPanel76.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, 150, -1));

        jLabel128.setText("SIN IGV O EXONERADO");
        jPanel76.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 35, -1, -1));

        jLabel129.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel129.setForeground(new java.awt.Color(0, 0, 0));
        jLabel129.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel129.setText("(S/.)");
        jPanel76.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 70, -1));

        jPanel69.add(jPanel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 340, 70));

        jPanel78.setBackground(new java.awt.Color(255, 255, 255));
        jPanel78.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel130.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel130.setForeground(new java.awt.Color(0, 0, 0));
        jLabel130.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel130.setText("(S/.)");
        jPanel78.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 70, -1));
        jPanel78.add(jSeparator38, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 120, 20));

        txtIgvTotal.setEditable(false);
        txtIgvTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtIgvTotal.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtIgvTotal.setForeground(new java.awt.Color(60, 63, 65));
        txtIgvTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIgvTotal.setBorder(null);
        jPanel78.add(txtIgvTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 120, 20));

        jPanel79.setBackground(new java.awt.Color(255, 255, 255));
        jPanel79.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel131.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel131.setForeground(new java.awt.Color(0, 0, 0));
        jLabel131.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel131.setText("Total a pagar (S/.) : ");
        jPanel79.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel79.add(jSeparator39, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 45, 140, 20));

        jTextField20.setEditable(false);
        jTextField20.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel79.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 24, 130, 20));

        jPanel78.add(jPanel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 670, 370, 70));

        jLabel132.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel132.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel132.setText("IGV TOTAL");
        jPanel78.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, -1));

        jPanel69.add(jPanel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 350, 70));

        jPanel80.setBackground(new java.awt.Color(255, 255, 255));
        jPanel80.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel81.setBackground(new java.awt.Color(255, 255, 255));
        jPanel81.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel133.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel133.setForeground(new java.awt.Color(0, 0, 0));
        jLabel133.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel133.setText("Total a pagar (S/.) : ");
        jPanel81.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel81.add(jSeparator40, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 45, 140, 20));

        jTextField23.setEditable(false);
        jTextField23.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTextField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel81.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 24, 130, 20));

        jPanel80.add(jPanel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 670, 370, 70));

        jPanel82.setBackground(new java.awt.Color(255, 255, 255));
        jPanel82.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel83.setBackground(new java.awt.Color(255, 255, 255));
        jPanel83.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel134.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel134.setForeground(new java.awt.Color(0, 0, 0));
        jLabel134.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel134.setText("Total a pagar (S/.) : ");
        jPanel83.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel83.add(jSeparator41, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 45, 140, 20));

        jTextField24.setEditable(false);
        jTextField24.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jTextField24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel83.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 24, 130, 20));

        jPanel82.add(jPanel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 670, 370, 70));

        jPanel80.add(jPanel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 360, 70));

        jLabel135.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel135.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel135.setText("IMPORTE TOTAL");
        jPanel80.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, 150, -1));

        jLabel136.setText("MÁS IGV");
        jPanel80.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 35, 60, -1));

        jLabel137.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel137.setForeground(new java.awt.Color(0, 0, 0));
        jLabel137.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel137.setText("(S/.)");
        jPanel80.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 70, -1));
        jPanel80.add(jSeparator42, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 90, 20));

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
        jPanel80.add(txtImpTotalConIgv2Dv, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 90, 20));

        jPanel69.add(jPanel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 360, 70));

        jPanel68.add(jPanel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 1170, 220));

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel68, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1210, Short.MAX_VALUE)
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel68, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
        );

        tbpTablaDv.addTab("tab2", jPanel67);

        panelDetalleVenta1.add(tbpTablaDv, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 1210, 730));

        jPanel84.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel85.setBackground(new java.awt.Color(255, 255, 255));
        jPanel85.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFecha.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFecha.setText("fecha");
        jPanel85.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 30));

        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHora.setText("hora");
        jPanel85.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 150, -1));

        jPanel84.add(jPanel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 330, 60));

        jPanel87.setBackground(new java.awt.Color(255, 255, 255));
        jPanel87.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDinamiTipoVenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDinamiTipoVenta.setText("Seleccione el tipo de venta");
        jPanel87.add(lblDinamiTipoVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 180, -1));

        rbBoleta2.setBackground(new java.awt.Color(255, 255, 255));
        rbBoleta2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbBoleta2.setText("Boleta");
        rbBoleta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBoleta2ActionPerformed(evt);
            }
        });
        jPanel87.add(rbBoleta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 18, -1, -1));

        rbFactura2.setBackground(new java.awt.Color(255, 255, 255));
        rbFactura2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbFactura2.setText("Factura");
        rbFactura2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFactura2ActionPerformed(evt);
            }
        });
        jPanel87.add(rbFactura2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 18, -1, -1));

        jPanel84.add(jPanel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 60));

        panelDetalleVenta1.add(jPanel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 1210, 60));

        jPanel4.add(panelDetalleVenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlCenter.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel1.add(pnlCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBoletaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbBoletaActionPerformed

    private void rbFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFacturaActionPerformed

    private void txtImpTotalSinIgvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImpTotalSinIgvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImpTotalSinIgvActionPerformed

    private void txtImpTotalConIgv2DvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImpTotalConIgv2DvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImpTotalConIgv2DvActionPerformed

    private void rbBoleta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBoleta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbBoleta2ActionPerformed

    private void rbFactura2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFactura2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFactura2ActionPerformed

    public JPanel getBarraMenu() {
        return barraMenu;
    }

    public void setBarraMenu(JPanel barraMenu) {
        this.barraMenu = barraMenu;
    }

    public JPanel getBarraTitulo() {
        return barraTitulo;
    }

    public void setBarraTitulo(JPanel barraTitulo) {
        this.barraTitulo = barraTitulo;
    }

    public JButton getBtnCancelarVenta() {
        return btnCancelarVenta;
    }

    public void setBtnCancelarVenta(JButton btnCancelarVenta) {
        this.btnCancelarVenta = btnCancelarVenta;
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

    public JCheckBox getCheckBoxDescuentoDv() {
        return checkBoxDescuentoDv;
    }

    public void setCheckBoxDescuentoDv(JCheckBox checkBoxDescuentoDv) {
        this.checkBoxDescuentoDv = checkBoxDescuentoDv;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public JLabel getjLabel100() {
        return jLabel100;
    }

    public void setjLabel100(JLabel jLabel100) {
        this.jLabel100 = jLabel100;
    }

    public JLabel getjLabel101() {
        return jLabel101;
    }

    public void setjLabel101(JLabel jLabel101) {
        this.jLabel101 = jLabel101;
    }

    public JLabel getjLabel102() {
        return jLabel102;
    }

    public void setjLabel102(JLabel jLabel102) {
        this.jLabel102 = jLabel102;
    }

    public JLabel getjLabel103() {
        return jLabel103;
    }

    public void setjLabel103(JLabel jLabel103) {
        this.jLabel103 = jLabel103;
    }

    public JLabel getjLabel104() {
        return jLabel104;
    }

    public void setjLabel104(JLabel jLabel104) {
        this.jLabel104 = jLabel104;
    }

    public JLabel getjLabel105() {
        return jLabel105;
    }

    public void setjLabel105(JLabel jLabel105) {
        this.jLabel105 = jLabel105;
    }

    public JLabel getjLabel106() {
        return jLabel106;
    }

    public void setjLabel106(JLabel jLabel106) {
        this.jLabel106 = jLabel106;
    }

    public JLabel getjLabel107() {
        return jLabel107;
    }

    public void setjLabel107(JLabel jLabel107) {
        this.jLabel107 = jLabel107;
    }

    public JLabel getjLabel108() {
        return jLabel108;
    }

    public void setjLabel108(JLabel jLabel108) {
        this.jLabel108 = jLabel108;
    }

    public JLabel getjLabel109() {
        return jLabel109;
    }

    public void setjLabel109(JLabel jLabel109) {
        this.jLabel109 = jLabel109;
    }

    public JLabel getjLabel110() {
        return jLabel110;
    }

    public void setjLabel110(JLabel jLabel110) {
        this.jLabel110 = jLabel110;
    }

    public JLabel getjLabel111() {
        return jLabel111;
    }

    public void setjLabel111(JLabel jLabel111) {
        this.jLabel111 = jLabel111;
    }

    public JLabel getjLabel112() {
        return jLabel112;
    }

    public void setjLabel112(JLabel jLabel112) {
        this.jLabel112 = jLabel112;
    }

    public JLabel getjLabel113() {
        return jLabel113;
    }

    public void setjLabel113(JLabel jLabel113) {
        this.jLabel113 = jLabel113;
    }

    public JLabel getjLabel114() {
        return jLabel114;
    }

    public void setjLabel114(JLabel jLabel114) {
        this.jLabel114 = jLabel114;
    }

    public JLabel getjLabel115() {
        return jLabel115;
    }

    public void setjLabel115(JLabel jLabel115) {
        this.jLabel115 = jLabel115;
    }

    public JLabel getjLabel116() {
        return jLabel116;
    }

    public void setjLabel116(JLabel jLabel116) {
        this.jLabel116 = jLabel116;
    }

    public JLabel getjLabel117() {
        return jLabel117;
    }

    public void setjLabel117(JLabel jLabel117) {
        this.jLabel117 = jLabel117;
    }

    public JLabel getjLabel118() {
        return jLabel118;
    }

    public void setjLabel118(JLabel jLabel118) {
        this.jLabel118 = jLabel118;
    }

    public JLabel getjLabel119() {
        return jLabel119;
    }

    public void setjLabel119(JLabel jLabel119) {
        this.jLabel119 = jLabel119;
    }

    public JLabel getjLabel120() {
        return jLabel120;
    }

    public void setjLabel120(JLabel jLabel120) {
        this.jLabel120 = jLabel120;
    }

    public JLabel getjLabel121() {
        return jLabel121;
    }

    public void setjLabel121(JLabel jLabel121) {
        this.jLabel121 = jLabel121;
    }

    public JLabel getjLabel122() {
        return jLabel122;
    }

    public void setjLabel122(JLabel jLabel122) {
        this.jLabel122 = jLabel122;
    }

    public JLabel getjLabel123() {
        return jLabel123;
    }

    public void setjLabel123(JLabel jLabel123) {
        this.jLabel123 = jLabel123;
    }

    public JLabel getjLabel124() {
        return jLabel124;
    }

    public void setjLabel124(JLabel jLabel124) {
        this.jLabel124 = jLabel124;
    }

    public JLabel getjLabel125() {
        return jLabel125;
    }

    public void setjLabel125(JLabel jLabel125) {
        this.jLabel125 = jLabel125;
    }

    public JLabel getjLabel126() {
        return jLabel126;
    }

    public void setjLabel126(JLabel jLabel126) {
        this.jLabel126 = jLabel126;
    }

    public JLabel getjLabel127() {
        return jLabel127;
    }

    public void setjLabel127(JLabel jLabel127) {
        this.jLabel127 = jLabel127;
    }

    public JLabel getjLabel128() {
        return jLabel128;
    }

    public void setjLabel128(JLabel jLabel128) {
        this.jLabel128 = jLabel128;
    }

    public JLabel getjLabel129() {
        return jLabel129;
    }

    public void setjLabel129(JLabel jLabel129) {
        this.jLabel129 = jLabel129;
    }

    public JLabel getjLabel13() {
        return jLabel13;
    }

    public void setjLabel13(JLabel jLabel13) {
        this.jLabel13 = jLabel13;
    }

    public JLabel getjLabel130() {
        return jLabel130;
    }

    public void setjLabel130(JLabel jLabel130) {
        this.jLabel130 = jLabel130;
    }

    public JLabel getjLabel131() {
        return jLabel131;
    }

    public void setjLabel131(JLabel jLabel131) {
        this.jLabel131 = jLabel131;
    }

    public JLabel getjLabel132() {
        return jLabel132;
    }

    public void setjLabel132(JLabel jLabel132) {
        this.jLabel132 = jLabel132;
    }

    public JLabel getjLabel133() {
        return jLabel133;
    }

    public void setjLabel133(JLabel jLabel133) {
        this.jLabel133 = jLabel133;
    }

    public JLabel getjLabel134() {
        return jLabel134;
    }

    public void setjLabel134(JLabel jLabel134) {
        this.jLabel134 = jLabel134;
    }

    public JLabel getjLabel135() {
        return jLabel135;
    }

    public void setjLabel135(JLabel jLabel135) {
        this.jLabel135 = jLabel135;
    }

    public JLabel getjLabel136() {
        return jLabel136;
    }

    public void setjLabel136(JLabel jLabel136) {
        this.jLabel136 = jLabel136;
    }

    public JLabel getjLabel137() {
        return jLabel137;
    }

    public void setjLabel137(JLabel jLabel137) {
        this.jLabel137 = jLabel137;
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

    public JLabel getjLabel40() {
        return jLabel40;
    }

    public void setjLabel40(JLabel jLabel40) {
        this.jLabel40 = jLabel40;
    }

    public JLabel getjLabel47() {
        return jLabel47;
    }

    public void setjLabel47(JLabel jLabel47) {
        this.jLabel47 = jLabel47;
    }

    public JLabel getjLabel49() {
        return jLabel49;
    }

    public void setjLabel49(JLabel jLabel49) {
        this.jLabel49 = jLabel49;
    }

    public JLabel getjLabel75() {
        return jLabel75;
    }

    public void setjLabel75(JLabel jLabel75) {
        this.jLabel75 = jLabel75;
    }

    public JLabel getjLabel77() {
        return jLabel77;
    }

    public void setjLabel77(JLabel jLabel77) {
        this.jLabel77 = jLabel77;
    }

    public JLabel getjLabel83() {
        return jLabel83;
    }

    public void setjLabel83(JLabel jLabel83) {
        this.jLabel83 = jLabel83;
    }

    public JLabel getjLabel85() {
        return jLabel85;
    }

    public void setjLabel85(JLabel jLabel85) {
        this.jLabel85 = jLabel85;
    }

    public JLabel getjLabel86() {
        return jLabel86;
    }

    public void setjLabel86(JLabel jLabel86) {
        this.jLabel86 = jLabel86;
    }

    public JLabel getjLabel92() {
        return jLabel92;
    }

    public void setjLabel92(JLabel jLabel92) {
        this.jLabel92 = jLabel92;
    }

    public JLabel getjLabel93() {
        return jLabel93;
    }

    public void setjLabel93(JLabel jLabel93) {
        this.jLabel93 = jLabel93;
    }

    public JLabel getjLabel94() {
        return jLabel94;
    }

    public void setjLabel94(JLabel jLabel94) {
        this.jLabel94 = jLabel94;
    }

    public JLabel getjLabel95() {
        return jLabel95;
    }

    public void setjLabel95(JLabel jLabel95) {
        this.jLabel95 = jLabel95;
    }

    public JLabel getjLabel96() {
        return jLabel96;
    }

    public void setjLabel96(JLabel jLabel96) {
        this.jLabel96 = jLabel96;
    }

    public JLabel getjLabel97() {
        return jLabel97;
    }

    public void setjLabel97(JLabel jLabel97) {
        this.jLabel97 = jLabel97;
    }

    public JLabel getjLabel98() {
        return jLabel98;
    }

    public void setjLabel98(JLabel jLabel98) {
        this.jLabel98 = jLabel98;
    }

    public JLabel getjLabel99() {
        return jLabel99;
    }

    public void setjLabel99(JLabel jLabel99) {
        this.jLabel99 = jLabel99;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel33() {
        return jPanel33;
    }

    public void setjPanel33(JPanel jPanel33) {
        this.jPanel33 = jPanel33;
    }

    public JPanel getjPanel36() {
        return jPanel36;
    }

    public void setjPanel36(JPanel jPanel36) {
        this.jPanel36 = jPanel36;
    }

    public JPanel getjPanel38() {
        return jPanel38;
    }

    public void setjPanel38(JPanel jPanel38) {
        this.jPanel38 = jPanel38;
    }

    public JPanel getjPanel4() {
        return jPanel4;
    }

    public void setjPanel4(JPanel jPanel4) {
        this.jPanel4 = jPanel4;
    }

    public JPanel getjPanel41() {
        return jPanel41;
    }

    public void setjPanel41(JPanel jPanel41) {
        this.jPanel41 = jPanel41;
    }

    public JPanel getjPanel56() {
        return jPanel56;
    }

    public void setjPanel56(JPanel jPanel56) {
        this.jPanel56 = jPanel56;
    }

    public JPanel getjPanel57() {
        return jPanel57;
    }

    public void setjPanel57(JPanel jPanel57) {
        this.jPanel57 = jPanel57;
    }

    public JPanel getjPanel58() {
        return jPanel58;
    }

    public void setjPanel58(JPanel jPanel58) {
        this.jPanel58 = jPanel58;
    }

    public JPanel getjPanel59() {
        return jPanel59;
    }

    public void setjPanel59(JPanel jPanel59) {
        this.jPanel59 = jPanel59;
    }

    public JPanel getjPanel60() {
        return jPanel60;
    }

    public void setjPanel60(JPanel jPanel60) {
        this.jPanel60 = jPanel60;
    }

    public JPanel getjPanel61() {
        return jPanel61;
    }

    public void setjPanel61(JPanel jPanel61) {
        this.jPanel61 = jPanel61;
    }

    public JPanel getjPanel62() {
        return jPanel62;
    }

    public void setjPanel62(JPanel jPanel62) {
        this.jPanel62 = jPanel62;
    }

    public JPanel getjPanel63() {
        return jPanel63;
    }

    public void setjPanel63(JPanel jPanel63) {
        this.jPanel63 = jPanel63;
    }

    public JPanel getjPanel64() {
        return jPanel64;
    }

    public void setjPanel64(JPanel jPanel64) {
        this.jPanel64 = jPanel64;
    }

    public JPanel getjPanel65() {
        return jPanel65;
    }

    public void setjPanel65(JPanel jPanel65) {
        this.jPanel65 = jPanel65;
    }

    public JPanel getjPanel66() {
        return jPanel66;
    }

    public void setjPanel66(JPanel jPanel66) {
        this.jPanel66 = jPanel66;
    }

    public JPanel getjPanel67() {
        return jPanel67;
    }

    public void setjPanel67(JPanel jPanel67) {
        this.jPanel67 = jPanel67;
    }

    public JPanel getjPanel68() {
        return jPanel68;
    }

    public void setjPanel68(JPanel jPanel68) {
        this.jPanel68 = jPanel68;
    }

    public JPanel getjPanel69() {
        return jPanel69;
    }

    public void setjPanel69(JPanel jPanel69) {
        this.jPanel69 = jPanel69;
    }

    public JPanel getjPanel70() {
        return jPanel70;
    }

    public void setjPanel70(JPanel jPanel70) {
        this.jPanel70 = jPanel70;
    }

    public JPanel getjPanel71() {
        return jPanel71;
    }

    public void setjPanel71(JPanel jPanel71) {
        this.jPanel71 = jPanel71;
    }

    public JPanel getjPanel72() {
        return jPanel72;
    }

    public void setjPanel72(JPanel jPanel72) {
        this.jPanel72 = jPanel72;
    }

    public JPanel getjPanel73() {
        return jPanel73;
    }

    public void setjPanel73(JPanel jPanel73) {
        this.jPanel73 = jPanel73;
    }

    public JPanel getjPanel74() {
        return jPanel74;
    }

    public void setjPanel74(JPanel jPanel74) {
        this.jPanel74 = jPanel74;
    }

    public JPanel getjPanel75() {
        return jPanel75;
    }

    public void setjPanel75(JPanel jPanel75) {
        this.jPanel75 = jPanel75;
    }

    public JPanel getjPanel76() {
        return jPanel76;
    }

    public void setjPanel76(JPanel jPanel76) {
        this.jPanel76 = jPanel76;
    }

    public JPanel getjPanel77() {
        return jPanel77;
    }

    public void setjPanel77(JPanel jPanel77) {
        this.jPanel77 = jPanel77;
    }

    public JPanel getjPanel78() {
        return jPanel78;
    }

    public void setjPanel78(JPanel jPanel78) {
        this.jPanel78 = jPanel78;
    }

    public JPanel getjPanel79() {
        return jPanel79;
    }

    public void setjPanel79(JPanel jPanel79) {
        this.jPanel79 = jPanel79;
    }

    public JPanel getjPanel80() {
        return jPanel80;
    }

    public void setjPanel80(JPanel jPanel80) {
        this.jPanel80 = jPanel80;
    }

    public JPanel getjPanel81() {
        return jPanel81;
    }

    public void setjPanel81(JPanel jPanel81) {
        this.jPanel81 = jPanel81;
    }

    public JPanel getjPanel82() {
        return jPanel82;
    }

    public void setjPanel82(JPanel jPanel82) {
        this.jPanel82 = jPanel82;
    }

    public JPanel getjPanel83() {
        return jPanel83;
    }

    public void setjPanel83(JPanel jPanel83) {
        this.jPanel83 = jPanel83;
    }

    public JPanel getjPanel84() {
        return jPanel84;
    }

    public void setjPanel84(JPanel jPanel84) {
        this.jPanel84 = jPanel84;
    }

    public JPanel getjPanel85() {
        return jPanel85;
    }

    public void setjPanel85(JPanel jPanel85) {
        this.jPanel85 = jPanel85;
    }

    public JPanel getjPanel87() {
        return jPanel87;
    }

    public void setjPanel87(JPanel jPanel87) {
        this.jPanel87 = jPanel87;
    }

    public JScrollPane getjScrollPane6() {
        return jScrollPane6;
    }

    public void setjScrollPane6(JScrollPane jScrollPane6) {
        this.jScrollPane6 = jScrollPane6;
    }

    public JScrollPane getjScrollPane7() {
        return jScrollPane7;
    }

    public void setjScrollPane7(JScrollPane jScrollPane7) {
        this.jScrollPane7 = jScrollPane7;
    }

    public JScrollPane getjScrollPane8() {
        return jScrollPane8;
    }

    public void setjScrollPane8(JScrollPane jScrollPane8) {
        this.jScrollPane8 = jScrollPane8;
    }

    public JSeparator getjSeparator21() {
        return jSeparator21;
    }

    public void setjSeparator21(JSeparator jSeparator21) {
        this.jSeparator21 = jSeparator21;
    }

    public JSeparator getjSeparator25() {
        return jSeparator25;
    }

    public void setjSeparator25(JSeparator jSeparator25) {
        this.jSeparator25 = jSeparator25;
    }

    public JSeparator getjSeparator26() {
        return jSeparator26;
    }

    public void setjSeparator26(JSeparator jSeparator26) {
        this.jSeparator26 = jSeparator26;
    }

    public JSeparator getjSeparator27() {
        return jSeparator27;
    }

    public void setjSeparator27(JSeparator jSeparator27) {
        this.jSeparator27 = jSeparator27;
    }

    public JSeparator getjSeparator28() {
        return jSeparator28;
    }

    public void setjSeparator28(JSeparator jSeparator28) {
        this.jSeparator28 = jSeparator28;
    }

    public JSeparator getjSeparator29() {
        return jSeparator29;
    }

    public void setjSeparator29(JSeparator jSeparator29) {
        this.jSeparator29 = jSeparator29;
    }

    public JSeparator getjSeparator30() {
        return jSeparator30;
    }

    public void setjSeparator30(JSeparator jSeparator30) {
        this.jSeparator30 = jSeparator30;
    }

    public JSeparator getjSeparator31() {
        return jSeparator31;
    }

    public void setjSeparator31(JSeparator jSeparator31) {
        this.jSeparator31 = jSeparator31;
    }

    public JSeparator getjSeparator32() {
        return jSeparator32;
    }

    public void setjSeparator32(JSeparator jSeparator32) {
        this.jSeparator32 = jSeparator32;
    }

    public JSeparator getjSeparator33() {
        return jSeparator33;
    }

    public void setjSeparator33(JSeparator jSeparator33) {
        this.jSeparator33 = jSeparator33;
    }

    public JSeparator getjSeparator34() {
        return jSeparator34;
    }

    public void setjSeparator34(JSeparator jSeparator34) {
        this.jSeparator34 = jSeparator34;
    }

    public JSeparator getjSeparator35() {
        return jSeparator35;
    }

    public void setjSeparator35(JSeparator jSeparator35) {
        this.jSeparator35 = jSeparator35;
    }

    public JSeparator getjSeparator36() {
        return jSeparator36;
    }

    public void setjSeparator36(JSeparator jSeparator36) {
        this.jSeparator36 = jSeparator36;
    }

    public JSeparator getjSeparator37() {
        return jSeparator37;
    }

    public void setjSeparator37(JSeparator jSeparator37) {
        this.jSeparator37 = jSeparator37;
    }

    public JSeparator getjSeparator38() {
        return jSeparator38;
    }

    public void setjSeparator38(JSeparator jSeparator38) {
        this.jSeparator38 = jSeparator38;
    }

    public JSeparator getjSeparator39() {
        return jSeparator39;
    }

    public void setjSeparator39(JSeparator jSeparator39) {
        this.jSeparator39 = jSeparator39;
    }

    public JSeparator getjSeparator4() {
        return jSeparator4;
    }

    public void setjSeparator4(JSeparator jSeparator4) {
        this.jSeparator4 = jSeparator4;
    }

    public JSeparator getjSeparator40() {
        return jSeparator40;
    }

    public void setjSeparator40(JSeparator jSeparator40) {
        this.jSeparator40 = jSeparator40;
    }

    public JSeparator getjSeparator41() {
        return jSeparator41;
    }

    public void setjSeparator41(JSeparator jSeparator41) {
        this.jSeparator41 = jSeparator41;
    }

    public JSeparator getjSeparator42() {
        return jSeparator42;
    }

    public void setjSeparator42(JSeparator jSeparator42) {
        this.jSeparator42 = jSeparator42;
    }

    public JTextField getjTextField10() {
        return jTextField10;
    }

    public void setjTextField10(JTextField jTextField10) {
        this.jTextField10 = jTextField10;
    }

    public JTextField getjTextField12() {
        return jTextField12;
    }

    public void setjTextField12(JTextField jTextField12) {
        this.jTextField12 = jTextField12;
    }

    public JTextField getjTextField14() {
        return jTextField14;
    }

    public void setjTextField14(JTextField jTextField14) {
        this.jTextField14 = jTextField14;
    }

    public JTextField getjTextField16() {
        return jTextField16;
    }

    public void setjTextField16(JTextField jTextField16) {
        this.jTextField16 = jTextField16;
    }

    public JTextField getjTextField18() {
        return jTextField18;
    }

    public void setjTextField18(JTextField jTextField18) {
        this.jTextField18 = jTextField18;
    }

    public JTextField getjTextField20() {
        return jTextField20;
    }

    public void setjTextField20(JTextField jTextField20) {
        this.jTextField20 = jTextField20;
    }

    public JTextField getjTextField23() {
        return jTextField23;
    }

    public void setjTextField23(JTextField jTextField23) {
        this.jTextField23 = jTextField23;
    }

    public JTextField getjTextField24() {
        return jTextField24;
    }

    public void setjTextField24(JTextField jTextField24) {
        this.jTextField24 = jTextField24;
    }

    public JTextField getjTextField6() {
        return jTextField6;
    }

    public void setjTextField6(JTextField jTextField6) {
        this.jTextField6 = jTextField6;
    }

    public JTextField getjTextField8() {
        return jTextField8;
    }

    public void setjTextField8(JTextField jTextField8) {
        this.jTextField8 = jTextField8;
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

    public JLabel getLblPdfDv() {
        return lblPdfDv;
    }

    public void setLblPdfDv(JLabel lblPdfDv) {
        this.lblPdfDv = lblPdfDv;
    }

    public JPanel getPanelDetalleVenta1() {
        return panelDetalleVenta1;
    }

    public void setPanelDetalleVenta1(JPanel panelDetalleVenta1) {
        this.panelDetalleVenta1 = panelDetalleVenta1;
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

    public JPanel getPnlAgregarDv() {
        return pnlAgregarDv;
    }

    public void setPnlAgregarDv(JPanel pnlAgregarDv) {
        this.pnlAgregarDv = pnlAgregarDv;
    }

    public JPanel getPnlBarraDeOpciones() {
        return pnlBarraDeOpciones;
    }

    public void setPnlBarraDeOpciones(JPanel pnlBarraDeOpciones) {
        this.pnlBarraDeOpciones = pnlBarraDeOpciones;
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

    public JPanel getPnlEliminarDv() {
        return pnlEliminarDv;
    }

    public void setPnlEliminarDv(JPanel pnlEliminarDv) {
        this.pnlEliminarDv = pnlEliminarDv;
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

    public JPanel getPnlLimpiarDv() {
        return pnlLimpiarDv;
    }

    public void setPnlLimpiarDv(JPanel pnlLimpiarDv) {
        this.pnlLimpiarDv = pnlLimpiarDv;
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

    public JPanel getPnlProducto() {
        return pnlProducto;
    }

    public void setPnlProducto(JPanel pnlProducto) {
        this.pnlProducto = pnlProducto;
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

    public JRadioButton getRbBoleta2() {
        return rbBoleta2;
    }

    public void setRbBoleta2(JRadioButton rbBoleta2) {
        this.rbBoleta2 = rbBoleta2;
    }

    public JRadioButton getRbFactura() {
        return rbFactura;
    }

    public void setRbFactura(JRadioButton rbFactura) {
        this.rbFactura = rbFactura;
    }

    public JRadioButton getRbFactura2() {
        return rbFactura2;
    }

    public void setRbFactura2(JRadioButton rbFactura2) {
        this.rbFactura2 = rbFactura2;
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

    public JTable getTablaDv1() {
        return tablaDv1;
    }

    public void setTablaDv1(JTable tablaDv1) {
        this.tablaDv1 = tablaDv1;
    }

    public JTable getTablaDv2() {
        return tablaDv2;
    }

    public void setTablaDv2(JTable tablaDv2) {
        this.tablaDv2 = tablaDv2;
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

    public JTextField getTxtContenidoDv() {
        return txtContenidoDv;
    }

    public void setTxtContenidoDv(JTextField txtContenidoDv) {
        this.txtContenidoDv = txtContenidoDv;
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraMenu;
    private javax.swing.JPanel barraTitulo;
    private javax.swing.JButton btnCancelarVenta;
    private javax.swing.ButtonGroup btnGroupContieneIgv;
    private javax.swing.JButton btnGuardarVenta;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbInfoProduDv;
    private javax.swing.JComboBox<String> cbMetPagoDv;
    private javax.swing.JCheckBox checkBoxDescuentoDv;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JSeparator jSeparator35;
    private javax.swing.JSeparator jSeparator36;
    private javax.swing.JSeparator jSeparator37;
    private javax.swing.JSeparator jSeparator38;
    private javax.swing.JSeparator jSeparator39;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator40;
    private javax.swing.JSeparator jSeparator41;
    private javax.swing.JSeparator jSeparator42;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel lblDinamiTipoVenta;
    private javax.swing.JLabel lblExcelDv;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblInventario1;
    private javax.swing.JLabel lblInventarioPnl;
    private javax.swing.JLabel lblPdfDv;
    private javax.swing.JPanel panelDetalleVenta1;
    private javax.swing.JPopupMenu pmInventario;
    private javax.swing.JPopupMenu pmVenta;
    private javax.swing.JPanel pnlActualizarDv;
    private javax.swing.JPanel pnlAgregarDv;
    private javax.swing.JPanel pnlBarraDeOpciones;
    private javax.swing.JPanel pnlCategoria;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlEliminarDv;
    private javax.swing.JPanel pnlEscanearCodBarraDv;
    private javax.swing.JPanel pnlEstadistica;
    private javax.swing.JPanel pnlFSLogin;
    private javax.swing.JPanel pnlInventario;
    private javax.swing.JPanel pnlLimpiarDv;
    private javax.swing.JPanel pnlMinusLogin;
    private javax.swing.JPanel pnlNorth;
    private javax.swing.JPanel pnlProducto;
    private javax.swing.JPanel pnlVenta;
    private javax.swing.JPanel pnlXLogin;
    private javax.swing.JRadioButton rbBoleta;
    private javax.swing.JRadioButton rbBoleta2;
    private javax.swing.JRadioButton rbFactura;
    private javax.swing.JRadioButton rbFactura2;
    private javax.swing.ButtonGroup seleccionTVenta;
    private javax.swing.JSpinner spnCantidadDv;
    private javax.swing.JTable tablaDv1;
    private javax.swing.JTable tablaDv2;
    private javax.swing.JTabbedPane tbpTablaDv;
    private javax.swing.JTextArea txtAreaObservacion;
    private javax.swing.JTextField txtContenidoDv;
    private javax.swing.JTextField txtDescuentoDv;
    private javax.swing.JTextField txtDescuentoTotal2Dv;
    private javax.swing.JTextField txtDescuentoTotalDv;
    private javax.swing.JTextField txtIgvTotal;
    private javax.swing.JTextField txtImpTotalConIgv2Dv;
    private javax.swing.JTextField txtImpTotalDv;
    private javax.swing.JTextField txtImpTotalSinIgv;
    private javax.swing.JTextField txtPrecioDv;
    private javax.swing.JTextField txtStockDv;
    private javax.swing.JTextField txtTotalPagar2Dv;
    private javax.swing.JTextField txtTotalPagarDv;
    private javax.swing.JTextField txtTrabajadorDv;
    // End of variables declaration//GEN-END:variables
}
