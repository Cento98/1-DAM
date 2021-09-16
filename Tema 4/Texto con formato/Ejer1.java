import java.util.Scanner;
public class Ejer1 {
    
    public static void main (String args[]){

        Scanner lector = new Scanner (System.in);

        System.out.println("Introduce un numero real");
        
        float num = lector.nextFloat();

        System.out.printf("%.2f\n",num);
        
    }
}
