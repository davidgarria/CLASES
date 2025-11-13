import java.util.Scanner;

public class Ejercicio {
    Scanner scanner;

    public void ejercicio1(){
    /* Hágase una aplicación que permita introducir el número de bebidas y bocadillos
    comprados (valores entre 0 y 20). Además se podrá introducir el precio de cada
    bebida (valor entre 0.00 € y 3.00 €) y de cada bocadillo (valor entre 0.00 € y 5.00
    €). También se podrá introducir el número de alumnos que realizaron la compra
    (valor entre 0 y 10). Se mostrará el total de la compra (con el subtotal de las
    bebidas y de los bocadillos) y la cantidad que debe pagar cada alumno
    redondeada a 2 decimales. (CosteBar) */
        scanner = new Scanner(System.in);
        System.out.println("Cantidad de bocadillos comprados: ");
        int cantidadBocadillos = scanner.nextInt();
        System.out.println("Cantidad de bebidas compradas: ");
        int cantidadBebidas = scanner.nextInt();
        System.out.println("Precio bocadillos: ");
        double precioBocadillo = scanner.nextDouble();
        System.out.println("Precio bebidas: ");
        double precioBebida = scanner.nextDouble();
        System.out.println("¿A dividir entre cuantos alumnos? ");
        int cantidadAlumnos = scanner.nextInt();

        double subtotalBocadillos = cantidadBocadillos*precioBocadillo;
        double subtotalBebidas = cantidadBebidas*precioBebida;
        double subtotal = subtotalBebidas+subtotalBocadillos;
        double subtotalAlumno = subtotal/cantidadAlumnos;

        System.out.printf("Subtotal bocadillos: %.2f%n",subtotalBocadillos);
        System.out.printf("Subtotal bebidas: %.2f%n",subtotalBebidas);
        System.out.printf("Total compra: %.2f%n",subtotal);
        System.out.printf("A pagar por alumno: %.2f%n",subtotalAlumno);
        scanner.close();
        scanner = null;
    }
    public void ejercicio2(){
        scanner = new Scanner(System.in);
    /* Permítase introducir el valor con IVA de una compra con dos decimales (la
    compra no puede ser superior a 500€ ni inferior a 0€) y el valor del IVA de dicha
    compra (valor entero entre 0 y 25%).¿Cuánto costó la compra sin IVA? ¿Cuánto fue
    el IVA? Muéstrese los resultados redondeados a dos decimales. (Compra) */
        // 1- Solicitar datos
        System.out.println("Valor total de la compra: ");
        double totalCompra = scanner.nextDouble();
        System.out.println("Porcentaje de IVA: ");
        int IVA = scanner.nextInt();

        // 2- Realizar calculos
        double IVAtotal = ((double)IVA / 100) * totalCompra;
        double comprasinIVA = totalCompra - IVAtotal;

        // 3- Mostrar resultados
        System.out.printf("Compra: %.2f%n",comprasinIVA);
        System.out.printf("IVA: %.2f%n",IVAtotal);

        scanner.close();
        scanner = null;
    }
    public void ejercicio3(){
        scanner = new Scanner(System.in);
    /* Se introducen los 5 dígitos de un número (decenas de mil, unidades de mil,
    centenas, decenas y unidades), y se obtiene el número correspondiente.
    (Numero) */
        // 1- Solicitar datos
        System.out.println("Decenas de mil: ");
        int decenasMil = scanner.nextInt();
        System.out.println("Unidades de mil: ");
        int unidadesMil = scanner.nextInt();
        System.out.println("Centenas: ");
        int centenas = scanner.nextInt();
        System.out.println("Decenas: ");
        int decenas = scanner.nextInt();
        System.out.println("Unidades: ");
        int unidades = scanner.nextInt();

        // 2- Realizar calculos
        int numero = (decenasMil*10000)+(unidadesMil*1000)+(centenas*100)+(decenas*10)+unidades;

        // 3- Mostrar resultados
        System.out.println("Número introducido: "+numero);

        scanner.close();
        scanner = null;
    }
    public void ejercicio4(){
    // Hágase un programa que convierta segundos en horas, minutos y segundos (Segundos)
        scanner = new Scanner(System.in);
        // 1- Pedir datos
        System.out.println("Indica la cantidad de segundos totales: ");
        int segundosTotales = scanner.nextInt();
        // 2- Realizar calculos
            // 1 hora -> 3600 segundos
            // 1 hora -> 60 minutos
            // 1 minuto -> 60 segundos
        int horas = segundosTotales/3600;
        int minutos = (segundosTotales%3600)/60;
        int segundos = segundosTotales%60;
        // 3- Mostrar resultados
        System.out.println("Horas: "+horas);
        System.out.println("Minutos: "+minutos);
        System.out.println("Segundos: "+segundos);

        scanner.close();
        scanner = null;
    }

}
