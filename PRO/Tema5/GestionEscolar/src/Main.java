import controller.Colegio;
import model.Alumno;
import model.Asignatura;
import model.Profesor;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[]Args){
        Scanner scanner = new Scanner(System.in);
        Colegio colegio = new Colegio();
        int opcion;

        do {
            System.out.println("1- Matricular alumno");
            System.out.println("2- Poner notas alumno");
            System.out.println("3- Ver notas alumno y media");
            System.out.println("4- Buscar expediente");
            System.out.println("5- Salir");
            System.out.println("¿Que quieres hacer?");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1->{
                    System.out.println("Nombre del alumno a matricular:");
                    String nombre = scanner.next();
                    colegio.matricularAlumno(nombre);}
                case 2->{
                    colegio.ponerNotas();
                }
                case 3->{
                    colegio.mostrarDatos();
                }
                case 4->{
                    System.out.println("Indica la matricula del alumno a buscar");
                    int nAlumno = scanner.nextInt();
                    colegio.buscarExpediente(nAlumno);
                }
                case 5->{
                    System.out.println("Saliendo...");
                }
            }
            System.out.println();

        } while (opcion!=5);


        /*
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Profesor profesor = new Profesor();

        for (int i = 1; i < 5; i++) {
            System.out.println("Introduce el nombre del alumno: ");
            String nombre = scanner.next();
            listaAlumnos.add(new Alumno (i, nombre, new Asignatura(1), new Asignatura(2), new Asignatura(3)));
        }
        System.out.println("Procedemos a poner las notas de todos los alumnos");
        for (Alumno item : listaAlumnos) {
            profesor.ponerNotas(item);
            item.mostrarDatos();
            System.out.println("La media del alumno es: "+profesor.calcularMedia(item));
            System.out.println();
        }
         */

        /*
        Asignatura programacion = new Asignatura(1);
        Asignatura sistemas = new Asignatura(2);
        Asignatura marcas = new Asignatura(3);
         */

        /*
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(new Alumno(1, 1,2,3));
        listaAlumnos.add(new Alumno(2, 1,2,3));
        listaAlumnos.add(new Alumno (3, new Asignatura(1), new Asignatura(2), new Asignatura(3)));
        listaAlumnos.add(new Alumno (4, new Asignatura(1), new Asignatura(2), new Asignatura(3)));
        listaAlumnos.add(new Alumno (5, new Asignatura(1), new Asignatura(2), new Asignatura(3)));
         */

        /*
        Alumno borja = new Alumno(new Asignatura(1), new Asignatura(2), new Asignatura(3));
        Alumno celia = new Alumno(new Asignatura(1), new Asignatura(2), new Asignatura(3));
        Alumno claudia = new Alumno(new Asignatura(1), new Asignatura(2), new Asignatura(3));

        //celia.mostrarDatos();
        Profesor profesor = new Profesor();
        profesor.ponerNotas(borja);
        profesor.ponerNotas(celia);
        System.out.println("La media obtenida de borja es "+profesor.calcularMedia(borja));
        System.out.println("La media obtenida de celia es "+profesor.calcularMedia(celia));
        System.out.println("La media obtenida de claudia es "+profesor.calcularMedia(claudia));
         */
    }

}
