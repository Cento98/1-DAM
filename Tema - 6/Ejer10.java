import java.util.Scanner;
public class Ejer10 {
    
    public static void main (String [] args){

        Scanner lector = new Scanner (System.in);
        int multiplicado;
        int multiplicador;
        do{
            System.out.println("Introduce el numero de la table que quieres ver");
            multiplicado=lector.nextInt();
            System.out.println("Hasta que numero lo quieres multiplicar?");
            multiplicador=lector.nextInt();
            tabla(multiplicado, multiplicador);
        }

        while(multiplicado>=0 && multiplicador>0);{
           
        }
    }

    static void tabla(int a, int b){

        for(int i=1;i<=b;i++){
            int c = i * a;
            System.out.println(a+" * "+i+" = "+c);
        }
    }
}
