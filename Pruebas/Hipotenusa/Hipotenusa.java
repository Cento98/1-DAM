import java.util.Scanner;
import java.lang.Math;
public class Hipotenusa {


    public static void main (String args[]){
    
        Scanner lector = new Scanner (System.in);
        
        
        double a;
        double b;
        double h;
        double a2;
        double b2;
        double h2;
        System.out.println("Introduce los 2 parametros para calcular la hipotenusa");
        
        a = lector .nextDouble();
        b = lector .nextDouble();
        
        a2 = Math.pow(a, 2);
        b2 = Math.pow(b, 2);
        h2 = a2 + b2;
        
        h = Math.sqrt(h2);
        
        System.out.println("La hipotenusa es = " + h);
        
        
        
        
    }
}
