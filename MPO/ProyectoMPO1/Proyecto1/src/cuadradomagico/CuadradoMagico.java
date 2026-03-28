package cuadradomagico;

// Clase con molde y métodos para validar un cuadrado mágico
/*
    Guardar la matriz de números
    Calcular la suma de filas, columnas y diagonales
    Validar si es un cuadrado mágico válido
    Mostrar la matriz de forma bonita
*/

public class CuadradoMagico {
    private int[][] matriz;
    private int n;

    // Cuadrado mágico vacío
    public CuadradoMagico (int n){
        this.n = n;
        this.matriz = new int[n][n];
    }

    // Regresa la matriz completa
    public int[][] getMatriz() {
        return matriz;
    }

    // Regresa el tamaño de la matriz
    public int getTamanho(){
        return n;
    }

    // Establecer valor en una posición específica
    public void setValor(int fila, int columna, int valor){
        matriz[fila][columna] = valor;
    }

    // Suma de una fila específica
    private int sumaFila(int fila){
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += matriz[fila][i];
        }
        return suma;
    }

    // Suma de una columna específica
    private int sumaColumna(int columna){
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += matriz[i][columna];
        }
        return suma;
    }

    private int sumaDiagonal1(){
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += matriz[i][i];
        }
        return suma;
    }

    private int sumaDiagonal2(){
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += matriz[i][n-1-i];
        }
        return suma;
    }

    public int getConstanteMagica(){
        return sumaFila(0);
    }


    // Valida si la matriz es un cuadrado mágico valido.
    public boolean esValido(){
        int constanteMagica = getConstanteMagica();

        // Verica todas las filas
        for (int i = 0; i < n; i++) {
            if (sumaFila(i) != constanteMagica){
                return false;
            }
        }

        // Verica todas las columnas
        for (int i = 0; i < n; i++) {
            if (sumaColumna(i) != constanteMagica){
                return false;
            }
        }

        // Verica las diagonales
        if (sumaDiagonal1() != constanteMagica || sumaDiagonal2() != constanteMagica){
            return false;
        }

        return true;
    }

    // Mostrar matriz por consola
    public void mostrar(){

        // Buscar número más grande para alinear la salida por consola
        int maxNumero = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] > maxNumero){
                    maxNumero = matriz[i][j];
                }
            }
        }

        // Calcular dígitos del número más grande
        int anchoColumna = String.valueOf(maxNumero).length();

        // Mostrar matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%"+anchoColumna+"d ",matriz[i][j]);
            }
            System.out.println();
        }
    }
}
