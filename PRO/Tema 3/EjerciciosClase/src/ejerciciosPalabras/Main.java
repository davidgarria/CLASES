package ejerciciosPalabras;

import java.util.Scanner;

public class Main {

    /* Pedir por consola una frase. Indicar:
    1. Cuantas oraciones tiene
    2. Cuantas letras tiene
    3. Cuantas palabras tiene
    4. Cuantas letras tiene (sin contar espacios ni signos de puntuacion)
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica la frase que quieres analizar");
        String frase = scanner.nextLine();

        String[] oraciones = frase.split("\\.");
        String letras = frase.replaceAll(" ","").replaceAll(",","").replaceAll("\\.","");
        String[] palabras = frase.split(" ");

        System.out.printf("La frase tiene %d oraciones.%n",oraciones.length);
        System.out.printf("La frase tiene %d letras.%n",letras.length());
        System.out.printf("La frase tiene %d palabras.%n",palabras.length);
        System.out.printf("La frase tiene %d carcacteres de longitud.%n",frase.length());

    }

}
