import java.util.Scanner;
public class Ejer15 {
    
    public static void main (String[] args){

        System.err.println("Introduce 20 valores numericos");

        array();
    }

    static void array(){

        Scanner lector=new Scanner (System.in);
       
        int array[]=new int[20];

        for(int i=0;i<20;i++){
            array[i]=lector.nextInt();
        }

        for(int j=0;j<20;j++){
            System.out.print(" "+array[j]+" ");
            if(j==3 || j==7 || j==11 || j==15 ){
                System.out.println("");
            }
        }

    }
}
