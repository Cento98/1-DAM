import java.util.Scanner;
public class Ejer6 {

    public static void main (String[] args){

        Scanner lector = new Scanner (System.in);

        System.out.println("Introduce una frase");
        String frase=lector.nextLine();

        System.out.println("Cuantas veces quieres verla repetida?");
        int repeticion=lector.nextInt();

        repeticiones(frase, repeticion);
    }

    static void repeticiones(String a, int b){

        for(int i=1;i<=b;i++){
            System.out.println(a);
        }
    }
    
}
