package com.codigodebarra.controller;

import com.codigodebarra.view.JVenta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentaController implements ActionListener {
    
    JVenta vistaVenta;
    
    public VentaController(JVenta vistaVenta) {
        this.vistaVenta = vistaVenta;
        this.vistaVenta.setLocationRelativeTo(null);
        this.vistaVenta.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
