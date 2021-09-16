import java.util.Scanner;
public class Ejer15 {
    
    public static void main (String args[]){
    Scanner lector = new Scanner (System.in);

        int segundos;
        int minutos;
        int horas;

      

        do{
            System.out.println("Introduce las horas");
            horas = lector.nextInt();

            if (horas < 0 || horas >= 23){
                System.out.println("hora no valida");
            }
            
        }
        while(horas < 0 || horas > 23);

        do{
            System.out.println("Introduce los minutos");
            minutos = lector.nextInt();

            if(minutos < 0 || minutos >= 59){
                System.out.println("minutos no validos");
            }

            
        }
        while(minutos < 0 || minutos>59);

        do{
            System.out.println("Introduce los segundos");
            segundos = lector.nextInt();
            
            if(segundos < 0 || segundos >= 59){
                System.out.println("Segundos no validos");
            }
            
           
        }
        while(segundos < 0 || segundos > 59);

        System.out.println(horas+":"+minutos+":"+segundos);
    }
}
