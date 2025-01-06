package com.codigodebarra.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.swing.JOptionPane;
import org.json.JSONObject;

public class ApiProductos {

    Cache objetoCache = new Cache();

    //Map<String, JSONObject> cachee = new ConcurrentHashMap<>();
    Map<String, JSONObject> cache = new ConcurrentHashMap<>();

    public boolean consumirApi(String codigo_barra) {
        boolean estado = false;
        //Traer el archivo de los productos encontrados
        cache = objetoCache.cargarCacheDesdeArchivo();

        try {

            if (cache.containsKey(codigo_barra)) {

                JSONObject product = cache.get(codigo_barra).getJSONObject("product");

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

                //Obtener información y mostrarla
                System.out.println("====== INFORMACIÓN ======");
                System.out.println("Codigo de barras: " + codigo_barra);
                System.out.println("Producto: " + product.optString("product_name"));
                System.out.println("Marca: " + product.optString("brands"));
                System.out.println("Cantidad: " + product.optString("quantity"));
                System.out.println("Imagen: " + imagenURL);
                JOptionPane.showMessageDialog(null, "Está en el if");

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
                cache.put(codigo_barra, jsonResponse);

                //
                objetoCache.guardarCacheEnArchivo(cache); //Guardamos ese mapa que será, posteriormente un jsonObject que se almacenará al archivo
                JOptionPane.showMessageDialog(null, "Está en el else");
            }
            estado = true;
        } catch (Exception e) {
            System.out.println("Error al consumir la API: " + e.getMessage());
        }
        return estado;
    }
}

//            //ESTO ES OTRA COSA
//            if (jsonResponse.getInt("status") == 1) {
//                JSONObject product = jsonResponse.getJSONObject("product"); //El jsonResponse despues de haber leido todo, ingresa al objeto product
//                String imagenURL = product.getJSONObject("selected_images")
//                        .getJSONObject("front")
//                        .getJSONObject("display")
//                        .getString("es");
//                System.out.println("Codigo de barras: " + codigo_barra);
//                System.out.println("Producto: " + product.getString("product_name"));
//                System.out.println("Marca: " + product.getString("brands"));
//                System.out.println("Cantidad: " + product.getString("quantity"));
//                System.out.println("Imagen: " + imagenURL);
//
//            } else {
//                System.out.println("Producto no encontrado");
//            }
//            conn.disconnect();
//            estado = true;

