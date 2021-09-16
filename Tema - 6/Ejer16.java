import java.util.Scanner;
public class Ejer16 {
    
    public static void main (String [] args){

        Scanner lector = new Scanner (System.in);

        System.out.println("Acontinuacion se mostrara por ponstalla una secuencia de 4 digitos del 0-0-0-0 al 9-9-9-9");
        System.out.println("Introduce el numero que quieres sustituir por una letra");
        int num1=lector.nextInt();
        System.out.println("Introduce la letra");
        char letra=lector.next().charAt(0);

        imprimir(num1, letra);

    }

    static void imprimir (int a, char b){

      String contador1="";
      String contador2="";
      String contador3="";
      String contador4="";

    for (int i=0;i<=9;i++){
        contador1=String.valueOf(i);
        if(contador1.equals(String.valueOf(a))){
            contador1=String.valueOf(b);
        }
        for (int j=0;j<=9;j++){
            contador2=String.valueOf(j);
            if(contador2.equals(String.valueOf(a))){
                contador2=String.valueOf(b);
            }
            for (int k=0;k<=9;k++){
                contador3=String.valueOf(k);
                if(contador3.equals(String.valueOf(a))){
                    contador3=String.valueOf(b);
                }
                for (int l=0;l<=9;l++){
                    contador4=String.valueOf(l);
                    if(contador4.equals(String.valueOf(a))){
                        contador4=String.valueOf(b);
                    }
                    System.out.println(contador1+"-"+contador2+"-"+contador3+"-"+contador4);
                }
            }
        }
    }

    }
    
}
