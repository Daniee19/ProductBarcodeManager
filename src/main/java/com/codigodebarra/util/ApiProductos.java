package com.codigodebarra.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class ApiProductos {

    public boolean consumirApi() {
        boolean estado = false;
        String codigo_barra = "";
        try {
            //Llamar a la API
            URL url = new URL("https://world.openfoodfacts.org/api/v0/product/" + codigo_barra + ".json");
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

            //Procesar JSON
            //Convertir la respuesta en un objeto JSON
            JSONObject jsonResponse = new JSONObject(response.toString());

            if (jsonResponse.getInt("status") == 1) {
                JSONObject product = jsonResponse.getJSONObject("product");
                System.out.println("Producto: " + product.getString("product_name"));
                System.out.println("Marca: " + product.getString("brand"));
                System.out.println("Precio: " + product.getString("price"));

            } else {
                System.out.println("Producto no encontrado");
            }
            conn.disconnect();
            estado = true;
        } catch (Exception e) {
            System.out.println("Error al consumir la API: " + e.getMessage());
        }
        return estado;
    }
}
