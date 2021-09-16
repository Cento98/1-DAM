import java.util.*;
public class Ejer1 {
    public static void main (String[] args){

        Random random=new Random();
        int array[]=new int[10];

        for(int i=0;i<array.length;i++){
            array[i]=random.nextInt(50-1)+1;
            System.out.println(array[i]);
        }

        conversion(array);
    }

    public static ArrayList <Integer> conversion(int[] array){

        ArrayList <Integer> lista = new ArrayList <Integer>();

        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                lista.add(array[i]);
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i]%2!=0){
                lista.add(array[i]);
            }
        }
        System.out.println(lista);
        return lista;
    }
}
