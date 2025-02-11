package com.codigodebarra.main;

import com.codigodebarra.controller.LoginController;
//import com.codigodebarra.controller.ProductoController;
//import com.codigodebarra.view.JEscanear;
import com.codigodebarra.view.JLogin;

public class Main {

    public static void main(String[] args) {
        JLogin vistaLogin = new JLogin();
        LoginController lcontroller = new LoginController(vistaLogin);
//        new Thread(() -> {
//            Runtime runtime = Runtime.getRuntime();
//            while (true) {
//                long memoriaUsada = (runtime.totalMemory() - runtime.freeMemory()) / 1024 / 1024; // En MB
//                System.out.println("Memoria usada: " + memoriaUsada + " MB");
//
//                try {
//                    Thread.sleep(2000); // Actualiza cada 2 segundos
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
    }
}
