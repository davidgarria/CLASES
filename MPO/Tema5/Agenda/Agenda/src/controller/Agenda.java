package controller;

import java.util.ArrayList;

public class Agenda {
    // Atributos -> cualificar
    // [nombre, apellido, correo, telefono, dni]
    private ArrayList<Object[]> listaContactos;

    public Agenda(){
        listaContactos = new ArrayList<>();
    }

    // Métodos -> funciones - acciones que quiero que el objeto pueda ejecutar

    // Agregar
    public void agregarContacto(Object[] contacto){
        listaContactos.add(contacto);
        System.out.println("Contacto agregado correctamente");
    }

    // Buscar
    public void buscarContactoPorDNI(String dni){
        for (Object[] item : listaContactos){
            if(item[3].equals(dni)){
                System.out.println("Contacto encontrado");
                System.out.println("Nombre: "+item[0]);
                System.out.println("Apellido: "+item[1]);
                System.out.println("Correo: "+item[2]);
                System.out.println("Telefono: "+item[4]);
                return;
            }
        }
        System.out.println("No encontrado");
    }

    // Borrar
    public void borrarContactoPorDNI(String dni){
        for (Object[] item : listaContactos){
            if (item[3].equals(dni)){
                listaContactos.remove(item);
                System.out.println("Contacto eliminado");
                return;
            }
        }
        System.out.println("No encontrado");
    }

    // Listar
    public void listarContactos(){
        for (Object[] item : listaContactos){
            System.out.println("Nombre: "+item[0]);
            System.out.println("Apellido: "+item[1]);
            System.out.println("Correo: "+item[2]);
            System.out.println("DNI: "+item[3]);
            System.out.println("Telefono: "+item[4]);
            System.out.println();
        }
    }

    public ArrayList<Object[]> getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(ArrayList<Object[]> listaContactos) {
        this.listaContactos = listaContactos;
    }
}
