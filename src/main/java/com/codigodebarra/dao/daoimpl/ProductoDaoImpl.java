package com.codigodebarra.dao.daoimpl;

import com.codigodebarra.config.Conexion;
import com.codigodebarra.dao.ProductoDao;
import com.codigodebarra.model.Producto;
import com.codigodebarra.model.Usuario;
import java.awt.Desktop;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ProductoDaoImpl implements ProductoDao {

    Conexion con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Usuario usuario;
//    public ProductoDaoImpl() {
//        con = new Conexion();
//    }

    public ProductoDaoImpl(Usuario usuario) {
        this.usuario = usuario;
    }

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
    public JasperPrint reportAllProducts(int idUsuario, String tipoReporte) {
        con = new Conexion();
        Connection conn = con.getConexion();
        //Obtener el archivo, de la siguiente ruta
        if (tipoReporte.equalsIgnoreCase("pdf")) {
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
                Map<String, Object> parametro = new HashMap<>();
                parametro.put("idUsuario", idUsuario);

                JasperPrint jp = JasperFillManager.fillReport(jr, parametro, conn);

                return jp;
            } catch (FileNotFoundException e) {
                System.out.println("Error en realizar el reporte de todos los productos: " + e.getMessage());
            } catch (JRException ex) {
                Logger.getLogger(ProductoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (tipoReporte.equalsIgnoreCase("excel")) {

            Workbook wb = new XSSFWorkbook();
            Sheet sheet = wb.createSheet("ReporteProductos");

            //Crear titulo
            Row row = sheet.createRow(1);
            Cell cTitulo1 = row.createCell(1);
            cTitulo1.setCellValue("REPORTE PRODUCTOS");
            CellStyle cs = diseniosExcel(wb, IndexedColors.BLACK.getIndex(), IndexedColors.WHITE.getIndex(), 14);

            cTitulo1.setCellStyle(cs);

            Cell cNombNegocio = row.createCell(2); //Numero de columna
            cNombNegocio.setCellValue("LA CANASTA");
            cs = diseniosExcel(wb, IndexedColors.GREY_50_PERCENT.getIndex(), IndexedColors.WHITE.getIndex(), 14);
            cNombNegocio.setCellStyle(cs);

            /**
             * Crear fila y celda de titulos de las columnas de la tabla.
             * Adicionalmente se realizó la creación de la celda de fecha.
             */
            cs = diseniosExcel(wb, IndexedColors.BLACK.getIndex(), IndexedColors.WHITE.getIndex(), 11);
            row = sheet.createRow(2);
            Cell cNCol8 = row.createCell(8);
            cNCol8.setCellValue("Fecha");
            cNCol8.setCellStyle(cs);

            row = sheet.createRow(3);
            /**
             * Crear la fila del trabajador.
             */
            row.createCell(1).setCellValue(String.format("%s, %s (%s)", usuario.getApellido(), usuario.getNombre(), usuario.getRol()));
            //Fin del crear la fila del trabajador
            row.createCell(8).setCellValue(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/YYYY")));
            sheet.autoSizeColumn(1); //Ajustar el contenido de la columna (2)
            sheet.autoSizeColumn(8); //Ajustar el contenido de la columna (9)

            //Nombres de columnas de la tabla
            row = sheet.createRow(5);

            String[] info = {"Nombre", "Marca", "Contenido", "Precio", "Stock"};

            cs = diseniosExcel(wb, IndexedColors.BLACK.getIndex(), IndexedColors.WHITE.getIndex(), 11);
            for (int i = 1; i < 6; i++) {
                Cell cNCol = row.createCell(i);
                cNCol.setCellStyle(cs);
                cNCol.setCellValue(info[i - 1]);
            }

            //Agregar datos a las filas
            ProductoDao p = new ProductoDaoImpl(usuario);
            List<Producto> productos = p.selectAll();

            for (int i = 0; i < productos.size(); i++) {
                row = sheet.createRow(i + 6);
                row.createCell(1).setCellValue(productos.get(i).getNombre());
                row.createCell(2).setCellValue(productos.get(i).getMarca());
                row.createCell(3).setCellValue(productos.get(i).getCont());
                row.createCell(4).setCellValue(String.valueOf(productos.get(i).getPrecio()));
                row.createCell(5).setCellValue(productos.get(i).getStock());
            }
            /**
             * Ajustar el tamaño de las celdas desde 0 a 5. Por cierto, para
             * conocimiento, las celdas tienen un size width por default como
             * minimo, lo cual hace que cuando haya menos texto no se note el
             * cambio en el ajuste del contenido.
             */
            for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
                sheet.autoSizeColumn(i + 1);
            }

            //Usar JfileChooser para que el usuario pueda escoger donde guardar el archivo
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Guardar archivo excel");
            fileChooser.setSelectedFile(new File("reporteProducto.xlsx")); //Establecer nombre por defecto

            //Filtrar por extensión
            fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.addChoosableFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Archivos excel", "xlsx"));

            //Mostrar el resultado para guardar
            int resultado = fileChooser.showSaveDialog(null);

            //Si se da click en guardar. (Suponiendo que se escogió o no un lugar en específico)
            if (resultado == JFileChooser.APPROVE_OPTION) {
                File archivoSeleccionado = fileChooser.getSelectedFile().getAbsoluteFile();

                //Verificar si el archio tiene el .xlsx o no
                if (!archivoSeleccionado.getName().endsWith(".xlsx")) {
                    archivoSeleccionado = new File(archivoSeleccionado.getAbsolutePath() + ".xlsx");
                }
                int contador = 1;
                String nombreBase = archivoSeleccionado.getAbsolutePath().substring(0, archivoSeleccionado.getAbsolutePath().lastIndexOf(".")); // Obtener el nombre base sin la extensión

                String extension = ".xlsx";

                //Verificar si el nombre del archivo existe para diferenciarlo con un numero del contador
                while (archivoSeleccionado.exists()) {
                    String nuevoNombre = nombreBase + " (" + contador + ")" + extension;
                    archivoSeleccionado = new File(nuevoNombre);
                    contador++;
                }

                try (FileOutputStream fileOut = new FileOutputStream(archivoSeleccionado.getAbsolutePath());) {
                    //Guardar archivo
                    wb.write(fileOut);
                    wb.close();
                    JOptionPane.showMessageDialog(null, "El archivo Excel se ha generado y guardado correctamente.");
                    Desktop.getDesktop().open(archivoSeleccionado);

                } catch (IOException ex) {
                    System.out.println("Error en la generación del excel: " + ex.getMessage());
                }

            } else {
                JOptionPane.showMessageDialog(null, "La operación ha sido cancelada");
            }

        }

        return null;
    }

    public CellStyle diseniosExcel(Workbook wb, short colorFondo, short colorTexto, int tamanioFont) {
        //Crear estilo de celda
        CellStyle cs = wb.createCellStyle();

        //Cambiar el color de fondo
        cs.setFillForegroundColor(colorFondo);
        cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        // ✅ PONER NEGRITA AL TEXTO
        Font font = wb.createFont();
        font.setBold(true); // Activar negrita
        font.setFontHeightInPoints((short) tamanioFont); // Cambiar tamaño del texto
        font.setColor(colorTexto); // Texto en rojo

        cs.setFont(font);
        return cs;
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
                .append("stock, ")
                .append("igvAplicable ")
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
                p.setIgvAplicable(rs.getBoolean("igvAplicable"));

            }
        } catch (SQLException e) {
            System.out.println("Error al momento de consultar por contenido: " + e.getMessage());
        }
        return p;
    }
}
