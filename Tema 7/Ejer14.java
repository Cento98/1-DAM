import java.util.Scanner;
public class Ejer14 {
    
    public static void main (String[] args){

        System.out.println("Introduce 10 valores Char");

        array();
    } 

    static void array(){

        Scanner lector = new Scanner (System.in);

        char array[]=new char[10];

        for(int i=0;i<=9;i++){
            array[i]=lector.next().charAt(0);
        }

        for(int j=0;j<=8;j=j+2){
            char caracterPar=array[j];
            System.out.println(caracterPar+" (posicion par)");
        }

        for(int n=1;n<=9;n=n+2){
            char caracterImpar=array[n];
            System.out.println(caracterImpar+" (posicion impar)");
        }


    }
}
