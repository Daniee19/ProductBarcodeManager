package com.codigodebarra.controller;

import com.codigodebarra.dao.UsuarioDao;
import com.codigodebarra.dao.daoimpl.UsuarioDaoImpl;
import com.codigodebarra.model.Usuario;
import com.codigodebarra.view.JLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

public class LoginController implements ActionListener {

    JLogin vistaLogin;
    UsuarioDao usuarioDao = new UsuarioDaoImpl();

    public LoginController(JLogin vistaLogin) {
        this.vistaLogin = vistaLogin;
        this.vistaLogin.setVisible(true);
        this.vistaLogin.setLocationRelativeTo(null);
        disenio();
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

    public void disenio() {
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
            java.util.logging.Logger.getLogger(JLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    public void evaluarLogin(String nombreUsuario, char[] contrasenia) {
        if ((nombreUsuario != null && contrasenia != null)) {
            usuarioDao.evaluarUsuario(nombreUsuario, contrasenia);

//            Usuario usuario = new Usuario();
//            usuario.setNombre("Daniel");
//            usuario.setApellido("Castaneda");
//            usuario.setNombreUsuario("Danie19");
//            usuario.setContrasenia("Contraseniaaaaaaaaaaaaa");
//            usuario.setRol("Administrador");
//            
//            usuarioDao.insert(usuario);
            JOptionPane.showMessageDialog(null, "SE RECIBIO VALORES DE LOS TEXT Y PASSWORD FIELDS");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
