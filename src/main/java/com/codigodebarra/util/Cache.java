package com.codigodebarra.util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Cache {

    ObjectMapper om = new ObjectMapper();
    public static final String CACHE_FILE = "cache.json";
    Map<String, JsonNode> cache = new HashMap<>();

    public void guardarCacheEnArchivo(Map<String, JsonNode> cache) {
        //om.valueToTree(), lo que hace es convertir el tipo Map, (JAVA), a formato JsonNode
        //Formato clave, valor, es decir para poder trabajar con el archivo JSON, como tal. (traer los valores, etc).
        JsonNode rootNode = om.valueToTree(cache);
        //Va a agregar toda la información del cache, e incluso con el nuevo registro agregado al Map
        rootNode.fieldNames().forEachRemaining(key -> cache.put(key, rootNode.get(key)));
        //Escribir el JSON actualizado en el archivo
        try (FileWriter file = new FileWriter(CACHE_FILE)) {
            //El writeValue convierte el objecto JAVA (MAP) a JSON
            om.writerWithDefaultPrettyPrinter().writeValue(file, cache);

        } catch (IOException ome) {
            System.out.println("Error al guardar el caché: " + ome.getMessage());
        }

    } //FIN DEL MÉTODO GUARDAR

    public Map<String, JsonNode> cargarCacheDesdeArchivo() {

        try (BufferedReader reader = new BufferedReader(new FileReader(CACHE_FILE))) {
            StringBuilder sb = new StringBuilder();
            String linea;
            while ((linea = reader.readLine()) != null) {
                sb.append(linea);
            }

            JsonNode rootNode = om.readTree(sb.toString());

            //Hasta aquí hemos recorrido todos los elementos del archivo JSON
            //Asignamos a la variable "cache", todas las claves con sus valores
            rootNode.fieldNames().forEachRemaining(key -> cache.put(key, rootNode.get(key)));

        } catch (IOException e) {
            System.out.println("Error al cargar el caché: " + e.getMessage());
        }
        return cache;
    } //FIN DEL MÉTODO CARGAR

}
