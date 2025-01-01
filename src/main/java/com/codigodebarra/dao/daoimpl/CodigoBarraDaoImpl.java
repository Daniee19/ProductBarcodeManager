package com.codigodebarra.dao.daoimpl;

import com.codigodebarra.config.Conexion;
import com.codigodebarra.dao.CodigoBarraDao;

import com.codigodebarra.model.CodigoBarra;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

public class CodigoBarraDaoImpl implements CodigoBarraDao {

    Conexion con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public CodigoBarraDaoImpl() {
        con = new Conexion();
    }

    @Override
    public CodigoBarra select(int id) {
        CodigoBarra cb = null;
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
                cb = new CodigoBarra();

                cb.setId_barra(rs.getInt("id_barra"));
                /*p.setId(rs.getInt("id"));
                //p.setCodigo_barra(rs.getString("codigo_barra"));
                p.setId_barra(cb);
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getDouble("precio"));
                p.setCantidad(rs.getInt("cantidad"));*/
            }

        } catch (SQLException e) {
            System.out.println("Error al momento de consultar: " + e.getMessage());
        }
        return cb;

    }

    @Override
    public List<CodigoBarra> selectAll() {
        List<CodigoBarra> codigos_barra = new ArrayList<>();
        StringBuilder sql = new StringBuilder();
        sql.append("Select ")
                .append("*")
                .append(" from ")
                .append("codigo_barra");

        try {
            Connection conn = con.getConexion();
            ps = conn.prepareStatement(sql.toString());

            rs = ps.executeQuery();
            while (rs.next()) {

                CodigoBarra cb = new CodigoBarra();
                cb.setId_barra(rs.getInt("id_barra"));

                cb.setNombre_barra(rs.getString("nombre"));
                cb.setTipo(rs.getString("tipo"));
                codigos_barra.add(cb);
            }

        } catch (SQLException e) {
            System.out.println("Error al momento de consultar: " + e.getMessage());
        }
        return codigos_barra;
    }

    @Override
    public int insert(CodigoBarra cb) {

        return 0;
    }

    @Override
    public CodigoBarra selectByType(String tipo) {
        CodigoBarra cb = new CodigoBarra();
        StringBuilder sql = new StringBuilder();
        sql.append("Select ")
                .append("*")
                .append(" from ")
                .append("codigo_barra ")
                .append("where ")
                .append("tipo=")
                .append("?");

        try {
            Connection conn = con.getConexion();
            ps = conn.prepareStatement(sql.toString());
            ps.setString(1, tipo);
            rs = ps.executeQuery();
            if (rs.next()) {
                cb = new CodigoBarra();
                cb.setId_barra(rs.getInt("id_barra"));
                cb.setNombre_barra(rs.getString("nombre"));
                cb.setTipo(rs.getString("tipo"));
            }
        } catch (SQLException e) {
            System.out.println("Error al momento de consultar el codigo de barra por el tipo: " + e.getMessage());
        }
        return cb;
    }

}
