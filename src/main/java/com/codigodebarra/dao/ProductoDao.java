package com.codigodebarra.dao;

import com.codigodebarra.model.Producto;

public interface ProductoDao extends Dao<Producto> {
    public Producto selectByCodeProduct(String codigo_barra);
    public boolean updateQuantityAfterInsert(int id);
}
