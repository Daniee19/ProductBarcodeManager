package com.codigodebarra.controller;

import com.codigodebarra.config.Disenio;
import com.codigodebarra.dao.ProductoDao;
import com.codigodebarra.dao.daoimpl.ProductoDaoImpl;
import com.codigodebarra.model.Producto;
import com.codigodebarra.model.Usuario;
import com.codigodebarra.util.ApiProductos;
import com.codigodebarra.view.JInformacion;
import com.codigodebarra.view.JInterfazPrincipal;
import com.codigodebarra.view.JLogin;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public final class PrincipalController implements ActionListener {

    JInterfazPrincipal vistaIp;
    Disenio d = new Disenio();
    //JEscanear vistaEscaner;
    JInformacion vistaInfo;
    ProductoDao productoDao;
    ApiProductos api;
    Producto productoGlobal;
    Usuario usuario;

    public PrincipalController(JInterfazPrincipal vistaIp, Usuario usuario) {
        this.vistaIp = vistaIp;
        //Se necesita que la vistaIp ya haya sida creada
        bienvenida(usuario);
        this.vistaIp.setVisible(true);
        this.vistaIp.setLocationRelativeTo(null);

        vistaInfo = new JInformacion(vistaIp, true);
        productoDao = new ProductoDaoImpl();
        api = new ApiProductos();
        d.getDesignWindows();
        ocultarPestaniasDelPanel();
        acciones();

    }

    public void ocultarPestaniasDelPanel() {
        vistaIp.getjTabbedPane1().setUI(new javax.swing.plaf.basic.BasicTabbedPaneUI() {
            @Override
            protected int calculateTabAreaHeight(int tabPlacement, int runCount, int maxTabHeight) {
                return 0; // Ocultar las pestañas
            }
        });

    }

    public void bienvenida(Usuario usuario) {
        vistaIp.getLblNombre().setText(String.format("%s, %s", usuario.getApellido(), usuario.getNombre()));
    }

    public void acciones() {
        //Menu lateral - > paneles
        vistaIp.getLblPrincipal().addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent event) {
                vistaIp.getjTabbedPane1().setSelectedIndex(0);
            }

        });
        vistaIp.getLblEscanear().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                vistaIp.getjTabbedPane1().setSelectedIndex(1);
            }
        });

        vistaIp.getBtnOkEscanear().addActionListener(this);
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
        vistaIp.getPnlCerrarSesion().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                vistaIp.dispose();

                JLogin login = new JLogin();
                LoginController lc = new LoginController(login);
            }
        });
    }

    public void escanearCodigo() throws MalformedURLException {
        long startTime = System.currentTimeMillis();

        //Traido de la api, o más rápido de la caché
        Producto productoApi = api.consumirApi(vistaIp.getTxtCodigoEscanear().getText());
        long endTime = System.currentTimeMillis();
        System.out.println("Tiempo de consulta a la API: " + (endTime - startTime) + " ms");
        //Pero la información más detallada, se traerá de la bd
        long startTimeA = System.currentTimeMillis();
        Producto producto_bd = productoDao.selectByCodeProduct(vistaIp.getTxtCodigoEscanear().getText());
        long endTimeA = System.currentTimeMillis();
        System.out.println("Tiempo de consulta a la BD: " + (endTimeA - startTimeA) + " ms");
        
        
        if (productoApi.getCodigo_barra() != null) {

            System.out.println("Funciono la api");
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
            if (productoApi.getCompania().isEmpty()) {
                if (producto_bd == null) {
                    vistaInfo.getTxtCompaniaProd().setEditable(true);
                    vistaInfo.getTxtCompaniaProd().setText("--");
                } else {
                    vistaInfo.getTxtCompaniaProd().setEditable(false);
                    vistaInfo.getTxtCompaniaProd().setText(producto_bd.getNombre());
                }
            } else {
                //Si en caso se haga cambios al resultado dado de la API
                vistaInfo.getTxtCompaniaProd().setEditable(false);
                if (producto_bd == null) {
                    vistaInfo.getTxtCompaniaProd().setText(productoApi.getCompania());
                } else {
                    vistaInfo.getTxtCompaniaProd().setText(producto_bd.getCompania());
                }
            }

            if (productoApi.getContenido().isEmpty()) {

                if (producto_bd == null) {
                    vistaInfo.getTxtContenidoProd().setEditable(true);
                    vistaInfo.getTxtContenidoProd().setText("--");
                } else {
                    vistaInfo.getTxtContenidoProd().setEditable(false);
                    vistaInfo.getTxtContenidoProd().setText(producto_bd.getContenido());
                }
            } else {
                vistaInfo.getTxtContenidoProd().setEditable(false);
                if (producto_bd == null) {
                    vistaInfo.getTxtContenidoProd().setText(productoApi.getContenido());
                } else {
                    vistaInfo.getTxtContenidoProd().setText(producto_bd.getContenido());
                }
            }
            //Esto es así porque no se hace una consulta directa a la API para obtener la cantidad del producto (stock)
            vistaInfo.getTxtCantidadProd().setEditable(false);
            if (producto_bd == null) {
                vistaInfo.getTxtCantidadProd().setText("0");
            } else {
                vistaInfo.getTxtCantidadProd().setText(String.valueOf(producto_bd.getCantidad()));
            }

            //vistaInfo.getTxtAreaInformacion().setText(sb.toString());
            //Almacenamos en la variable global para ver los cambios al actualizar
            //this.textAreaInfo = sb;
            if (productoApi.getImagenURL() != null) {
                if (producto_bd == null) {
                    cargarImagenPorURL(productoApi.getImagenURL());
                } else {
                    cargarImagenPorURL(producto_bd.getImagenURL());
                }
            } else {
                if (producto_bd == null) {
                    vistaInfo.getLblImagen().setText("Imagen no encontrada");
                } else {
                    vistaInfo.getLblImagen().setText(producto_bd.getImagenURL());
                }
            }

            //Se va a consultar en el daoProducto para ver si existe o no en la base de datos
            //Separar la lógica si existe o no el producto en la base de datos
            if (producto_bd != null) {
                System.out.println("Si existe en la base de datos");
                vistaInfo.getLblPreguntar().setText("El producto ya está almacenado. ¿Desea aumentar su cantidad?");
                vistaInfo.getBtnAceptar().setActionCommand("aumentar");
                this.productoGlobal = producto_bd;
            } else {
                System.out.println("No existe en la base de datos");
                vistaInfo.getLblPreguntar().setText("El producto es nuevo. ¿Desea agregarlo?");
                vistaInfo.getBtnAceptar().setActionCommand("agregar");
                this.productoGlobal = productoApi;
            }

            vistaInfo.setLocationRelativeTo(null);
            vistaInfo.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el producto");
            System.out.println("No funciono la api");
        }

        vistaIp.getTxtCodigoEscanear().setText("");
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
        if (e.getSource() == vistaIp.getBtnOkEscanear()) {

            try {
                escanearCodigo();

            } catch (MalformedURLException ex) {
                Logger.getLogger(ProductoController.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
        //
        if (e.getSource() == vistaInfo.getBtnCancelar()) {
            vistaInfo.dispose();
        }
    }

}
