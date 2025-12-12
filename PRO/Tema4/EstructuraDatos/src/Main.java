import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bonoloto bonoloto = new Bonoloto();
        //Ejercicio ejercicio = new Ejercicio();
        //ejercicio.mayormenor();

        boolean jugar = false;
        do {
            bonoloto.iniciarJuego();
            System.out.println("¿Quieres jugar otra vez? (s/n)");
            String respuesta = scanner.nextLine().toLowerCase();
            jugar = respuesta.startsWith("s");
        } while (jugar);

        System.out.println("Sesión terminada");
    }
}
