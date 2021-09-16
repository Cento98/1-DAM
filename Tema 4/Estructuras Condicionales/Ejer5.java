import java.util.Scanner;
public class Ejer5 {
    
    public static void main (String args[]){

        Scanner lector=new Scanner (System.in);

        int nota;
        System.out.println("Introduce la nota entre 0 y 10");
        nota=lector.nextInt();

    
        switch(nota){

            case 0: System.out.println("INSUFCIENTE");
            break;

            case 1: System.out.println("INSUFCIENTE");
            break;

            case 2: System.out.println("INSUFCIENTE");
            break;

            case 3: System.out.println("INSUFCIENTE");
            break;
            
            case 4: System.out.println("INSUFCIENTE");
            break;

            case 5: System.out.println("SUFICIENTE");
            break;

            case 6: System.out.println("BIEN");
            break;

            case 7: System.out.println("NOTABLE");
            break;

            case 8: System.out.println("NOTABLE");
            break;

            case 9: System.out.println("SOBRESALIENTE");
            break;

            case 10: System.out.println("SOBRESALIENTE");
            break;

            default: System.out.println("Nota no valida");
        }
    
    }
}
