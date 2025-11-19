package ejercicio1;

import java.util.Scanner;

public class Main {
    /*
Crea un programa de adivinación de números El programa genera de manera
aleatoria un número entre 1 y 50. El usuario debe adivinar el número en un
máximo de 7 intentos. Después de cada intento, indica si el número es mayor
o menor que el elegido. Si el usuario acierta, mostrar un aviso con el número
de intentos utilizado; si no, mostrar un aviso de que debe introducir
nuevamente un número.
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numeroAleatorio = (int) (Math.random()*50)+1;
        int intentos = 7;
        System.out.println("Numero aleatorio: "+numeroAleatorio);
        System.out.println("Indica tu primer numero:");
        int numero = scanner.nextInt();
        boolean acertado = false;
        for (int i = 1; i < intentos; i++) {
            if (numero == numeroAleatorio){
                System.out.println("Felicidades! acertaste.");
                System.out.printf("El número de intentos realizados fue: %d%n",i);
                acertado = true;
                break;
            }else{
                System.out.println("Fallo! Intentalo de nuevo con otro número:");
                System.out.printf("Te quedan %d intentos%n",intentos-i);
                numero = scanner.nextInt();
            }
        }
        if (!acertado) {
            System.out.println("Lo siento, has perdido!");
        }

    }
}
