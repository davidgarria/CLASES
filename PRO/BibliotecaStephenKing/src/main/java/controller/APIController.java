package controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import model.Biblioteca;
import model.Libro;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIController {

    // URLs de la API
    private static final String URL_TODOS   = "https://stephen-king-api.onrender.com/api/books";
    private static final String URL_LIBRO   = "https://stephen-king-api.onrender.com/api/book/";

    private final Gson gson = new Gson();

    public Biblioteca obtenerTodosLosLibros() {
        try {
            String json = hacerPeticion(URL_TODOS);
            return gson.fromJson(json, Biblioteca.class);
        } catch (Exception e) {
            System.out.println("Error al conectar con la API: " + e.getMessage());
            return null;
        }
    }

    public Libro obtenerLibroPorId(int id) {
        try {
            String json = hacerPeticion(URL_LIBRO + id);

            // Parseamos el JSON como un objeto genérico
            JsonObject jsonObject = gson.fromJson(json, JsonObject.class);

            // Extraemos el campo "data" y lo convertimos a Libro
            JsonObject data = jsonObject.getAsJsonObject("data");
            return gson.fromJson(data, Libro.class);

        } catch (Exception e) {
            System.out.println("❌ Error al obtener el libro: " + e.getMessage());
            return null;
        }
    }

    private String hacerPeticion(String urlTexto) throws Exception {

        URL url = new URL(urlTexto);
        HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
        conexion.setRequestMethod("GET");  // GET = "dame datos"

        BufferedReader lector = new BufferedReader(
                new InputStreamReader(conexion.getInputStream())
        );

        StringBuilder resultado = new StringBuilder();
        String linea;
        while ((linea = lector.readLine()) != null) {
            resultado.append(linea);
        }
        lector.close();

        return resultado.toString();
    }
}