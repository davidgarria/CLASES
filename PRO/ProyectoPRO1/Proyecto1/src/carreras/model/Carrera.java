package carreras.model;
/*
Una carrera individual con participantes y resultados
-Lista de coches
-Distancia total de la carrera
-Posiciones del podio
 */

import java.util.ArrayList;
import java.util.List;

public class Carrera {
    // Atributos
    private String nombre;          // Nombre de la carrera
    private double kmTotales;       // Distancia de la carrera
    private List<Coche> participantes;
    private boolean finalizada;     // Avisa cuando acaba la carrera

    // Constructor: crea una carrera
    public Carrera (String nombre, double kmTotales){
        this.nombre = nombre;
        this.kmTotales = kmTotales;
        this.participantes = new ArrayList<>(); // Inicializa lista vacía
        this.finalizada = false;
    }

    // Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public double getKmTotales() {
        return kmTotales;
    }

    public List<Coche> getParticipantes() {
        return participantes;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    // Añade coche a la lista de participantes
    public void agregarParticipante (Coche coche){
        participantes.add(coche);
    }

    // Verifica si algún coche ha alcanzado la distancia total
    public boolean hayGanador(){
        for (Coche coche : participantes) {
            if (coche.getKmRecorridos() >= kmTotales){
                return true;
            }
        }
        return false;
    }

    // Obtiene coche en primer lugar
    public Coche obtenerLider(){
        if (participantes.isEmpty()){
            return null;
        }
        Coche lider = participantes.get(0); // Empezamos por el primero
        for (Coche coche : participantes){
            if (coche.getKmRecorridos() > lider.getKmRecorridos()){
                lider = coche;
            }
        }
        return lider;
    }

    // Obtener clasificación usando algoritmo de burbuja
    public List<Coche> obtenerClasificacion() {
        List<Coche> clasificacion = new ArrayList<>(participantes);
        for (int i = 0; i < clasificacion.size()-1; i++) {
            for (int j = 0; j < clasificacion.size()-1; j++) {
                if (clasificacion.get(j).getKmRecorridos() < clasificacion.get(j+1).getKmRecorridos()){
                    Coche temporal = clasificacion.get(j);
                    clasificacion.set(j, clasificacion.get(j+1));
                    clasificacion.set(j+1, temporal);
                }
            }
        }
        return clasificacion;
    }

    // Muestra el podio de la carrera
    public void mostrarPodio(){
        List<Coche> clasificacion = obtenerClasificacion();
        System.out.println("\n=== PODIO - "+nombre+" ===");

        // Mostrar los 3 primeros, si no hay más de dos coches, mostrar menos
        int posiciones = Math.min(3, clasificacion.size());
        for (int i = 0; i < posiciones; i++) {
            Coche coche = clasificacion.get(i);
            System.out.printf("%dº - %s (%.2f km)%n",i+1, coche.getNombreCompleto(), coche.getKmRecorridos());
        }
        System.out.println();
    }

    // Clasificación completa
    public void mostrarClasificacionCompleta(){
        List<Coche> clasificacion = obtenerClasificacion();

        System.out.println("\n=== CLASIFICACION - "+nombre+" ===");
        System.out.printf("%-9s %-8s %-20s %-10s%n","Posición", "Dorsal", "Coche", "Km");
        System.out.println("----------------------------------------------");

        for (int i = 0; i < clasificacion.size(); i++) {
            Coche coche = clasificacion.get(i);
            System.out.printf("%-9s %-8s %-20s %-10s%n",i+1, coche.getDorsal(), coche.getNombreCompleto(), coche.getKmRecorridos());
        }
        System.out.println();
    }

    // Reinicia Km de cada participante para iniciar otra carrera
    public void prepararCarrera(){
        for (Coche coche : participantes){
            coche.resetearKm();
        }
        finalizada = false;
    }
}
