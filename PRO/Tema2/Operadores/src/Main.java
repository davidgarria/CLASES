import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Operadores operadores = new Operadores();
        //operadores.operadoresAritmeticos();
        //operadores.operadoresComparacion();

        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Indica el salario anual que quieres ganar: ");
        double salario = lectorTeclado.nextDouble();
        System.out.println("Indica tu edad: ");
        int edad = lectorTeclado.nextInt();
        System.out.println("Tienes carnet de coche (responde true o false): ");
        boolean carnet = lectorTeclado.nextBoolean();

        operadores.evaluarCandidato(salario,edad,carnet);

    }
}
