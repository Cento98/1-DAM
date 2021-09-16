import java.util.Scanner;
public class Ejer5 {

    public static void main (String[] args){

        Scanner lector=new Scanner (System.in);

        System.out.println("Introduce una frase");

        String cadena=lector.nextLine();

        String cadena2=cadena+" ";
        String suma="";
        String palabraaux="";
        String palabraF="";
        for(int i=0;i<cadena2.length();i++){
            char caracter=cadena2.charAt(i);
            if(caracter==' '){
                if(suma.length()>palabraaux.length()){
                    palabraF=suma;
                    suma="";
                }
            }
            else{
                String letraS=Character.toString(caracter);
                suma=suma+letraS;
            }
        }
        System.out.println("La palabra mas larga es:"+palabraF+" y tiene "+palabraF.length()+" caracteres");
    }
}
