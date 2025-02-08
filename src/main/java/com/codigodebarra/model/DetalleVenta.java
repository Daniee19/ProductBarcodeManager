package com.codigodebarra.model;

public class DetalleVenta {

    int idDetalle, idVenta, idProducto, cant;
    double impSnIgvOExo, igv, impMasIgv, descProdu, subtotCnDesc;

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

    public double getImpSnIgvOExo() {
        return impSnIgvOExo;
    }

    public void setImpSnIgvOExo(double impSnIgvOExo) {
        this.impSnIgvOExo = impSnIgvOExo;
    }

    public double getImpMasIgv() {
        return impMasIgv;
    }

    public void setImpMasIgv(double impMasIgv) {
        this.impMasIgv = impMasIgv;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
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
