package com.codigodebarra.dao;

import com.codigodebarra.model.CodigoBarra;

public interface CodigoBarraDao extends Dao<CodigoBarra> {
    public CodigoBarra selectByType(String tipo);
}
