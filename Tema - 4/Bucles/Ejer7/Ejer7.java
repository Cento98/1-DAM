import java.util.Scanner;
public class Ejer7 {
    
    public static void main (String args[]){

        Scanner lector = new Scanner (System.in);
        
        System.out.println("Introduce el numero real que quieras");
        double real=lector.nextDouble();

        System.out.println("Introduce la potencia que quieres");
        int potencia=lector.nextInt();
        
        double total=1;
        for(int i=1;i<=potencia;i++){
            total=total*real;
        }
        System.out.println("El resultado es "+total);
    }
    }

