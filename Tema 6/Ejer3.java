import java.util.Scanner;
public class Ejer3 {
    
    public static void main (String [] args){

        Scanner lector=new Scanner (System.in);
        System.out.println("Introduce los 2 numeros que quieres comparar");

        double num1=lector.nextDouble();
        double num2=lector.nextDouble();

        double comparacion = comparar(num1, num2);
        System.out.println("El numero "+comparacion+" Es mayor");
    }

    static double comparar(double a, double b){
        if (a>b){
            return a;
        }
        else{
            return b;
        }
    }
}
