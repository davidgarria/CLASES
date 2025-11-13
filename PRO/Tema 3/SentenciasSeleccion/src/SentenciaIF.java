public class SentenciaIF {

    public void examenAprobado(int nota){

        System.out.println("Procedemos a evaluar si el examen está aprobado con la nota de: "+nota);
        if(nota>=5){
            System.out.println("El examen está aprobado");
        } else {
            System.out.println("El examen está suspenso");
        }
        System.out.println("Buenas tardes");

    }
    public void notaExamen(double nota){
        //suspenso 0-4.99
        //aprobado 5-7.99
        //notable 8-8.99
        //sobresaliente 9-9.99
        //MH 10

        String resultado;

        if(nota>=0 && nota<=10) {
            if (nota < 5) {
                resultado = "suspenso";
                //System.out.println("El examen está suspenso");
            } else if (nota < 8) {
                resultado = "aprobado";
                //System.out.println("El examen está aprobado");
            } else if (nota < 9) {
                resultado = "notable";
                //System.out.println("El examen es notable");
            } else if (nota < 10) {
                resultado = "sobresaliente";
                //System.out.println("El examen es sobresaliente");
            } else {
                resultado = "Matrícula de honor";
                //System.out.println("El examen tiene una matrícula de honor");
            }

        }else{
            resultado = "Coloca una nota válida entre el 0 y el 10";
            //System.out.println("Coloca una nota válida entre el 0 y el 10");
        }
        System.out.println("El resultado del exámen es: "+resultado);

    }

}
