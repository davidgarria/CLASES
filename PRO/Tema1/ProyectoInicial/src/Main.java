public class Main {

    public static void main(String[] args){
        // Este comentario es solo de una linea. Aclaracion BREVE de lo que hace el metodo
        // TODO indica lo que te falta por hacer to-do. view-toolwindos-TODO
        /*
        Este comentario lo utilizo cuando necesito una explicacion
        un poco mas larga, ya que puede usar mas lineas
         */
        System.out.println("Esta es una linea de codigo.\nSegunda linea.");
        System.out.print("Esta es otra linea de codigo. ");
        System.out.println("Esta es una linea de codigo seguida.");

        String nombrecompleto = "David Gonzalez";
        final String NUMERO_DNI = "12345678A"; // si tiene "final" no puede cambiar su valor nunca
        char letraCarnet = 'E';
        int edad = 28;
        edad = edad +1;
        float altura = 1.79f;
        double peso = 78.234324;
        boolean experiencia = true;

        System.out.println("Mi nombre completo es: "+nombrecompleto);
        System.out.println("Mi edad es: "+edad);
        System.out.println("Mi altura es: "+altura+"cm");
        System.out.println("Mi peso es: "+peso+"kg");
        System.out.println("Tengo experiencia: "+experiencia);

        //ejercicios Tema 1
        int puntuacion = 0;
        System.out.println("Puntuacion incial: "+puntuacion);
        puntuacion = puntuacion + 5;
        System.out.println("Puntuacion despues de primera modificacion: "+puntuacion);
        puntuacion = puntuacion + 5;
        System.out.println("Puntuacion despues de segunda modificacion: "+puntuacion);
        puntuacion = puntuacion + 5;
        System.out.println("Puntuacion final: "+puntuacion);
    }
}