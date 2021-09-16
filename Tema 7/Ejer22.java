import java.util.Scanner;
public class Ejer22 {
    
    public static void main (String[] args){
        
        Scanner lector = new Scanner (System.in);

        System.out.println("Introduce 10 valores INT");
        int array[]=new int[10];
        int contador=0;
        int contadorA=0;

        for(int i=0;i<10;i++){
            array[i]=lector.nextInt();
            int numero=array[i];
            if(numero<=10){
                array[i]=-1;
            }
            else{
                contador++;
            }
        }

        System.out.println("==========");
        System.out.println("==========");

        for(int k=0;k<10;k++){
            int numeroV=array[k];
            System.out.println(numeroV);
        }

        System.out.println("==========");
        System.out.println("==========");

        int array2[]=new int[contador];

        for(int j=0;j<10;j++){
            int numero2=array[j];
            if(numero2>10){
                System.out.println(numero2);
                array2[contadorA]=numero2;
                contadorA++;
            }
            
        }
    }
}
