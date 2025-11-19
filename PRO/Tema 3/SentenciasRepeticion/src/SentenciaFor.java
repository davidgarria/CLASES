import java.util.Locale;

public class SentenciaFor {

    public void sentencia(){

        for (int i = 0; i < 5; i++) {
            System.out.printf("Linea numero: %d%n",i+1);
        }
    }
    public void tablaMultiplicarNumero(int numero){
        System.out.println("Procedemos a escribir la tabla de multiplicar del " + numero);
        for (int i = 1; i < 11; i++){
            System.out.printf("%d * %d = %d%n", i, numero, i * numero);
        }
    }
    public void todasTablas(){
        // 1-10
        for (int i = 1; i < 11; i++) {
            System.out.println("Sacando la tabla del: " + i);
            // 1 2 3 4 5 6 7 8 9 10
            for (int j = 1; j < 11; j++) {
                // 1 2 3 4 5 6 7 8 9 10
                System.out.printf("\t%d * %d = %d%n", i, j, i * j);
            }
        }
    }
    public void dibujarCuadrado(){
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4) {
                    System.out.print("*");
                } else if (j == 0 || j == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void esPalindromo(String frase){
        frase = frase.toLowerCase(Locale.ROOT);
        frase = frase.replaceAll(" ","");
        boolean esPalindromo = true;

        for (int i = 0; i < frase.length()/2; i++) {
            char letra1 = frase.charAt(i);
            char letra2 = frase.charAt(frase.length()-1-i);
            if(letra1 != letra2){
                esPalindromo = false;
                break;
            }
        }

        if(esPalindromo){
            System.out.println("Es un palindromo");
        }else{
            System.out.println("No es un palindromo");
        }
    }
    public void calcularFactorial(int numero){
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        System.out.printf("El factorial de %d es %d%n",numero,resultado);
    }
    public void recorrerColeccion(){
        int[] numeros = {1,10,50,94,7};
        //1ra forma
        /*for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);*/

        //2da forma
        for ( int coleccion : numeros){
            System.out.println(coleccion);
        }
    }

}
