public class Ejercicio {

    public void mayormenor(){

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*21);
        }

        int mayor=numeros[0], menor=numeros[0];

        for (int item : numeros){
            System.out.print(item+"\t");
            if(item>mayor){
                mayor=item;
            }else if(item<menor){
                menor=item;
            }
        }
        System.out.println("El numero más alto es: "+mayor);
        System.out.println("El numero más bajo es: "+menor);
    }

}
