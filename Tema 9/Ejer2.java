import java.util.*;
public class Ejer2 {
 
    public static void main (String[] args){
        
        decimales();
    }

    static void decimales(){

        Scanner lector=new Scanner (System.in);
        Double array[]=new Double[10];
        int exep=0;
        double max=0;

        for(int i=0;i<array.length;i++){
            try{
                System.out.println("Introduce un numero decimal:");
                array[i]=lector.nextDouble();
            }
            catch(InputMismatchException a){
                System.out.println("No se pueden introducir letras.");
                lector.nextLine();
                i=i-1;
                exep++;
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("El numero maximo introducido es: "+max);
        System.out.println("La excepcion se ha repetido "+exep+" veces.");
    }
}
