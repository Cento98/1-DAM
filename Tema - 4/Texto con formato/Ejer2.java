import java.text.DecimalFormat;
import java.util.Scanner;
public class Ejer2 {

    public static void main (String args[]){

        Scanner lector = new Scanner (System.in);

        DecimalFormat formateador = new DecimalFormat("00");


        System.out.println("Introduce la hora");
        int horas=lector.nextInt();

        System.out.println("Introduce los minutos");
        int minutos=lector.nextInt();

        System.out.println("Introduce los segundos");
        int segundos=lector.nextInt();

        System.out.print(formateador.format(horas));
        System.out.print(":");
        System.out.print(formateador.format(minutos));
        System.out.print(":");
        System.out.print(formateador.format(segundos));
    }
}
 