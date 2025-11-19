import java.sql.SQLOutput;
import java.util.Scanner;

public class SentenciaWhile {

    public void evaluacionNumero(){
        Scanner scanner = new Scanner(System.in);

        int aleatorio = (int)(Math.random()*11); //rango de lo que quieres +1
        System.out.println("Introduce un número a ver si es correcto: ");
        int numero = scanner.nextInt();
        int intentos = 1;

        while(numero!=aleatorio){
            System.out.println("Intendo fallido, indica un nuevo número");
            numero = scanner.nextInt();
            intentos++;
        }

        System.out.printf("Numero acertado!%nTe tomó %d intentos.",intentos);
    }
}
