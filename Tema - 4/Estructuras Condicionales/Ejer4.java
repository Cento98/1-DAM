import java.util.Scanner;
public class Ejer4 {

    public static void main (String args[]){

        Scanner lector = new Scanner (System.in);

        int num1;
        int num2;
        System.out.println("Escribe 2 numeros");

        num1=lector.nextInt();
        num2=lector.nextInt();

        if(num1>num2){
            System.out.println(num1+" > "+num2);
        }
        else if(num2>num1){
            System.out.println(num2+" > "+num1);
        }
        else{
            System.out.println(num1+" = "+num2);
        }

    }
}
