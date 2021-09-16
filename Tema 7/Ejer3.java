import java.util.Scanner;
public class Ejer3 {
    
    public static void main (String[] args){

        Scanner lector=new Scanner (System.in);

        System.out.println("Introduce una frase");
        String frase=lector.nextLine();

        espacios(frase);
    }

    static void espacios (String a){

        int longitud=a.length();
        int palabras=1;
        for(int i=0;i<longitud;i++){
            
            char caracter=a.charAt(i);
            if (caracter==' '){
                palabras++;
            }
        }

        if (palabras==1){
            System.out.println("Tu frase tiene "+palabras+" palabra.");
        }
        else{
            System.out.println("Tu frase tiene "+palabras+" palabras.");
        }
       
    }
}
