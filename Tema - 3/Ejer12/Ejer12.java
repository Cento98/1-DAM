import java.util.Scanner;
public class Ejer12{
    
    public static void main (String args[]){
        
        Scanner lector = new Scanner (System.in);
        double tres;
        System.out.println("Introduce los 2 valores");
        
        double uno = lector.nextDouble();
        double dos = lector.nextDouble();
        tres= uno/dos;
        System.out.println("El resultado de la operacion es: " + tres);
       
    }
}