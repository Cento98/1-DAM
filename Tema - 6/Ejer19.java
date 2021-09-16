import java.util.Scanner;
public class Ejer19 {
    
    public static void main (String [] args){

        Scanner lector = new Scanner (System.in);

        System.out.println("Introduce el NIF");
        String nif = lector.nextLine();
        
        dni(nif);
        
      
    }


    static void dni(String a){

        char letra=a.charAt(8);
        String letraS=String.valueOf(letra);
        String cadenaSinLetra=a.replaceAll("[A-z]", "");
        int dni=Integer.parseInt(cadenaSinLetra);
        int resultadoLetra=dni%23;
        String letrasDNI[]={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        String comparacion=letrasDNI[resultadoLetra];
        
        if(comparacion.equals(letraS)){
            
            System.out.println("El NIF es correcto");
        }
        else {
            System.out.println("El NIF es incorrecto");
        }
    }

}
