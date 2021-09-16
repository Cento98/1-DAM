import java.util.Random;
public class Ejer25 {
    
    public static void main (String[] args){

        Random random = new Random();

        int array[]=new int[50];
        int contadorPar=0;

        for(int i=0;i<50;i++){
            array[i]=random.nextInt(10-0+1)+0;
            int numeroPar=array[i];
            if(numeroPar%2==0){
                contadorPar++;
            }
        }

        if(contadorPar==0){
            System.out.println("No hay numeros par en la array");
        }
        else{
            int arrayPar[]=new int[contadorPar];
            int posicion=0;
            for(int j=0;j<50;j++){
                int numero2=array[j];
                if(numero2%2==0){
                    arrayPar[posicion]=numero2;
                    posicion++;
                    System.out.println(numero2);
                }
            }
        }

    }
}
