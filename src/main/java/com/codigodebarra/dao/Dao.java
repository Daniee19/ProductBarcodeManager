package com.codigodebarra.dao;

import java.util.List;

public interface Dao<T> {

    public T select(int id);

    public List<T> selectAll();

    public boolean insert(T producto);

}
