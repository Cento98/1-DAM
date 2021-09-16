import java.util.Random;
import java.util.Scanner;
public class Ejer20 {
    
    public static void main (String[] args){

        Random random= new Random();
        Scanner lector=new Scanner (System.in);

        System.out.println("Introduce un numero");
        int numero=lector.nextInt();

        int array[]= new int[100];
        for(int i=0;i<99;i++){
            array[i]=random.nextInt(0+(100-0));
            System.out.println(array[i]);
        }

        boolean comprobacion=array(array, numero);

        if (comprobacion==true){
            System.out.println("El numero "+numero+" está en la array");
        }
        else{
            System.out.println("El numero "+numero+" no está en la array");
        }
    }

    static boolean array(int[] array, int a){

        int b=0;

        for(int i=0;i<99;i++){
            int numeroA=array[i];

            if (numeroA==a){
                b++;
            }
        }

        if(b==0){
            return false;
        }
        else{
            return true;
        }
        
    }
}
