import java.util.Locale;
import java.util.Scanner;

public class SentenciaSwitch {

    public void usoSwitchInt(){
        int valor = 1;
        // 1, 5, 7, resto
        switch (valor){
            case 1:
                // cuerpo cuando la variable toma valor 1
                System.out.println("Toma el valor de 1");
                break;
            case 5:
                // cuerpo cuando la variable toma valor 5
                System.out.println("Toma el valor de 5");
                break;
            case 7:
                // cuerpo cuando la variable toma valor 7
                System.out.println("Toma el valor de 7");
                break;
            default:
                System.out.println("Valor no contemplado");
        }
        System.out.println("Terminado el bloque switch");
    }
    public void usoSwitchString(){
        String name = "OsCar";
        switch (name.toLowerCase()){
            case "oscar":
                System.out.println("Wasacaca");
                break;
            case "diego":
                System.out.println("Comelón");
                break;
            case "ana":
                System.out.println("Loca");
                break;
            default:
                System.out.println("nombre no contemplado");
        }
        System.out.println("Terminado el bloque switch");
    }
    public void usoSwitchLambda() {
        int nota = 7;
        switch (nota) {
            case 1 -> {
                System.out.println("Seleccionado el caso 1");
            }
            case 2 -> {
                System.out.println("Seleccionado el caso 2");
            }
            case 3 -> {
                System.out.println("Seleccionado el caso 3");
            }
            case 4, 5, 6, 7, 8, 9 -> {
                System.out.println("Seleccionado el caso 4");
            }
            default -> {
                System.out.println("Sin contemplar");
            }
        }
    }
    public void menuOpciones() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu operaciones");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multi");
        System.out.println("4. Dividir");
        System.out.println("5. Modulo");
        System.out.println("Que operacion quieres hacer");
        int opcion = scanner.nextInt();
        System.out.println("Dime el primer operando");
        int op1 = scanner.nextInt();
        System.out.println("Dime el segundo operando");
        int op2 = scanner.nextInt();
        double resultado = 0;
        switch (opcion) {
            case 1 -> {
                System.out.println("Vas a sumar");
                resultado = op1 + op2;
            }
            case 2 -> {
                System.out.println("Vas a restar");
                resultado = op1 - op2;
            }
            case 3 -> {
                System.out.println("Vas a multiplicar");
                resultado = op1 * op2;
            }
            case 4 -> {
                System.out.println("Vas a dividir");
                if (op2 == 0) {
                    System.out.println("Resultado incierto, se aplica la regla de 0");
                } else {
                    resultado = (double) op1 / op2;
                }
            }
            case 5 -> {
                System.out.println("Vas a modulo");
                resultado = op1 % op2;
            }
            default -> {
                System.out.println("Datos incorrectos");
                // resultado = 0
            }
        }
        System.out.printf("El resultado de la operacion es %.1f%n", resultado);
    }


}
