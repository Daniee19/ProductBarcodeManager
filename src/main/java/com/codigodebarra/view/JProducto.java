/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.codigodebarra.view;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Yoshua
 */
public class JProducto extends javax.swing.JDialog {

    /**
     * Creates new form JProducto
     */
    public JProducto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupContieneIgv = new javax.swing.ButtonGroup();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelProducto.setBackground(new java.awt.Color(255, 255, 255));
        panelProducto.setPreferredSize(new java.awt.Dimension(1900, 2000));
        panelProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlProductoTitulo.setBackground(new java.awt.Color(255, 255, 255));
        pnlProductoTitulo.setForeground(new java.awt.Color(255, 255, 255));
        pnlProductoTitulo.setLayout(new java.awt.GridLayout(1, 0));

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
            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
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
            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
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
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
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
            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
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
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1662, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreGPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreGPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreGPActionPerformed

    private void rbNoContieneIgvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoContieneIgvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbNoContieneIgvActionPerformed

    private void cbNombresColumnasProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNombresColumnasProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNombresColumnasProdActionPerformed

    public JButton getBtnEscanearProduGP() {
        return btnEscanearProduGP;
    }

    public void setBtnEscanearProduGP(JButton btnEscanearProduGP) {
        this.btnEscanearProduGP = btnEscanearProduGP;
    }

    public JComboBox<String> getCbNombresColumnasProd() {
        return cbNombresColumnasProd;
    }

    public void setCbNombresColumnasProd(JComboBox<String> cbNombresColumnasProd) {
        this.cbNombresColumnasProd = cbNombresColumnasProd;
    }

    public JComboBox<String> getjComboBox1() {
        return jComboBox1;
    }

    public void setjComboBox1(JComboBox<String> jComboBox1) {
        this.jComboBox1 = jComboBox1;
    }

    public JLabel getjLabel11() {
        return jLabel11;
    }

    public void setjLabel11(JLabel jLabel11) {
        this.jLabel11 = jLabel11;
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

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel62() {
        return jLabel62;
    }

    public void setjLabel62(JLabel jLabel62) {
        this.jLabel62 = jLabel62;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
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

    public JPanel getjPanel32() {
        return jPanel32;
    }

    public void setjPanel32(JPanel jPanel32) {
        this.jPanel32 = jPanel32;
    }

    public JPanel getjPanel6() {
        return jPanel6;
    }

    public void setjPanel6(JPanel jPanel6) {
        this.jPanel6 = jPanel6;
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

    public JLabel getLblExcelProd() {
        return lblExcelProd;
    }

    public void setLblExcelProd(JLabel lblExcelProd) {
        this.lblExcelProd = lblExcelProd;
    }

    public JLabel getLblPdfProd() {
        return lblPdfProd;
    }

    public void setLblPdfProd(JLabel lblPdfProd) {
        this.lblPdfProd = lblPdfProd;
    }

    public JPanel getPanelProducto() {
        return panelProducto;
    }

    public void setPanelProducto(JPanel panelProducto) {
        this.panelProducto = panelProducto;
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

    public JPanel getPnlBuscarProd() {
        return pnlBuscarProd;
    }

    public void setPnlBuscarProd(JPanel pnlBuscarProd) {
        this.pnlBuscarProd = pnlBuscarProd;
    }

    public JPanel getPnlEliminarGP() {
        return pnlEliminarGP;
    }

    public void setPnlEliminarGP(JPanel pnlEliminarGP) {
        this.pnlEliminarGP = pnlEliminarGP;
    }

    public JPanel getPnlIzquierdaOperacionesProducto() {
        return pnlIzquierdaOperacionesProducto;
    }

    public void setPnlIzquierdaOperacionesProducto(JPanel pnlIzquierdaOperacionesProducto) {
        this.pnlIzquierdaOperacionesProducto = pnlIzquierdaOperacionesProducto;
    }

    public JPanel getPnlLimpiarGP() {
        return pnlLimpiarGP;
    }

    public void setPnlLimpiarGP(JPanel pnlLimpiarGP) {
        this.pnlLimpiarGP = pnlLimpiarGP;
    }

    public JPanel getPnlOperacionesProducto() {
        return pnlOperacionesProducto;
    }

    public void setPnlOperacionesProducto(JPanel pnlOperacionesProducto) {
        this.pnlOperacionesProducto = pnlOperacionesProducto;
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

    public ButtonGroup getBtnGroupContieneIgv() {
        return btnGroupContieneIgv;
    }

    public void setBtnGroupContieneIgv(ButtonGroup btnGroupContieneIgv) {
        this.btnGroupContieneIgv = btnGroupContieneIgv;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEscanearProduGP;
    private javax.swing.ButtonGroup btnGroupContieneIgv;
    private javax.swing.JComboBox<String> cbNombresColumnasProd;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblExcelProd;
    private javax.swing.JLabel lblPdfProd;
    private javax.swing.JPanel panelProducto;
    private javax.swing.JPanel pnlActualizarGP;
    private javax.swing.JPanel pnlAgregarGP;
    private javax.swing.JPanel pnlBuscarProd;
    private javax.swing.JPanel pnlEliminarGP;
    private javax.swing.JPanel pnlIzquierdaOperacionesProducto;
    private javax.swing.JPanel pnlLimpiarGP;
    private javax.swing.JPanel pnlOperacionesProducto;
    private javax.swing.JPanel pnlProductoTitulo;
    private javax.swing.JPanel pnlTablaProductos;
    private javax.swing.JRadioButton rbNoContieneIgv;
    private javax.swing.JRadioButton rbSiContieneIgv;
    private javax.swing.JSpinner spnCantidadGP;
    private javax.swing.JSpinner spnPrecioGP;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtCodBarraGP;
    private javax.swing.JTextField txtContenidoGP;
    private javax.swing.JTextField txtMarcaGP;
    private javax.swing.JTextField txtNombreGP;
    private javax.swing.JTextField txtValorProd;
    // End of variables declaration//GEN-END:variables
}
