import java.util.Scanner;
public class AreaCirculo{

    
    public static void main (String args[]){
        Scanner lector = new Scanner (System.in);
        
        double radio;
        double area;
        double pi = 3.1416f;
        
        System.out.println("Introduce el radio"); 
        
        radio=lector.nextDouble();
        
        area = radio * radio * pi;
        
        System.out.println("El area es: " + area);
    }
}
