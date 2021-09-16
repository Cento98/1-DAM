import java.util.Scanner;
public class Ejer10 {
    
    public static void main (String[] args){

        Scanner lector=new Scanner (System.in);

        System.out.println("Inserte una palabra para ver si es palíndroma");
        String palabra=lector.nextLine();

        boolean comprobacion=palindroma(palabra);

        if (comprobacion==true){
            System.out.println("La palabra es palíndroma");
        }
        else{
            System.out.println("La palabra no es palíndroma");
        }
    }

    static boolean palindroma (String a){

        String letra;
        String palabraReves="";
        int longitud=a.length();
        int longitud2=longitud-1;
        
        for(int i=longitud2;i>=0;i--){

            char caracter=a.charAt(i);
            letra=Character.toString(caracter);
            palabraReves=palabraReves+letra;

    }

    if (palabraReves.equals(a)){

        return true;
    }
    else{
        return false;
    }
    
}
}
