package com.codigodebarra.dao.daoimpl;

import com.codigodebarra.config.Conexion;
import com.codigodebarra.dao.ProductoDao;
import com.codigodebarra.model.Producto;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

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
                .append("idProducto = ?");
        try (Connection conn = con.getConexion(); PreparedStatement ps = conn.prepareStatement(sql.toString());) {

            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                p = new Producto();

                p.setIdProducto(rs.getInt("idProducto"));
                p.setCodBarra(rs.getString("codigoBarra"));
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getDouble("precio"));
                p.setStock(rs.getInt("stock"));
                p.setMarca(rs.getString("marca"));
                p.setCont(rs.getString("contenido"));
                p.setImagenUrl(rs.getString("imagenUrl"));
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

                p.setIdProducto(rs.getInt("idProducto"));
                p.setCodBarra(rs.getString("codigoBarra"));
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getDouble("precio"));
                p.setStock(rs.getInt("stock"));
                p.setMarca(rs.getString("marca"));
                p.setCont(rs.getString("contenido"));
                p.setImagenUrl(rs.getString("imagenUrl"));
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
                .append("(producto.codigoBarra, ")
                .append("producto.nombre, ")
                .append("producto.precio, ")
                .append("producto.stock, ")
                .append("producto.marca, ")
                .append("producto.contenido, ")
                .append("producto.imagenUrl ")
                .append(") values (")
                .append("?,?,?,?,?,?,?")
                .append(")");

        //Llamar a la variable, la cual ya pasó por el DriverManager...
        try (Connection conn = con.getConexion(); PreparedStatement ps = conn.prepareStatement(sql.toString(), Statement.RETURN_GENERATED_KEYS);) {
            ps.setString(1, producto.getCodBarra());
            ps.setString(2, producto.getNombre());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getStock());
            ps.setString(5, producto.getMarca());
            ps.setString(6, producto.getCont());
            ps.setString(7, producto.getImagenUrl());

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
        int stock = -1;
        StringBuilder sql = new StringBuilder();
        sql.append("Update ")
                .append("producto")
                .append(" set ")
                .append("stock = stock +1")
                .append(" where ")
                .append("idProducto = ?");
        String obtenerCantidad = "Select stock from producto where idProducto=?";
        //Se hace la consulta para actualizar la stock del producto, por medio de su id del producto
        try (Connection conn = con.getConexion();) {
            try (PreparedStatement ps = conn.prepareStatement(sql.toString());) {
                ps.setInt(1, id);
                ps.executeUpdate();
            }
            //Se ejecuta con respecto a la consulta para obtener la stock actualizada del producto
            try (PreparedStatement ps2 = conn.prepareStatement(obtenerCantidad);) {
                ps2.setInt(1, id);
                try (ResultSet rs = ps2.executeQuery()) {
                    if (rs.next()) {
                        stock = rs.getInt("stock");
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al momento de actualizar despues de haber insertado un nuevo producto: " + e.getMessage());
        }
        return stock;
    }

    @Override
    public Producto findByCodeProduct(String codigoBarra
    ) {
        con = new Conexion();
        Producto p = null;

        StringBuilder sql = new StringBuilder();
        sql.append("Select ")
                .append("* ")
                .append("from ")
                .append("producto ")
                .append("where ")
                .append("codigoBarra = ?");
        try (Connection conn = con.getConexion(); PreparedStatement ps = conn.prepareStatement(sql.toString());) {

            ps.setString(1, codigoBarra);

            rs = ps.executeQuery();
            if (rs.next()) {
                p = new Producto();

                p.setIdProducto(rs.getInt("idProducto"));
                p.setCodBarra(rs.getString("codigoBarra"));
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getDouble("precio"));
                p.setStock(rs.getInt("stock"));
                p.setMarca(rs.getString("marca"));
                p.setCont(rs.getString("contenido"));
                p.setImagenUrl(rs.getString("imagenUrl"));

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

                p.setIdProducto(rs.getInt("idProducto"));
                p.setCodBarra(rs.getString("codigoBarra"));
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getDouble("precio"));
                p.setStock(rs.getInt("stock"));
                p.setMarca(rs.getString("marca"));
                p.setCont(rs.getString("contenido"));
                p.setImagenUrl(rs.getString("imagenUrl"));
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

                p.setIdProducto(rs.getInt("idProducto"));
                p.setCodBarra(rs.getString("codigoBarra"));
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getDouble("precio"));
                p.setStock(rs.getInt("stock"));
                p.setMarca(rs.getString("marca"));
                p.setCont(rs.getString("contenido"));
                p.setImagenUrl(rs.getString("imagenUrl"));
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

                p.setIdProducto(rs.getInt("idProducto"));
                p.setCodBarra(rs.getString("codigoBarra"));
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getDouble("precio"));
                p.setStock(rs.getInt("stock"));
                p.setMarca(rs.getString("marca"));
                p.setCont(rs.getString("contenido"));
                p.setImagenUrl(rs.getString("imagenUrl"));

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

                p.setIdProducto(rs.getInt("idProducto"));
                p.setCodBarra(rs.getString("codigoBarra"));
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getDouble("precio"));
                p.setStock(rs.getInt("stock"));
                p.setMarca(rs.getString("marca"));
                p.setCont(rs.getString("contenido"));
                p.setImagenUrl(rs.getString("imagenUrl"));
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
                .append("stock = ?");
        try (Connection conn = con.getConexion(); PreparedStatement ps = conn.prepareStatement(sql.toString());) {

            ps.setString(1, quantity);

            rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();

                p.setIdProducto(rs.getInt("idProducto"));
                p.setCodBarra(rs.getString("codigoBarra"));
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getDouble("precio"));
                p.setStock(rs.getInt("stock"));
                p.setMarca(rs.getString("marca"));
                p.setCont(rs.getString("contenido"));
                p.setImagenUrl(rs.getString("imagenUrl"));
                productos.add(p);
            }
        } catch (SQLException e) {
            System.out.println("Error al momento de consultar por stock: " + e.getMessage());
        }
        return productos;
    }

    @Override
    public boolean deleteByCodeBar(String codigoBarra
    ) {
        con = new Conexion();
        boolean estado = false;
        StringBuilder sql = new StringBuilder();
        sql.append("Delete ")
                .append("from ")
                .append("producto ")
                .append("where ")
                .append("codigoBarra = ?");
        try (Connection conn = con.getConexion(); PreparedStatement ps = conn.prepareStatement(sql.toString());) {

            ps.setString(1, codigoBarra);
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
                .append("stock=? ")
                .append("where codigoBarra=?;");

        try {
            Connection conn = con.getConexion();
            PreparedStatement ps = conn.prepareStatement(sb.toString());
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getMarca());
            ps.setString(3, producto.getCont());
            ps.setDouble(4, producto.getPrecio());
            ps.setInt(5, producto.getStock());
            ps.setString(6, producto.getCodBarra());

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

    @Override
    public JasperPrint reportAllProducts() {
        con = new Conexion();
        Connection conn = con.getConexion();
        //Obtener el archivo, de la siguiente ruta
        File reporte = new File(getClass().getResource("/report/Producto.jasper").getFile());

        if (!reporte.exists()) {
            return null;
        }

        //Generar un archivo inputStream
        try {
            InputStream is = new BufferedInputStream(new FileInputStream(reporte.getAbsolutePath()));

            if (is == null) {
                System.out.println("El archivo reporte.jasper no se encuentra en el classpath.");
            } else {
                System.out.println("El archivo reporte.jasper fue encontrado correctamente.");
            }
            //Convertimos el archivo obtenido por medio del BufferedInputStream
            JasperReport jr = (JasperReport) JRLoader.loadObject(is);

            JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);

            return jp;
        } catch (FileNotFoundException e) {
            System.out.println("Error en realizar el reporte de todos los productos: " + e.getMessage());
        } catch (JRException ex) {
            Logger.getLogger(ProductoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    @Override
    public Producto findSpecificByNameBrandContent(String name, String brand, String content) {
        con = new Conexion();
        Producto p = null;
        ResultSet rs = null;
        StringBuilder sql = new StringBuilder();
        sql.append("Select ")
                .append("codigoBarra, ")
                .append("precio, ")
                .append("stock ")
                .append("from ")
                .append("producto ")
                .append("where ")
                .append("nombre = ? ")
                .append("AND marca=? ")
                .append("AND contenido=?");
        try (Connection conn = con.getConexion(); PreparedStatement ps = conn.prepareStatement(sql.toString());) {

            ps.setString(1, name);
            ps.setString(2, brand);
            ps.setString(3, content);
            rs = ps.executeQuery();
            if (rs.next()) {
                p = new Producto();
                System.out.println("Se enconttró el producto");
                p.setCodBarra(rs.getString("codigoBarra"));
                p.setPrecio(rs.getDouble("precio"));
                p.setStock(rs.getInt("stock"));

            }
        } catch (SQLException e) {
            System.out.println("Error al momento de consultar por contenido: " + e.getMessage());
        }
        return p;
    }
}
