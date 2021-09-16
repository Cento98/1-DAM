import java.util.Scanner;
public class Ejer13 {
    
    public static void main (String[] args){

        System.out.println("Introduce 10 valores numericos");

        array();
    }

    static void array (){

        Scanner lector = new Scanner (System.in);
        double media=0;
        double contador=0;
        
        double array[]=new double[10];

        for (int i=0;i<=9;i++){
            array[i]=lector.nextDouble();
        }

        for(int i=0;i<=9;i++){
        double numeroArray=array[i];
        media=media+numeroArray;
        contador++;
        System.out.println("El valor "+contador+" es igual a: "+numeroArray);
        }

        double media2=media/10;
        System.err.println("La media de los 10 valores es: "+media2);
    
    
    }
}
