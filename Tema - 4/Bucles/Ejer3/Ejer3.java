import java.util.Scanner;
public class Ejer3{
    
    public static void main (String args[]){
        
        Scanner lector = new Scanner (System.in);
        
        System.out.println("Escribe el numero que quieres multiplicar");
        int num1 = lector.nextInt();
        System.out.println("Escribe por cuanto quieres multiplicarlo");
        int num2 = lector.nextInt();
        int num3=0;
        for (int i=0;i<num2;i++){
            num3= num3+num1;
        }
        System.out.println(num3);
    }
}