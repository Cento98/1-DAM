import java.util.Random;
public class Ejer19 {
    
    public static void main (String[] args){

        Random random=new Random();

        int array[]= new int[100];

        for(int i=0;i<99;i++){
            array[i]=random.nextInt(0+(100-0));
        }

        array0(array);
        array5(array);
        array10(array);
    }

    static void array0(int[] array){

        System.out.println("Ceros");
        for(int i=0;i<99;i++){
            int numero=array[i];
            if(numero==0){
                System.out.println(numero);
            }
        }
    }

    static void array5(int[] array){

        System.out.println("Multiplos de 5");
        for(int i=0;i<99;i++){
            int numero=array[i];
            if(numero%5==0){
                System.out.println(numero);
            }
        }
    }

    static void array10(int[] array){

        System.out.println("Multiplos de 10");
        for(int i=0;i<99;i++){
            int numero=array[i];
            if(numero%10==0 && numero!=0){
                System.out.println(numero);
            }
        }
    }
}
