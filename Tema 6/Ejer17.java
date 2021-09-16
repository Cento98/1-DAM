import java.util.Scanner;
public class Ejer17 {
    
    public static void main (String [] args){

        Scanner lector = new Scanner (System.in);

        System.out.println("Introduce la anchura");
        int ancho=lector.nextInt();
        System.out.println("Introduce la altura");
        int alto=lector.nextInt();
        System.out.println("Introduce con que caracter quieres rellenarlo");
        char carac=lector.next().charAt(0);

        imprimir(alto, ancho, carac);

    }

    static void imprimir (int a, int b, char c){

        for (int i=1;i<=a;i++){
            for (int j=1;j<=b;j++){
                System.out.print(c);
            }
            System.out.println("");
        }
    }
}
