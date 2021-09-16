import java.util.Scanner;
public class EjerPerfectos {

    public static void main (String [] args){

        Scanner lector = new Scanner (System.in);

        System.out.println("Introduce el numero que quieras, para saber si es perfecto.");
        int num1=lector.nextInt();

        int contador=0;
        for(int i=1;i<num1;i++){
            
            if(num1%i==0){
                contador+=i;
            }
        }

        if (contador==num1){
            System.out.println("El numero es perfecto");
        }
        else {
            System.out.println("El numero no es perfecto");
        }


    }
}
