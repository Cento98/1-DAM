import java.util.Scanner;
public class Ejer1{

    public static void main (String [] args){

        Scanner lector = new Scanner (System.in);

        System.out.println("Introduce una palabra en minusculas");

        String palabraMinuscula=lector.nextLine();

        String mayuscula=convertir(palabraMinuscula);

        System.out.println(mayuscula);
    }

    static String convertir (String a){
        String palabraMayuscula="";
        int longitud=a.length();
        for (int i=0;i<longitud;i++){
            
            if(i==0){
                char primeraLetra=a.charAt(i);
                String letra1=Character.toString(primeraLetra);
                palabraMayuscula=letra1.toUpperCase();
            }
            else{
                char letras=a.charAt(i);
                String letra2=Character.toString(letras);
                palabraMayuscula=palabraMayuscula+letra2;
            }
        }
        return palabraMayuscula;
    }
}