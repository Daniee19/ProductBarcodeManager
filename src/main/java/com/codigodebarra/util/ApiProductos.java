package com.codigodebarra.util;

import com.codigodebarra.model.Producto;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.swing.JOptionPane;

public class ApiProductos {

    Cache objetoCache = new Cache();
    ObjectMapper om = new ObjectMapper();
    Map<String, JsonNode> cache = new ConcurrentHashMap<>();

    public Producto consumirApi(String codigo_barra) {
        //Traer el archivo cache de los productos encontrados
        cache = objetoCache.cargarCacheDesdeArchivo();

        Producto p = new Producto();
        try {

            if (cache.containsKey(codigo_barra)) {
                JsonNode productNode = cache.get(codigo_barra);
                /*OBTENER LA URL DE LA IMAGEN*/
                String imagenURL = obtenerImagen(productNode);

                JOptionPane.showMessageDialog(null, "Está en el if");
                p.setCodBarra(codigo_barra);
                p.setNombre(productNode.path("product_name").asText());
                p.setCont(productNode.path("quantity").asText());
                p.setMarca(productNode.path("brands").asText());
                p.setImagenUrl(imagenURL);

            } else {
                //Llamar a la API
                URL url = new URL("https://world.openfoodfacts.org/api/v0/product/" + codigo_barra + ".json?fields=product_name,brands,quantity,selected_images");
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.setRequestProperty("Accept", "application/json");

                BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;

                while ((line = br.readLine()) != null) {
                    response.append(line);
                }
                br.close();

                //Usar Jackson para mapear la respuesta al objeto
                //Convierte un JSON en texto, a un árbol de nodos para que se pueda navegar o manipularlo.
                //Estamos deserializando, para poder trabajar con una clase JsonNode
                JsonNode rootNode = om.readTree(response.toString());
                //Nos ubicamos en el nivel del product
                JsonNode productNode = rootNode.path("product");
                String imagenURL = obtenerImagen(productNode);

                cache.put(codigo_barra, productNode);
                //Esto es importante porque asignamos el codigo con el valor encontrado de la api
                ////Esto es importante para guardarlo en el archivo json
                objetoCache.guardarCacheEnArchivo(cache); //Guardamos ese mapa que será, posteriormente un jsonNode que se almacenará al archivo
                //
                p.setCodBarra(codigo_barra);
                p.setNombre(productNode.path("product_name").asText());
                p.setCont(productNode.path("quantity").asText());
                p.setMarca(productNode.path("brands").asText());
                p.setImagenUrl(imagenURL);
            }
        } catch (HeadlessException | IOException e) {
            System.out.println("Error al consumir la API: " + e.getMessage());
        }
        return p;
    }

    public String obtenerImagen(JsonNode productNode) {
        String[] idiomas = {"es", "en", "fr", "it"};

        JsonNode display = productNode.path("selected_images")
                .path("front").path("display");

        String imagenURL = "";

        for (String idioma : idiomas) {
            imagenURL = display.path(idioma).asText();
            if (!imagenURL.isBlank()) {
                break; //Si encuentra una URL termina el bucle
            }
        }
        if (imagenURL.isBlank()) {
            imagenURL = "No se encontró la imagen";
        }
        return imagenURL;
    }
}
