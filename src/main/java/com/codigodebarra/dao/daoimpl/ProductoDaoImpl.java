package com.codigodebarra.dao.daoimpl;

import com.codigodebarra.config.Conexion;
import com.codigodebarra.dao.ProductoDao;
import com.codigodebarra.model.Producto;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProductoDaoImpl implements ProductoDao {

    Conexion con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

//    public ProductoDaoImpl() {
//        con = new Conexion();
//    }
    @Override
    public Producto select(int id) {
        //Solucionado
        con = new Conexion();
        Producto p = null;
        StringBuilder sql = new StringBuilder();
        sql.append("Select ")
                .append("*")
                .append(" from ")
                .append("producto")
                .append(" where")
                .append("id_producto = ?");
        try (Connection conn = con.getConexion(); PreparedStatement ps = conn.prepareStatement(sql.toString());) {

            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                p = new Producto();

                p.setId(rs.getInt("id_producto"));
                p.setCodigo_barra(rs.getString("codigo_barra"));
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getDouble("precio"));
                p.setCantidad(rs.getInt("cantidad"));
                p.setMarca(rs.getString("marca"));
                p.setContenido(rs.getString("contenido"));
                p.setImagenURL(rs.getString("imagenURL"));
            }

        } catch (SQLException e) {
            System.out.println("Error al momento de consultar: " + e.getMessage());
        }
        return p;

    }

    @Override
    public List<Producto> selectAll() {
        con = new Conexion();
        List<Producto> productos = new ArrayList<>();
        StringBuilder sql = new StringBuilder();
        sql.append("Select ")
                .append("*")
                .append(" from ")
                .append("producto");

        try (Connection conn = con.getConexion(); PreparedStatement ps = conn.prepareStatement(sql.toString()); ResultSet rs = ps.executeQuery();) {

            while (rs.next()) {
                Producto p = new Producto();

                p.setId(rs.getInt("id_producto"));
                p.setCodigo_barra(rs.getString("codigo_barra"));
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getDouble("precio"));
                p.setCantidad(rs.getInt("cantidad"));
                p.setMarca(rs.getString("marca"));
                p.setContenido(rs.getString("contenido"));
                p.setImagenURL(rs.getString("imagenURL"));
                productos.add(p);
            }

        } catch (SQLException e) {
            System.out.println("Error al momento de consultar: " + e.getMessage());
        }
        return productos;
    }

    @Override
    public int insert(Producto producto
    ) {
        con = new Conexion();
        int id_obtenido_producto = 0;
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO ").append(" producto ")
                .append("(producto.codigo_barra, ")
                .append("producto.nombre, ")
                .append("producto.precio, ")
                .append("producto.cantidad, ")
                .append("producto.marca, ")
                .append("producto.contenido, ")
                .append("producto.imagenURL ")
                .append(") values (")
                .append("?,?,?,?,?,?,?")
                .append(")");

        //Llamar a la variable, la cual ya pasó por el DriverManager...
        try (Connection conn = con.getConexion(); PreparedStatement ps = conn.prepareStatement(sql.toString(), Statement.RETURN_GENERATED_KEYS);) {
            ps.setString(1, producto.getCodigo_barra());
            ps.setString(2, producto.getNombre());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getCantidad());
            ps.setString(5, producto.getMarca());
            ps.setString(6, producto.getContenido());
            ps.setString(7, producto.getImagenURL());

            ps.executeUpdate(); //Tenemos que ejecutarlo primero, para obtener el id del producto que se haya creado

            //Se aplica el generatedKeys para obtener el id al insertar un producto
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

    @Override
    public int updateQuantityAfterInsert(int id) {
        con = new Conexion();
        int cantidad = -1;
        StringBuilder sql = new StringBuilder();
        sql.append("Update ")
                .append("producto")
                .append(" set ")
                .append("cantidad = cantidad +1")
                .append(" where ")
                .append("id_producto = ?");
        String obtenerCantidad = "Select cantidad from producto where id_producto=?";
        //Se hace la consulta para actualizar la cantidad del producto, por medio de su id del producto
        try (Connection conn = con.getConexion();) {
            try (PreparedStatement ps = conn.prepareStatement(sql.toString());) {
                ps.setInt(1, id);
                ps.executeUpdate();
            }
            //Se ejecuta con respecto a la consulta para obtener la cantidad actualizada del producto
            try (PreparedStatement ps2 = conn.prepareStatement(obtenerCantidad);) {
                ps2.setInt(1, id);
                try (ResultSet rs = ps2.executeQuery()) {
                    if (rs.next()) {
                        cantidad = rs.getInt("cantidad");
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al momento de consultar: " + e.getMessage());
        }
        return cantidad;
    }

    @Override
    public Producto findByCodeProduct(String codigo_barra
    ) {
        con = new Conexion();
        Producto p = null;

        StringBuilder sql = new StringBuilder();
        sql.append("Select ")
                .append("* ")
                .append("from ")
                .append("producto ")
                .append("where ")
                .append("codigo_barra = ?");
        try (Connection conn = con.getConexion(); PreparedStatement ps = conn.prepareStatement(sql.toString());) {

            ps.setString(1, codigo_barra);

            rs = ps.executeQuery();
            if (rs.next()) {
                p = new Producto();

                p.setId(rs.getInt("id_producto"));
                p.setCodigo_barra(rs.getString("codigo_barra"));
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getDouble("precio"));
                p.setCantidad(rs.getInt("cantidad"));
                p.setMarca(rs.getString("marca"));
                p.setContenido(rs.getString("contenido"));
                p.setImagenURL(rs.getString("imagenURL"));

            }
        } catch (SQLException e) {
            System.out.println("Error al momento de consultar por codigo de barra: " + e.getMessage());
        }
        return p;
    }

    @Override
    public List<Producto> findByName(String name
    ) {
        con = new Conexion();
        List<Producto> productos = new ArrayList<>();

        StringBuilder sql = new StringBuilder();
        sql.append("Select ")
                .append("* ")
                .append("from ")
                .append("producto ")
                .append("where ")
                .append("nombre = ?");
        try (Connection conn = con.getConexion(); PreparedStatement ps = conn.prepareStatement(sql.toString());) {

            ps.setString(1, name);

            rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();

                p.setId(rs.getInt("id_producto"));
                p.setCodigo_barra(rs.getString("codigo_barra"));
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getDouble("precio"));
                p.setCantidad(rs.getInt("cantidad"));
                p.setMarca(rs.getString("marca"));
                p.setContenido(rs.getString("contenido"));
                p.setImagenURL(rs.getString("imagenURL"));
                productos.add(p);
            }
        } catch (SQLException e) {
            System.out.println("Error al momento de consultar por nombre: " + e.getMessage());
        }
        return productos;
    }

    @Override
    public List<Producto> findByBrand(String brand
    ) {
        con = new Conexion();
        List<Producto> productos = new ArrayList<>();

        StringBuilder sql = new StringBuilder();
        sql.append("Select ")
                .append("* ")
                .append("from ")
                .append("producto ")
                .append("where ")
                .append("marca = ?");
        try (Connection conn = con.getConexion(); PreparedStatement ps = conn.prepareStatement(sql.toString());) {

            ps.setString(1, brand);

            rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();

                p.setId(rs.getInt("id_producto"));
                p.setCodigo_barra(rs.getString("codigo_barra"));
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getDouble("precio"));
                p.setCantidad(rs.getInt("cantidad"));
                p.setMarca(rs.getString("marca"));
                p.setContenido(rs.getString("contenido"));
                p.setImagenURL(rs.getString("imagenURL"));
                productos.add(p);
            }
        } catch (SQLException e) {
            System.out.println("Error al momento de consultar por marca: " + e.getMessage());
        }
        return productos;
    }

    @Override
    public List<Producto> findByContent(String content
    ) {
        con = new Conexion();
        List<Producto> productos = new ArrayList<>();

        StringBuilder sql = new StringBuilder();
        sql.append("Select ")
                .append("* ")
                .append("from ")
                .append("producto ")
                .append("where ")
                .append("contenido = ?");
        try (Connection conn = con.getConexion(); PreparedStatement ps = conn.prepareStatement(sql.toString());) {

            ps.setString(1, content);

            rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();

                p.setId(rs.getInt("id_producto"));
                p.setCodigo_barra(rs.getString("codigo_barra"));
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getDouble("precio"));
                p.setCantidad(rs.getInt("cantidad"));
                p.setMarca(rs.getString("marca"));
                p.setContenido(rs.getString("contenido"));
                p.setImagenURL(rs.getString("imagenURL"));
                productos.add(p);
            }
        } catch (SQLException e) {
            System.out.println("Error al momento de consultar por contenido: " + e.getMessage());
        }
        return productos;
    }

    @Override
    public List<Producto> findByPrice(String price
    ) {
        con = new Conexion();
        List<Producto> productos = new ArrayList<>();

        StringBuilder sql = new StringBuilder();
        sql.append("Select ")
                .append("* ")
                .append("from ")
                .append("producto ")
                .append("where ")
                .append("precio = ?");
        try (Connection conn = con.getConexion(); PreparedStatement ps = conn.prepareStatement(sql.toString());) {

            ps.setString(1, price);

            rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();

                p.setId(rs.getInt("id_producto"));
                p.setCodigo_barra(rs.getString("codigo_barra"));
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getDouble("precio"));
                p.setCantidad(rs.getInt("cantidad"));
                p.setMarca(rs.getString("marca"));
                p.setContenido(rs.getString("contenido"));
                p.setImagenURL(rs.getString("imagenURL"));
                productos.add(p);
            }
        } catch (SQLException e) {
            System.out.println("Error al momento de consultar por precio: " + e.getMessage());
        }
        return productos;
    }

    @Override
    public List<Producto> findByQuantity(String quantity
    ) {
        con = new Conexion();
        List<Producto> productos = new ArrayList<>();

        StringBuilder sql = new StringBuilder();
        sql.append("Select ")
                .append("* ")
                .append("from ")
                .append("producto ")
                .append("where ")
                .append("cantidad = ?");
        try (Connection conn = con.getConexion(); PreparedStatement ps = conn.prepareStatement(sql.toString());) {

            ps.setString(1, quantity);

            rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();

                p.setId(rs.getInt("id_producto"));
                p.setCodigo_barra(rs.getString("codigo_barra"));
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getDouble("precio"));
                p.setCantidad(rs.getInt("cantidad"));
                p.setMarca(rs.getString("marca"));
                p.setContenido(rs.getString("contenido"));
                p.setImagenURL(rs.getString("imagenURL"));
                productos.add(p);
            }
        } catch (SQLException e) {
            System.out.println("Error al momento de consultar por cantidad: " + e.getMessage());
        }
        return productos;
    }

    @Override
    public boolean deleteByCodeBar(String codigo_barra
    ) {
        con = new Conexion();
        boolean estado = false;
        StringBuilder sql = new StringBuilder();
        sql.append("Delete ")
                .append("from ")
                .append("producto ")
                .append("where ")
                .append("codigo_barra = ?");
        try (Connection conn = con.getConexion(); PreparedStatement ps = conn.prepareStatement(sql.toString());) {

            ps.setString(1, codigo_barra);
            ps.executeUpdate();
            estado = true;
        } catch (SQLException e) {
            System.out.println("Error al eliminar producto, por el codigo de barra: " + e.getMessage());
        }
        return estado;
    }

    @Override
    public boolean delete(int id
    ) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Producto updateByCodeBar(Producto producto) {
        con = new Conexion();
        Producto p = null;

        StringBuilder sb = new StringBuilder();
        sb.append("Update producto set ")
                .append("nombre=?,")
                .append("marca=?,")
                .append("contenido=?,")
                .append("precio=?,")
                .append("cantidad=? ")
                .append("where codigo_barra=?;");

        try {
            Connection conn = con.getConexion();
            PreparedStatement ps = conn.prepareStatement(sb.toString());
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getMarca());
            ps.setString(3, producto.getContenido());
            ps.setDouble(4, producto.getPrecio());
            ps.setInt(5, producto.getCantidad());
            ps.setString(6, producto.getCodigo_barra());

            ps.executeUpdate();

            System.out.println("Producto actualizado");
        } catch (SQLException e) {
            System.out.println("Error al actualizar producto: " + e.getMessage());
        }

        return null;
    }

    @Override
    public Producto update(Producto id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
