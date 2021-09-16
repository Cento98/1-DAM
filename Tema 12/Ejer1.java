import java.io.*;
public class Ejer1 {
    
    public static void main (String[] args){

        File fichero=new File("ficheros");

        if(fichero.isDirectory()){
            System.out.println("Es un directorio");
        }
        else{
            System.out.println("No es un directorio");
        }
    }
}
