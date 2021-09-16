import java.io.*;
public class Ejer2 {
    
    public static void main (String[] args){

        File fichero=new File("../Tema 12");

        for(String uno:fichero.list()){
            System.out.println(uno);
        }
        
    }
}
