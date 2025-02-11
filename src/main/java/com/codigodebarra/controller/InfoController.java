/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codigodebarra.controller;

import com.codigodebarra.dao.ProductoDao;
import com.codigodebarra.dao.daoimpl.ProductoDaoImpl;
import com.codigodebarra.model.Producto;
import com.codigodebarra.model.Usuario;
import com.codigodebarra.view.JInformacion;
import com.codigodebarra.view.JProducto;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InfoController implements ActionListener {

    JInformacion vistaInfo;
    JProducto vistaProdu;
    Producto productoGlobal, productoApi, productoBd;
    ProductoDao productoDao;
    DefaultTableModel modelo;

    public InfoController(JInformacion vistaInfo, JProducto vistaProdu, Producto productoApi, Producto productoBd, DefaultTableModel modelo) throws MalformedURLException {
        this.vistaInfo = vistaInfo;
        this.vistaProdu = vistaProdu;
        this.productoApi = productoApi;
        this.productoBd = productoBd;
        this.modelo = modelo;
        this.productoDao = new ProductoDaoImpl(null);
        metodos();
        this.vistaInfo.setLocationRelativeTo(null);
        this.vistaInfo.setVisible(true);
    }

    public void metodos() throws MalformedURLException {
        condicionalBrindarDatosProductoApiOBd(productoApi, productoBd);
        productoExisteBD();
        vistaInfo.getLblCodigoBarra().setText(productoApi.getCodBarra());
        pnlAgregarOActualizaProducto();
    }

    public void condicionalBrindarDatosProductoApiOBd(Producto productoApi, Producto producto_bd) throws MalformedURLException {
        //Corregir porque a la primera llamada aparecen los text field con --
        if (productoApi.getNombre().isEmpty()) {

            if (producto_bd == null) {
                vistaInfo.getTxtNombreProd().setEditable(true);
                vistaInfo.getTxtNombreProd().setText("--");
            } else {
                vistaInfo.getTxtNombreProd().setEditable(false);
                vistaInfo.getTxtNombreProd().setText(producto_bd.getNombre());
            }
        } else {
            vistaInfo.getTxtNombreProd().setEditable(false);

            if (producto_bd == null) {
                vistaInfo.getTxtNombreProd().setText(productoApi.getNombre());
            } else {
                //Si el producto existe en la api pero, hice alguna actualizacion entonces traeme de la bd
                vistaInfo.getTxtNombreProd().setText(producto_bd.getNombre());
            }
        }

        //==========================================
        //Si en caso el producto no retorna el nombre de la compania
        if (productoApi.getMarca().isEmpty()) {
            if (producto_bd == null) {
                vistaInfo.getTxtMarcaProd().setEditable(true);
                vistaInfo.getTxtMarcaProd().setText("--");
            } else {
                vistaInfo.getTxtMarcaProd().setEditable(false);
                vistaInfo.getTxtMarcaProd().setText(producto_bd.getNombre());
            }
        } else {
            //Si en caso se haga cambios al resultado dado de la API
            vistaInfo.getTxtMarcaProd().setEditable(false);
            if (producto_bd == null) {
                vistaInfo.getTxtMarcaProd().setText(productoApi.getMarca());
            } else {
                vistaInfo.getTxtMarcaProd().setText(producto_bd.getMarca());
            }
        }

        if (productoApi.getCont().isEmpty()) {

            if (producto_bd == null) {
                vistaInfo.getTxtContenidoProd().setEditable(true);
                vistaInfo.getTxtContenidoProd().setText("--");
            } else {
                vistaInfo.getTxtContenidoProd().setEditable(false);
                vistaInfo.getTxtContenidoProd().setText(producto_bd.getCont());
            }
        } else {
            vistaInfo.getTxtContenidoProd().setEditable(false);
            if (producto_bd == null) {
                vistaInfo.getTxtContenidoProd().setText(productoApi.getCont());
            } else {
                vistaInfo.getTxtContenidoProd().setText(producto_bd.getCont());
            }
        }
        //Esto es así porque no se hace una consulta directa a la API para obtener la cantidad del producto (stock)
        vistaInfo.getTxtCantidadProd().setEditable(false);
        if (producto_bd == null) {
            vistaInfo.getTxtCantidadProd().setText("0");
        } else {
            vistaInfo.getTxtCantidadProd().setText(String.valueOf(producto_bd.getStock()));
        }

        //vistaInfo.getTxtAreaInformacion().setText(sb.toString());
        //Almacenamos en la variable global para ver los cambios al actualizar
        //this.textAreaInfo = sb;
        if (productoApi.getImagenUrl() != null) {
            if (producto_bd == null) {
                cargarImagenPorURL(productoApi.getImagenUrl());
            } else {
                cargarImagenPorURL(producto_bd.getImagenUrl());
            }
        } else {
            if (producto_bd == null) {
                vistaInfo.getLblImagen().setText("Imagen no encontrada");
            } else {
                vistaInfo.getLblImagen().setText(producto_bd.getImagenUrl());
            }
        }

    }

    public void productoExisteBD() {
        if (productoBd != null) {
            System.out.println("Si existe en la base de datos");
            vistaInfo.getLblPreguntar().setText("El producto ya está almacenado. ¿Desea aumentar su cantidad?");
            vistaInfo.getBtnAceptar().setActionCommand("aumentar");
            this.productoGlobal = productoBd;
        } else {
            System.out.println("No existe en la base de datos");
            vistaInfo.getLblPreguntar().setText("El producto es nuevo. ¿Desea agregarlo?");
            vistaInfo.getBtnAceptar().setActionCommand("agregar");

            this.productoGlobal = productoApi;
        }
    }

    public void pnlAgregarOActualizaProducto() {
        vistaInfo.getBtnAceptar().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //Ayudará a separar la lógica del botón
                String command = e.getActionCommand();
                if (command.equals("aumentar")) {
                    int cantidadActualizada = productoDao.updateQuantityAfterInsert(productoGlobal.getIdProducto());
                    vistaInfo.getTxtCantidadProd().setText(String.valueOf(cantidadActualizada));

                    JOptionPane.showMessageDialog(null, "Cantidad incrementada con éxito");
                } else if (command.equals("agregar")) {
                    System.out.println("Se va a agregar");

                    /**
                     * El productoGlobal trae el objeto producto seteado con los
                     * valores obtenidos de la API y se muestra en los
                     * TextFields, pero en todo caso devuelve valores nulos, se
                     * evalua con la bd (bueno eso es otra historia). Lo que
                     * pasa es que se está trayendo los valores de la API
                     * incluso con los valores vacíos, por ende se debe de leer
                     * los texFields, cuando se de en el botón de agregar, para
                     * setear los cambios del productoGobal y crear el producto.
                     *
                     */
                    productoGlobal.setNombre(vistaInfo.getTxtNombreProd().getText());
                    productoGlobal.setMarca(vistaInfo.getTxtMarcaProd().getText());
                    productoGlobal.setCont(vistaInfo.getTxtContenidoProd().getText());

                    int idObtenido = productoDao.insert(productoGlobal);

                    if (idObtenido > 0) {
                        productoDao.updateQuantityAfterInsert(idObtenido);
                        JOptionPane.showMessageDialog(null, "Producto agregado con éxito");
                        vistaInfo.dispose();
                    } else {
                        System.out.println("No se agregó");
                    }
                }

                mostrarElementosEnTabla(productoDao.selectAll());
            }
        });
    }

    public void mostrarElementosEnTabla(List<Producto> listaProductos) {
        modelo.setRowCount(0);
        String valVisual = "";
        for (Producto p : listaProductos) {
            if (p.getIgvAplicable() == true) {
                valVisual = "IGV";
            } else {
                valVisual = "Exo";
            }
            Object[] fila = {p.getCodBarra(), p.getNombre(), p.getMarca(), p.getCont(), precisionDouble(p.getPrecio()), p.getStock(), valVisual};
            modelo.addRow(fila);
        }
        vistaProdu.getTxtValorProd().setText("");
    }

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

    public void cargarImagenPorURL(String url_imagen) throws MalformedURLException {
        URL url = new URL(url_imagen);

        // Cargar la imagen desde la URL
        ImageIcon imagen = new ImageIcon(url);

        // Redimensionar la imagen
        Image img = imagen.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        //Volver a crear la imagen pero con la escala actualizada
        imagen = new ImageIcon(img);

        // Asignar la imagen al JLabel
        vistaInfo.getLblImagen().setIcon(imagen);
        vistaInfo.getLblImagen().setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
