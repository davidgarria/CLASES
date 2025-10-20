public class Operaciones {

    public void sumar(int op1, int op2){
        int resultado = op1+op2;
        System.out.println("El resultado de la suma es: "+resultado);
    }

    public void restar(int op1, int op2){
        int resultado = op1-op2;
        System.out.println("El resultado de la resta es: "+resultado);
    }

    public void multiplicar(int op1, int op2){
        int resultado = op1*op2;
        System.out.println("El resultado de la multiplicacion es: "+resultado);
    }

    public void dividir(double op1, double op2){
        double resultado = op1/op2;
        System.out.println("El resultado de la division es: "+resultado);
    }

    public void rectangulo(int base, int altura){
        int resultado = base * altura;
        System.out.println("Si la base de un rectangulo es "+base+"cm y su altura es "+altura+"cm, entonces su area será de "+resultado+"cm");
    }

}
