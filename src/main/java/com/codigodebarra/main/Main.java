package com.codigodebarra.main;

import com.codigodebarra.controller.LoginController;
//import com.codigodebarra.controller.ProductoController;
//import com.codigodebarra.view.JEscanear;
import com.codigodebarra.view.JLogin;

public class Main {

    public static void main(String[] args) {
//        JEscanear vista = new JEscanear();
//        ProductoController pcontroller = new ProductoController(vista);
        JLogin vistaLogin = new JLogin();
        LoginController lcontroller = new LoginController(vistaLogin);
    }
}
