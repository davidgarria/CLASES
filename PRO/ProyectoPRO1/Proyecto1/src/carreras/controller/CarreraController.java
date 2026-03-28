package carreras.controller;

import carreras.model.Carrera;
import carreras.model.Coche;

import java.util.List;
import java.util.Random;

/*
Métod para que los coches avancen vuelta por vuelta
Genera kilómetros aleatorios para cada coche
Detecta cuándo termina la carrera
Coordina el flujo de la simulación
 */
public class CarreraController {
    private Random random; // Genera números aleatorios

    //Constructor: Inicializa controlador de carrera
    public CarreraController() {
        this.random = new Random();
    }

    //Simular carrera completa vuelta por vuelta
    public void simularCarrera(Carrera carrera){
        carrera.prepararCarrera(); //Resetear km de todos los coches

        System.out.println("INICIANDO: "+ carrera.getNombre());
        System.out.println("Distancia total: "+ carrera.getKmTotales());
        System.out.println("Participantes: "+ carrera.getParticipantes().size());
        System.out.println();

        //Bucle hasta que haya ganador
        int vuelta = 0;
        while (!carrera.hayGanador()){
            vuelta++;
            System.out.printf("---Vuelta: %d---%n",vuelta);
            //Hacer avanzar a cada coche
            for (Coche coche : carrera.getParticipantes()){
                //Generar km aleatorios entre 20 y 50
                double kmAvance = generarKmAleatorios();
                coche.avanzar(kmAvance);
                System.out.printf("#%-3d %s avanza %.2f km → Total: %.2f km%n", coche.getDorsal(), coche.getNombreCompleto(), kmAvance, coche.getKmRecorridos());
            }
        }
        System.out.println();

        carrera.setFinalizada(true);
        System.out.println("   ¡CARRERA FINALIZADA!");
        System.out.println("   Total de vueltas: "+vuelta);
        System.out.println();
    }

    //Generar número aleatorio entre 20 y 50
    private double generarKmAleatorios(){
        int kmEnteros = 20 + random.nextInt(31); //random.nextInt(31) genera un numero entre 0 y 30
        double decimales = random.nextDouble(); //decimales para agregar realismo
        return kmEnteros + decimales;
    }

    //Mostrar posiciones actuales de la carrera
    public void mostrarEstadoCarrera(Carrera carrera){
        List<Coche> clasificacion = carrera.obtenerClasificacion();

        System.out.println("ESTADO DE CARRERA:");
        for (int i = 0; i < clasificacion.size(); i++) {
            Coche coche = clasificacion.get(i);
            double porcentaje = (coche.getKmRecorridos() / carrera.getKmTotales()) * 100;

            System.out.printf("%dº - #%-3d %s: %.2f km (%.1f%%)%n",i+1, coche.getDorsal(), coche.getNombreCompleto(), coche.getKmRecorridos(),porcentaje);
        }
        System.out.println();
    }
}
