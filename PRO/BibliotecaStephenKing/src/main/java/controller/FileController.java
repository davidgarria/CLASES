package controller;

import model.Libro;

import java.io.*;
import java.util.List;

public class FileController {

    private static final String FICHERO = "favoritos.obj";

    public void exportarFavoritos(List<Libro> favoritos) {
        if (favoritos.isEmpty()) {
            System.out.println("No tienes favoritos para exportar.");
            return;
        }
        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream(FICHERO)
            );
            oos.writeObject(favoritos);
            oos.close();
            System.out.println("Favoritos exportados a " + FICHERO);
        } catch (IOException e) {
            System.out.println("Error al exportar: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public List<Libro> importarFavoritos() {
        try {
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(FICHERO)
            );
            List<Libro> favoritos = (List<Libro>) ois.readObject();
            ois.close();
            return favoritos;
        } catch (FileNotFoundException e) {
            System.out.println("No existe el fichero favoritos.obj todavía.");
        } catch (Exception e) {
            System.out.println("Error al importar: " + e.getMessage());
        }
        return null;
    }
}