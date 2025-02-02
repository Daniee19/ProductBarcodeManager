package com.codigodebarra.model;

import java.sql.Timestamp;

public class Venta {

    int idVenta, idUsuario;
    double impTotSnIgv, impTotCnIgv, descTot, igvTotal, total;
    String observacion;
    Timestamp fechaVenta;

    enum metPago {
        Efectivo, Tarjeta, Yape, Pli, Transaccion, Fiado;
    }

    enum tipoVenta {
        Boleta, Factura;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public double getImpTotSnIgv() {
        return impTotSnIgv;
    }

    public void setImpTotSnIgv(double impTotSnIgv) {
        this.impTotSnIgv = impTotSnIgv;
    }

    public double getImpTotCnIgv() {
        return impTotCnIgv;
    }

    public void setImpTotCnIgv(double impTotCnIgv) {
        this.impTotCnIgv = impTotCnIgv;
    }

    public double getDescTot() {
        return descTot;
    }

    public void setDescTot(double descTot) {
        this.descTot = descTot;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Timestamp getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Timestamp fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getIgvTotal() {
        return igvTotal;
    }

    public void setIgvTotal(double igvTotal) {
        this.igvTotal = igvTotal;
    }

}
