import java.util.Scanner;
public class Ejer18 {
    
    public static void main (String [] args){

        String denei=obtindreDNI();
        
        String letra=calcularNIF(denei);

        System.out.println("Su NIF es: "+letra);

    }

    static String obtindreDNI(){

        Scanner lector = new Scanner (System.in);

        System.out.println("Introduce tu DNI:");
        int dni=lector.nextInt();
        String dniString = Integer.toString(dni);

        return dniString;
    }

    static String calcularNIF(String a){

        int calculo =Integer.parseInt(a);
        int resultado=calculo%23;
        String letraDNI;
        String finalDNI;
        String letras[]={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        letraDNI=letras[resultado];
        finalDNI=a+letraDNI;
        return finalDNI;

    }
}
