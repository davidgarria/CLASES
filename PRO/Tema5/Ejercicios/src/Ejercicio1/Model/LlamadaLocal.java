package Ejercicio1.Model;

public final class LlamadaLocal extends Llamada {

    //Constructoes
    public LlamadaLocal(){}

    public LlamadaLocal(long nOrigen, long nDestino, int duracion){
        super(nOrigen, nDestino, duracion);
        // coste = 0
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Llamada LOCAL");
        super.mostrarDatos();
    }


}
