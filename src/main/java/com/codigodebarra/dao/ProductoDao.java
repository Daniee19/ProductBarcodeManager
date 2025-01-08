package com.codigodebarra.dao;

import com.codigodebarra.model.Producto;

public interface ProductoDao extends Dao<Producto> {
    public boolean selectByCodeProduct(String codigo_barra);
}
