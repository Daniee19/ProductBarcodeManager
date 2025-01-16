package com.codigodebarra.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JInformacion extends javax.swing.JDialog {

    public JInformacion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtNombreProd = new javax.swing.JTextField();
        txtCompaniaProd = new javax.swing.JTextField();
        txtContenidoProd = new javax.swing.JTextField();
        txtCantidadProd = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblPreguntar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblCodigoBarra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombreProd.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        jPanel1.add(txtNombreProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 220, -1));

        txtCompaniaProd.setBorder(javax.swing.BorderFactory.createTitledBorder("Compañía"));
        jPanel1.add(txtCompaniaProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 220, -1));

        txtContenidoProd.setBorder(javax.swing.BorderFactory.createTitledBorder("Contenido"));
        jPanel1.add(txtContenidoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 120, 40));

        txtCantidadProd.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad"));
        jPanel1.add(txtCantidadProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 90, 40));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 280, 170));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Información del producto");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, 38));
        jPanel2.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 87, 300, 220));

        btnAceptar.setText("Aceptar");
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 109, 35));

        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 96, 35));

        lblPreguntar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(lblPreguntar, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 313, 541, 41));

        jPanel3.setBackground(new java.awt.Color(255, 204, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Código de barras:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 110, -1));
        jPanel3.add(lblCodigoBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 10, 220, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 220, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnAceptar() {
        return btnAceptar;
    }

    public void setBtnAceptar(JButton btnAceptar) {
        this.btnAceptar = btnAceptar;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return lblPreguntar;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.lblPreguntar = jLabel2;
    }

    public JLabel getLblImagen() {
        return lblImagen;
    }

    public void setLblImagen(JLabel lblImagen) {
        this.lblImagen = lblImagen;
    }

    public JLabel getLblPreguntar() {
        return lblPreguntar;
    }

    public void setLblPreguntar(JLabel lblPreguntar) {
        this.lblPreguntar = lblPreguntar;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JTextField getTxtCantidadProd() {
        return txtCantidadProd;
    }

    public void setTxtCantidadProd(JTextField txtCantidadProd) {
        this.txtCantidadProd = txtCantidadProd;
    }

    public JTextField getTxtCompaniaProd() {
        return txtCompaniaProd;
    }

    public void setTxtCompaniaProd(JTextField txtCompaniaProd) {
        this.txtCompaniaProd = txtCompaniaProd;
    }

    public JTextField getTxtContenidoProd() {
        return txtContenidoProd;
    }

    public void setTxtContenidoProd(JTextField txtContenidoProd) {
        this.txtContenidoProd = txtContenidoProd;
    }

    public JTextField getTxtNombreProd() {
        return txtNombreProd;
    }

    public void setTxtNombreProd(JTextField txtNombreProd) {
        this.txtNombreProd = txtNombreProd;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public JLabel getLblCodigoBarra() {
        return lblCodigoBarra;
    }

    public void setLblCodigoBarra(JLabel lblCodigoBarra) {
        this.lblCodigoBarra = lblCodigoBarra;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCodigoBarra;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblPreguntar;
    private javax.swing.JTextField txtCantidadProd;
    private javax.swing.JTextField txtCompaniaProd;
    private javax.swing.JTextField txtContenidoProd;
    private javax.swing.JTextField txtNombreProd;
    // End of variables declaration//GEN-END:variables
}
