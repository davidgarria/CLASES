package ejercicio3;

import java.util.Scanner;

public class Main {
/*
Crea un programa que permita al usuario crear una pizza personalizada
eligiendo ingredientes desde un menú.
Reglas:
• El programa muestra al usuario un menú con al menos cinco ingredientes
posibles y su precio individual. Ejemplo: queso (10), jamón (15), piña
(8), tomate (6), pepperoni (12).
• El usuario puede agregar hasta 5 ingredientes diferentes a su pizza,
eligiendo uno por uno. El programa debe evitar la cantidad máxima no
se supere.
• Por cada ingrediente elegido, el programa suma el precio
correspondiente.
• Después de cada selección, muestra al usuario la lista actual de
ingredientes y el subtotal acumulado.
• Cuando el usuario termina, muestra la pizza final detallada (con todos
los ingredientes seleccionados) y el total a pagar.
 */
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String ingredientes = "";

        System.out.println("Bienvenido al menú de pizzas personalizadas:");
        System.out.println("1. Queso ($10)");
        System.out.println("2. Jamón ($15)");
        System.out.println("3. Piña ($8)");
        System.out.println("4. Tomate ($6)");
        System.out.println("5. Pepperoni ($12)");
        System.out.println("Selecciona el primer ingrediente de tu pizza: ");
        int ingrediente = scanner.nextInt(), precioPizza = 0, precioMaximo = 50;


        for (int i = 0; i < 5; i++) {
            switch (ingrediente) {
                case 1 -> {
                    precioPizza += 10;
                    ingredientes += "Queso ";
                }
                case 2 -> {
                    precioPizza += 15;
                    ingredientes += "Jamon ";
                }
                case 3 -> {
                    precioPizza += 8;
                    ingredientes += "Piña ";
                }
                case 4 -> {
                    precioPizza += 6;
                    ingredientes += "Tomate ";

                }
                case 5 -> {
                    precioPizza += 12;
                    ingredientes += "Pepperoni ";
                }
                case 0 -> {
                    System.out.println("Pedido listo!");
                }
                default -> {
                    System.out.println("Coloca un número válido.");
                    i--;
                }
            }
            if (ingrediente == 0) {
                break;
            } else if(precioPizza > precioMaximo) {
                System.out.printf("Precio máximo de $%d superado%n", precioMaximo);
                break;
            }

            System.out.println("Ingredientes que llevas: "+ingredientes);
            System.out.println("Selecciona tu siguiente ingrediente o coloca '0' para terminar");
            ingrediente = scanner.nextInt();
        }

        System.out.println("Saliendo pizza con: "+ingredientes);
        System.out.println("El precio total de tu pizza es de: $"+precioPizza);
    }
}
