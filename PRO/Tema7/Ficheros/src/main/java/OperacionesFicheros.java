import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class OperacionesFicheros {

    public void leerDatosFichero(){
        File file = new File("src/main/java/resources/fichero.txt");
        System.out.println("Existe: "+file.exists());
        System.out.println("Tamaño: "+file.length());
        System.out.println("Es fichero: "+file.isFile());
        System.out.println("Es Directorio: "+file.isDirectory());
        System.out.println("Ruta absoulta: "+file.getAbsolutePath());
    }

    public void leerHijos(String path){
        File file = new File(path);
        // for (String item : file.list()) {System.out.println(item);}
        for (File hijo : file.listFiles()) {
            System.out.println(hijo.getName());
            if (hijo.isDirectory()){
                leerHijos(hijo.getAbsolutePath());
            }
        }
    }

    public void crearFicheros(String path){
        File file = new File(path+"/fichero.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Fallo en la escritura");
            System.out.println(e.getMessage());
        }
    }

    public void crearDirectorio(String path){
        File file = new File(path+"/carpeta/carpeta hija");
        if (!file.exists()){
            file.mkdirs();
        }
    }
}
