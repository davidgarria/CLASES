package ejercicio2;

import java.util.Scanner;

public class Main {
/*
Crea una aplicación que simule el funcionamiento del wordle. Para ello realiza
las siguientes acciones:
a. Crea una palabra de 5 letras. (funcionará como la palabra a adivinar)
b. El programa debe seleccionar aleatoriamente una palabra del array y
almacenarla como la palabra secreta.
c. El usuario tiene 5 intentos como máximo para adivinar la palabra secreta.
d. En cada intento, el usuario introduce una palabra por teclado.
e. Tras cada intento, el programa debe indicar al usuario:
i. Aciertos: cuántas letras tiene en la misma posición que la palabra
secreta.
ii. Aproximaciones: cuántas letras están en la palabra secreta, pero en una
posición diferente.
iii. Fallos: cuántas letras no están presentes en la palabra secreta.
El juego termina cuando el usuario adivina la palabra o se acaban los 5 intentos.
 */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String palabraSecreta = "frase", palabraUsuario;
        int intentos = 5, numeroAciertos = 0, numeroAproximacion = 0, numeroFallos = 0;

        do {
            System.out.println("Introduce la palabra:");
            palabraUsuario = scanner.next();
            intentos--;
            for (int i = 0; i < 5; i++) {
                if (palabraUsuario.equals(palabraSecreta)){
                    numeroAciertos=5;
                    break;
                } else if (palabraUsuario.charAt(i)==palabraSecreta.charAt(i)){
                    numeroAciertos++;
                } else if (palabraSecreta.contains(String.valueOf(palabraUsuario.charAt(i)))) {
                    numeroAproximacion++;
                } else{
                    numeroFallos++;
                }
            }
            if (numeroAciertos==5){
                System.out.printf("Felicidades, has acertado!%n");
                break;
            } else {
                System.out.println("Aciertos: " + numeroAciertos);
                System.out.println("Aproximaciones: " + numeroAproximacion);
                System.out.println("Fallos: " + numeroFallos);
                numeroAciertos = 0;
                numeroAproximacion = 0;
                numeroFallos = 0;
                System.out.printf("Te quedan %d intentos%n",intentos);
            }

        }while (intentos>0);

        if (intentos == 0){
            System.out.println("Has perdido!");
        }
    }
}
