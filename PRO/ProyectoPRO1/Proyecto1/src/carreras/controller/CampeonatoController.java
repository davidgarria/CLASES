package carreras.controller;

import carreras.model.Campeonato;
import carreras.model.Carrera;
import carreras.model.Coche;

import java.util.List;
import java.util.Scanner;

public class CampeonatoController {
    private CarreraController carreraController;
    private Scanner scanner;

    public CampeonatoController(){
        this.carreraController = new CarreraController();
        this.scanner = new Scanner(System.in);
    }

    // Ejecutar campeonato completo
    public void ejecutarCampeonato(Campeonato campeonato){
        System.out.println();
        System.out.println("        INICIANDO CAMPEONATO: "+campeonato.getNombre());
        System.out.println();
        System.out.println("  Total de carreras: "+campeonato.getTotalCarreras());
        System.out.println("  Participantes: "+campeonato.getParticipantes().size());
        System.out.println();

        // Ejecutar cada carrera del campeonato
        for (int i = 0; i < campeonato.getTotalCarreras(); i++) {
            Carrera carrera = campeonato.getCarreras().get(i);
            System.out.printf("CARRERA %d de %d: %s",i+1, campeonato.getTotalCarreras(), carrera.getNombre());

            carreraController.simularCarrera(carrera); // Simular carrera

            List<Coche> clasificacion = carrera.obtenerClasificacion(); //Obtener clasificación

            carrera.mostrarPodio(); // Mostrar podio

            campeonato.asignarPuntos(clasificacion); //Asignar puntos y mostrar puntos otorgados
            mostrarPuntosOtorgados(clasificacion);

            campeonato.avanzarCarrera(); // Siguiente carrera

            campeonato.mostrarResumen(); // Resumen del campeonato

            //Si no es la última carrera, preguntar si continuar
            if (i < campeonato.getTotalCarreras()) {
                System.out.println("Presiona ENTER para continuar a la siguiente carrera");
                scanner.nextLine();
            }
        }

        finalizarCampeonato(campeonato); // El campeonato ha terminado
    }

    // Mostrar puntos otorgados en una carrera
    private void mostrarPuntosOtorgados(List<Coche> clasificacion){
        int[] puntosPorPosicion = {10,8,6,5,4,3,2,1};

        System.out.println("PUNTOS OTORGADOS:");
        for (int i = 0; i < clasificacion.size() && i < puntosPorPosicion.length; i++) {
            Coche coche = clasificacion.get(i);
            int puntos = puntosPorPosicion[i];
            System.out.printf("%dº - %s: +%d puntos%n",i+1, coche.getNombreCompleto(),puntos);
        }
        System.out.println();
    }

    //Finalizar campeonato y mostrar resulatos finales
    private void finalizarCampeonato(Campeonato campeonato){
        System.out.println();
        System.out.println("CAMPEONATO FINALIZADO");
        System.out.println();

        // Mostrar: clasificación, al campeón
        campeonato.mostrarClasificacionGeneral();
        campeonato.mostrarCampeon();
        System.out.println();
    }

}
