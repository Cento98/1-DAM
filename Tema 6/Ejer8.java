import java.util.Scanner;
public class Ejer8 {

    public static void main (String [] args){

        Scanner lector = new Scanner (System.in);
        System.out.println("Introduce las 4 cadenas de enteros para saber si es capicua");
        int num1=lector.nextInt();
        int num2=lector.nextInt();
        int num3=lector.nextInt();
        int num4=lector.nextInt();

        int total = capicua(num1,num2,num3,num4);
       
        if (total==1){
            System.out.println("El numero es capicua");
        }
        else {
            System.out.println("El numero no es capicua");
        }
    }

    static int capicua (int a, int b, int c, int d){

        String uno = Integer.toString(a);
        String dos = Integer.toString(b);
        String tres = Integer.toString(c);
        String cuatro = Integer.toString(d);
        String cinco =uno+dos+tres+cuatro;
        int cadena =Integer.parseInt(cinco);

        int falta=cadena;
        int numeroInvertido=0;
        while(falta!=0){
            int resto=falta%10;
            numeroInvertido=numeroInvertido*10+resto;
            falta=falta/10;
        }

        if (numeroInvertido==cadena){
            return 1;
        }
        else {
            return 0;
        }
    }
}
