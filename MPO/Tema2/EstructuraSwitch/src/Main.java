public class Main {

    public static void main(String[] args){

        // Evaluar el dia de la semana y si es laborable o no es laborable
        // string, int, char
        DiaSemana diaSemana = DiaSemana.Martes;

        switch (diaSemana){
            case Lunes,Martes,Miercoles,Jueves,Viernes -> System.out.println("Laborable");
            case Sabado,Domingo -> System.out.println("No laborable");
        }

        MesesAnio mesActual = MesesAnio.Mayo;
        System.out.printf("El mes actual es %s, que es %s y tiene %d dias.",mesActual,mesActual.estacion,mesActual.diasMes);

    }

}
