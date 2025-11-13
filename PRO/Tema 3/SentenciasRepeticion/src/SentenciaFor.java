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


}
