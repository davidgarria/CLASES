import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bonoloto bonoloto = new Bonoloto();

        boolean jugar = false;
        do {
            bonoloto.iniciarJuego();
            System.out.println("¿Quieres jugar otra vez? (s/n)");
            String respuesta = scanner.next().toLowerCase();
            jugar = respuesta.equals("si") || respuesta.equals("s");
        } while (jugar);

    }

}
