package cuadradomagico;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("---GENERADOR DE CUADRADO MÁGICO---");
        System.out.println();
        System.out.println("Introduce el tamaño de la matriz: ");
        int n = scanner.nextInt();

        // Verificamos que sea mayor que 2
        if (n <= 2){
            System.out.println();
            System.out.println("ERROR: El tamaño debe ser superior a 2");
            scanner.close();
            return;
        }

        // Advertencia para matrices grandes
        if (n > 4){
            System.out.println();
            System.out.println("ADVERTENCIA: para matrices > 4, el tiempo de búsqueda puede ser muy largo");
            System.out.println("(varios minutos u horas). ¿Quiéres continuar de todos modos? (s/n)");
            String respuesta = scanner.next();

            if(!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("si")){
                System.out.println("Programa cancelado");
                scanner.close();
                return;
            }
        }

        System.out.println();
        System.out.printf("Buscando cuadrado mágico de %d x %d, espere un momento (puede tardar varios minutos)%n",n,n);

        // Generar el cuadrado mágico
        GeneradorCuadradoMagico generador = new GeneradorCuadradoMagico(n);
        CuadradoMagico cuadrado = generador.generar();

        // Mostrar resultados
        System.out.println();
        System.out.println("----CUADRADO MÁGICO ENCONTRADO----");
        System.out.println();

        cuadrado.mostrar();

        System.out.println();
        System.out.printf("Constante mágica: %d%n",cuadrado.getConstanteMagica());
        System.out.printf("Intentos realizados: %d%n",generador.getIntentos());

        scanner.close();
    }
}
