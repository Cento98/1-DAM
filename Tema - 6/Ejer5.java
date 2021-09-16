import java.util.Scanner;
public class Ejer5 {
    
    public static void main (String [] args){

        
        Scanner lector=new Scanner(System.in);

        System.out.println("Introduce el caracter que quieras:");
        char carac=lector.next().charAt(0);
        System.out.println("Introduce el numero de veces que quieres imprimirlo");
        int num1=lector.nextInt();

        imprimir(carac, num1);

    }

    static void imprimir (char a, int b){
        for(int i=1;i<=b;i++){
            System.out.println(a);
        }
    }
}
