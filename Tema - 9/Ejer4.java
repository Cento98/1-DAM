import java.util.*;
public class Ejer4 {
    
    public static void main (String[] args){

        int array[]=new int[5];
        int array2[]=new int[0];
        Emetodo(array);
        try{
            Emetodo(array2);
        }
        catch(NegativeArraySizeException c){
            System.out.println("Se ha creado una array sin inicializar...");
        }
       
    }

    static void Emetodo(int[] array){

        Scanner lector=new Scanner (System.in);
        for(int i=0;i<array.length+1;i++){

            try{
                System.out.println("Introduce un numero");
                array[i]=lector.nextInt();
            }
            catch(InputMismatchException a){
                System.out.println("Has introducido una letra...");
                i=i-1;
            }
            catch(IndexOutOfBoundsException b){
                System.out.println("Limite sobrepasado...");
                System.out.println("Mostrando array...");
                for(int j=0;j<array.length;j++){
                    System.out.println(array[j]);
                }
            }

        }
    }
}
