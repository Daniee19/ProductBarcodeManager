package com.codigodebarra.dao.daoimpl;

import com.codigodebarra.config.Conexion;
import com.codigodebarra.dao.ProductoDao;
import com.codigodebarra.model.CodigoBarra;
import com.codigodebarra.model.Producto;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

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
    public boolean insert(Producto producto) {
        boolean valor_boolean = false;
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO ").append(" producto ")
                .append("(id_barra, ").append("producto.nombre, ").append("producto.precio, ").append("producto.cantidad")
                .append(") values (").append("?,?,?,?").append(")");
        try {
            Connection conn = con.getConexion();
            ps = conn.prepareStatement(sql.toString());
            ps.setInt(1, producto.getId_barra().getId_barra());
            ps.setString(2, producto.getNombre());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getCantidad());

            int resultado = ps.executeUpdate();
            if (resultado > 0) {
                valor_boolean = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al insertar el producto: " + e.getMessage());
        }
        return valor_boolean;
    }

}
