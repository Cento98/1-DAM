import java.util.Scanner;
public class Ejer16{
    
    public static void main (String args[]){
        
        Scanner lector = new Scanner (System.in);
        
        System.out.println("Introduzca los euros que quiere convertir");
        double euros = lector.nextDouble();
        
        double dolar = euros * 1.18;
        double libras = euros * 0.90;
        
        System.out.println(dolar + " Dolares.");
        System.out.println(libras + " Libras.");
        
    }
    
    
    
}