import java.util.Scanner;
public class Ejer1 {
    
    public static void main (String args[]){

            Scanner lector = new Scanner (System.in);

        int num;
        System.out.println("Introduce un numero para saber si es par o impar");
        num=lector.nextInt();

        if(num%2==0){
            System.out.println("El numero es par");
        }
        else{
            System.out.println("El numero es impar");
        }
    }
}
