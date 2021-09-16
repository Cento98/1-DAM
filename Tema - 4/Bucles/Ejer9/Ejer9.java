import java.util.Scanner;
public class Ejer9{

    public static void main (String args[]){

        Scanner lector = new Scanner (System.in);

        System.out.println("Introduce un numero para saber si es primo");
        int primo=lector.nextInt();
        int contador=0;

        for(int i=1;i<=primo;i++){
            
            if(primo%i==0){
                contador++;
            }
        }
        if (contador<=2){
            System.out.println("El numero "+primo+" es primo");
        }
        else{
            System.out.println("El numero "+primo+" no es primo");
        }
    }
}

