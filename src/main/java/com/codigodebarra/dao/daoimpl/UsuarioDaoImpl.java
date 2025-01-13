package com.codigodebarra.dao.daoimpl;

import com.codigodebarra.config.Conexion;
import com.codigodebarra.dao.UsuarioDao;
import com.codigodebarra.model.Usuario;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuarioDaoImpl implements UsuarioDao {

    PreparedStatement ps;
    ResultSet rs;
    Conexion con = new Conexion();

    @Override
    public Usuario select(int id) {
        Usuario usuario = null;
        StringBuilder sql = new StringBuilder();
        sql.append("Select ")
                .append("id_usuario, ")
                .append("nombre, ")
                .append("apellido, ")
                .append("nombre_usuario, ")
                .append("AES_DECRYPT(contrasenia, contrasenia), ")
                .append("rol ")
                .append("from usuario ")
                .append("where ")
                .append("id_usuario = ")
                .append("?");

        try {
            Connection conn = con.getConexion();
            ps = conn.prepareStatement(sql.toString());
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                usuario = new Usuario();
                usuario.setId_usuario(rs.getInt("id_usuario"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setNombreUsuario(rs.getString("nombre_usuario"));
                usuario.setContrasenia(rs.getString("contrasenia"));
                usuario.setRol(rs.getString("rol"));

            }

        } catch (Exception e) {
            System.out.println("Error al consultar el usuario con id especifico: " + e.getMessage());
        }
        return usuario;
    }

    @Override
    public List<Usuario> selectAll() {
        List<Usuario> usuarios = new ArrayList<>();
        StringBuilder sql = new StringBuilder();
        sql.append("Select ")
                .append("id_usuario, ")
                .append("nombre, ")
                .append("apellido, ")
                .append("nombre_usuario, ")
                .append("AES_DECRYPT(contrasenia, contrasenia), ")
                .append("rol ")
                .append("from usuario ")
                .append(")");

        try {
            Connection conn = con.getConexion();
            ps = conn.prepareStatement(sql.toString());

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId_usuario(rs.getInt("id_usuario"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setNombreUsuario(rs.getString("nombre_usuario"));
                usuario.setContrasenia(rs.getString("contrasenia"));
                usuario.setRol(rs.getString("rol"));
                usuarios.add(usuario);
            }

        } catch (Exception e) {
            System.out.println("Error al consultar todos los usuarios: " + e.getMessage());
        }
        return usuarios;
    }

    @Override
    public int insert(Usuario usuario) {
        int id_obtenido_usuario = 0;
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO ").append(" usuario ")
                .append("(usuario.nombre, ")
                .append("usuario.apellido, ")
                .append("usuario.nombreUsuario, ")
                .append("usuario.contrasenia, ")
                .append("usuario.rol ")
                .append(") values (")
                .append("?,?,?,AES_ENCRYPT(?,?),?")
                .append(")");
        try {
            Connection conn = con.getConexion(); //Llamar a la variable, la cual ya pasó por el DriverManager...
            ps = conn.prepareStatement(sql.toString(), Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellido());
            ps.setString(3, usuario.getNombreUsuario());
            /**
             * Puse 2 veces el usuario.getContrasenia(), porque quiero que la
             * clave sea la misma que la contraseña. Esto no significa que se
             * guardará la contraseña como tipo String, es decir, como texto...
             * Sino que servirá como clave para poder descifrar esa contraseña.
             */
            ps.setString(4, usuario.getContrasenia());
            ps.setString(5, usuario.getContrasenia());
            ps.setString(6, usuario.getRol());

            ps.executeUpdate(); //Tenemos que ejecutarlo primero, para obtener el id del producto que se haya creado

            //Se aplica el generatedKeys para obtener el id al insertar un producto
            ResultSet resultado = ps.getGeneratedKeys();

            if (resultado.next()) {
                id_obtenido_usuario = resultado.getInt("GENERATED_KEY");
                //Solo se obtiene en el resultset el id generado, el cual solo habrá una columna... (columna 1 o "GENERATED_KEY")

                JOptionPane.showMessageDialog(null, "El id que obtuviste es de : " + id_obtenido_usuario);
            }
        } catch (SQLException e) {
            System.out.println("Error al insertar el usuario: " + e.getMessage());
        }
        return id_obtenido_usuario;
    }

    @Override
    public Usuario evaluarUsuario(String nombreUsuario, char[] contrasenia) {

        Usuario usuario = null;
        StringBuilder sb = new StringBuilder();
        sb.append("Select ")
                .append("usuario.id_usuario, ")
                .append("usuario.nombre, ")
                .append("usuario.apellido, ")
                .append("usuario.nombreUsuario, ")
                .append("AES_DECRYPT(usuario.contrasenia, usuario.contrasenia), ")
                .append("usuario.rol ")
                .append("from ")
                .append(" usuario ")
                .append("WHERE ")
                .append("nombreUsuario = ")
                .append("? ")
                .append("AND ")
                .append("AES_DECRYPT(contrasenia, ?) = ")
                .append("?");
        /**
         * Quiero desencriptar un valor del campo que se encuentre en la columna
         * *contrasenia* (del where), la cual se desencriptará en todo caso yo
         * ingrese la clave secreta, la cual es el primer '?' dentro de append
         * de AES_DECRYPT. Y bueno el segundo parámetro vendría a ser el valor
         * ingresado a comparar.
         */
        try {

            Connection conn = con.getConexion();
            ps = conn.prepareStatement(sb.toString());
            ps.setString(1, nombreUsuario);

            String str = new String(contrasenia);
            byte[] byteArray = str.getBytes(StandardCharsets.UTF_8);
            System.out.println("byteArray: " + byteArray);
            ps.setBytes(2, byteArray);
            ps.setBytes(3, byteArray);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                usuario = new Usuario();
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setId_usuario(rs.getInt("id_usuario"));
                usuario.setNombreUsuario("nombreUsuario");
                usuario.setRol(rs.getString("rol"));
                System.out.println("ELEMENTOS ENCONTRADOS");

            } else {
                System.out.println("Elementos no encontradoss, no coincide la contrasenia o el nombre de usuario");
            }
        } catch (Exception e) {
            System.out.println("Error al evaluar al usuario: " + e.getMessage());
        }

        return usuario;
    }

}
