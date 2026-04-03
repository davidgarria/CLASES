import controller.FichajeController;
import controller.LoginController;
import controller.UsuarioController;
import model.Administrador;
import model.Trabajador;
import model.Usuario;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);


    static UsuarioController usuarioController = new UsuarioController();
    static LoginController loginController     = new LoginController(usuarioController);
    static FichajeController fichajeController = new FichajeController();

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║      SISTEMA DE FICHAJE EMPRESA      ║");
        System.out.println("╚══════════════════════════════════════╝");

        // Bucle externo — el programa no termina hasta que
        // cerramos la ventana o paramos la ejecución manualmente
        while (true) {
            Usuario usuarioActivo = null;
            while (usuarioActivo == null) {
                usuarioActivo = menuLogin();
            }

            if (usuarioActivo instanceof Administrador) {
                menuAdmin(usuarioActivo);
            } else if (usuarioActivo instanceof Trabajador) {
                menuTrabajador(usuarioActivo);
            }

            System.out.println("\nVolviendo al inicio de sesión...\n");
        }
    }


    static Usuario menuLogin() {
        System.out.println("\n--- INICIO DE SESIÓN ---");
        System.out.print("Correo: ");
        String correo = scanner.nextLine().trim();

        System.out.print("Contraseña: ");
        String password = scanner.nextLine().trim();

        Usuario usuario = loginController.login(correo, password);

        if (usuario == null) {
            System.out.println("Correo o contraseña incorrectos. Inténtalo de nuevo.");
        } else {
            System.out.println("\nBienvenido/a, " + usuario.getNombre() +
                    " (" + usuario.getRol() + ")");
        }
        return usuario;
    }

    // -------------------------------------------------------
    // MENÚ ADMINISTRADOR
    // -------------------------------------------------------
    static void menuAdmin(Usuario admin) {
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n╔══════════════════════════════════════╗");
            System.out.println("║        MENÚ ADMINISTRADOR            ║");
            System.out.println("╠══════════════════════════════════════╣");
            System.out.println("║  1. Dar de alta trabajador           ║");
            System.out.println("║  2. Dar de baja trabajador           ║");
            System.out.println("║  3. Ver datos de un trabajador       ║");
            System.out.println("║  4. Ver todos los trabajadores       ║");
            System.out.println("║  5. Cambiar contraseña trabajador    ║");
            System.out.println("║  6. Ver registros de jornada         ║");
            System.out.println("║  0. Cerrar sesión                    ║");
            System.out.println("╚══════════════════════════════════════╝");
            System.out.print("Elige una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Escribe un número válido.");
                continue;
            }

            switch (opcion) {

                case 1 -> {
                    // Alta de trabajador
                    System.out.println("\n--- ALTA DE TRABAJADOR ---");
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine().trim();
                    System.out.print("Apellido: ");
                    String apellido = scanner.nextLine().trim();
                    System.out.print("DNI: ");
                    String dni = scanner.nextLine().trim();
                    System.out.print("Correo: ");
                    String correo = scanner.nextLine().trim();
                    System.out.print("Contraseña: ");
                    String password = scanner.nextLine().trim();

                    usuarioController.altaTrabajador(
                            nombre, apellido, dni, correo, password
                    );
                }

                case 2 -> {
                    // Baja de trabajador
                    System.out.println("\n--- BAJA DE TRABAJADOR ---");
                    System.out.print("DNI del trabajador: ");
                    String dni = scanner.nextLine().trim();
                    usuarioController.bajaTrabajador(dni);
                }

                case 3 -> {
                    // Ver datos de un trabajador
                    System.out.println("\n--- DATOS DE TRABAJADOR ---");
                    System.out.print("DNI del trabajador: ");
                    String dni = scanner.nextLine().trim();
                    usuarioController.verTrabajador(dni);
                }

                case 4 -> {
                    // Ver todos los trabajadores
                    usuarioController.verTrabajadores();
                }

                case 5 -> {
                    // Cambiar contraseña
                    System.out.println("\n--- CAMBIAR CONTRASEÑA ---");
                    System.out.print("DNI del trabajador: ");
                    String dni = scanner.nextLine().trim();
                    System.out.print("Nueva contraseña: ");
                    String nuevaPass = scanner.nextLine().trim();
                    usuarioController.cambiarPassword(dni, nuevaPass);
                }

                case 6 -> {
                    // Ver registros de jornada
                    fichajeController.verRegistros();
                }

                case 0 -> {
                    System.out.println("\nSesión cerrada. ¡Hasta pronto!");
                }

                default -> System.out.println("Opción no válida.");
            }
        }
    }

    // -------------------------------------------------------
    // MENÚ TRABAJADOR
    // -------------------------------------------------------
    static void menuTrabajador(Usuario trabajador) {
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n╔══════════════════════════════════════╗");
            System.out.println("║         MENÚ TRABAJADOR              ║");
            System.out.println("╠══════════════════════════════════════╣");
            System.out.println("║  1. Realizar fichaje                 ║");
            System.out.println("║  0. Cerrar sesión                    ║");
            System.out.println("╚══════════════════════════════════════╝");
            System.out.print("Elige una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Escribe un número válido.");
                continue;
            }

            switch (opcion) {

                case 1 -> {
                    // El trabajador ficha con su correo
                    fichajeController.fichar(trabajador.getCorreo());
                }

                case 0 -> {
                    System.out.println("\nSesión cerrada. ¡Hasta pronto!");
                }

                default -> System.out.println("Opción no válida.");
            }
        }
    }
}