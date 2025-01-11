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
import javax.swing.JOptionPane;

public class ProductoController implements ActionListener {

    JInterfazPrincipal view;

    JEscanear vista;
    JInformacion vistaInfo;
    ProductoDao productoDao;
    ApiProductos api = new ApiProductos();
    private Producto productoGlobal;
    private StringBuilder textAreaInfo = new StringBuilder();

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
                    System.out.println("Se va a aumentar");
                    productoDao.updateQuantityAfterInsert(productoGlobal.getId());

                    //Cambiar el TextArea por elementos gráficos separados, dentro de un panel
                    //vistaInfo.getTxtAreaInformacion().setText(textAreaInfo.toString());
                    System.out.println("El id es: " + productoGlobal.getId());
                } else if (command.equals("agregar")) {
                    System.out.println("Se va a agregar");
                    int idObtenido = productoDao.insert(productoGlobal);
                    if (idObtenido > 0) {
                        System.out.println("Se agregó el producto, mira la bd");
                        productoDao.updateQuantityAfterInsert(idObtenido);
                        vistaInfo.dispose();

                    } else {
                        System.out.println("No se agregó");
                    }
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
        //Traido de la api, o más rápido de la caché
        Producto producto = api.consumirApi(vista.getTxtCodigoEscanear().getText());

        //Pero la información más detallada, se traerá de la bd
        Producto producto_existe = productoDao.selectByCodeProduct(vista.getTxtCodigoEscanear().getText());

        if (producto.getCodigo_barra() != null) {
            System.out.println("EL PRODUCTO AUN CON ERROR ES: " + producto);
            System.out.println("Funciono la api");
            if (vistaInfo.getTxtNombreProd().getText().isEmpty()) {
                vistaInfo.getTxtNombreProd().setText("--");
            } else {
                vistaInfo.getTxtNombreProd().setText(producto.getNombre());
            }

            if (vistaInfo.getTxtCompaniaProd().getText().isEmpty()) {
                vistaInfo.getTxtCompaniaProd().setText("--");
            } else {
                vistaInfo.getTxtCompaniaProd().setText(producto.getCompania());
            }
            if (vistaInfo.getTxtContenidoProd().getText().isEmpty()) {
                vistaInfo.getTxtContenidoProd().setText("--");
            } else {
                vistaInfo.getTxtContenidoProd().setText(producto.getContenido());
            }

            if (producto_existe == null) {
                vistaInfo.getTxtCantidadProd().setText("0");
            } else {
                vistaInfo.getTxtCantidadProd().setText(String.valueOf(producto_existe.getCantidad()));
            }

            //vistaInfo.getTxtAreaInformacion().setText(sb.toString());
            //Almacenamos en la variable global para ver los cambios al actualizar
            //this.textAreaInfo = sb;
            if (producto.getImagenURL() != null) {
                cargarImagenPorURL(producto.getImagenURL());
            } else {
                vistaInfo.getLblImagen().setText("Imagen no encontrada");
            }

            //Se va a consultar en el daoProducto para ver si existe o no en la base de datos
            //Separar la lógica si existe o no el producto en la base de datos
            if (producto_existe != null) {
                System.out.println("Si existe en la base de datos");
                vistaInfo.getLblPreguntar().setText("El producto ya está almacenado. ¿Desea aumentar su cantidad?");
                vistaInfo.getBtnAceptar().setActionCommand("aumentar");
                this.productoGlobal = producto_existe;
            } else {
                System.out.println("No existe en la base de datos");
                vistaInfo.getLblPreguntar().setText("El producto es nuevo. ¿Desea agregarlo?");
                vistaInfo.getBtnAceptar().setActionCommand("agregar");
                this.productoGlobal = producto;
            }

            vistaInfo.setLocationRelativeTo(null);
            vistaInfo.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el producto");
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
