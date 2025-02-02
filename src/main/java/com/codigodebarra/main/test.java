/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codigodebarra.main;

import org.mindrot.jbcrypt.BCrypt;

public class test {

    public static void main(String[] args) {
        String contrasenia = "hola que tal";

        String hashedPassword = BCrypt.hashpw(contrasenia, BCrypt.gensalt());

        System.out.println("Contraseña original: " + contrasenia);
        System.out.println("Contraseña cifrada: " + hashedPassword);

    }
}
