package model;

public abstract class Usuario {

    // Atributos comunes a admin y trabajador
    private String nombre;
    private String apellido;
    private String dni;
    private String correo;
    private String password;

    public Usuario(String nombre, String apellido, String dni,
                   String correo, String password) {
        this.nombre   = nombre;
        this.apellido = apellido;
        this.dni      = dni;
        this.correo   = correo;
        this.password = password;
    }

    // Getters
    public String getNombre()   { return nombre; }
    public String getApellido() { return apellido; }
    public String getDni()      { return dni; }
    public String getCorreo()   { return correo; }
    public String getPassword() { return password; }

    // Setter — solo la contraseña puede cambiar
    public void setPassword(String password) { this.password = password; }

    public abstract String getRol();

    @Override
    public String toString() {
        return " " + nombre + " " + apellido +
                " | DNI: " + dni +
                " | Correo: " + correo +
                " | Rol: " + getRol();
    }
}