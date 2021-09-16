import java.util.Random;
public class Ejer27 {
    
    public static void main (String[] args){

        Random random=new Random();

        int array1[]=new int[50];
        int array2[]=new int[20];
        int matriz[][]=new int[50][20];

        for(int i=0;i<50;i++){
            array1[i]=random.nextInt((10-1+1)+1);
        }
        for(int j=0;j<20;j++){
            array2[j]=random.nextInt((10-1+1)+1);
        }

        for(int k=0;k<50;k++){
            for(int n=0;n<20;n++){
                matriz[k][n]=array1[k]*array2[n];
            }
        }

        for(int o=0;o<50;o++){
            for(int p=0;p<20;p++){
                int numero=matriz[o][p];
                System.out.print(numero);
            }
            System.out.println("");
        }
    }
}
