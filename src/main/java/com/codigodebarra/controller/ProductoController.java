package com.codigodebarra.controller;

import com.codigodebarra.dao.ProductoDao;
import com.codigodebarra.dao.daoimpl.ProductoDaoImpl;
import com.codigodebarra.model.Producto;
import com.codigodebarra.util.ApiProductos;
import com.codigodebarra.util.Barras;
import com.codigodebarra.view.JEscanear;
import com.codigodebarra.view.JInformacion;
import com.codigodebarra.view.JInterfazPrincipal;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class ProductoController implements ActionListener {

    JInterfazPrincipal view;

    JEscanear vista;
    JInformacion vistaInfo;
    ProductoDao productoDao;
    ApiProductos api = new ApiProductos();

    public ProductoController(JEscanear vista) {
        this.vista = vista;
        this.vista.setVisible(true);
        this.vista.setLocationRelativeTo(null);
        //Se instancia pero no se muestra, hasta que se de en el botón escanear
        vistaInfo = new JInformacion(vista, true);
        productoDao = new ProductoDaoImpl();

        acciones();
        disenio();
        //mostrar_elementos_cb();
    }

    private void disenio() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JInformacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JInformacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JInformacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JInformacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    private void acciones() {
//        view.getBtnCrearProducto().addActionListener(this);
//        view.getCb_tipo_barra().addActionListener(this);
//        view.getBtnObtenerPDF().addActionListener(this);

        vista.getBtnOkEscanear().addActionListener(this);
        vistaInfo.getBtnCancelar().addActionListener(this);

        //Se hace esto porque queremos detallar más en el uso específico del botón aceptar
        vistaInfo.getBtnAceptar().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //Ayudará a separar la lógica del botón
                String command = e.getActionCommand();
                if (command.equals("aumentar")) {

                } else if (command.equals("agregar")) {
                    //productoDao.insert();
                }
            }
        });
    }

    private void crearProducto() {

    }

    public void obtenerPDF() {
        Barras ba = new Barras();
        List<Producto> productos = productoDao.selectAll();
        System.out.println(productos);
        for (Producto ps : productos) {
            ba.generarCodBarras(ps.getCodigo_barra(), "EAN-13");
        }
    }

    public void escanearCodigo() throws MalformedURLException {

        Producto producto = api.consumirApi(vista.getTxtCodigoEscanear().getText());

        if (producto != null) {
            System.out.println("Funciono la api");

            StringBuilder sb = new StringBuilder();
            sb.append("Nombre del producto: ")
                    .append(producto.getNombre())
                    .append(" \n")
                    .append("Compañía: ")
                    .append(producto.getCompania())
                    .append("\n")
                    .append("Cantidad del producto: ")
                    .append(producto.getCantidad_contenida());

            vistaInfo.getTxtAreaInformacion().setText(sb.toString());

            if (producto.getImagenURL() != null) {
                cargarImagenPorURL(producto.getImagenURL());
            } else {
                vistaInfo.getLblImagen().setText("Imagen no encontrada");
            }

            //Se va a consultar en el daoProducto para ver si existe o no en la base de datos
            boolean existe = productoDao.selectByCodeProduct(vista.getTxtCodigoEscanear().getText());

            //Separar la lógica si existe o no el producto en la base de datos
            if (existe) {
                System.out.println("Si existe en la base de datos");
                vistaInfo.getLblPreguntar().setText("El producto ya está almacenado. ¿Desea aumentar su cantidad?");
                vistaInfo.getBtnAceptar().setActionCommand("aumentar");
            } else {
                System.out.println("No existe en la base de datos");
                vistaInfo.getLblPreguntar().setText("El producto es nuevo. ¿Desea agregarlo?");
                vistaInfo.getBtnAceptar().setActionCommand("agregar");
            }

            vistaInfo.setLocationRelativeTo(null);
            vistaInfo.setVisible(true);

        } else {
            System.out.println("No funciono la api");
        }
    }

    public void cargarImagenPorURL(String url_imagen) throws MalformedURLException {
        URL url = new URL(url_imagen);

        // Cargar la imagen desde la URL
        ImageIcon imagen = new ImageIcon(url);

        // Redimensionar la imagen
        Image img = imagen.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        imagen = new ImageIcon(img);

        // Asignar la imagen al JLabel
        vistaInfo.getLblImagen().setIcon(imagen);
        vistaInfo.getLblImagen().setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.getBtnOkEscanear()) {
            try {
                escanearCodigo();
            } catch (MalformedURLException ex) {
                Logger.getLogger(ProductoController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //
        if (e.getSource() == vistaInfo.getBtnCancelar()) {
            vistaInfo.dispose();
        }

    }

}
