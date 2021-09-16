import java.util.Scanner;
public class Ejer8 {
    
    public static void main (String args[]){

        Scanner lector=new Scanner (System.in);
        int num2=1;
        System.out.println("Introduce un numero para calcular su factorial");
        int num1=lector.nextInt();

        for(int i=1;i<=num1;i++){
            num2 = num2 * i;

        }
        System.out.println(num2);
    }
}
