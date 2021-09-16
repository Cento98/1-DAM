import java.util.Random;
public class Ejer23 {
    
    public static void main (String[] args){

        Random random=new Random();

        int array[]=new int[10];
        int arrayInversa[]=new int [10];

        for(int i=0;i<10;i++){
            array[i]=random.nextInt(10-0+1)+0;
            int numero=array[i];
            System.out.println(numero);
        }
        System.out.println("=================");
        int contador=-1;
        for (int j=9;j>=0;j--){
            contador++;
            arrayInversa[contador]=array[j];
            int numero2=arrayInversa[contador];
            System.out.println(numero2);
        }
    }
}
