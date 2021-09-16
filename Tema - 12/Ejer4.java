import java.io.*;
import java.text.SimpleDateFormat;
public class Ejer4 {
    
    public static void main (String[] args){

        File fichero=new File("fichero1.txt");
        SimpleDateFormat formateo = new SimpleDateFormat("dd/mm/yyyy");

        System.out.println(fichero.getName());

        System.out.println(fichero.getAbsolutePath());

        if(fichero.isHidden()){
            System.out.println("El fichero esta oculto");
        }
        else{
            System.out.println("El fichero no esta oculto");
        }

        if(fichero.canRead()){
            System.out.println("Se puede leer");
        }
        else{
            System.out.println("No se puede leer");
        }

        if(fichero.canWrite()){
            System.out.println("Se puede escribir");
        }
        else{
            System.out.println("No se puede escribir");
        }

        System.out.println(formateo.format(fichero.lastModified()));

        System.out.println(fichero.length()+" Bytes");
        System.out.println(fichero.length()/1024.0+" KB");
        double tamanyo=fichero.length()/1024.0;
        System.out.println(tamanyo/1024.0+" MB");
    }
}
