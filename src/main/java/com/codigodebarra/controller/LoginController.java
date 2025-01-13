package com.codigodebarra.controller;

import com.codigodebarra.config.Disenio;
import com.codigodebarra.dao.UsuarioDao;
import com.codigodebarra.dao.daoimpl.UsuarioDaoImpl;
import com.codigodebarra.model.Usuario;
import com.codigodebarra.view.JInterfazPrincipal;
import com.codigodebarra.view.JLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

public class LoginController implements ActionListener {

    JLogin vistaLogin;
    UsuarioDao usuarioDao = new UsuarioDaoImpl();
    Disenio d = new Disenio();

    public LoginController(JLogin vistaLogin) {
        this.vistaLogin = vistaLogin;
        this.vistaLogin.setVisible(true);
        this.vistaLogin.setLocationRelativeTo(null);
        d.getDesignWindows();
        acciones();
    }

    public void acciones() {
        vistaLogin.getPnlIngresar().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                //Cuando se de click en el panel de "Ingresar"
                String nombreUsuario = vistaLogin.getTxtUsuario().getText();
                char[] password = vistaLogin.getTxtPassword().getPassword();

                evaluarLogin(nombreUsuario, password);
            }

        });

    }

    public void evaluarLogin(String nombreUsuario, char[] contrasenia) {
        if ((!nombreUsuario.isEmpty()) && contrasenia.length != 0) {
            Usuario usuario = usuarioDao.evaluarUsuario(nombreUsuario, contrasenia);

            if (usuario != null) {
                JInterfazPrincipal ip = new JInterfazPrincipal();
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
//            usuario.setNombreUsuario("da");
//            usuario.setContrasenia("da");
//            usuario.setRol("Administrador");
//
//            usuarioDao.insert(usuario);
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese los campos para iniciar sesión");

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
