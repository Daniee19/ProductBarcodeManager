package com.codigodebarra.dao.daoimpl;

import com.codigodebarra.config.Conexion;
import com.codigodebarra.dao.DetalleImpl;
import com.codigodebarra.model.DetalleVenta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;

public class DetalleDaoImpl implements DetalleImpl {

    Conexion con;
    ResultSet rs;

    //idDetalle, idVenta, idProducto, cant, impSnIgvOExo, igv, impMasIgv, descProdu, subtotCnDesc
    @Override
    public DetalleVenta select(int id) {
        con = new Conexion();
        DetalleVenta dv = null;
        StringBuilder sql = new StringBuilder();
        sql.append("Select ")
                .append("*")
                .append(" from ")
                .append("detalleVenta")
                .append(" where")
                .append("idDetalle = ?");
        try (Connection conn = con.getConexion(); PreparedStatement ps = conn.prepareStatement(sql.toString());) {

            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                dv = new DetalleVenta();
                dv.setIdDetalle(rs.getInt("detalleVenta.idDetalle"));
                dv.setIdVenta(rs.getInt("detalleVenta.idVenta"));
                dv.setIdProducto(rs.getInt("detalleVenta.idProducto"));
                dv.setCant(rs.getInt("detalleVenta.cant"));
                dv.setImpSnIgvOExo(rs.getDouble("detalleVenta.impSnIgvOExo"));
                dv.setIgv(rs.getDouble("detalleVenta.igv"));
                dv.setImpMasIgv(rs.getDouble("detalleVenta.impMasIgv"));
                dv.setDescProdu(rs.getDouble("detalleVenta.descProdu"));
                dv.setSubtotCnDesc(rs.getDouble("subtotCnDesc"));
            }

        } catch (SQLException e) {
            System.out.println("Error al momento de consultar el detalle especifico: " + e.getMessage());
        }
        return dv;
    }

    @Override
    public List<DetalleVenta> selectAll() {
        con = new Conexion();
        List<DetalleVenta> dvs = null;
        StringBuilder sql = new StringBuilder();
        sql.append("Select ")
                .append("*")
                .append(" from ")
                .append("detalleVenta")
                .append(" where")
                .append("idDetalle = ?");
        try (Connection conn = con.getConexion(); PreparedStatement ps = conn.prepareStatement(sql.toString());) {

            rs = ps.executeQuery();

            while (rs.next()) {
                DetalleVenta dv = new DetalleVenta();
                dv.setIdDetalle(rs.getInt("detalleVenta.idDetalle"));
                dv.setIdVenta(rs.getInt("detalleVenta.idVenta"));
                dv.setIdProducto(rs.getInt("detalleVenta.idProducto"));
                dv.setCant(rs.getInt("detalleVenta.cant"));
                dv.setImpSnIgvOExo(rs.getDouble("detalleVenta.impSnIgvOExo"));
                dv.setIgv(rs.getDouble("detalleVenta.igv"));
                dv.setImpMasIgv(rs.getDouble("detalleVenta.impMasIgv"));
                dv.setDescProdu(rs.getDouble("detalleVenta.descProdu"));
                dv.setSubtotCnDesc(rs.getDouble("subtotCnDesc"));
                dvs.add(dv);
            }

        } catch (SQLException e) {
            System.out.println("Error al momento de consultar el detalle: " + e.getMessage());
        }
        return dvs;
    }

    @Override
    public int insert(DetalleVenta dv) {
        con = new Conexion();
        int idObtenidoDetVenta = 0;
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO ").append(" venta ")
                .append("(detalleVenta.idVenta, ")
                .append("detalleVenta.idProducto, ")
                .append("detalleVenta.cant, ")//idVenta, idProducto, cant, impSnIgvOExo, igv, impMasIgv, descProdu, subtotCnDesc
                .append("detalleVenta.impSnIgvOExo, ")
                .append("detalleVenta.igv, ")
                .append("detalleVenta.impMasIgv, ")
                .append("detalleVenta.descProdu, ")
                .append("detalleVenta.subtotCnDesc, ")
                .append(") values (")
                .append("?,?,?,?,?,?,?,?")
                .append(")");

        //Llamar a la variable, la cual ya pasó por el DriverManager...
        try (Connection conn = con.getConexion(); PreparedStatement ps = conn.prepareStatement(sql.toString(), Statement.RETURN_GENERATED_KEYS);) {
            ps.setInt(1, dv.getIdVenta());
            ps.setInt(2, dv.getIdProducto());
            ps.setInt(3, dv.getCant());
            ps.setDouble(4, dv.getImpSnIgvOExo());
            ps.setDouble(5, dv.getIgv());
            ps.setDouble(6, dv.getImpMasIgv());
            ps.setDouble(7, dv.getDescProdu());
            ps.setDouble(8, dv.getSubtotCnDesc());

            ps.executeUpdate(); //Tenemos que ejecutarlo primero, para obtener el id del producto que se haya creado

            //Se aplica el generatedKeys para obtener el id al insertar un producto
            ResultSet resultado = ps.getGeneratedKeys();

            if (resultado.next()) {
                idObtenidoDetVenta = resultado.getInt("GENERATED_KEY");
                //Solo se obtiene en el resultset el id generado, el cual solo habrá una columna... (columna 1 o "GENERATED_KEY")

                JOptionPane.showMessageDialog(null, "El id que obtuviste es de : " + idObtenidoDetVenta);
            }
        } catch (SQLException e) {
            System.out.println("Error al insertar el detalle: " + e.getMessage());
        }
        return idObtenidoDetVenta;
    }

    @Override
    public DetalleVenta update(DetalleVenta dv) {
        con = new Conexion();
        DetalleVenta dventa = null;

        StringBuilder sb = new StringBuilder();
        sb.append("Update venta set ")
                .append("detalleVenta.idProducto=?, ")
                .append("detalleVenta.cant=?, ")//idVenta, idProducto, cant, impSnIgvOExo, igv, impMasIgv, descProdu, subtotCnDesc
                .append("detalleVenta.impSnIgvOExo=?, ")
                .append("detalleVenta.igv=?, ")
                .append("detalleVenta.impMasIgv=?, ")
                .append("detalleVenta.descProdu=?, ")
                .append("detalleVenta.subtotCnDesc=?, ")
                .append("where idDetalle=?;");

        try {
            Connection conn = con.getConexion();
            PreparedStatement ps = conn.prepareStatement(sb.toString());

            ps.setInt(1, dv.getIdProducto());
            ps.setInt(2, dv.getCant());
            ps.setDouble(3, dv.getImpSnIgvOExo());
            ps.setDouble(4, dv.getIgv());
            ps.setDouble(5, dv.getImpMasIgv());
            ps.setDouble(6, dv.getDescProdu());
            ps.setDouble(7, dv.getSubtotCnDesc());
            ps.setInt(8, dv.getIdDetalle());
            ps.executeUpdate();

            System.out.println("Detalle actualizado");
        } catch (SQLException e) {
            System.out.println("Error al actualizar el detalle de la venta: " + e.getMessage());
        }

        return null;
    }

    @Override
    public boolean delete(int id) {
        con = new Conexion();
        boolean estado = false;
        StringBuilder sql = new StringBuilder();
        sql.append("Delete ")
                .append("from ")
                .append("detalleVenta ")
                .append("where ")
                .append("idDetalle = ?");
        try (Connection conn = con.getConexion(); PreparedStatement ps = conn.prepareStatement(sql.toString());) {

            ps.setInt(1, id);
            ps.executeUpdate();
            estado = true;
        } catch (SQLException e) {
            System.out.println("Error al eliminar el detalle, por el codigo el idDetalle: " + e.getMessage());
        }
        return estado;
    }

}
