package controller;

import model.Usuario;

public class LoginController {

    private UsuarioController usuarioController;

    public LoginController(UsuarioController usuarioController) {
        this.usuarioController = usuarioController;
    }

    public Usuario login(String correo, String password) {
        for (Usuario u : usuarioController.getUsuarios()) {
            if (u.getCorreo().equalsIgnoreCase(correo) &&
                    u.getPassword().equals(password)) {
                return u;  // login correcto
            }
        }
        return null;  // login fallido
    }
}