import java.util.*;
public class Ejer3 {
    
    public static void main (String[] args){

        Scanner lector=new Scanner (System.in);

        int[] array={0,0};
        numeros(array);

        if(array[1]==0){
            System.out.println("No se ha introducido ningun numero");
        }
        else{
            System.out.println("El numero maximo introducido es el "+array[0]);
        }

    }

    static int[] numeros(int[] array){

        Scanner lector=new Scanner (System.in);
        int max;
        boolean compro=false;
        do{
            try{
                System.out.println("Introduce numeros");
                max=lector.nextInt();
                if(max>array[0]){
                    array[0]=max;
                }
                array[1]++;
            }
            catch(InputMismatchException a){
                compro=true;
            }
        }
        while(compro==false);

        return array;
    }
}
