import java.util.Scanner;

public class Bonoloto {
    Scanner scanner = new Scanner(System.in);

    private int[] numeroSistema = new int[5]; // 0,0,0,0,0
    private int[] numeroUsuario = new int[5]; // 0,0,0,0,0
    private int aciertos = 0;

    public void iniciarJuego(){
        // Al iniciar el juego pasan dos cosas
        // 1. Sale de la máquina 5 números que serán los números del sistema 0-20.
        // No se pueden repetir números, si se repiten, se vuelve a escoger otro número
        aciertos = 0;
        for (int i = 0; i < 5; i++){
            numeroSistema[i] = (int) (Math.random()*21);
        }

        // 2. Se le piden 5 números al usuario
        System.out.println("Introduce los 5 números con los que quieras jugar (entre el 0 y el 20)");
        for (int i = 0; i < 5; i++) {
            int numeroIntroducido;
            boolean repetido;
            do {
                repetido = false;
                numeroIntroducido = scanner.nextInt();
                if (numeroIntroducido < 0 || numeroIntroducido > 20){
                    System.out.println("Número fuera de rango, introduce otro número");
                }
                for (int j = 0; j < i; j++) {
                    if (numeroUsuario[j] == numeroIntroducido){
                        System.out.println("Número repetido, introduce otro número.");
                        repetido = true;
                        break;
                    }
                }
            } while (numeroIntroducido < 0 || numeroIntroducido > 20 || repetido);
            numeroUsuario[i] = numeroIntroducido;
        }

        for (int item : numeroUsuario){
            buscarNumero(item);
        }

        listarNumerosUsuario();
        listarNumerosSistema();

        System.out.printf("Número de aciertos: %d%n",aciertos);

    }

    public void buscarNumero(int numero){
        for (int item : numeroSistema){
            if (item == numero){
                aciertos++;
                break;
            }
        }
    }

    public void listarNumerosSistema(){
        System.out.println("Los números del sistema son: ");
        for (int item : numeroSistema){ // el Foreach solo sirve para lectura de colecciones
            System.out.printf("%d ",item);
        }
        System.out.println();
    }

    public void listarNumerosUsuario(){
        System.out.println("Los números del usuario son: ");
        for (int item: numeroUsuario){
            System.out.printf("%d ",item);
        }
        System.out.println();
    }

    public boolean buscarCoincidencia(int numero){
        for (int item : numeroSistema){
            if (item == numero){
                return true;
            }
        }
        return false;
    }

}
