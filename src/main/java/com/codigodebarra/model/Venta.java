package com.codigodebarra.model;

import java.sql.Timestamp;

public class Venta {

    int idVenta, idUsuario;
    double impTotSnIgvOExo, impTotMasIgv, descTot, igvTotal, total;
    String observacion, metPago, tipoVenta;
    Timestamp fechaVenta;

    public String getMetPago() {
        return metPago;
    }

    public void setMetPago(String metPago) {
        this.metPago = metPago;
    }

    public String getTipoVenta() {
        return tipoVenta;
    }

    public void setTipoVenta(String tipoVenta) {
        this.tipoVenta = tipoVenta;
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

    public double getImpTotSnIgvOExo() {
        return impTotSnIgvOExo;
    }

    public void setImpTotSnIgvOExo(double impTotSnIgvOExo) {
        this.impTotSnIgvOExo = impTotSnIgvOExo;
    }

    public double getImpTotMasIgv() {
        return impTotMasIgv;
    }

    public void setImpTotMasIgv(double impTotMasIgv) {
        this.impTotMasIgv = impTotMasIgv;
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
