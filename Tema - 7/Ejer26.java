import java.util.Scanner;
import java.util.Random;
public class Ejer26 {
    
    public static void main (String[] args){

        Random random=new Random();
        Scanner lector=new Scanner (System.in);

        int matriz[][]=new int[4][8];

        System.out.println("Introduce F y C para ver un elemento en concreto");
        int elemento=lector.nextInt();
        int elemento2=lector.nextInt();
        System.out.println("Introduce F");
        int fila=lector.nextInt();
        System.out.println("Introduce C");
        int columna=lector.nextInt();

        System.out.println("===============");

        for(int i=0;i<4;i++){
            for(int j=0;j<8;j++){
                matriz[i][j]=random.nextInt((10-0+1)+0);
                int numeroMatriz=matriz[i][j];
                System.out.print(" "+numeroMatriz+" ");
            }
            System.out.println("");
        }

        System.out.println("===============");

        for(int k=3;k>=0;k--){
            for(int n=7;n>=0;n--){
                int numeroReves=matriz[k][n];
                System.out.print(" "+numeroReves+" ");
            }
            System.out.println("");
        }

        System.out.println("===============");

        for(int a=0;a<4;a++){
            int suma=0;
            for(int b=0;b<8;b++){
                int sumaM=matriz[a][b];
                System.out.print(" "+sumaM+" ");
                suma=suma+sumaM;
            }
            System.out.print(" == "+suma);
            System.out.println("");
        }

        System.out.println("===============");

        int comproMAX=0;
        int comproMIN=10;
        for(int c=0;c<4;c++){
            for(int d=0;d<8;d++){
                int numeraco=matriz[c][d];
                if(numeraco>comproMAX){
                    comproMAX=numeraco;
                }
                if(numeraco<comproMIN){
                    comproMIN=numeraco;
                }
            }
        }
        System.out.println("El valor maximo de la matriz es: "+comproMAX);
        System.out.println("El valor minimo de la matriz es: "+comproMIN);

        System.out.println("===============");

        int media=0;
        int contador=0;
        for(int e=0;e<4;e++){
            for(int f=0;f<8;f++){
                int aux=matriz[e][f];
                media=media+aux;
                contador++;
            }
        }
        int mediaF=media/contador;
        System.out.println("La media de la matriz es: "+mediaF);

        System.out.println("===============");


        int element=matriz[elemento][elemento2];
        System.out.println("El elemento seleccionado es: "+element);

        System.out.println("===============");

        for(int h=0;h<8;h++){
            int fil=matriz[fila][h];
            System.out.print(fil);
        }
        System.out.println("");

        System.out.println("===============");

        for(int g=0;g<4;g++){
            int column=matriz[g][columna];
            System.out.println(column);
        }

        System.out.println("===============");

        int suma;
        for(int l=0;l<8;l++){
            suma=0;
            for(int m=0;m<4;m++){
                int guard=matriz[m][l];
                suma=suma+guard;
            }
            System.out.println("Total columna "+l+" = "+suma);
        }
    }
}
