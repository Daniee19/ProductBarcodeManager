package com.codigodebarra.dao.daoimpl;

import com.codigodebarra.config.Conexion;
import com.codigodebarra.dao.ProductoDao;
import com.codigodebarra.model.CodigoBarra;
import com.codigodebarra.model.Producto;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProductoDaoImpl implements ProductoDao {

    Conexion con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public ProductoDaoImpl() {
        con = new Conexion();
    }

    @Override
    public Producto select(int id) {
        Producto p = null;
        StringBuilder sql = new StringBuilder();
        sql.append("Select ")
                .append("*")
                .append(" from ")
                .append("producto")
                .append(" where")
                .append("id = ?");
        try {
            Connection conn = con.getConexion();
            ps = conn.prepareStatement(sql.toString());
            ps.setInt(1, id);

            rs = ps.executeQuery();
            if (rs.next()) {
                p = new Producto();
                CodigoBarra cb = new CodigoBarra();
                cb.setId_barra(rs.getInt("id_barra"));
                p.setId(rs.getInt("id"));
                //p.setCodigo_barra(rs.getString("codigo_barra"));
                p.setId_barra(cb);
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getDouble("precio"));
                p.setCantidad(rs.getInt("cantidad"));
            }

        } catch (SQLException e) {
            System.out.println("Error al momento de consultar: " + e.getMessage());
        }
        return p;

    }

    @Override
    public List<Producto> selectAll() {
        List<Producto> productos = new ArrayList<>();
        StringBuilder sql = new StringBuilder();
        sql.append("Select ")
                .append("*")
                .append(" from ")
                .append("producto");

        try {
            Connection conn = con.getConexion();
            ps = conn.prepareStatement(sql.toString());

            rs = ps.executeQuery();
            while (rs.next()) {
                Producto produ = new Producto();
                CodigoBarra cb = new CodigoBarra();
                cb.setId_barra(rs.getInt("id_barra"));
                produ.setId(rs.getInt("id"));

                produ.setId_barra(cb);
                produ.setNombre(rs.getString("nombre"));
                produ.setPrecio(rs.getDouble("precio"));
                produ.setCantidad(rs.getInt("cantidad"));
            }

        } catch (SQLException e) {
            System.out.println("Error al momento de consultar: " + e.getMessage());
        }
        return productos;
    }

    @Override
    public int insert(Producto producto) {
        int id_obtenido_producto = 0;
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO ").append(" producto ")
                .append("(id_barra, ").append("producto.nombre, ").append("producto.precio, ").append("producto.cantidad")
                .append(") values (").append("?,?,?,?").append(")");
        try {
            Connection conn = con.getConexion(); //Llamar a la variable, la cual ya pasó por el DriverManager...
            ps = conn.prepareStatement(sql.toString(), Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, producto.getId_barra().getId_barra());
            ps.setString(2, producto.getNombre());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getCantidad());

            ps.executeUpdate(); //Tenemos que ejecutarlo primero, para obtener el id del producto que se haya creado

            ResultSet resultado = ps.getGeneratedKeys();

            if (resultado.next()) {
                id_obtenido_producto = resultado.getInt("GENERATED_KEY");
                //Solo se obtiene en el resultset el id generado, el cual solo habrá una columna... (columna 1 o "GENERATED_KEY")
                
                JOptionPane.showMessageDialog(null, "El id que obtuviste es de : " + id_obtenido_producto);
            }
        } catch (SQLException e) {
            System.out.println("Error al insertar el producto: " + e.getMessage());
        }
        return id_obtenido_producto;
    }

}
