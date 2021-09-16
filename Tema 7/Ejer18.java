import java.util.Random;

import javax.swing.plaf.synth.SynthSpinnerUI;
public class Ejer18 {
    
    public static void main (String[] args){

        Random random=new Random();

        int array1[]=new int[10];
        int array2[]=new int[10];

        System.out.println("Primera array");
        for(int i=0;i<9;i++){
            array1[i]=random.nextInt(10)+1;
            int num=array1[i];
            System.out.println(num);
        }

        System.out.println("Segona array");
        for(int j=0;j<9;j++){
            array2[j]=random.nextInt(10)+1;
            int num1=array2[j];
            System.out.println(num1);
        }

        int arraySuma[]=suma(array1, array2);
        int arrayDivi[]=divi(array1, array2);

        System.out.println("arraySuma");
        for(int k=0;k<9;k++){
            int numSuma=arraySuma[k];
            System.out.println(numSuma);
        }

        System.out.println("arrayDivi");
        for(int n=0;n<9;n++){
            int numDivi=arrayDivi[n];
            System.out.println(numDivi);
        }


    }

    static int[] suma (int a[], int b[]){

        int array3[]=new int[10];

        for(int i=0;i<9;i++){
            int num1=a[i];
            int num2=b[i];
            array3[i]=num1+num2;
        }
        return array3;
    }

    static int[] divi (int a[], int b[]){

        int array4[]=new int[10];

        for(int i=0;i<9;i++){
            int num1=a[i];
            int num2=b[i];
            array4[i]=num1/num2;
        }
        return array4;
    }
}
