package controller;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FichajeController {

    private static final String FICHERO = "horas.txt";

    // Registrar fichaje
    public void fichar(String correo) {
        // Obtenemos la fecha y hora actual con el formato pedido
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
        String fechaHora = ahora.format(formato);

        String linea = correo + " | " + fechaHora;

        try {
            FileWriter fw = new FileWriter(FICHERO, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(linea);
            bw.newLine();  // salto de línea al final
            bw.close();
            System.out.println("Fichaje registrado: " + linea);
        } catch (IOException e) {
            System.out.println("Error al registrar fichaje: " + e.getMessage());
        }
    }


    // Ver todos los registros
    public void verRegistros() {
        System.out.println("\nREGISTROS DE JORNADA\n");
        try {
            BufferedReader br = new BufferedReader(new FileReader(FICHERO));
            String linea;
            boolean hayRegistros = false;

            while ((linea = br.readLine()) != null) {
                System.out.println("🕐 " + linea);
                hayRegistros = true;
            }
            br.close();

            if (!hayRegistros) {
                System.out.println("No hay registros de fichaje todavía.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("No existe el fichero horas.txt todavía.");
        } catch (IOException e) {
            System.out.println("Error al leer registros: " + e.getMessage());
        }
    }
}