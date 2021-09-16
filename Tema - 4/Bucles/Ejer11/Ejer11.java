import java.util.Scanner;
public class Ejer11 {

    public static void main (String args[]){

        Scanner lector=new Scanner (System.in);
        double num1;
        double num2=0;
        double media;
        double contador=0;
        do{
            System.out.println("Introduce un numero positivo, cuando introduzcas uno negativo se acabara y se sacará la media");
            num1=lector.nextDouble();
        if (num1>=0){   
            num2=num2+num1;
            contador++;
        }
        }
        while(num1>=0);
        media=num2/contador;
        System.out.println("La media de los numeros introducidos es "+media);
    }
    
}
