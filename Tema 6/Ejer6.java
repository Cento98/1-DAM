import java.util.Scanner;
public class Ejer6 {
    

    public static void main (String [] args){

        Scanner lector=new Scanner(System.in);

        System.out.println("Introduce el caracter que quieras:");
        char carac=lector.next().charAt(0);
        System.out.println("Introduce el numero de veces que quieres imprimirlo:");
        int num1=lector.nextInt();
        System.out.println("Introduce en cuantas lineas lo quieres ver:");
        int num2=lector.nextInt();

        imprimir(carac, num1, num2);

    }

    static void imprimir (char a, int b, int c){
        for(int j=1;j<=c;j++){
            for(int i=1;i<=b;i++){
               System.out.print(a);
            }
        System.out.println("");
        }
    }
}