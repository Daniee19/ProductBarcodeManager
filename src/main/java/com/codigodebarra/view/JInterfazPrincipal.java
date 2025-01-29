package com.codigodebarra.view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
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
        pnlInventario = new javax.swing.JPanel();
        lblInventario = new javax.swing.JLabel();
        pnlVenta = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        pnlCerrarSesion = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
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
        jLabel4 = new javax.swing.JLabel();
        txtCodigoEscanear = new javax.swing.JTextField();
        btnOkEscanear = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        panelInventario = new javax.swing.JPanel();
        pnlInventarioTitulo = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pnlIzquierdaOperacionesProducto = new javax.swing.JPanel();
        pnlOperacionesProducto = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cbNombresColumnasProd = new javax.swing.JComboBox<>();
        txtValorProd = new javax.swing.JTextField();
        pnlBuscarProd = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
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
        jPanel16 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lblPdfProd = new javax.swing.JLabel();
        lblExcelProd = new javax.swing.JLabel();
        pnlTablaProductos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        panelDetalleVenta = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        panelVenta = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();

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

        pnlInventario.setForeground(new java.awt.Color(255, 255, 255));

        lblInventario.setBackground(new java.awt.Color(0, 0, 0));
        lblInventario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblInventario.setForeground(new java.awt.Color(0, 0, 0));
        lblInventario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInventario.setText("Inventario");
        lblInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlInventarioLayout = new javax.swing.GroupLayout(pnlInventario);
        pnlInventario.setLayout(pnlInventarioLayout);
        pnlInventarioLayout.setHorizontalGroup(
            pnlInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInventario, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        pnlInventarioLayout.setVerticalGroup(
            pnlInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInventario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        pnlLeft.add(pnlInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 200, 40));

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
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        pnlLeft.add(pnlVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 200, 40));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCerrarSesionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlLeft.add(pnlCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 200, 40));

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

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ESCANEAR");
        jLabel4.setAutoscrolls(true);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 230, -1));

        txtCodigoEscanear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCodigoEscanear.setBorder(null);
        jPanel2.add(txtCodigoEscanear, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 400, 40));

        btnOkEscanear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnOkEscanear.setText("OK");
        btnOkEscanear.setAutoscrolls(true);
        btnOkEscanear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOkEscanear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(btnOkEscanear, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 490, 90, 30));

        jSeparator4.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 398, 14));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escanear_codigo_barra.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 300, 60, 70));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel6.setText("CÓDIGO");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 170, -1));

        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel33.setText("Inventario");
        jPanel17.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 150, 30));

        jPanel2.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 230, 50));

        panelEscanear.add(jPanel2, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("tab2", panelEscanear);
        panelEscanear.getAccessibleContext().setAccessibleDescription("");

        panelInventario.setBackground(new java.awt.Color(255, 255, 255));
        panelInventario.setPreferredSize(new java.awt.Dimension(1900, 2000));
        panelInventario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlInventarioTitulo.setBackground(new java.awt.Color(255, 255, 255));
        pnlInventarioTitulo.setForeground(new java.awt.Color(255, 255, 255));
        pnlInventarioTitulo.setLayout(new java.awt.GridLayout(2, 0));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("INVENTARIO DE PRODUCTOS");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlInventarioTitulo.add(jLabel11);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("   Selecciona el producto para realizar operaciones");
        pnlInventarioTitulo.add(jLabel12);

        panelInventario.add(pnlInventarioTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 0, 1490, 71));

        pnlIzquierdaOperacionesProducto.setBackground(new java.awt.Color(255, 255, 102));
        pnlIzquierdaOperacionesProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlOperacionesProducto.setBackground(new java.awt.Color(102, 102, 102));
        pnlOperacionesProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Buscar producto");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 160, 30));

        cbNombresColumnasProd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel6.add(cbNombresColumnasProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 140, 30));

        txtValorProd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel6.add(txtValorProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 140, 30));

        pnlBuscarProd.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Buscar");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlBuscarProdLayout = new javax.swing.GroupLayout(pnlBuscarProd);
        pnlBuscarProd.setLayout(pnlBuscarProdLayout);
        pnlBuscarProdLayout.setHorizontalGroup(
            pnlBuscarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        pnlBuscarProdLayout.setVerticalGroup(
            pnlBuscarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel6.add(pnlBuscarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 80, 30));

        jLabel17.setText("Columna");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel18.setText("Valor");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 40, -1));

        pnlOperacionesProducto.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 170));

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setText("Gestión del producto");
        jPanel11.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 190, 30));

        txtNombreGP.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        jPanel11.add(txtNombreGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 140, 40));

        txtMarcaGP.setBorder(javax.swing.BorderFactory.createTitledBorder("Marca"));
        jPanel11.add(txtMarcaGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 140, 40));

        txtContenidoGP.setBorder(javax.swing.BorderFactory.createTitledBorder("Contenido"));
        jPanel11.add(txtContenidoGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 300, 40));

        spnPrecioGP.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 0.1d));
        spnPrecioGP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel11.add(spnPrecioGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 140, 30));

        spnCantidadGP.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel11.add(spnCantidadGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 140, 30));

        jLabel20.setText("Precio");
        jPanel11.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        jLabel21.setText("Stock");
        jPanel11.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 60, -1));

        pnlAgregarGP.setBackground(new java.awt.Color(255, 255, 255));

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Agregar");
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlAgregarGPLayout = new javax.swing.GroupLayout(pnlAgregarGP);
        pnlAgregarGP.setLayout(pnlAgregarGPLayout);
        pnlAgregarGPLayout.setHorizontalGroup(
            pnlAgregarGPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        pnlAgregarGPLayout.setVerticalGroup(
            pnlAgregarGPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel11.add(pnlAgregarGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 110, 30));
        jPanel11.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 300, 20));

        pnlActualizarGP.setBackground(new java.awt.Color(255, 255, 255));

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Actualizar");
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlActualizarGPLayout = new javax.swing.GroupLayout(pnlActualizarGP);
        pnlActualizarGP.setLayout(pnlActualizarGPLayout);
        pnlActualizarGPLayout.setHorizontalGroup(
            pnlActualizarGPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        pnlActualizarGPLayout.setVerticalGroup(
            pnlActualizarGPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel11.add(pnlActualizarGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 110, 30));

        pnlEliminarGP.setBackground(new java.awt.Color(255, 255, 255));

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Eliminar");
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlEliminarGPLayout = new javax.swing.GroupLayout(pnlEliminarGP);
        pnlEliminarGP.setLayout(pnlEliminarGPLayout);
        pnlEliminarGPLayout.setHorizontalGroup(
            pnlEliminarGPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        pnlEliminarGPLayout.setVerticalGroup(
            pnlEliminarGPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel11.add(pnlEliminarGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 110, 30));

        pnlLimpiarGP.setBackground(new java.awt.Color(255, 255, 255));

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Limpiar");
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlLimpiarGPLayout = new javax.swing.GroupLayout(pnlLimpiarGP);
        pnlLimpiarGP.setLayout(pnlLimpiarGPLayout);
        pnlLimpiarGPLayout.setHorizontalGroup(
            pnlLimpiarGPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        pnlLimpiarGPLayout.setVerticalGroup(
            pnlLimpiarGPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel11.add(pnlLimpiarGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 110, 30));

        txtCodBarraGP.setBorder(javax.swing.BorderFactory.createTitledBorder("Cod. de barra"));
        jPanel11.add(txtCodBarraGP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 300, 40));

        pnlOperacionesProducto.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 420, 440));

        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setText("Se descargará la información de los elementos actuales de la tabla");
        jPanel16.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("Descargar información");
        jPanel16.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 170, -1));

        lblPdfProd.setBackground(new java.awt.Color(255, 255, 255));
        lblPdfProd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPdfProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf.png"))); // NOI18N
        lblPdfProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel16.add(lblPdfProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 50, 50));

        lblExcelProd.setBackground(new java.awt.Color(255, 255, 255));
        lblExcelProd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExcelProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excel.png"))); // NOI18N
        lblExcelProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel16.add(lblExcelProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 50, 50));

        pnlOperacionesProducto.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 420, 130));

        pnlIzquierdaOperacionesProducto.add(pnlOperacionesProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 790));

        panelInventario.add(pnlIzquierdaOperacionesProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 71, 420, 790));

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

        pnlTablaProductos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 960, 790));

        panelInventario.add(pnlTablaProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 71, 1020, -1));

        jTabbedPane1.addTab("tab3", panelInventario);

        panelDetalleVenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setText("Agregar pedido");
        jPanel9.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 6, -1, -1));

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));

        jLabel30.setBackground(new java.awt.Color(153, 153, 153));
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Escanear cod. barra");
        jLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 43, 120, 35));

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));

        jLabel31.setBackground(new java.awt.Color(153, 153, 153));
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Manual");
        jLabel31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 43, 120, 35));

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 420, 110));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(447, Short.MAX_VALUE))
        );

        jPanel8.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 420, 500));

        panelDetalleVenta.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 460, 720));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setForeground(new java.awt.Color(0, 0, 0));

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
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        panelDetalleVenta.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, -1));

        jTabbedPane1.addTab("tab4", panelDetalleVenta);

        panelVenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1650, -1));

        jPanel18.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel14.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1650, 780));

        panelVenta.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1650, 880));

        jTabbedPane1.addTab("tab5", panelVenta);

        jPanel4.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1650, 910));

        pnlCenter.add(jPanel4);

        jPanel1.add(pnlCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnOkEscanear() {
        return btnOkEscanear;
    }

    public void setBtnOkEscanear(JButton btnOkEscanear) {
        this.btnOkEscanear = btnOkEscanear;
    }

    public JComboBox<String> getCbNombresColumnasProd() {
        return cbNombresColumnasProd;
    }

    public void setCbNombresColumnasProd(JComboBox<String> cbNombresColumnasProd) {
        this.cbNombresColumnasProd = cbNombresColumnasProd;
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

    public JLabel getjLabel12() {
        return jLabel12;
    }

    public void setjLabel12(JLabel jLabel12) {
        this.jLabel12 = jLabel12;
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

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel11() {
        return jPanel11;
    }

    public void setjPanel11(JPanel jPanel11) {
        this.jPanel11 = jPanel11;
    }

    public JPanel getjPanel16() {
        return jPanel16;
    }

    public void setjPanel16(JPanel jPanel16) {
        this.jPanel16 = jPanel16;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public JPanel getjPanel4() {
        return jPanel4;
    }

    public void setjPanel4(JPanel jPanel4) {
        this.jPanel4 = jPanel4;
    }

    public JPanel getjPanel5() {
        return jPanel5;
    }

    public void setjPanel5(JPanel jPanel5) {
        this.jPanel5 = jPanel5;
    }

    public JPanel getjPanel6() {
        return jPanel6;
    }

    public void setjPanel6(JPanel jPanel6) {
        this.jPanel6 = jPanel6;
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

    public JPopupMenu getjPopupMenu1() {
        return pmInventario;
    }

    public void setjPopupMenu1(JPopupMenu jPopupMenu1) {
        this.pmInventario = jPopupMenu1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JSeparator getjSeparator2() {
        return jSeparator2;
    }

    public void setjSeparator2(JSeparator jSeparator2) {
        this.jSeparator2 = jSeparator2;
    }

    public JSeparator getjSeparator3() {
        return jSeparator3;
    }

    public void setjSeparator3(JSeparator jSeparator3) {
        this.jSeparator3 = jSeparator3;
    }

    public JSeparator getjSeparator4() {
        return jSeparator4;
    }

    public void setjSeparator4(JSeparator jSeparator4) {
        this.jSeparator4 = jSeparator4;
    }

    public JTabbedPane getjTabbedPane1() {
        return jTabbedPane1;
    }

    public void setjTabbedPane1(JTabbedPane jTabbedPane1) {
        this.jTabbedPane1 = jTabbedPane1;
    }

    public JLabel getLblExcelProd() {
        return lblExcelProd;
    }

    public void setLblExcelProd(JLabel lblExcelProd) {
        this.lblExcelProd = lblExcelProd;
    }

    public JLabel getLblInventario() {
        return lblInventario;
    }

    public void setLblInventario(JLabel lblInventario) {
        this.lblInventario = lblInventario;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
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

    public JPanel getPanelEscanear() {
        return panelEscanear;
    }

    public void setPanelEscanear(JPanel panelEscanear) {
        this.panelEscanear = panelEscanear;
    }

    public JPanel getPanelInventario() {
        return panelInventario;
    }

    public void setPanelInventario(JPanel panelInventario) {
        this.panelInventario = panelInventario;
    }

    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }

    public void setPanelPrincipal(JPanel panelPrincipal) {
        this.panelPrincipal = panelPrincipal;
    }

    public JPanel getPnlActualizarGP() {
        return pnlActualizarGP;
    }

    public void setPnlActualizarGP(JPanel pnlActualizarGP) {
        this.pnlActualizarGP = pnlActualizarGP;
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

    public JPanel getPnlEliminarGP() {
        return pnlEliminarGP;
    }

    public void setPnlEliminarGP(JPanel pnlEliminarGP) {
        this.pnlEliminarGP = pnlEliminarGP;
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

    public JPanel getPnlInventarioTitulo() {
        return pnlInventarioTitulo;
    }

    public void setPnlInventarioTitulo(JPanel pnlInventarioTitulo) {
        this.pnlInventarioTitulo = pnlInventarioTitulo;
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

    public JPanel getPanelVenta() {
        return panelDetalleVenta;
    }

    public void setPanelVenta(JPanel panelVenta) {
        this.panelDetalleVenta = panelVenta;
    }

    public JPanel getPnlXLogin() {
        return pnlXLogin;
    }

    public void setPnlXLogin(JPanel pnlXLogin) {
        this.pnlXLogin = pnlXLogin;
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

    public JTable getTablaProductos() {
        return tablaProductos;
    }

    public void setTablaProductos(JTable tablaProductos) {
        this.tablaProductos = tablaProductos;
    }

    public JTextField getTxtCodBarraGP() {
        return txtCodBarraGP;
    }

    public void setTxtCodBarraGP(JTextField txtCodBarraGP) {
        this.txtCodBarraGP = txtCodBarraGP;
    }

    public JTextField getTxtCodigoEscanear() {
        return txtCodigoEscanear;
    }

    public void setTxtCodigoEscanear(JTextField txtCodigoEscanear) {
        this.txtCodigoEscanear = txtCodigoEscanear;
    }

    public JTextField getTxtContenidoGP() {
        return txtContenidoGP;
    }

    public void setTxtContenidoGP(JTextField txtContenidoGP) {
        this.txtContenidoGP = txtContenidoGP;
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

    public JTextField getTxtValorProd() {
        return txtValorProd;
    }

    public void setTxtValorProd(JTextField txtValorProd) {
        this.txtValorProd = txtValorProd;
    }

    public JPopupMenu getPmInventario() {
        return pmInventario;
    }

    public void setPmInventario(JPopupMenu pmInventario) {
        this.pmInventario = pmInventario;
    }

    public JComboBox<String> getjComboBox1() {
        return jComboBox1;
    }

    public void setjComboBox1(JComboBox<String> jComboBox1) {
        this.jComboBox1 = jComboBox1;
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

    public JPanel getjPanel10() {
        return jPanel10;
    }

    public void setjPanel10(JPanel jPanel10) {
        this.jPanel10 = jPanel10;
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
        return panelVenta;
    }

    public void setjPanel14(JPanel jPanel14) {
        this.panelVenta = jPanel14;
    }

    public JPanel getjPanel7() {
        return jPanel7;
    }

    public void setjPanel7(JPanel jPanel7) {
        this.jPanel7 = jPanel7;
    }

    public JPanel getPanelDetalleVenta() {
        return panelDetalleVenta;
    }

    public void setPanelDetalleVenta(JPanel panelDetalleVenta) {
        this.panelDetalleVenta = panelDetalleVenta;
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

    public JPanel getjPanel15() {
        return jPanel15;
    }

    public void setjPanel15(JPanel jPanel15) {
        this.jPanel15 = jPanel15;
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

    public JPopupMenu getPmVenta() {
        return pmVenta;
    }

    public void setPmVenta(JPopupMenu pmVenta) {
        this.pmVenta = pmVenta;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOkEscanear;
    private javax.swing.JComboBox<String> cbNombresColumnasProd;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblExcelProd;
    private javax.swing.JLabel lblInventario;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPdfProd;
    private javax.swing.JLabel lblPrincipal;
    private javax.swing.JPanel panelDetalleVenta;
    private javax.swing.JPanel panelEscanear;
    private javax.swing.JPanel panelInventario;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelVenta;
    private javax.swing.JPopupMenu pmInventario;
    private javax.swing.JPopupMenu pmVenta;
    private javax.swing.JPanel pnlActualizarGP;
    private javax.swing.JPanel pnlAgregarGP;
    private javax.swing.JPanel pnlBarraDeOpciones;
    private javax.swing.JPanel pnlBuscarProd;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlCerrarSesion;
    private javax.swing.JPanel pnlEliminarGP;
    private javax.swing.JPanel pnlFSLogin;
    private javax.swing.JPanel pnlInventario;
    private javax.swing.JPanel pnlInventarioTitulo;
    private javax.swing.JPanel pnlIzquierdaOperacionesProducto;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlLimpiarGP;
    private javax.swing.JPanel pnlMinusLogin;
    private javax.swing.JPanel pnlNorth;
    private javax.swing.JPanel pnlOperacionesProducto;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlTablaProductos;
    private javax.swing.JPanel pnlVenta;
    private javax.swing.JPanel pnlXLogin;
    private javax.swing.JSpinner spnCantidadGP;
    private javax.swing.JSpinner spnPrecioGP;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtCodBarraGP;
    private javax.swing.JTextField txtCodigoEscanear;
    private javax.swing.JTextField txtContenidoGP;
    private javax.swing.JTextField txtMarcaGP;
    private javax.swing.JTextField txtNombreGP;
    private javax.swing.JTextField txtValorProd;
    // End of variables declaration//GEN-END:variables
}
