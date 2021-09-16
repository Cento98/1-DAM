import java.util.Scanner;
import java.lang.Math;
public class EjercicioEcuacion {
    
    public static void main (String [] args){

        Scanner lector = new Scanner (System.in);

        System.out.println("Bienvenido al programa para calcular ecuaciones de 2ndo grado");

        System.out.println("Introduce el primer valor");
        double num1=lector.nextDouble();

        System.out.println("Introduce el segundo valor");
        double num2=lector.nextDouble();

        System.out.println("Introduce el tercer valor");
        double num3=lector.nextDouble();

        double valor2a=2*num1;
        System.out.println(valor2a);
        double valor4ac=4*num1*num3;
        System.out.println(valor4ac);
        double valorb2=num2*num2;
        System.out.println(valorb2);
        double valorb24ac=valorb2-valor4ac;
        System.out.println(valorb24ac);
        if (valorb24ac<=0){
            System.out.println("La ecuacion no tiene una resolucion real");
            System.out.println("El descriminante es igual a: "+valorb24ac);
        }
        else{
            double valorRaiz=Math.sqrt(valorb24ac);
            System.out.println(valorRaiz);
            double menosB=num2*(-1);
            System.out.println(menosB);
            double positivo=menosB+valorRaiz;
            System.out.println(positivo);
            double negativo=menosB-valorRaiz;
            System.out.println(negativo);
            double finalPositivo=positivo/valor2a;
            System.out.println(finalPositivo);
            double finalNegativo=negativo/valor2a;
            System.out.println(finalNegativo);

            System.out.println("El resultado positivo de la ecuacion es: "+finalPositivo);
            System.out.println("El resultado negativo de la ecuacion es: "+finalNegativo);
        }
    }
}
