import java.util.Scanner;
public class Ejer2 {

    public static void main (String args[]){

        Scanner lector = new Scanner (System.in);

        int num1;
        int num2;

        System.out.println("Introduce 2 numeros para compararlos");

        num1=lector.nextInt();
        num2=lector.nextInt();

        if(num1<num2){
            System.out.println("El 2ndo numero es mayor");
        }
        else if(num1>num2){
            System.out.println("El 1r numero es mayor");
        }
        else {
            System.out.println("Los numeros son iguales");
        }
    }
}
