package com.codigodebarra.model;

public class DetalleVenta {

    int idDetalle, idVenta, idProducto, cant;
    double impSnIgv, igv, impCnIgv, descProdu, subtotCnDesc;

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public double getImpSnIgv() {
        return impSnIgv;
    }

    public void setImpSnIgv(double impSnIgv) {
        this.impSnIgv = impSnIgv;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getImpCnIgv() {
        return impCnIgv;
    }

    public void setImpCnIgv(double impCnIgv) {
        this.impCnIgv = impCnIgv;
    }

    public double getDescProdu() {
        return descProdu;
    }

    public void setDescProdu(double descProdu) {
        this.descProdu = descProdu;
    }

    public double getSubtotCnDesc() {
        return subtotCnDesc;
    }

    public void setSubtotCnDesc(double subtotCnDesc) {
        this.subtotCnDesc = subtotCnDesc;
    }

}
