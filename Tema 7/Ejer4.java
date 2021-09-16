import java.util.Scanner;
public class Ejer4 {
    
    public static void main (String[] args){

        Scanner lector=new Scanner (System.in);

        System.out.println("Introduce una frase");
        String frase=lector.nextLine();

        vocalesPalabra(frase);
    }

    static void vocalesPalabra (String a){

        int voc=0;
        int cons=0;
        int palabra=1;
        int longitud=a.length();

        for (int i=0;i<longitud;i++){

            char letra=a.charAt(i);
            if (letra==' '){
                System.out.println("La palabra "+palabra+" tiene "+voc+" vocales y "+cons+" cosonantes");
                palabra++;
                voc=0;
                cons=0;
            }
            else {

                if (letra=='a' || letra=='A' || letra=='e' || letra=='E' || letra=='i' || letra=='I' || letra=='o' || letra=='O' || letra=='u' || letra=='U'){

                    voc++;
    
                }
                else{
                    cons++;
                }
            }
        }
        System.out.println("La palabra "+palabra+" tiene "+voc+" vocales y "+cons+" cosonantes");
    }
}
