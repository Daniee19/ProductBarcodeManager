package com.codigodebarra.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class Cache {

    JSONObject cache_existente = new JSONObject();
    public static final String CACHE_FILE = "cache.json";
    Map<String, JSONObject> cache = new HashMap<>();

    public void guardarCacheEnArchivo(Map<String, JSONObject> cache) {
        //Es un JSONObject, el acepta pares clave valor.

        //JSONObject cache_existente = leerCacheDeArchivo(); //Leer datos existentes
        //Añadir nuevos datos al JSON existente
        /**
         * El .entrySet, lo que hace es devolver todos los pares Clave, Valor.
         * Recordar: El key es el código de barra del producto, y el valor es el
         * JSONObject del producto (El valor encontrado en formato JSON).
         */
        //¿Porque uso el for? - Porque como recorrerá todo, almacenará también el último valor que se acaba de ingresar
        //Los valores duplicados se sobreescribirán
        //Seleccionamos todo lo que hay, pero supuestamente solo hay un valor
        for (Map.Entry<String, JSONObject> entry : cache.entrySet()) {
            //Lo que hace es agregar todos los pares Clave, Valor, al JSONObject
            cache_existente.put(entry.getKey(), entry.getValue());
        }

        //Escribir el JSON actualizado en el archivo
        try (FileWriter file = new FileWriter(CACHE_FILE)) {
            file.write(cache_existente.toString(4));
        } catch (IOException e) {
            System.out.println("Error al guardar el caché: " + e.getMessage());
        }

    } //FIN DEL MÉTODO GUARDAR

    /*public JSONObject leerCacheDeArchivo() {
        //Comprobar si existe o no el archivo.
        File file = new File(CACHE_FILE);

        if (!file.exists()) {
            return new JSONObject();
        }
        //El BufferedReader permitirá leer archivos grandes
        //Lee todo el contenido que existe en el archivo del CACHE_FILE
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            StringBuilder contenido = new StringBuilder();
            String linea;
            while ((linea = reader.readLine()) != null) {
                contenido.append(linea);
            }

            /**
             * Lo que hace es retornar el JSON de todo el archivo que estaba en
             * el CACHE_FILE.
     *//*
            return new JSONObject(contenido.toString());
        } catch (IOException e) {
            System.out.println("Error al leer el caché: " + e.getMessage());
            return new JSONObject();
        }
    }
     */
    public Map<String, JSONObject> cargarCacheDesdeArchivo() {

        try (BufferedReader reader = new BufferedReader(new FileReader(CACHE_FILE))) {
            StringBuilder sb = new StringBuilder();
            String linea;
            while ((linea = reader.readLine()) != null) {
                sb.append(linea);
            }

            JSONObject jsonCache = new JSONObject(sb.toString());
            //Hasta aquí hemos recorrido todos los elementos del archivo JSON

            //Ahora se va a llenar la variable cache con los datos leídos
            for (String key : jsonCache.keySet()) {
                cache.put(key, jsonCache.getJSONObject(key));
            }
        } catch (IOException e) {
            System.out.println("Error al cargar el caché: " + e.getMessage());
        }
        return cache;
    } //FIN DEL MÉTODO CARGAR

}
