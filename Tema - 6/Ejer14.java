import java.util.Scanner;
public class Ejer14 {
    
    public static void main (String [] args){

        Scanner lector = new Scanner (System.in);

        System.out.println("Introduce los 2 numeros que quieras");
        
        double m = lector.nextDouble();
        double n = lector.nextDouble();
        double sumaNM=m-n;

        double factorialM=factorial(m);
        double factorialN=factorial(n);
        double factorialNM=factorial(sumaNM);

        double resultado1 = factorialN*factorialNM;
        double resultadoFinal=factorialM/resultado1;

        System.out.println("El valor de M sobre N es: "+resultadoFinal);
    
    }

    
    static Double factorial(double a){
        double num2=1;
        for(int i=1;i<=a;i++){
            num2=num2*i;
        }
        return num2;
    }
}

