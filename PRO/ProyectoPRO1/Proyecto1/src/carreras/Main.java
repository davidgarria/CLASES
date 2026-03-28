package carreras;

import carreras.model.Campeonato;
import carreras.model.Carrera;
import carreras.model.Coche;
import carreras.controller.CampeonatoController;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarBienvenida();
        simularCampeonato();
        scanner.close();
    }

    // Mensaje de bienvenida
    private static void mostrarBienvenida() {
        System.out.println();
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║                                                            ║");
        System.out.println("║              SIMULADOR DE CARRERAS DE COCHES               ║");
        System.out.println("║                                                            ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");
        System.out.println();
    }

    // Simula un campeonato completo
    private static void simularCampeonato() {
        // Nombre del campeonato
        System.out.print("Nombre del campeonato: ");
        String nombreCampeonato = scanner.nextLine();

        // Crear campeonato
        Campeonato campeonato = new Campeonato(nombreCampeonato);

        // Pedir número de coches
        int numCoches = leerEntero("¿Cuántos coches participarán? (mínimo 2): ", 2);

        // Crear los coches
        System.out.println("\n--- REGISTRO DE COCHES ---");
        for (int i = 0; i < numCoches; i++) {
            System.out.println("\nCoche " + (i + 1) + ":");
            System.out.print("  Marca: ");
            String marca = scanner.nextLine();
            System.out.print("  Modelo: ");
            String modelo = scanner.nextLine();
            int dorsal = leerEntero("  Dorsal: ", 1);

            Coche coche = new Coche(marca, modelo, dorsal);
            campeonato.agregarParticipante(coche);
        }

        // Pedir número de carreras
        int numCarreras = leerEntero("\n¿Cuántas carreras tendrá el campeonato? ", 1);

        // Crear las carreras
        System.out.println("\n--- CONFIGURACIÓN DE CARRERAS ---");
        for (int i = 0; i < numCarreras; i++) {
            System.out.println("\nCarrera " + (i + 1) + ":");
            System.out.print("  Nombre: ");
            String nombreCarrera = scanner.nextLine();
            double kmCarrera = leerDouble("  Kilómetros: ", 50.0);

            Carrera carrera = new Carrera(nombreCarrera, kmCarrera);

            // Añadir todos los coches a la carrera
            for (Coche coche : campeonato.getParticipantes()) {
                carrera.agregarParticipante(coche);
            }

            campeonato.agregarCarrera(carrera);
        }

        // Ejecutar campeonato
        CampeonatoController controller = new CampeonatoController();
        controller.ejecutarCampeonato(campeonato);

        System.out.println();
    }

    // Lee un número entero con validación y mensaje personalizado
    private static int leerEntero(String mensaje, int minimo) {
        while (true) {
            try {
                System.out.print(mensaje);
                int numero = scanner.nextInt();
                scanner.nextLine();  // Limpiar buffer

                if (numero < minimo) {
                    System.out.println("El valor debe ser al menos " + minimo + ". Intenta de nuevo.");
                    continue;
                }

                return numero;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Debes ingresar un número entero.");
                scanner.nextLine();  // Limpiar buffer
            }
        }
    }

    // Lee un número decimal con validación
    private static double leerDouble(String mensaje, double minimo) {
        while (true) {
            try {
                System.out.print(mensaje);
                double numero = scanner.nextDouble();
                scanner.nextLine();  // Limpiar buffer

                if (numero < minimo) {
                    System.out.println("El valor debe ser al menos " + minimo + ". Intenta de nuevo.");
                    continue;
                }

                return numero;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Debes ingresar un número.");
                scanner.nextLine();  // Limpiar buffer
            }
        }
    }
}