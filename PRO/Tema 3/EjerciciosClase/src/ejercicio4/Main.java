package ejercicio4;

import ejercicio2.Turno;

import java.util.Scanner;

public class Main {
/*
Crea un programa para jugar una partida virtual de dardos entre dos
jugadores. El objetivo es que uno de los jugadores llegue exactamente a 0 puntos
partiendo desde 301.
Reglas:
• Nada más empezar pide el nombre de cada jugador
• Cada jugador comienza con 301 puntos.
• En cada turno, un jugador lanza 3 dardos. Cada dardo genera un número
aleatorio entre 0 y 60 (simulando puntuación en dardos).
• La puntuación del turno es la suma de los 3 dardos.
• Resta la puntuación del turno al total de puntos del jugador.
• Si la puntuación restante es menor que 0, se considera que el jugador "se
pasa" y su total no cambia ese turno.
• El primer jugador que llegue exactamente a 0 gana la partida.
• Después de cada turno, muestra las puntuaciones actuales y quién va
ganando (el que tiene menos puntos).
• Al finalizar, muestra el ganador y cuántos turnos tomó la partida.
*/
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica el nombre del primer jugador: ");
        String jugador1 = scanner.next();
        System.out.println("Indica el nombre del segundo jugador: ");
        String jugador2 = scanner.next();

        int ptsJ1 = 301, ptsJ2 = 301, turnos = 0;
        Turno turno = new Turno();

        while ((ptsJ1 != 0) && (ptsJ2 != 0)){
            turnos++;
            System.out.printf("Turno: %d%n",turnos);

            ptsJ1 = turno.turno(ptsJ1);
            ptsJ2 = turno.turno(ptsJ2);

            if ((ptsJ1 != 0) && (ptsJ2 != 0)) {
                System.out.printf("%s puntuación: %d%n", jugador1, ptsJ1);
                System.out.printf("%s puntuación: %d%n", jugador2, ptsJ2);
                if (ptsJ1 < ptsJ2) {
                    System.out.printf("%s va en la delantera!%n", jugador1);
                } else if (ptsJ1 > ptsJ2) {
                    System.out.printf("%s va en la delantera!%n", jugador2);
                } else {
                    System.out.println("Esto está empatado");
                }
            }
            System.out.println();
        }

        if (ptsJ1 == 0) {
            System.out.printf("%s es el ganador en %d turnos!", jugador1,turnos);
        } else {
            System.out.printf("%s es el ganador en %d turnos!", jugador2,turnos);
        }
    }
}
