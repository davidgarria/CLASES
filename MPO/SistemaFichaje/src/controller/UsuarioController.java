package controller;

import model.Administrador;
import model.Trabajador;
import model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioController {

    private List<Usuario> usuarios = new ArrayList<>();

    public UsuarioController() {
        usuarios.add(new Administrador(
                "Admin", "Principal", "00000000A",
                "admin@empresa.com", "admin123"
        ));
    }

    public void altaTrabajador(String nombre, String apellido,
                               String dni, String correo, String password) {
        // Comprobamos que no existe ya un usuario con ese DNI
        if (buscarPorDni(dni) != null) {
            System.out.println("Ya existe un usuario con el DNI " + dni);
            return;
        }
        usuarios.add(new Trabajador(nombre, apellido, dni, correo, password));
        System.out.println("Trabajador dado de alta correctamente.");
    }

    public void bajaTrabajador(String dni) {
        Usuario usuario = buscarPorDni(dni);

        if (usuario == null) {
            System.out.println("No existe ningún usuario con el DNI " + dni);
            return;
        }
        // No permitimos borrar administradores
        if (usuario instanceof Administrador) {
            System.out.println("No puedes dar de baja a un administrador.");
            return;
        }
        usuarios.remove(usuario);
        System.out.println("Trabajador dado de baja correctamente.");
    }


    // Ver datos de un trabajador por DNI
    public void verTrabajador(String dni) {
        Usuario usuario = buscarPorDni(dni);
        if (usuario == null) {
            System.out.println("No existe ningún usuario con el DNI " + dni);
            return;
        }
        System.out.println("\n" + usuario);
    }

    // Ver todos los trabajadores (solo trabajadores, no admins)
    public void verTrabajadores() {
        boolean hayTrabajadores = false;
        System.out.println("\nLISTA DE TRABAJADORES\n");
        for (Usuario u : usuarios) {
            if (u instanceof Trabajador) {
                System.out.println(u);
                System.out.println("─".repeat(50));
                hayTrabajadores = true;
            }
        }
        if (!hayTrabajadores) {
            System.out.println("No hay trabajadores registrados.");
        }
    }

    // Cambiar password de un trabajador por DNI
    public void cambiarPassword(String dni, String nuevaPassword) {
        Usuario usuario = buscarPorDni(dni);
        if (usuario == null) {
            System.out.println("No existe ningún usuario con el DNI " + dni);
            return;
        }
        usuario.setPassword(nuevaPassword);
        System.out.println("Contraseña actualizada correctamente.");
    }

    // Buscar usuario por DNI
    public Usuario buscarPorDni(String dni) {
        for (Usuario u : usuarios) {
            if (u.getDni().equalsIgnoreCase(dni)) {
                return u;
            }
        }
        return null;  // null significa "no encontrado"
    }

    // Devuelve toda la lista (la necesita el LoginController)
    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}