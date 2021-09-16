import java.util.Scanner;
public class Ejer4 {
    
    public static void main (String [] args){

        Scanner lector=new Scanner (System.in);

        System.out.println("Introduce los 4 nuemros que quieres comparar");

        double num1=lector.nextDouble();
        double num2=lector.nextDouble();
        double num3=lector.nextDouble();
        double num4=lector.nextDouble();

        double comparacion = comparar(num1, num2);
        double comparacion2= comparar(num3, num4);
        double total=comparar(comparacion, comparacion2);

        System.out.println("El numero "+total+" es el mayor");
    }

    static double comparar(double a, double b){

        if (a>b){
            return a;
        }
        else {
            return b;
        }
    }
}
