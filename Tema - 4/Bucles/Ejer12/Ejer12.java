import java.util.Scanner;
import java.util.Random;
public class Ejer12 {
    public static void main (String args[]){
        
        Scanner lector = new Scanner (System.in);
        Random aleatorio = new Random();
        int random = aleatorio.nextInt(100);
        
        int numero;
        int contador=0;

        System.out.println("Bienvenido al juego de adivina el numero.");
        System.out.println("Introduce el numero de intentos que quieres tener.");
        int intentos = lector.nextInt();
        
            do{
            
                System.out.println("Escribe el numero que piensas");
                numero = lector.nextInt();

                if(numero>random){
                    System.out.println("Te has pasado");
            }

                else if (numero<random){
                    System.out.println("Te has queado corto");
            }
                contador++;

        }
            while (numero!=random && contador!=intentos);

       
                if (numero==random){
                    System.out.println("Enhorabuena, has ganado");
        }
                else  if(contador==intentos){
                    System.out.println("Has perdido todos los intentos.");
            }
        

        
    }
}
