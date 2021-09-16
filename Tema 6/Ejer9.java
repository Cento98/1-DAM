import java.util.Scanner;
public class Ejer9 {
    public static void main (String [] args){

        Scanner lector = new Scanner (System.in);

        System.out.println("Introduce el numero para calcular su sumatorio");

        int num = lector.nextInt();

        int total=sumatorio(num);

        System.out.println("El sumatorio de "+num+" es: "+total);
    }

    static int sumatorio(int a){

        int suma=0;
        for (int i=1;i<=a;i++){
            suma=suma+i;
        }
        return suma;
    }
}
