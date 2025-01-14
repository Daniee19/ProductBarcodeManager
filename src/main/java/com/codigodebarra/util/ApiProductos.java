package com.codigodebarra.util;

import com.codigodebarra.model.Producto;
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

    //Map<String, JSONObject> cachee = new ConcurrentHashMap<>();
    Map<String, JSONObject> cache = new ConcurrentHashMap<>();

    public Producto consumirApi(String codigo_barra) {
        //Traer el archivo de los productos encontrados
        Long timeStart = System.currentTimeMillis();
        cache = objetoCache.cargarCacheDesdeArchivo();
        Long endTime = System.currentTimeMillis();
        System.out.println("Tiempo en traer los valores del json: " + (endTime - timeStart) + " ms");

        Producto producto = new Producto();
        try {

            if (cache.containsKey(codigo_barra)) {
                Long timeStart2 = System.currentTimeMillis();
                JSONObject product = cache.get(codigo_barra).getJSONObject("product");
                //Long timeend2 = System.currentTimeMillis();
                //System.out.println("Tiempo en traer los datos de tipo producto JSON" + (timeend2 - time2) + " ms");
                // Obtener imagen del producto
                //Crear un vector que almacene las abreviaturas de los idiomas, para ahorrar líneas de código
                String[] idiomas = {"es", "en", "fr"};

                //Establecer una dirección donde se encuentra la imagen
                JSONObject display = product.getJSONObject("selected_images")
                        .getJSONObject("front")
                        .getJSONObject("display");

                String imagenURL = "";

                for (String idioma : idiomas) {
                    imagenURL = display.optString(idioma);
                    if (!imagenURL.isBlank()) {
                        break; //Si encuentra una URL termina el bucle
                    }
                }
                if (imagenURL.isBlank()) {
                    imagenURL = "No se encontró la imagen";
                }

                JOptionPane.showMessageDialog(null, "Está en el if");
                Long timeEnd2 = System.currentTimeMillis();
                
                
                System.out.println("Tiempo en setearlos valores de la api " + (timeEnd2 - timeStart2) + " ms");
                producto.setCodigo_barra(codigo_barra);
                producto.setNombre(product.optString("product_name"));
                producto.setContenido(product.optString("quantity"));
                producto.setCompania(product.optString("brands"));
                producto.setImagenURL(imagenURL);

            } else {
                // Llama a la API, guarda en cache

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
                /* Procesar JSON*/
                //Convertir la respuesta en un objeto JSON
                JSONObject jsonResponse = new JSONObject(response.toString());
                /**
                 * Asignamos al Map "cache", la llave que se escaneó o ingresó
                 * en el textField. Y su valor que es el valor encontrado de ese
                 * código de barra pero en tipo JSON.
                 */
                cache.put(codigo_barra, jsonResponse); //Esto es importante porque asignamos el codigo con el valor encontrado de la api

                //
                JSONObject product = cache.get(codigo_barra).getJSONObject("product");

                //
                String[] idiomas = {"es", "en", "fr"};

                //Establecer una dirección donde se encuentra la imagen
                JSONObject display = product.getJSONObject("selected_images")
                        .getJSONObject("front")
                        .getJSONObject("display");

                String imagenURL = "";

                for (String idioma : idiomas) {
                    imagenURL = display.optString(idioma);
                    if (!imagenURL.isBlank()) {
                        break; //Si encuentra una URL termina el bucle
                    }
                }
                if (imagenURL.isBlank()) {
                    imagenURL = "No se encontró la imagen";
                }
                //             
                producto.setCodigo_barra(codigo_barra);

                producto.setNombre(product.optString("product_name"));
                producto.setContenido(product.optString("quantity"));
                producto.setCompania(product.optString("brands"));
                producto.setImagenURL(imagenURL);
                System.out.println("En el apiProducts: " + producto);
                ////Esto es importante para guardarlo en el archivo json
                objetoCache.guardarCacheEnArchivo(cache); //Guardamos ese mapa que será, posteriormente un jsonObject que se almacenará al archivo
                JOptionPane.showMessageDialog(null, "Está en el else");

            }
        } catch (Exception e) {
            System.out.println("Error al consumir la API: " + e.getMessage());
        }
        return producto;
    }
}
