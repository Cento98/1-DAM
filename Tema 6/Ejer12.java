import java.util.Random;
public class Ejer12 {
    
    public static void main (String [] args){
        
        
        int num1=0;
        for (int i=1;i<=50;i++){
            System.out.print("Nota "+i+": ");
            calificacion(num1);
        }
        
    }

    static void calificacion(int a){

        Random aleatorio=new Random();

        a=aleatorio.nextInt(10)+1;

        switch(a){
            case 0: System.out.println("Insuficiente");
            break;
            case 1: System.out.println("Insuficiente");
            break;
            case 2: System.out.println("Insuficiente");
            break;
            case 3: System.out.println("Insuficiente");
            break;
            case 4: System.out.println("Insuficiente");
            break;
            case 5: System.out.println("Suficiente");
            break;
            case 6: System.out.println("Bien");
            break;
            case 7: System.out.println("Notable");
            break;
            case 8: System.out.println("Notable");
            break;
            case 9: System.out.println("Sobresaliente");
            break;
            case 10: System.out.println("Sobresaliente");
            break;
            default: System.out.println("Nota no valida");
            break;
        }
    }
}
