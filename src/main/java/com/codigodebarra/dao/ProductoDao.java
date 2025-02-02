package com.codigodebarra.dao;

import com.codigodebarra.model.Producto;
import java.util.List;
import net.sf.jasperreports.engine.JasperPrint;

public interface ProductoDao extends Dao<Producto> {

    public Producto findByCodeProduct(String barcode);

    public List<Producto> findByName(String name);

    public List<Producto> findByBrand(String brand);

    public List<Producto> findByContent(String content);

    public List<Producto> findByPrice(String price);

    public List<Producto> findByQuantity(String quantity);

    public int updateQuantityAfterInsert(int id);

    public Producto updateByCodeBar(Producto producto);

    public boolean deleteByCodeBar(String codigo_barra);

    public JasperPrint reportAllProducts();

    public Producto findSpecificByNameBrandContent(String name, String brand, String content);
}
