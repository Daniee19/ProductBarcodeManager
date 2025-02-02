package com.codigodebarra.dao.daoimpl;

import com.codigodebarra.config.Conexion;
import com.codigodebarra.dao.UsuarioDao;
import com.codigodebarra.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mindrot.jbcrypt.BCrypt;

public class UsuarioDaoImpl implements UsuarioDao {

    PreparedStatement ps;
    ResultSet rs;
    Conexion con = null;

    @Override
    public Usuario select(int id) {
        con = new Conexion();
        Usuario usuario = null;
        StringBuilder sql = new StringBuilder();
        sql.append("Select ")
                .append("idUsuario, ")
                .append("nombre, ")
                .append("apellido, ")
                .append("nombreUsuario, ")
                .append("rol ")
                .append("from usuario ")
                .append("where ")
                .append("idUsuario = ")
                .append("?");

        try {
            Connection conn = con.getConexion();
            ps = conn.prepareStatement(sql.toString());
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                usuario = new Usuario();
                usuario.setId_usuario(rs.getInt("idUsuario"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setNombreUsuario(rs.getString("nombreUsuario"));
                usuario.setRol(rs.getString("rol"));

            }

        } catch (Exception e) {
            System.out.println("Error al consultar el usuario con id especifico: " + e.getMessage());
        }
        return usuario;
    }

    @Override
    public List<Usuario> selectAll() {
        con = new Conexion();
        List<Usuario> usuarios = new ArrayList<>();
        StringBuilder sql = new StringBuilder();
        sql.append("Select ")
                .append("idUsuario, ")
                .append("nombre, ")
                .append("apellido, ")
                .append("nombreUsuario, ")
                .append("rol ")
                .append("from usuario ");

        try {
            Connection conn = con.getConexion();
            ps = conn.prepareStatement(sql.toString());

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId_usuario(rs.getInt("idUsuario"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setNombreUsuario(rs.getString("nombreUsuario"));
                usuario.setRol(rs.getString("rol"));
                usuarios.add(usuario);
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar todos los usuarios: " + e.getMessage());
        }
        return usuarios;
    }

    @Override
    public int insert(Usuario usuario) {
        con = new Conexion();
        int id_obtenido_usuario = 0;
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO ").append(" usuario ")
                .append("(usuario.nombre, ")
                .append("usuario.apellido, ")
                .append("usuario.nombreUsuario, ")
                .append("usuario.contrasenia, ")
                .append("usuario.rol ")
                .append(") values (")
                .append("?,?,?,?,?")
                .append(")");
        try {
            Connection conn = con.getConexion(); //Llamar a la variable, la cual ya pasó por el DriverManager...
            ps = conn.prepareStatement(sql.toString(), Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellido());
            ps.setString(3, usuario.getNombreUsuario());
            //Se está insertando el hash+salt para que ningún registro tenga el mismo hash
            ps.setString(4, BCrypt.hashpw(usuario.getContrasenia(), BCrypt.gensalt()));
            ps.setString(5, usuario.getRol());

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
        //Se trae de tipo char[] porque es de tipo txtPASSWORD
        con = new Conexion();
        Usuario usuario = null;
        StringBuilder sb = new StringBuilder();
        sb.append("Select ")
                .append("usuario.idUsuario, ")
                .append("usuario.nombre, ")
                .append("usuario.apellido, ")
                .append("usuario.nombreUsuario, ")
                .append("usuario.contrasenia, ")
                .append("usuario.rol ")
                .append("from ")
                .append(" usuario ")
                .append("WHERE ")
                .append("nombreUsuario = ")
                .append("? ");

        try {

            Connection conn = con.getConexion();
            ps = conn.prepareStatement(sb.toString());
            ps.setString(1, nombreUsuario);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String contraseniaHasheada = rs.getString("contrasenia");
                //Convertimos el char[] a String 
                String str = new String(contrasenia);
                try {
                    /**
                     * Obtenemos el salt de la contraseña hasheada. Y lo
                     * combinamos ese salt entontrado y lo combinamos con el
                     * texto plano hasheado. Y luego se compara y si son iguales
                     * devuelve true, y sino false.
                     */
                    if (BCrypt.checkpw(str, contraseniaHasheada)) {

                        usuario = new Usuario();
                        usuario.setNombre(rs.getString("nombre"));
                        usuario.setApellido(rs.getString("apellido"));
                        usuario.setId_usuario(rs.getInt("idUsuario"));
                        usuario.setNombreUsuario("nombreUsuario");
                        usuario.setRol(rs.getString("rol"));
                    }
                } catch (Exception e) {
                    System.out.println("Error en la comparación de las contraseñas: " + e.getMessage());
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al evaluar al usuario: " + e.getMessage());
        }

        return usuario;
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Usuario update(Usuario id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
