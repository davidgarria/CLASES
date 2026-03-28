package Ejercicio1;

import Ejercicio1.Controller.Centralita;
import Ejercicio1.Model.Llamada;
import Ejercicio1.Model.LlamadaLocal;
import Ejercicio1.Model.LlamadaNacional;
import Ejercicio1.Model.LlamadaProvincial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        /*
        LlamadaLocal llamadaLocal = new LlamadaLocal(1,23,10);
        llamadaLocal.mostrarDatos();

        LlamadaProvincial llamadaProvincial = new LlamadaProvincial(123,123,5);
        llamadaProvincial.mostrarDatos();

        LlamadaNacional llamadaNacional = new LlamadaNacional(123, 123, 10, 2);
        llamadaNacional.mostrarDatos(); */

        Scanner scanner = new Scanner(System.in);
        Centralita centralita = new Centralita();

        int opcion;
        do {
            System.out.println();
            System.out.println("Indica que acción deseas realizar");
            System.out.println("1. Añadir llamada");
            System.out.println("2. Listar llamada");
            System.out.println("3. Mostrar Costes");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1 -> {
                    Llamada llamada;
                    System.out.println("Qué tipo de llamada quieres agregar?\n1.Local \n2.Provincial \n3.Nacional");
                    int tipo = scanner.nextInt();
                    System.out.println("Indica nOrigen");
                    long nOrigen = scanner.nextLong();
                    System.out.println("Indica nDestino");
                    long nDestino = scanner.nextLong();
                    System.out.println("Indica duración");
                    int duracion = scanner.nextInt();
                    if (tipo == 3){
                        System.out.println("Indica Franja");
                        int franja = scanner.nextInt();
                        llamada = new LlamadaNacional(nOrigen,nDestino,duracion,franja);
                    } else if(tipo == 2) {
                        llamada = new LlamadaProvincial(nOrigen,nDestino,duracion);
                    } else {
                        llamada = new LlamadaLocal(nOrigen,nDestino,duracion);
                    }
                    centralita.registrarLlamada(llamada);
                    System.out.println("Llamada registrada con éxito");
                }
                case 2 -> centralita.mostrarLlamadas();
                case 3 -> System.out.println(centralita.getCaja());
                case 4 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no contemplada");
            }
        } while (opcion != 4);
    }

}
