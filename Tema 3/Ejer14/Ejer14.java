import java.util.Scanner;
public class Ejer14{
    
    public static void main (String args[]){
        
        Scanner lector = new Scanner (System.in);
        
        System.out.println("Introduce el radio de la circumferencia");
        
        double radio = lector.nextDouble();
        double pi2 = 3.14*3.14;
        double longitud = radio+radio*pi2;
        double radio2 = radio*radio;
        double area = radio2 * 3.14;
        
        System.out.println("El circulo tiene " + area + " de area, y " + longitud + " de longitud.");
        
        
        
    }
}