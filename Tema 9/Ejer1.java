import java.util.*;
public class Ejer1 {
 
    public static void main (String[] args){

       solicitar(); 
    }

    static void solicitar(){

        Scanner lector=new Scanner (System.in);
        int num=0;
    do{
        try{
            System.out.println("Introduce un NUMERO:");
            num=lector.nextInt();    
        }
        catch(InputMismatchException a){
            System.out.println("No se pueden introducir letras...");
            lector.nextLine();
        }
    }
    while(num>=0);
    }
}
