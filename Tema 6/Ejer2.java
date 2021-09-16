import java.lang.Math;
import java.util.Scanner;
public class Ejer2 {
    
    public static void main (String [] args){

        Scanner lector = new Scanner (System.in);

        double p1=3.14f;

        System.out.println("Introduce el radio de la circumferencia");
        double radio=lector.nextFloat();

        double area=area(radio,p1);
        double longitud=longitud(radio,p1);

        System.out.println("El area de la circumferencia es "+area);
        System.out.println("La longitud de la circumferencia es "+longitud);
    }

    static double area(double a, double b){
        double a2 = Math.pow(a, 2);
        double c=a2*b;
        return c;
    }

    static double longitud(double d, double e){
        double f = d+d;
        double g=f*e;
        return g;
    }


}
