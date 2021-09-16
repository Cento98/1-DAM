import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Ejer29 {
    
    public static void main(String[] args){

        Random random=new Random();

        double matriz[][]=new double[20][3];
        double mediaT1=0;
        double mediaT2=0;
        double mediaT3=0;
        int contador1=0;
        int contador2=0;
        int contador3=0;

        int alumno=1;
        System.out.println("Alumnos   nota1   nota2   nota3   media");
        for(int i=0;i<20;i++){
            System.out.print("Alumno "+alumno+" --> ");
            alumno++;
            double mediaA=0;
            for(int j=0;j<3;j++){
                matriz[i][j]=random.nextDouble()*((9-0+1)+0);
                double num1=matriz[i][j];
                BigDecimal bd =new BigDecimal(num1).setScale(2, RoundingMode.HALF_UP);
                double num2=bd.doubleValue();
                System.out.print(num2+"   ");
                mediaA=mediaA+num2;
                if(j==0){
                    mediaT1=mediaT1+num1;
                    if(num1>=5){
                        contador1++;
                    }
                }
                if(j==1){
                    mediaT2=mediaT2+num1;
                    if(num1>=5){
                        contador2++;
                    }
                }
                if(j==2){
                    mediaT3=mediaT3+num1;
                    if(num1>=5){
                        contador3++;
                    }
                }

            }
            double mediaAA=mediaA/3;
            BigDecimal bd1 =new BigDecimal(mediaAA).setScale(2, RoundingMode.HALF_UP);
            double mediaA2=bd1.doubleValue();
            System.out.println(mediaA2);
        }
        double mediaT11=mediaT1/20;
        double mediaT22=mediaT2/20;
        double mediaT33=mediaT3/20;
        BigDecimal bd2 =new BigDecimal(mediaT11).setScale(2, RoundingMode.HALF_UP);
        BigDecimal bd3 =new BigDecimal(mediaT22).setScale(2, RoundingMode.HALF_UP);
        BigDecimal bd4 =new BigDecimal(mediaT33).setScale(2, RoundingMode.HALF_UP);
        double mediaT1F=bd2.doubleValue();
        double mediaT2F=bd3.doubleValue();
        double mediaT3F=bd4.doubleValue();
        System.out.println("Media ASIG "+mediaT1F+"("+contador1+")"+" "+mediaT2F+"("+contador2+")"+" "+mediaT3F+"("+contador3+")");
    }
}
