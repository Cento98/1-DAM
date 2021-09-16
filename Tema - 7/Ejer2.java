import java.util.Scanner;
public class Ejer2 {
    
    public static void main (String[] args){
        
        Scanner lector=new Scanner (System.in);

        System.out.println("Introduce una frase");
        String frase=lector.nextLine();

        vocales(frase);
    }

    static void vocales (String a){

        int longitud=a.length();
        int voc=0;
        int cons=0;

        for (int i=0;i<longitud;i++){

            
            char letra=a.charAt(i);

            if (letra=='a' || letra=='A' || letra=='e' || letra=='E' || letra=='i' || letra=='I' || letra=='o' || letra=='O' || letra=='u' || letra=='U'){

                voc++;

            }
            else{
                cons++;
            }
        }

        System.out.println("Tu frase tiene "+voc+" vocales y "+cons+" consonantes");
    }
}
