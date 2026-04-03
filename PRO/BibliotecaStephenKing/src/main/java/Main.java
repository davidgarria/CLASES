import controller.APIController;
import controller.BibliotecaController;
import controller.FileController;
import model.Biblioteca;
import model.Libro;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        APIController apiController           = new APIController();
        BibliotecaController bibController    = new BibliotecaController();
        FileController fileController         = new FileController();

        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {

            mostrarMenu();

            System.out.print("Elige una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Escribe un número válido.");
                continue;
            }

            switch (opcion) {

                case 1 -> {
                    // ── Importar todos los libros desde la API ──
                    System.out.println("\nConectando con la API...");
                    Biblioteca biblioteca = apiController.obtenerTodosLosLibros();

                    if (biblioteca != null && biblioteca.getData() != null) {
                        bibController.setLibros(biblioteca.getData());
                        System.out.println("Importados " +
                                biblioteca.getData().size() + " libros.");
                        bibController.mostrarLibros();
                    } else {
                        System.out.println("No se pudieron importar los libros.");
                    }
                }

                case 2 -> {
                    // ── Buscar un libro por id ──
                    System.out.print("\nIntroduce el id del libro: ");
                    try {
                        int id = Integer.parseInt(scanner.nextLine().trim());
                        System.out.println("\nBuscando...");
                        Libro libro = apiController.obtenerLibroPorId(id);

                        if (libro != null) {
                            System.out.println("\n" + libro);
                        } else {
                            System.out.println("No se encontró el libro.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Introduce un número válido.");
                    }
                }

                case 3 -> {
                    // ── Añadir un libro a favoritos ──
                    if (bibController.getLibros().isEmpty()) {
                        System.out.println("Primero importa los libros (opción 1).");
                        break;
                    }
                    System.out.print("\nIntroduce el id del libro a favoritos: ");
                    try {
                        int id = Integer.parseInt(scanner.nextLine().trim());
                        bibController.añadirFavorito(id);
                    } catch (NumberFormatException e) {
                        System.out.println("Introduce un número válido.");
                    }
                }

                case 4 -> {
                    // ── Exportar favoritos al fichero .obj ──
                    fileController.exportarFavoritos(bibController.getFavoritos());
                }

                case 5 -> {
                    // ── Importar favoritos desde el fichero .obj ──
                    List<Libro> favoritosGuardados = fileController.importarFavoritos();
                    if (favoritosGuardados != null) {
                        bibController.setFavoritos(favoritosGuardados);
                        System.out.println("Favoritos importados:");
                        bibController.mostrarFavoritos();
                    }
                }

                case 0 -> {
                    // ── Salir ──
                    System.out.println("\n¡Hasta luego! Que disfrutes leyendo a Stephen King!");
                }

                default -> System.out.println("Opción no válida. Elige entre 0 y 5.");
            }

            // Separador visual entre opciones
            System.out.println();
        }

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║     BIBLIOTECA DE STEPHEN KING       ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║  1. Importar todos los libros        ║");
        System.out.println("║  2. Buscar libro por id              ║");
        System.out.println("║  3. Añadir libro a favoritos         ║");
        System.out.println("║  4. Exportar favoritos               ║");
        System.out.println("║  5. Importar favoritos               ║");
        System.out.println("║  0. Salir                            ║");
        System.out.println("╚══════════════════════════════════════╝");
    }
}