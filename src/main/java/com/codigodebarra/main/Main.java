package com.codigodebarra.main;

import com.codigodebarra.controller.ProductoController;
import com.codigodebarra.view.JInterfazPrincipal;

public class Main {

    public static void main(String[] args) {
        JInterfazPrincipal vista = new JInterfazPrincipal();
        ProductoController pcontroller = new ProductoController(vista);
    }
}
