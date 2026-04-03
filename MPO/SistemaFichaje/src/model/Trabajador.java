package model;

public class Trabajador extends Usuario {

    public Trabajador(String nombre, String apellido,
                      String dni, String correo, String password) {
        super(nombre, apellido, dni, correo, password);
    }

    @Override
    public String getRol() {
        return "Trabajador";
    }
}