package com.codigodebarra.dao.daoimpl;

import com.codigodebarra.config.Conexion;
import com.codigodebarra.dao.VentaDao;
import com.codigodebarra.model.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;

public class VentaDaoImpl implements VentaDao {

    Conexion con;
    ResultSet rs = null;

    @Override
    public Venta select(int id) {
        con = new Conexion();
        Venta v = null;
        StringBuilder sql = new StringBuilder();
        sql.append("Select ")
                .append("*")
                .append(" from ")
                .append("producto")
                .append(" where")
                .append("idVenta = ?");
        try (Connection conn = con.getConexion(); PreparedStatement ps = conn.prepareStatement(sql.toString());) {

            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                v = new Venta();
                v.setIdVenta(rs.getInt("idVenta"));
                v.setIdUsuario(rs.getInt("idUsuario"));
                v.setFechaVenta(rs.getTimestamp("fechaVenta"));
                v.setImpTotSnIgvOExo(rs.getDouble("impTotSnIgvOExo"));
                v.setIgvTotal(rs.getDouble("igvTotal"));
                v.setImpTotMasIgv(rs.getDouble("impTotMasIgv"));
                v.setDescTot(rs.getDouble("descTot"));
                v.setTotal(rs.getDouble("total"));
                v.setTipoVenta(rs.getString("tipoVenta"));
                v.setMetPago(rs.getString("metPago"));
                v.setObservacion(rs.getString("observacion"));
            }

        } catch (SQLException e) {
            System.out.println("Error al momento de consultar: " + e.getMessage());
        }
        return v;
    }

    @Override
    public List<Venta> selectAll() {
        con = new Conexion();
        List<Venta> vs = null;
        StringBuilder sql = new StringBuilder();
        sql.append("Select ")
                .append("*")
                .append(" from ")
                .append("producto")
                .append(" where")
                .append("idVenta = ?");
        try (Connection conn = con.getConexion(); PreparedStatement ps = conn.prepareStatement(sql.toString());) {

            rs = ps.executeQuery();

            while (rs.next()) {
                Venta v = new Venta();
                v.setIdVenta(rs.getInt("idVenta"));
                v.setIdUsuario(rs.getInt("idUsuario"));
                v.setFechaVenta(rs.getTimestamp("fechaVenta"));
                v.setImpTotSnIgvOExo(rs.getDouble("impTotSnIgvOExo"));
                v.setIgvTotal(rs.getDouble("igvTotal"));
                v.setImpTotMasIgv(rs.getDouble("impTotMasIgv"));
                v.setDescTot(rs.getDouble("descTot"));
                v.setTotal(rs.getDouble("total"));
                v.setTipoVenta(rs.getString("tipoVenta"));
                v.setMetPago(rs.getString("metPago"));
                v.setObservacion(rs.getString("observacion"));
                vs.add(v);
            }

        } catch (SQLException e) {
            System.out.println("Error al momento de consultar: " + e.getMessage());
        }
        return vs;
    }

    @Override
    public int insert(Venta venta) {
        con = new Conexion();
        int idObtenidoVenta = 0;
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO ").append(" venta ")
                .append("(venta.idUsuario, ")
                .append("venta.fechaVenta, ")
                .append("venta.impTotSnIgvOExo, ")//igvTotal, impTotMasIgv, descTot, total, tipoVenta, metPago, observacion
                .append("venta.igvTotal, ")
                .append("venta.impTotMasIgv, ")
                .append("venta.descTot, ")
                .append("venta.total, ")
                .append("venta.tipoVenta, ")
                .append("venta.metPago, ")
                .append("venta.observacion")
                .append(") values (")
                .append("?,?,?,?,?,?,?,?,?,?")
                .append(")");

        //Llamar a la variable, la cual ya pasó por el DriverManager...
        try (Connection conn = con.getConexion(); PreparedStatement ps = conn.prepareStatement(sql.toString(), Statement.RETURN_GENERATED_KEYS);) {
            ps.setInt(1, venta.getIdUsuario());
            ps.setTimestamp(2, venta.getFechaVenta());
            ps.setDouble(3, venta.getImpTotSnIgvOExo());
            ps.setDouble(4, venta.getIgvTotal());
            ps.setDouble(5, venta.getImpTotMasIgv());
            ps.setDouble(6, venta.getDescTot());
            ps.setDouble(7, venta.getTotal());
            ps.setString(8, venta.getTipoVenta());
            ps.setString(9, venta.getMetPago());
            ps.setString(10, venta.getObservacion());
            ps.executeUpdate(); //Tenemos que ejecutarlo primero, para obtener el id del producto que se haya creado

            //Se aplica el generatedKeys para obtener el id al insertar un producto
            ResultSet resultado = ps.getGeneratedKeys();

            if (resultado.next()) {
                idObtenidoVenta = resultado.getInt("GENERATED_KEY");
                //Solo se obtiene en el resultset el id generado, el cual solo habrá una columna... (columna 1 o "GENERATED_KEY")

                JOptionPane.showMessageDialog(null, "El id que obtuviste es de : " + idObtenidoVenta);
            }
        } catch (SQLException e) {
            System.out.println("Error al insertar el producto: " + e.getMessage());
        }
        return idObtenidoVenta;

    }

    @Override
    public Venta update(Venta objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
