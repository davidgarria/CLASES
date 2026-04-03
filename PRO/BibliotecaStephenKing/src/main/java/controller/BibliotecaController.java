package controller;

import model.Libro;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaController {

    private List<Libro> libros = new ArrayList<>();

    private List<Libro> favoritos = new ArrayList<>();

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros importados. Usa la opción 1 primero.");
            return;
        }
        System.out.println("\nBIBLIOTECA DE STEPHEN KING\n");
        for (Libro libro : libros) {
            System.out.println(libro);
            System.out.println("─".repeat(50));
        }
    }

    public void añadirFavorito(int id) {

        for (Libro libro : libros) {
            if (libro.getId() == id) {
                // Comprobamos que no esté ya en favoritos
                if (favoritos.contains(libro)) {
                    System.out.println("Este libro ya está en favoritos.");
                } else {
                    favoritos.add(libro);
                    System.out.println("Añadido a favoritos: " + libro.getTitle());
                }
                return;
            }
        }
        System.out.println("No se encontró ningún libro con id " + id);
    }

    public List<Libro> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(List<Libro> favoritos) {
        this.favoritos = favoritos;
    }

    public void mostrarFavoritos() {
        if (favoritos.isEmpty()) {
            System.out.println("No tienes favoritos guardados.");
            return;
        }
        System.out.println("\nTUS LIBROS FAVORITOS\n");
        for (Libro libro : favoritos) {
            System.out.println(libro);
            System.out.println("─".repeat(50));
        }
    }
}