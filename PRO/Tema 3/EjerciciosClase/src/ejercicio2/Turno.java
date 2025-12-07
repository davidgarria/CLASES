package ejercicio2;

public class Turno {

    public static int turno(int puntuacion){

        int turno = 0;
        for (int i = 0; i < 3; i++) {
            int dardo = (int) (Math.random() * 61);
            turno += dardo;
            System.out.printf("Dardo %d: %d puntos. ",i+1,dardo);
            if ((puntuacion-turno)==0){
                break;
            } else if ((puntuacion-turno) < 0){
                System.out.println("Te pasaste!");
                return puntuacion;
            }
        }
        System.out.println();
        puntuacion -= turno;
        return puntuacion;


    }

}
