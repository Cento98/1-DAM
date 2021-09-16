import java.util.Scanner;
public class Ejer7 {
    
    public static void main (String[] args){

        Scanner lector = new Scanner (System.in);

        System.out.println("Escribe una frase");
        String frase=lector.nextLine();

        separacion(frase);
    }

    static void separacion (String a){

        String palabra="";
        String palabra2="";
        int longitud=a.length();

        for(int i=0;i<longitud;i++){
            
            char caracter=a.charAt(i);
            if (caracter==' '){
                System.out.println(palabra);
                palabra="";
                palabra2="";
            }
            else{
                palabra2=Character.toString(caracter);
                palabra=palabra+palabra2;
            }
           
        }
        System.out.println(palabra);
    }
}
