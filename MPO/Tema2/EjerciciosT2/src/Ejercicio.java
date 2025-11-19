import java.util.Scanner;

public class Ejercicio{
    Scanner scanner = new Scanner(System.in);

    public void ejercicio1(){
     /*Objetivo:* Crear un programa que convierta una calificación numérica (0-10)
     en su equivalente alfabético usando un switch.
     **Requisitos:**
     1. Declara una variable `double calificacion` con un valor entre 0 y 10.
     2. Usa un `switch` para convertir la calificación a una letra (A, B, C, D, F).
     3. Considera: 9-10 = A, 7-8.9 = B, 5-6.9 = C, 4-4.9 = D, 0-3.9 = F
     4. Muestra un mensaje apropiado para cada calificación.*/
        System.out.println("Introduce la calificación:");
        double calificacion = scanner.nextDouble();

        /*switch (calificacion){
            case (calificacion >= 0 && calificacion <4) -> System.out.println("Tu calificación es una F");
            case (calificacion >= 4 && calificacion <5) -> System.out.println("Tu calificación es una D");
            case (calificacion >= 5 && calificacion <7) -> System.out.println("Tu calificación es una C");
            case (calificacion >= 5 && calificacion <7) -> System.out.println("Tu calificación es una C");
            case (calificacion >= 7 && calificacion <9) -> System.out.println("Tu calificación es una B");
            case (calificacion >= 9 && calificacion <=10) -> System.out.println("Tu calificación es una A");
            default -> System.out.println("Escribe una calificacion entre 0 y 10");*/

        if (calificacion >= 0 && calificacion <4){
            System.out.println("Tu calificación es una F");
        } else if(calificacion >= 4 && calificacion <5){
            System.out.println("Tu calificación es una D");
        } else if(calificacion >= 5 && calificacion <7){
            System.out.println("Tu calificación es una C");
        } else if(calificacion >= 5 && calificacion <7){
            System.out.println("Tu calificación es una C");
        } else if(calificacion >= 7 && calificacion <9){
            System.out.println("Tu calificación es una B");
        } else if(calificacion >= 9 && calificacion <=10){
            System.out.println("Tu calificación es una A");
        } else {
            System.out.println("Escribe una calificacion entre 0 y 10");
        };
    }
    public void ejercicio2(){
        enum Moneda {Dolar(1), LIBRA, YEN, PESO}
        System.out.println("Indica la cantidad de euros que deseas cambiar:");
        double euros = scanner.nextDouble();
        System.out.println("Indica a qué moneda deseas cambiar:");
        System.out.println("1. DOLAR");
        System.out.println("2. LIBRA");
        System.out.println("3. YEN");
        System.out.println("4. PESO");
        int opcion = scanner.nextInt();
        int cambio;


        switch (opcion){
            case 1 -> {cambio = Moneda.Dolar}
            case 2 -> {cambio = Moneda.LIBRA}
            case 3 -> {cambio = Moneda.YEN}
            case 4 -> {cambio = Moneda.PESO}
        }

    }

}
