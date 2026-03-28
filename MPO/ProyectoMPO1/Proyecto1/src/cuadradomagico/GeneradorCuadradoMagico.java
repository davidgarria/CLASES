package cuadradomagico;

// Clase que genera cuadrados mágicos mediante búsqueda aleatoria
/*
    Genera números aleatorios sin repetir
    Los coloca en la matriz
    Verifica si formó un cuadrado mágico válido
    Si no es válido, lo intenta de nuevo
    Cuenta cuántos intentos hace
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class GeneradorCuadradoMagico {
    private int n, intentos;
    private Random random;

    // Inicializa generador
    public GeneradorCuadradoMagico(int n) {
        this.n = n;
        this.intentos = 0;
        this.random = new Random();
    }

    // Regresa número de intentos realizados
    public int getIntentos() {
        return intentos;
    }

    // Generar lista de números únicos aleatorios
    private ArrayList<Integer> generarNumerosAleatorios(){
        // Lista con números del 1 hasta el n * n
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= n*n; i++) {
            numeros.add(i);
        }
        Collections.shuffle(numeros,random);
        return numeros;
    }

    // Llena cuadrado mágico con número de la lista
    private void llenarCuadrado(CuadradoMagico cuadrado, ArrayList<Integer> numeros){

        int indice = 0; // para recorrer lista de números
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cuadrado.setValor(i,j,numeros.get(indice));
                indice++;
            }
        }
    }

    // Genera cuadrado mágico válido mediante intentos sucesivos
    public CuadradoMagico generar(){
        CuadradoMagico cuadrado = new CuadradoMagico(n);
        intentos = 0; // Reinicia contador de intentos

        while (true) {
            intentos++;

            // Generamos números aleatorios sin repetir
            ArrayList<Integer> numeros = generarNumerosAleatorios();

            // Llenamos cuadrado con esos números
            llenarCuadrado(cuadrado, numeros);

            // Verificamos si es un cuadrado mágico
            if (cuadrado.esValido()){
                break;
            }
        }

        return cuadrado; // Devolver cuadrado mágico encontrado
    }
}
