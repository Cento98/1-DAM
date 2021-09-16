import java.io.*;
public class Ejer3 {
    
    public static void main (String[] args){

        File fichero=new File("../Tema 12");

        System.out.println(fichero.getName());

        System.out.println(fichero.getAbsolutePath());

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

    }
}
