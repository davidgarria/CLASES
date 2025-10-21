import java.util.Scanner;

public class Ejercicios {
    Scanner scanner = new Scanner(System.in);

    public void ejercicio1(){
        /* Crea un programa que pida al usuario dos números enteros por consola y
        muestre el resultado de las cinco operaciones aritméticas básicas: suma,
        resta, multiplicación, división y módulo (resto). */
        System.out.println("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.println("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("Suma: "+(num1+num2));
        System.out.println("Resta: "+(num1-num2));
        System.out.println("Multiplicación: "+(num1*num2));
        System.out.println("Division: "+((double)num1/(double)num2));
        System.out.println("Modulo(resto): "+(num1%num2));
    }
    public void ejercicio2(){
        /* Escribe un programa que pida dos números al usuario y muestre el resultado
         de todas las comparaciones relacionales entre ellos (mayor que, menor que,
         igual, diferente, mayor o igual, menor o igual). */
        System.out.println("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.println("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println(num1+" es mayor que "+num2+" = "+(num1>num2));
        System.out.println(num1+" es menor que que "+num2+" = "+(num1<num2));
        System.out.println(num1+" es igual a "+num2+" = "+(num1==num2));
        System.out.println(num1+" es diferente de "+num2+" = "+(num1!=num2));
        System.out.println(num1+" es mayor o igual que "+num2+" = "+(num1>=num2));
        System.out.println(num1+" es menor que "+num2+" = "+(num1<=num2));
    }
    public void ejercicio3(){
        /* Crea un programa que declare una variable con valor inicial 100
        y aplique diferentes operadores de asignación compuesta (+=, -=, *=, /=).
        Muestra el valor de la variable después de cada operación. */
        int inicial = 100;
        System.out.println("Valor inicial: "+inicial);
        inicial += 50;
        System.out.println("Después de sumar 50: "+inicial);
        inicial -= 30;
        System.out.println("Después de restar 30: "+inicial);
        inicial *= 3;
        System.out.println("Después de multiplicar por 3: "+inicial);
        inicial /= 2;
        System.out.println("Después de dividir entre 2: "+inicial);
    }
    public void ejercicio4(){
        /* Desarrolla un programa que pida un número al usuario
        y determine si es par o impar usando el operador módulo.
        Muestra el resultado por consola. */
        System.out.println("Indica un número: ");
        int num = scanner.nextInt();
        System.out.println("El número "+num+" es par: "+(num%2==0));
    }
    public void ejercicio5(){
        /* Crea un programa que pida la edad del usuario y si tiene carnet de
        conducir (true/false). Usa operadores lógicos para determinar si
        puede alquilar un coche (debe tener 21 años o más Y tener carnet). */
        System.out.println("Introduce tu edad: ");
        int edad = scanner.nextInt();
        System.out.println("¿Tienes carnet de conducir? (Escribe true o false): ");
        boolean carnet = scanner.nextBoolean();
        boolean alquiler = edad >= 21 && carnet;
        System.out.println("¿Puedes alquilar un coche? "+alquiler);
    }
    public void ejercicio6(){
        /*Escribe un programa que pida el precio de un producto y el porcentaje
         de descuento. Calcula el precio final después del descuento usando
         operadores aritméticos y muestra todos los pasos del cálculo. */
        System.out.println("Introduce el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.println("Introduce el porcentaje de descuento: ");
        double descuento = scanner.nextDouble();
        descuento /= 100;
        descuento *= precio;
        System.out.println("Precio final: "+(precio-descuento));
    }
    public void ejercicio7(){
        /* Crea un programa que pida al usuario su edad y si es estudiante
        (true/false). Usa operadores lógicos (AND, OR, NOT) para determinar
        si puede acceder a diferentes descuentos: descuento joven (menor de 26 años),
        descuento estudiante, o descuento especial (menor de 26 Y estudiante). */
        System.out.println("Introduce tu edad:");
        int edad = scanner.nextInt();
        System.out.println("¿Eres estudiante? (true/false)");
        boolean estudiante = scanner.nextBoolean();
        System.out.println("Descuento joven (menor de 26): "+(edad<26));
        System.out.println("Descuento estudiante: "+estudiante);
        System.out.println("Descuento descuento especial (estudiante y menor de 26): "+(edad<26 && estudiante));
    }
    public void ejercicio8(){
        /* Desarrolla un programa que pida tres números al usuario y calcule:
        la suma de los tres, el promedio, el resultado de multiplicar el primero
        por el segundo y dividirlo entre el tercero. Usa paréntesis para controlar
        la precedencia de operadores. */
        System.out.println("Introduce el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.println("Introduce el tercer numero: ");
        int num3 = scanner.nextInt();
        System.out.println("Suma de los tres: "+(num1+num2+num3));
        System.out.println("Promedio: "+((double)num1+(double)num2+(double)num3)/3);
        System.out.println("resultado de ("+num1+" * "+num2+") / "+num3+": "+(((double)num1*(double)num2)/(double)num3));
    }
    public void ejercicio10(){
        /*Crea un programa que pida el salario base por hora, las horas trabajadas
        y si ha hecho horas extra (true/false). Si ha hecho horas extra y trabajó más
        de 40 horas, las horas que excedan de 40 se pagan al doble. Usa operadores
        lógicos, relacionales y aritméticos para calcular el salario total. */
        System.out.println("Introduce el salario por hora: ");
        double preciohora = scanner.nextDouble();
        System.out.println("Introduce las horas trabajadas: ");
        double horastotales = scanner.nextDouble();
        System.out.println("Horas extra: "+(horastotales>40));
        System.out.println("Cantidad: "+(horastotales>40));


    }

}
