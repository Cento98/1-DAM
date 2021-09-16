import java.util.Scanner;
public class Ejer8{
    
    public static void main (String args[]){
        
        Scanner lector = new Scanner (System.in);
        
        double edad;
        double dias;
        
        System.out.println("Introduce tu edad");
        
            edad=lector.nextDouble();
            dias=edad*365;
        
        System.out.println("Una persona de " + edad + " años, tiene " + dias + " dias de vida.");
    }
}