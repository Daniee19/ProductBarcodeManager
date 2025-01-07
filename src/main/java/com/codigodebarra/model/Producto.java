package com.codigodebarra.model;

public class Producto {

    int id;
    CodigoBarra id_barra;
    String nombre;
    String compania;
    String cantidad_contenida;
    String imagenURL;
    double precio;
    int cantidad;

    public Producto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CodigoBarra getId_barra() {
        return id_barra;
    }

    public void setId_barra(CodigoBarra id_barra) {
        this.id_barra = id_barra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getCantidad_contenida() {
        return cantidad_contenida;
    }

    public void setCantidad_contenida(String cantidad_contenida) {
        this.cantidad_contenida = cantidad_contenida;
    }

    public String getImagenURL() {
        return imagenURL;
    }

    public void setImagenURL(String imagenURL) {
        this.imagenURL = imagenURL;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", id_barra=" + id_barra + ", nombre=" + nombre + ", compania=" + compania + ", cantidad_contenida=" + cantidad_contenida + ", imagenURL=" + imagenURL + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }

}
