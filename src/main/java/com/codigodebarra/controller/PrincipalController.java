package com.codigodebarra.controller;

import com.codigodebarra.config.Disenio;
import com.codigodebarra.dao.ProductoDao;
import com.codigodebarra.dao.daoimpl.ProductoDaoImpl;
import com.codigodebarra.model.Producto;
import com.codigodebarra.model.Usuario;
import com.codigodebarra.util.ApiProductos;
import com.codigodebarra.util.Barras;
import com.codigodebarra.view.JInformacion;
import com.codigodebarra.view.JInterfazPrincipal;
import com.codigodebarra.view.JLogin;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class PrincipalController implements ActionListener {
    
    JInterfazPrincipal vistaIp;
    JInformacion vistaInfo;
    ProductoDao productoDao;
    ApiProductos api;
    Producto productoGlobal;
    Usuario usuario;
    DefaultTableModel modelo;
    
    int xMouse, yMouse;
    
    public PrincipalController(JInterfazPrincipal vistaIp, Usuario usuario) {
        this.vistaIp = vistaIp;
        //Se necesita que la vistaIp ya haya sida creada
        bienvenida(usuario);
        this.vistaIp.setVisible(true);
        this.vistaIp.setLocationRelativeTo(null);
        
        vistaInfo = new JInformacion(vistaIp, true);
        productoDao = new ProductoDaoImpl();
        api = new ApiProductos();
        Disenio.getDesignWindows();
        modelo = new DefaultTableModel();
        acciones();
        
    }
    
    public void bienvenida(Usuario usuario) {
        vistaIp.getLblNombre().setText(String.format("%s, %s", usuario.getApellido(), usuario.getNombre()));
    }
    
    private void disenioTabla() {
        
        String[] tituloColumnas = {"Cod. Barra", "Nombre", "Marca", "Contenido", "Precio", "Cantidad"};
        
        modelo.setColumnIdentifiers(tituloColumnas);
        
        vistaIp.getTablaProductos().setModel(modelo);

        //=============
        List<Producto> productos = productoDao.selectAll();
        
        for (Producto p : productos) {
            Object[] fila = {p.getCodigo_barra(), p.getNombre(), p.getMarca(), p.getContenido(), p.getPrecio(), p.getCantidad()};
            modelo.addRow(fila);
        }
        
    }
    
    public void acciones() {
        configuracionTabbedPane();
        //Menu lateral - > paneles
        navegacionTabbedPane();
        disenioTabla();
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
        
    }
    
    private void configuracionTabbedPane() {
        //Ocultar las pestañas del TabbedPane
        vistaIp.getjTabbedPane1().setUI(new javax.swing.plaf.basic.BasicTabbedPaneUI() {
            @Override
            protected int calculateTabAreaHeight(int tabPlacement, int runCount, int maxTabHeight) {
                return 0; // Ocultar las pestañas
            }
        });
        //Barra superior
        vistaIp.getPnlBarraDeOpciones().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent event) {
                xMouse = event.getX();
                yMouse = event.getY();
            }
        });
        
        vistaIp.getPnlBarraDeOpciones().addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent event) {
                int x = event.getXOnScreen();
                int y = event.getYOnScreen();
                
                vistaIp.setLocation(x - xMouse, y - yMouse);
            }
        });
        
        vistaIp.getPnlXLogin().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas cerrar sesión?");
                if (respuesta == 0) {
                    vistaIp.dispose();
                    JLogin login = new JLogin();
                    LoginController lc = new LoginController(login);
                }
            }
            
            @Override
            public void mouseEntered(MouseEvent event) {
                vistaIp.getPnlXLogin().setBackground(new Color(254, 57, 57));
            }
            
            @Override
            public void mouseExited(MouseEvent event) {
                vistaIp.getPnlXLogin().setBackground(new Color(51, 51, 51));
            }
        });
        
        vistaIp.getPnlFSLogin().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                if (vistaIp.getExtendedState() != vistaIp.MAXIMIZED_BOTH) {
                    vistaIp.setExtendedState(vistaIp.MAXIMIZED_BOTH);
//                  vistaLogin.getPnlAll().setMaximumSize(vistaLogin.getMaximumSize());
                } else {
                    vistaIp.setExtendedState(vistaIp.NORMAL);
                }
            }
            
            @Override
            public void mouseEntered(MouseEvent event) {
                vistaIp.getPnlFSLogin().setBackground(new Color(95, 92, 93));
            }
            
            @Override
            public void mouseExited(MouseEvent event) {
                vistaIp.getPnlFSLogin().setBackground(new Color(51, 51, 51));
            }
        });
        
        vistaIp.getPnlMinusLogin().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                if ((vistaIp.getExtendedState() == vistaIp.NORMAL) || (vistaIp.getExtendedState() == vistaIp.MAXIMIZED_BOTH)) {
                    vistaIp.setExtendedState(vistaIp.HIDE_ON_CLOSE);
                }
            }
            
            @Override
            public void mouseEntered(MouseEvent event) {
                vistaIp.getPnlMinusLogin().setBackground(new Color(95, 92, 93));
            }
            
            @Override
            public void mouseExited(MouseEvent event) {
                vistaIp.getPnlMinusLogin().setBackground(new Color(51, 51, 51));
            }
            
        });
    }
    
    private void navegacionTabbedPane() {
        vistaIp.getPnlPrincipal().addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent event) {
                vistaIp.getjTabbedPane1().setSelectedIndex(0);
            }
            
            @Override
            public void mouseEntered(MouseEvent event) {
                vistaIp.getPnlPrincipal().setBackground(new Color(220, 220, 220));
            }
            
            @Override
            public void mouseExited(MouseEvent event) {
                vistaIp.getPnlPrincipal().setBackground(new Color(255, 255, 255));
            }
        });
        vistaIp.getPnlEscanear().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                vistaIp.getjTabbedPane1().setSelectedIndex(1);
            }
            
            @Override
            public void mouseEntered(MouseEvent event) {
                vistaIp.getPnlEscanear().setBackground(new Color(220, 220, 220));
            }
            
            @Override
            public void mouseExited(MouseEvent event) {
                vistaIp.getPnlEscanear().setBackground(new Color(255, 255, 255));
            }
        });
        
        vistaIp.getPnlInventario().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                vistaIp.getjTabbedPane1().setSelectedIndex(2);
            }
            
            @Override
            public void mouseEntered(MouseEvent event) {
                vistaIp.getPnlInventario().setBackground(new Color(220, 220, 220));
            }
            
            @Override
            public void mouseExited(MouseEvent event) {
                vistaIp.getPnlInventario().setBackground(new Color(255, 255, 255));
            }
        });
        vistaIp.getPnlCerrarSesion().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                
                int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas cerrar sesión?");
                /**
                 * -1: Clic en la x | 0: Si | 1: Cancelar | 2: No
                 */
                if (respuesta == 0) {
                    vistaIp.dispose();
                    JLogin login = new JLogin();
                    LoginController lc = new LoginController(login);
                }
            }
            
            @Override
            public void mouseEntered(MouseEvent event) {
                vistaIp.getPnlCerrarSesion().setBackground(new Color(220, 220, 220));
            }
            
            @Override
            public void mouseExited(MouseEvent event) {
                vistaIp.getPnlCerrarSesion().setBackground(new Color(255, 255, 255));
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
        //long startTimeA = System.currentTimeMillis();
        Producto producto_bd = productoDao.selectByCodeProduct(vistaIp.getTxtCodigoEscanear().getText());
        //long endTimeA = System.currentTimeMillis();
        //System.out.println("Tiempo de consulta a la BD: " + (endTimeA - startTimeA) + " ms");

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
            if (productoApi.getMarca().isEmpty()) {
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
                    vistaInfo.getTxtCompaniaProd().setText(productoApi.getMarca());
                } else {
                    vistaInfo.getTxtCompaniaProd().setText(producto_bd.getMarca());
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
            vistaInfo.getLblCodigoBarra().setText(productoApi.getCodigo_barra());
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
        //Volver a crear la imagen pero con la escala actualizada
        imagen = new ImageIcon(img);

        // Asignar la imagen al JLabel
        vistaInfo.getLblImagen().setIcon(imagen);
        vistaInfo.getLblImagen().setText("");
    }
    
    public void obtenerPDF() {
        Barras ba = new Barras();
        List<Producto> productos = productoDao.selectAll();
        System.out.println(productos);
        for (Producto ps : productos) {
            ba.generarCodBarras(ps.getCodigo_barra(), "EAN-13");
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaIp.getBtnOkEscanear()) {
            
            try {
                escanearCodigo();
            } catch (MalformedURLException ex) {
                Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //
        if (e.getSource() == vistaInfo.getBtnCancelar()) {
            vistaInfo.dispose();
        }
    }
    
}
