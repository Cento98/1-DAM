import java.util.Random;
public class Ejer24 {
    
    public static void main (String[] args){

        Random random = new Random();

        int array[]=new int[50];
        int arraySumato[]=new int[50];
        int suma=0;
        for(int i=0;i<50;i++){
            array[i]=random.nextInt(0+(50-0));
            int numero2=array[i];
            System.out.println(numero2);
        }

        System.out.println("==============");

        for(int j=0;j<50;j++){
            int numero=array[j];
            suma=suma+numero;
            arraySumato[j]=suma;
            int numero3=arraySumato[j];
            System.out.println(numero3);
        }
    }
}
