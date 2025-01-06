package com.codigodebarra.controller;

import com.codigodebarra.dao.CodigoBarraDao;
import com.codigodebarra.dao.ProductoDao;
import com.codigodebarra.dao.daoimpl.CodigoBarraDaoImpl;
import com.codigodebarra.dao.daoimpl.ProductoDaoImpl;
import com.codigodebarra.model.CodigoBarra;
import com.codigodebarra.model.Producto;
import com.codigodebarra.util.ApiProductos;
import com.codigodebarra.util.Barras;
import com.codigodebarra.view.JEscanear;
import com.codigodebarra.view.JInterfazPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;

public class ProductoController implements ActionListener {

    JInterfazPrincipal view;

    JEscanear vista;
    ProductoDao productoDaoImpl;
    CodigoBarraDaoImpl codigoBarraDaoImpl;
    ApiProductos api = new ApiProductos();

    public ProductoController(JEscanear vista) {
        this.vista = vista;
        this.vista.setVisible(true);
        this.vista.setLocationRelativeTo(null);

        productoDaoImpl = new ProductoDaoImpl();
        codigoBarraDaoImpl = new CodigoBarraDaoImpl();
        acciones();
        //mostrar_elementos_cb();
    }

    private void mostrar_elementos_cb() {

        List<CodigoBarra> codigos = codigoBarraDaoImpl.selectAll();

        for (CodigoBarra cs : codigos) {
            view.getCb_tipo_barra().addItem(cs.getTipo());
        }
    }

    private void acciones() {
//        view.getBtnCrearProducto().addActionListener(this);
//        view.getCb_tipo_barra().addActionListener(this);
//        view.getBtnObtenerPDF().addActionListener(this);

        vista.getBtnOkEscanear().addActionListener(this);
    }

    private void crearProducto() {
        JOptionPane.showMessageDialog(null, "Se va a crear el producto. No te rindas");
        Producto p = new Producto();
        CodigoBarra cb = new CodigoBarra();

        CodigoBarraDao daoCodigo = new CodigoBarraDaoImpl();
        //Nombre del tipo de código de barra con el visible
        CodigoBarra objetoCodigo = daoCodigo.selectByType(view.getCb_tipo_barra().getSelectedItem().toString());

        cb.setId_barra(objetoCodigo.getId_barra());

        p.setId_barra(cb);
        p.setNombre(view.getTxtNombreProducto().getText());
        p.setPrecio(Double.parseDouble(view.getTxtPrecioProducto().getText()));
        p.setCantidad(Integer.parseInt(view.getTxtCantidadProducto().getText()));

        productoDaoImpl.insert(p);
        //No 
    }

    public void obtenerPDF() {
        Barras ba = new Barras();
        List<Producto> productos = productoDaoImpl.selectAll();
        System.out.println(productos);
        for (Producto ps : productos) {
            ba.generarCodBarras(ps.getId_barra().getNombre_barra(), ps.getId_barra().getTipo());
        }

    }

    public void EscanearCodigo() {

        boolean a = api.consumirApi(vista.getTxtCodigoEscanear().getText());
        if (a) {

            System.out.println("Funciono la api");
        } else {
            System.out.println("No funciono la api");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.getBtnOkEscanear()) {
            EscanearCodigo();
        }
    }

}
