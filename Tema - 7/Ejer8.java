import java.util.Scanner;
public class Ejer8 {
    
    public static void main (String[] args){

        Scanner lector = new Scanner (System.in);

        System.out.println("Introduce una frase");

        String frase=lector.nextLine();

        columnas(frase);
    }

    static void columnas (String a){
        
        int caracteres=0;
        String palabra="";
        String b=a+" ";
        int longitud=b.length();

        for(int i=0;i<longitud;i++){

            char letra=b.charAt(i);

            if (letra==' '){
                System.out.println(palabra+" "+caracteres);
                palabra="";
                caracteres=0;
            }
            else {
                String letra2=Character.toString(letra);
                palabra=palabra+letra2;
                caracteres++;
            }
        }
    }
}
