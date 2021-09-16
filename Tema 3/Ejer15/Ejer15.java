import java.util.Scanner;
public class Ejer15{
    
    public static void main (String args[]){
            
        Scanner lector = new Scanner (System.in);
        
        System.out.println("Introduce los celsius que quieras convertir");
        double celsius = lector.nextDouble();
        
        double kelvin = celsius * 274.15;
        double fahrenheit = celsius * 33.8;
        
        System.out.println(celsius + " celsius son: " + fahrenheit + " fahrenheit o " + kelvin + " kelvin.");
    }
}