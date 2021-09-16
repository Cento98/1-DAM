import java.util.Scanner;
public class Ejer13{
    
    public static void main(String args[]){
        
        Scanner lector = new Scanner (System.in);
        
        System.out.println("Introduce los segundos que quieres convertir");
        
        int segundos = 0;
        int minutos = 0;
        int horas = 0;
        int dias = 0;
        int semanas =0;
        int meses = 0;
        int años = 0;
       // int datos = lector.nextInt(); 
        int datos = Integer.MAX_VALUE;
        for (int i=0;i<datos;i++){
            
            segundos++;
            if (segundos == 60){
                minutos++;
                segundos = 0;
            }
            if (minutos == 60){
                horas++;
                minutos = 0;
            }
            if (horas == 24){
                dias++;
                horas = 0;
            }
            if (dias == 7){
                semanas++;
                dias = 0;
            }
            if (semanas == 4){
                meses++;
                semanas = 0;
            }
            if (meses == 12){
                años++;
                meses = 0;
            }
        }
        System.out.print(años + " años, " + meses + " meses, " + semanas + " semanas, " + dias + " dias, " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos." );
    }
}
