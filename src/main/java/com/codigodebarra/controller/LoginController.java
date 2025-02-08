package com.codigodebarra.controller;

import com.codigodebarra.config.Disenio;
import com.codigodebarra.dao.UsuarioDao;
import com.codigodebarra.dao.daoimpl.UsuarioDaoImpl;
import com.codigodebarra.model.Usuario;
import com.codigodebarra.view.JInterfazPrincipal;
import com.codigodebarra.view.JLogin;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JOptionPane;

public class LoginController {

    JLogin vistaLogin;
    UsuarioDao usuarioDao = new UsuarioDaoImpl();
    //Disenio d = new Disenio();
    int xMouse, yMouse;

    public LoginController(JLogin vistaLogin) {
        this.vistaLogin = vistaLogin;
        this.vistaLogin.setVisible(true);
        this.vistaLogin.setLocationRelativeTo(null);
        Disenio.getDesignWindows();
        acciones();
    }

    public void evaluarLogin(String nombreUsuario, char[] contrasenia) {
        if ((!nombreUsuario.isEmpty()) && contrasenia.length != 0) {
            Usuario usuario = usuarioDao.evaluarUsuario(nombreUsuario, contrasenia);

            if (usuario != null) {
                JInterfazPrincipal ip = new JInterfazPrincipal();
                // Obtener tamaño de pantalla
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                int width = (int) screenSize.getWidth();
                int height = (int) screenSize.getHeight();

                // Ajustar tamaño de la ventana
                ip.setSize(width / 2, height / 2);
                ip.setLocationRelativeTo(null); // Centrar ventana
                PrincipalController pc = new PrincipalController(ip, usuario);
                vistaLogin.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no encontrado");
            }
            /**
             * <br> Esto se tiene que hacer en la sección del administrador.
             */
//            Usuario usuario = new Usuario();
//            usuario.setNombre("Yoshua");
//            usuario.setApellido("Castaneda");
//            usuario.setNombreUsuario("dani");
//            usuario.setContrasenia("dani");
//            usuario.setRol("Administrador");
//
//            usuarioDao.insert(usuario);
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese los campos para iniciar sesión");

        }
    }

    public void acciones() {
        //Opciones de la Tabbed Pane
        vistaLogin.getPnlBarraOpciones().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent event) {
                xMouse = event.getX();
                yMouse = event.getY();
            }
        });

        vistaLogin.getPnlBarraOpciones().addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent event) {
                int x = event.getXOnScreen();
                int y = event.getYOnScreen();

                vistaLogin.setLocation(x - xMouse, y - yMouse);
            }
        });

        vistaLogin.getPnlXLogin().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                System.exit(0);
            }

            @Override
            public void mouseEntered(MouseEvent event) {
                vistaLogin.getPnlXLogin().setBackground(new Color(254, 57, 57));
            }

            @Override
            public void mouseExited(MouseEvent event) {
                vistaLogin.getPnlXLogin().setBackground(new Color(51, 51, 51));
            }
        });

        vistaLogin.getPnlFSLogin().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                if (vistaLogin.getExtendedState() != vistaLogin.MAXIMIZED_BOTH) {
                    vistaLogin.setExtendedState(vistaLogin.MAXIMIZED_BOTH);
//                  vistaLogin.getPnlAll().setMaximumSize(vistaLogin.getMaximumSize());
                } else {
                    vistaLogin.setExtendedState(vistaLogin.NORMAL);
                }
            }

            @Override
            public void mouseEntered(MouseEvent event) {
                vistaLogin.getPnlFSLogin().setBackground(new Color(95, 92, 93));
            }

            @Override
            public void mouseExited(MouseEvent event) {
                vistaLogin.getPnlFSLogin().setBackground(new Color(51, 51, 51));
            }
        });

        vistaLogin.getPnlMinusLogin().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                if ((vistaLogin.getExtendedState() == vistaLogin.NORMAL) || (vistaLogin.getExtendedState() == vistaLogin.MAXIMIZED_BOTH)) {
                    vistaLogin.setExtendedState(vistaLogin.HIDE_ON_CLOSE);
                }
            }

            @Override
            public void mouseEntered(MouseEvent event) {
                vistaLogin.getPnlMinusLogin().setBackground(new Color(95, 92, 93));
            }

            @Override
            public void mouseExited(MouseEvent event) {
                vistaLogin.getPnlMinusLogin().setBackground(new Color(51, 51, 51));
            }

        });

        vistaLogin.getPnlIngresar().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent event) {
                vistaLogin.getPnlIngresar().setBackground(new Color(95, 92, 93));
                vistaLogin.getLblIngresar().setForeground(Color.white);
            }

            @Override
            public void mouseExited(MouseEvent event) {
                vistaLogin.getPnlIngresar().setBackground(new Color(255, 204, 102));
                vistaLogin.getLblIngresar().setForeground(Color.black);
            }

            @Override
            public void mouseClicked(MouseEvent event) {
                //Cuando se de click en el panel de "Ingresar"
                String nombreUsuario = vistaLogin.getTxtUsuario().getText();
                char[] password = vistaLogin.getTxtPassword().getPassword();

                evaluarLogin(nombreUsuario, password);
            }
        });
    }
}
