import java.util.Scanner;
public class Ejer13 {
    
    public static void main (String [] args){

        Scanner lector = new Scanner (System.in);

        System.out.println("Introduce tu nombre");
        String nombre = lector.nextLine();
        System.out.println("En que idioma quieres que te salude?");
        System.out.println("(1) Valenciano");
        System.out.println("(2) Castellano");
        System.out.println("(3) Ingles");
        int num = lector.nextInt();

        String total = saludos(nombre, num);
        System.out.println(total);
    }

    static String saludos(String a, int b){

        switch(b){

            case 1: String valenciano = "Bon dia, "+a;
            return valenciano;
            

            case 2: String castellano = "Buenos dias, "+a;
            return castellano;
            

            case 3: String ingles = "Good morning, "+a;
            return ingles;

            default: ;
            return "Entrada incorrecta, saliendo del programa...";
            
        }
    }
}

