package com.codigodebarra.util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class Cache {

    ObjectMapper om = new ObjectMapper();
    JSONObject cache_existente = new JSONObject();
    public static final String CACHE_FILE = "cache.json";
    Map<String, JsonNode> cache = new HashMap<>();

    public void guardarCacheEnArchivo(Map<String, JsonNode> cache) {
        //Es un JSONObject, el acepta pares clave valor.

        /**
         * El .entrySet, lo que hace es devolver todos los pares Clave, Valor.
         * Pero no es porque lo haga de la nada, no. Sino es que cache es una
         * variable tipo map que previamente ha leído todos la información que
         * había en el archivo cache, más la nueva información encontrada.
         * Recordar: El key es el código de barra del producto, y el valor es el
         * JSONObject del producto (El valor encontrado en formato JSON).
         */
        JsonNode rootNode = om.valueToTree(cache);
//        for (Map.Entry<String, JsonNode> entry : cache.entrySet()) {
//            //Lo que hace es agregar todos los pares Clave, Valor, al JSONObject
//            cache_existente.put(entry.getKey(), entry.getValue());
//        }
        rootNode.fieldNames().forEachRemaining(key -> cache.put(key, rootNode.get(key)));
        //Escribir el JSON actualizado en el archivo
        try (FileWriter file = new FileWriter(CACHE_FILE)) {
            //file.write(cache.toString(4));
            om.writerWithDefaultPrettyPrinter().writeValue(file, cache);

        } catch (IOException e) {
            System.out.println("Error al guardar el caché: " + e.getMessage());
        }

    } //FIN DEL MÉTODO GUARDAR

    public Map<String, JsonNode> cargarCacheDesdeArchivo() {

        try (BufferedReader reader = new BufferedReader(new FileReader(CACHE_FILE))) {
            StringBuilder sb = new StringBuilder();
            String linea;
            while ((linea = reader.readLine()) != null) {
                sb.append(linea);
            }

            //JSONObject jsonCache = new JSONObject(sb.toString());
            JsonNode rootNode = om.readTree(sb.toString());

            //Hasta aquí hemos recorrido todos los elementos del archivo JSON
            //Asignamos a la variable "cache", todas las llaves y sus valores
            rootNode.fieldNames().forEachRemaining(key -> cache.put(key, rootNode.get(key)));

        } catch (IOException e) {
            System.out.println("Error al cargar el caché: " + e.getMessage());
        }
        return cache;
    } //FIN DEL MÉTODO CARGAR

}
