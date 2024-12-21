package com.codigodebarra.config;

import java.sql.*;

public class Conexion {

    Connection con;

    String url = "jdbc:mysql://localhost:3306/tiendita";
    String driver = "com.mysql.cj.jdbc.Driver";
    String user = "root";
    String pass = "admin";

    public Conexion() {
        con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, pass);
            if (con != null) {
                System.out.println("Conexión establecida.");
            }
        } catch (Exception e) {
            System.out.println("Sucedió un error en la conexión a la base de datos: " + e.getMessage());
        }
    }

    public Connection getConexion() {
        return con; //Es necesario obtener la variable con, para poder utilizarlo en el DAO.

    }
}
