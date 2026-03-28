package carreras.model;
// Coche de carreras -> características y estadísticas

public class Coche {
    // Atributos - Características del coche
    private String marca, modelo;
    private int dorsal, puntosTotal;
    private double kmRecorridos;

    // Constructor: crea un coche

    public Coche(String marca, String modelo, int dorsal) {
        this.marca = marca;
        this.modelo = modelo;
        this.dorsal = dorsal;
        this.puntosTotal = 0; // Empieza con 0 puntos
        this.kmRecorridos = 0.0; // Empieza con 0 km
    }

    // Getter y Setter
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getDorsal() {
        return dorsal;
    }

    public int getPuntosTotal() {
        return puntosTotal;
    }

    public void setPuntosTotal(int puntosTotal) {
        this.puntosTotal = puntosTotal;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    // Avanzar coche ciertos km en cada vuelta.
    public void avanzar (double km){
        this.kmRecorridos += km;
    }

    // Reiniciar km a 0 en cada nueva carrera
    public void resetearKm (){
        this.kmRecorridos = 0.0;
    }

    // Suma puntos acumulados del campeonato
    public void sumarPuntos (int puntos){
        this.puntosTotal += puntos;
    }

    // Obtener nombre completo del coche
    public String getNombreCompleto(){
        return marca + " " + modelo;
    }

    // Mostrar información del coche en un formato más legible
    @Override
    public String toString() {
        return String.format("Dorsal #%d - %s %s (%.2f km, %d pts", dorsal, marca, modelo, kmRecorridos, puntosTotal);
    }
}
