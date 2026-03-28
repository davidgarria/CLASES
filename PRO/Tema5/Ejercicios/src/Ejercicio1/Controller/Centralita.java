package Ejercicio1.Controller;
import Ejercicio1.Model.Llamada;
import java.util.ArrayList;

public class Centralita {
    private ArrayList<Llamada> listaLlamadas;
    private double caja;

    public Centralita(){
        listaLlamadas = new ArrayList<>();
    }

    public void registrarLlamada(Llamada llamada){
        listaLlamadas.add(llamada);
        this.caja += llamada.getCoste();
    }

    public void mostrarLlamadas(){
        /* for(Llamada llamada : listaLlamadas){
            llamada.mostrarDatos();
        } */
        // listaLlamadas.forEach(item->item.mostrarDatos());
        if (!listaLlamadas.isEmpty()){
            listaLlamadas.forEach(Llamada::mostrarDatos);
        } else {
            System.out.println("Está vacía");
        }

    }

    public ArrayList<Llamada> getListaLlamadas() {
        return listaLlamadas;
    }

    public void setListaLlamadas(ArrayList<Llamada> listaLlamadas) {
        this.listaLlamadas = listaLlamadas;
    }

    public double getCaja() {
        return caja;
    }

    public void setCaja(double caja) {
        this.caja = caja;
    }
}
