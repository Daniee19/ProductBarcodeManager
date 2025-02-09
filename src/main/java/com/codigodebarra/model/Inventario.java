package com.codigodebarra.model;

public class Inventario {

    private int idInventario;
    private Producto idProducto;
    private String ubicacion;
    private int stockProdu;
    private int stockMinimo;

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getStockProdu() {
        return stockProdu;
    }

    public void setStockProdu(int stockProdu) {
        this.stockProdu = stockProdu;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

}
