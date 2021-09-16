import java.util.Scanner;
public class Ejer10 {
       public static void main (String args[]){
           Scanner lector=new Scanner (System.in);
        int num1;
        int num2=0;
            
           do{
            System.out.println("Escribe un numero para sumarlo o presionar 0 para salir");
            num1=lector.nextInt();
            num2=num2+num1;
           } 
           while(num1!=0);
           System.out.println("La suma de todos los numeros es "+num2);
       }
}
