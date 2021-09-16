import java.text.DecimalFormat;
import java.util.Scanner;
public class Ejer9 {
    
    public static void main (String args[]){

        Scanner lector = new Scanner (System.in);
        DecimalFormat formateador = new DecimalFormat("00");


        System.out.println("Bienvenido a la estación meteorologica");
        System.out.println("Introduce la Ciudad");
        String ciudad = lector.nextLine();

        System.out.println("Introduce la fecha");
        System.out.println("Dia:");
        int dia = lector.nextInt();
        System.out.println("Mes:");
        int mes = lector.nextInt();
        System.out.println("anyo:");
        int ano = lector.nextInt();

        System.out.println("Introduce la hora de la medida");
        System.out.println("Horas:");
        int hora = lector.nextInt();
        System.out.println("Minutos:");
        int minutos = lector.nextInt();
        System.out.println("Segundos:");
        int segundos = lector.nextInt();

        System.out.println("Introduce la velocidad del viento (solo numeors enteros)");
        int viento = lector.nextInt();

        System.out.println("Introduce la Temperatura");
        float temperatura = lector.nextFloat();

        System.out.println("Introduce la presion atmoferica");
        float presion = lector.nextFloat();

        System.out.println("Introduce la probabilidad de lluvia");
        int lluvia = lector.nextInt();

        System.out.println("Introduce el indice de radiacion ultravioleta");
        int violeta = lector.nextInt();

        System.out.printf("\u001B[1;37;44m ** DATOS ESTACION METEREOLOGICA ** \u001B[0m\n");
        System.out.printf("\u001B[0;30;47m Ciudad:                 %s   \u001B[0m\n",ciudad);
    }
}
