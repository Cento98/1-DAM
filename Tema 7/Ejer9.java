import java.util.Scanner;
public class Ejer9 {
    
    public static void main (String [] args){

        Scanner lector = new Scanner (System.in);

        System.out.println("Introduce una frase");
        String frase=lector.nextLine();

        impares(frase);
    }

    static void impares (String a){

        String espacio=" ";
        String b=espacio+a;
        int longitud=b.length();
        for(int i=1;i<longitud;i++){

            if (i%2==1){
                char letra=b.charAt(i);
                System.out.print(letra);
            }
        }
    }
}
