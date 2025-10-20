public class Operadores {

    public void operadoresAritmeticos(){
        //Unarios
        int operandoUno = 5;
        //Incremento -> para hacer un contador
        operandoUno++; // le suma uno al valor que ya tenía
        System.out.println("El valor de operando uno despues del incremento es: "+operandoUno);
        //Decremento -> para restar intentos
        operandoUno--;
        operandoUno--;
        operandoUno--;
        System.out.println("El valor de operando uno despues del decremento es: "+operandoUno);

        //Binarios -> dos operadores: suma (+) resta (-) multi (*) div (/) resto div (%)
        int operandoDos = 8;
        int suma = operandoUno + operandoDos;
        System.out.println("El resultado de la suma es: "+(operandoUno+operandoDos));
    }

    public void operadoresAsignacion(){
        int operadorUno = 8;
        operadorUno += 5; // suma a la cantidad anterior la cantidad indicada
        // se puede tambien con -=5, *=5, %=5


    }

    public void operadoresComparacion(){
        int operandoUno = 10;
        int operandoDos = 20;
        boolean resultado = operandoUno>operandoDos;
        System.out.println("El resultado de la comparación es: "+resultado);
        resultado = operandoUno<operandoDos;
        System.out.println("El resultado de la comparación es: "+resultado);
        resultado = operandoUno==operandoDos;
        System.out.println("El resultado de la comparación es: "+resultado);
    }

    public void operadoresLogicos(){
        int sueldo = 20000;
        int edad = 35;
        boolean conducir = false;
        // cuando quiere cobrar menos de 30000 y tienes menos de 40 y puede conducir
        boolean candidatovalido = sueldo<30000 && edad<40 && conducir;
        System.out.println("El candidato es valido: "+candidatovalido);

    }

    public void evaluarCandidato(double salario,int edad, boolean carnet){
       boolean candidatovalido = salario<40000 && edad<40 && carnet;
       System.out.println("El candidato es valido: "+candidatovalido);
    }

}
