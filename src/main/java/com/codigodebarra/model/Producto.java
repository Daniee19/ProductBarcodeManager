package com.codigodebarra.model;

public class Producto {

    int id;
    CodigoBarra id_barra;
    String nombre;
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

}
