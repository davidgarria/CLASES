import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // System.out.println("Proyecto metodos. \nVamos a realizar llamadas a metodos.");
        // saludar("Borja");
        // saludar("Maria");

        Calculadora operacionesMatematicas = new Calculadora();
        //operacionesMatematicas.sumar(1,2);
        //operacionesMatematicas.restar(1,5);
        //operacionesMatematicas.multiplicar(2,8);
        //operacionesMatematicas.dividir((double)8,(double)5);
        //operacionesMatematicas.rectangulo(5,10);

        //System.out.println(operacionesMatematicas.multiplicar2(7,3)*3);
        System.out.println("Indica qué número quieres validar:");
        int numeroValidar = scanner.nextInt();
        System.out.println("El numero es mayor que cero: " +operacionesMatematicas.validarNumero(numeroValidar));
    }

    public static void saludar(String nombre){
        System.out.println("Hola "+nombre);
        System.out.println("Encantado de saludarte");
        System.out.println("Vamos a practicar el llamado de metodos");
        System.out.println("Animo!");
    }



}
