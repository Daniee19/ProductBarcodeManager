package com.codigodebarra.controller;

import com.codigodebarra.dao.CodigoBarraDao;
import com.codigodebarra.dao.ProductoDao;
import com.codigodebarra.dao.daoimpl.CodigoBarraDaoImpl;
import com.codigodebarra.dao.daoimpl.ProductoDaoImpl;
import com.codigodebarra.model.CodigoBarra;
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
import javax.swing.JOptionPane;

public class ProductoController implements ActionListener {

    JInterfazPrincipal view;

    JEscanear vista;
    JInformacion vistaInfo;
    ProductoDao productoDaoImpl;
    CodigoBarraDaoImpl codigoBarraDaoImpl;
    ApiProductos api = new ApiProductos();

    public ProductoController(JEscanear vista) {
        this.vista = vista;
        this.vista.setVisible(true);
        this.vista.setLocationRelativeTo(null);
        vistaInfo = new JInformacion(vista, true);
        productoDaoImpl = new ProductoDaoImpl();
        codigoBarraDaoImpl = new CodigoBarraDaoImpl();
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

    private void mostrar_elementos_cb() {

        List<CodigoBarra> codigos = codigoBarraDaoImpl.selectAll();

        for (CodigoBarra cs : codigos) {
            view.getCb_tipo_barra().addItem(cs.getTipo());
        }
    }

    private void acciones() {
//        view.getBtnCrearProducto().addActionListener(this);
//        view.getCb_tipo_barra().addActionListener(this);
//        view.getBtnObtenerPDF().addActionListener(this);

        vista.getBtnOkEscanear().addActionListener(this);
        this.vistaInfo.getBtnCancelar().addActionListener(this);

    }

    private void crearProducto() {
        JOptionPane.showMessageDialog(null, "Se va a crear el producto. No te rindas");
        Producto p = new Producto();
        CodigoBarra cb = new CodigoBarra();

        CodigoBarraDao daoCodigo = new CodigoBarraDaoImpl();
        //Nombre del tipo de código de barra con el visible
        CodigoBarra objetoCodigo = daoCodigo.selectByType(view.getCb_tipo_barra().getSelectedItem().toString());

        cb.setId_barra(objetoCodigo.getId_barra());

        p.setId_barra(cb);
        p.setNombre(view.getTxtNombreProducto().getText());
        p.setPrecio(Double.parseDouble(view.getTxtPrecioProducto().getText()));
        p.setCantidad(Integer.parseInt(view.getTxtCantidadProducto().getText()));

        productoDaoImpl.insert(p);
        //No 
    }

    public void obtenerPDF() {
        Barras ba = new Barras();
        List<Producto> productos = productoDaoImpl.selectAll();
        System.out.println(productos);
        for (Producto ps : productos) {
            ba.generarCodBarras(ps.getId_barra().getNombre_barra(), ps.getId_barra().getTipo());
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
            vistaInfo = new JInformacion(vista, true);
            vistaInfo.getTxtAreaInformacion().setText(sb.toString());

            if (producto.getImagenURL() != null) {
                cargarImagenPorURL(producto.getImagenURL());
            } else {
                vistaInfo.getLblImagen().setText("Imagen no encontrada");
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
            System.out.println("HELLOOOOOOOO");
            vistaInfo.dispose();
        }

    }

}
