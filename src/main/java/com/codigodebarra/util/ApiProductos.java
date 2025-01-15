package com.codigodebarra.util;

import com.codigodebarra.model.Producto;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.swing.JOptionPane;
import org.json.JSONObject;

public class ApiProductos {

    Cache objetoCache = new Cache();
ObjectMapper om = new ObjectMapper();
    //Map<String, JSONObject> cachee = new ConcurrentHashMap<>();
    Map<String, JsonNode> cache = new ConcurrentHashMap<>();

    public Producto consumirApi(String codigo_barra) {
        //Traer el archivo de los productos encontrados

        cache = objetoCache.cargarCacheDesdeArchivo();

        Producto producto = new Producto();
        try {

            if (cache.containsKey(codigo_barra)) {

                JsonNode productNode = cache.get(codigo_barra).path("product");
                
                
                // Obtener imagen del producto
                //Crear un vector que almacene las abreviaturas de los idiomas, para ahorrar líneas de código
                String[] idiomas = {"es", "en", "fr"};

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

                JOptionPane.showMessageDialog(null, "Está en el if");

                producto.setNombre(productNode.path("product_name").asText());
                producto.setContenido(productNode.path("quantity").asText());
                producto.setCompania(productNode.path("brands").asText());
                producto.setImagenURL(imagenURL);

            } else {
                // Llama a la API, guarda en cache ##############################

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

                //=============================================================
                //=============================================================
                //Usar Jackson para mapear la respuesta al objeto
                
                //producto = om.readValue(response.toString(), Producto.class);
                JsonNode rootNode = om.readTree(response.toString());
                JsonNode productNode = rootNode.path("product");
                String nombre = productNode.path("product_name").asText(); //retorna el valor que hay en la clave product_name
                String compania = productNode.path("brands").asText();
                String contenido = productNode.path("quantity").asText();

                System.out.println("========= INFO =========");
                System.out.println("Nombre: " + nombre);
                System.out.println("Compania: " + compania);
                System.out.println("Contenido: " + contenido);
                //System.out.println("ImagenURL: " + producto.getImagenURL());
                System.out.println("========= END - INFO =========");
                producto.setCodigo_barra(codigo_barra);

                cache.put(codigo_barra, productNode);
                //******
                //|v Nop
                //cache.put(codigo_barra, jsonResponse); //Esto es importante porque asignamos el codigo con el valor encontrado de la api
                ////Esto es importante para guardarlo en el archivo json
                objetoCache.guardarCacheEnArchivo(cache); //Guardamos ese mapa que será, posteriormente un jsonObject que se almacenará al archivo
                //
                

                //
                String[] idiomas = {"es", "en", "fr"};

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

                producto.setNombre(productNode.path("product_name").asText());
                producto.setContenido(productNode.path("quantity").asText());
                producto.setCompania(productNode.path("brands").asText());
                producto.setImagenURL(imagenURL);
                //=============================================================
                /**
                 * * UTILIZAR Jackson, en lugar del JSONObject como tal /*
                 * Procesar JSON
                 */
                //Convertir la respuesta en un objeto JSON
//                JSONObject jsonResponse = new JSONObject(response.toString());
//                /**
//                 * Asignamos al Map "cache", la llave que se escaneó o ingresó
//                 * en el textField. Y su valor que es el valor encontrado de ese
//                 * código de barra pero en tipo JSON.
//                 */
//                if (jsonResponse.getInt("status") != 0) {
//                    cache.put(codigo_barra, jsonResponse); //Esto es importante porque asignamos el codigo con el valor encontrado de la api
//                    ////Esto es importante para guardarlo en el archivo json

//                    objetoCache.guardarCacheEnArchivo(cache); //Guardamos ese mapa que será, posteriormente un jsonObject que se almacenará al archivo
//                    JSONObject product = cache.get(codigo_barra).getJSONObject("product");
//
//                    //
//                    String[] idiomas = {"es", "en", "fr"};
//
//                    //Establecer una dirección donde se encuentra la imagen
//                    JSONObject display = product.getJSONObject("selected_images")
//                            .getJSONObject("front")
//                            .getJSONObject("display");
//
//                    String imagenURL = "";
//
//                    for (String idioma : idiomas) {
//                        imagenURL = display.optString(idioma);
//                        if (!imagenURL.isBlank()) {
//                            break; //Si encuentra una URL termina el bucle
//                        }
//                    }
//                    if (imagenURL.isBlank()) {
//                        imagenURL = "No se encontró la imagen";
//                    }
//                    //             
//                    producto.setCodigo_barra(codigo_barra);
//
//                    producto.setNombre(product.optString("product_name"));
//                    producto.setContenido(product.optString("quantity"));
//                    producto.setCompania(product.optString("brands"));
//                    producto.setImagenURL(imagenURL);
//                    System.out.println("En el apiProducts: " + producto);
//                }
                //=============================================================
            }
        } catch (Exception e) {
            System.out.println("Error al consumir la API: " + e.getMessage());
        }
        return producto;
    }
}
