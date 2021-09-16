import java.util.Scanner;
public class Ejer3 {
    
    public static void main (String args[]){

        Scanner lector=new Scanner (System.in);

        int edad;
        System.out.println("Introduzca la edad");
        edad=lector.nextInt();
        
        if(edad>=18){
            System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("Eres menor de edad");
        }
    }
}
