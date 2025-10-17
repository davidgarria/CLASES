public class Main {

    public static void main(String[] args) {

        System.out.println("Proyecto metodos. \nVamos a realizar llamadas a metodos.");
        saludar("Borja");
        saludar("Maria");

        int numero;
        Operaciones operacionesMatematicas = new Operaciones();
        operacionesMatematicas.sumar(1,2);
        operacionesMatematicas.restar(1,2);
        operacionesMatematicas.multiplicar(1,2);
        operacionesMatematicas.dividir(1,2);
    }

    public static void saludar(String nombre){
        System.out.println("Hola "+nombre);
        System.out.println("Encantado de saludarte");
        System.out.println("Vamos a practicar el llamado de metodos");
        System.out.println("Animo!");
    }

}
