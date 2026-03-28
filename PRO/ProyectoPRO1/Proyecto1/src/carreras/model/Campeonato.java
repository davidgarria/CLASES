package carreras.model;

import java.util.ArrayList;
import java.util.List;

/*
Campeonato completo (varias carreras):
-Lista de carreras
-Coches que participan en todo el campeonato
-Acumula puntos de todas las carreras
-Muestra la clasificación general del campeonato
-Determina el campeón final
 */

public class Campeonato {
    // Atributos
    private String nombre;
    private List<Carrera> carreras;
    private List<Coche> participantes;
    private int carreraActual;
    
    // Constructor - crea un campeonato
    public Campeonato(String nombre) {
        this.nombre = nombre;
        this.carreraActual = 0;
        this.participantes = new ArrayList<>();
        this.carreras = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }

    public List<Coche> getParticipantes() {
        return participantes;
    }

    public int getCarreraActual() {
        return carreraActual;
    }

    public int getTotalCarreras(){
        return carreras.size();
    }
    
    // Añade un coche a los participantes del campeonato
    public void agregarParticipante(Coche coche){
        participantes.add(coche);
    }
    
    // Añade una carrera al campeonato
    public void agregarCarrera(Carrera carrera){
        carreras.add(carrera);
    }

    // Avanzar a la siguiente carrera
    public void avanzarCarrera(){
        carreraActual++;
    }

    // Verifica si el campeonato ha terminado
    public boolean haTerminado(){
        return  carreraActual >= carreras.size();
    }

    // Clasificacion general del campeonato por puntos totales
    public List<Coche> obtenerClasificacionGeneral(){
        List<Coche> clasificacion = new ArrayList<>(participantes);
        //Ordenar por puntos usando algoritmo burbuja
        for (int i = 0; i < clasificacion.size()-1; i++) {
            for (int j = 0; j < clasificacion.size()-1; j++) {
                if (clasificacion.get(j).getPuntosTotal()<clasificacion.get(j+1).getPuntosTotal()){
                    Coche temporal = clasificacion.get(j);
                    clasificacion.set(j, clasificacion.get(j+1));
                    clasificacion.set(j+1, temporal);
                }
            }
        }
        return clasificacion;
    }

    // Obtiene lider del campeonato
    public Coche obtenerLider(){
        if (participantes.isEmpty()){
            return null;
        }

        List<Coche> clasificacion = obtenerClasificacionGeneral();
        return clasificacion.get(0);
    }

    // Asigna puntos a los coches según su posición
    public void asignarPuntos(List<Coche> clasificacion){
        // Puntos por posición
        int[] puntosPorPosicion = {10, 8, 6, 5, 4, 3, 2, 1};

        for (int i = 0; i < clasificacion.size(); i++) {
            Coche coche = clasificacion.get(i);
            if (i < puntosPorPosicion.length){
                coche.sumarPuntos(puntosPorPosicion[i]);
            }
            // si hay más de 8 coches, no suman puntos
        }
    }

    // Clasificacion general del campeonato
    public void mostrarClasificacionGeneral(){
        List<Coche> clasificacion = obtenerClasificacionGeneral();
        System.out.println("=== CLASIFICACIÓN GENERAL - "+nombre+" ===");
        System.out.printf("%-9s %-8s %-20s %-10s%n","Posición", "Dorsal", "Coche", "Puntos");
        System.out.println("----------------------------------------------");

        for (int i = 0; i < clasificacion.size(); i++) {
            Coche coche = clasificacion.get(i);
            System.out.printf("%-9s %-8s %-20s %d pts%n",i+1, coche.getDorsal(), coche.getNombreCompleto(), coche.getPuntosTotal());
        }
        System.out.println("----------------------------------------------");

        if (!clasificacion.isEmpty()){
            Coche lider = clasificacion.get(0);
            System.out.printf(" LIDER DEL CAMPEONATO: %s (%d puntos)%n",lider.getNombreCompleto(), lider.getPuntosTotal());
        }
        System.out.println();

    }

    // Resumen del campeonato tras cada carrera
    public void mostrarResumen(){
        System.out.printf(" RESUMEN TRAS CARRERA %d de %d%n", carreraActual, carreras.size());
        // Top 3
        List<Coche> clasificacion = obtenerClasificacionGeneral();
        int top = Math.min(3,clasificacion.size());

        for (int i = 0; i < top; i++) {
            Coche coche = clasificacion.get(i);
            System.out.printf("%d - %s: %d puntos%n",i+1, coche.getNombreCompleto(), coche.getPuntosTotal());
        }
        System.out.println();
    }

    // Muestra al campeón al finalizar
    public void mostrarCampeon(){
        Coche campeon = obtenerLider();
        if (campeon == null){
            System.out.println("No hay campeón (no hay participantes)");
            return;
        }
        System.out.println("      ¡CAMPEÓN DEL CAMPEONATO!");
        System.out.println();
        System.out.println("      "+campeon.getNombreCompleto());
        System.out.println("      Dorsal: #"+campeon.getDorsal());
        System.out.println("      Puntos totales: "+campeon.getPuntosTotal());
        System.out.println();
    }

    //Reinicia todos los puntos (para iniciar nuevo campeonato con los mismos coches)
    public void reiniciarPuntos(){
        for (Coche coche : participantes){
            coche.setPuntosTotal(0);
        }
        carreraActual = 0;
    }
}
