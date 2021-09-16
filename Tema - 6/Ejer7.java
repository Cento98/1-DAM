import java.util.Scanner;
public class Ejer7 {
    
    public static void main (String [] args){

        Scanner lector=new Scanner (System.in);

        System.out.println("Introduce el numero que quieras para calcular su factorial:");
        int num1 = lector.nextInt();

        int total=factorial(num1);

        System.out.println("El factorial de "+num1+" es: "+total);

    }

    static int factorial(int a){
        int num2=1;
        for(int i=1;i<=a;i++){
            num2=num2*i;
        }
        return num2;
    }
}
