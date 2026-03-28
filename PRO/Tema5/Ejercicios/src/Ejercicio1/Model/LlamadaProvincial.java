package Ejercicio1.Model;

public final class LlamadaProvincial extends Llamada implements Tarificable{

    public LlamadaProvincial(){}

    public LlamadaProvincial(long nOrigen, long nDestino, int duracion){
        super(nOrigen, nDestino, duracion);
        calcularCoste();
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Llamada PROVINCIAL");
        super.mostrarDatos();
    }

    @Override
    public void calcularCoste() {
        double costeSegundo = 0.15;
        setCoste(getDuracion()* costeSegundo);
    }
}
