package Primitiva;
import java.util.Random;
import java.util.Scanner;
public class Boleto {
    
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int num5;
    private int num6;
    private int complementario;
    private int reintegro;

    public int getReintegro() {
        return this.reintegro;
    }

    public void setReintegro(int reintegro) {
        this.reintegro = reintegro;
    }

    public int getComplementario() {
        return this.complementario;
    }

    public void setComplementario(int reintegro) {
        this.complementario = reintegro;
    }


    public int getNum1() {
        return this.num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return this.num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return this.num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getNum4() {
        return this.num4;
    }

    public void setNum4(int num4) {
        this.num4 = num4;
    }

    public int getNum5() {
        return this.num5;
    }

    public void setNum5(int num5) {
        this.num5 = num5;
    }

    public int getNum6() {
        return this.num6;
    }

    public void setNum6(int num6) {
        this.num6 = num6;
    }

    public Boleto(){
        Random random=new Random();
        int array[]=new int[7];
        int num;
        boolean compro;
        for(int i=0;i<array.length;i++){
            compro=false;
            num=random.nextInt(49-1)+1;
            for(int j=0;j<array.length;j++){
                if(array[j]!=0 && array[j]==num){
                    compro=true;
                }
            }
            if(compro==false){
                array[i]=num;
            }
            else{
                i-=1;
            }

        }  
        num1=array[0];
        num2=array[1];
        num3=array[2];
        num4=array[3];
        num5=array[4];
        num6=array[5];
        complementario=array[6];
        reintegro=random.nextInt(9-0)+0;
    }

    public Boleto(int[] array){
        Scanner lector=new Scanner (System.in);
        Random random=new Random();
        int num;
        boolean compro;
        for(int i=0;i<array.length;i++){
            compro=false;
            if(i<=5){
                int o=i+1;
                System.out.println("Introduce el "+o+" numero");
            }
            else if(i==6){
                System.out.println("Introduce el numero complementario");
            }
            else{
                System.out.println("Introduce el reintegro");
            }
            num=lector.nextInt();
            for(int j=0;j<array.length;j++){
                if(array[j]!=0 && array[j]==num){
                    compro=true;
                }
            }
            if(compro==false){
                array[i]=num;
            }
            else{
                System.out.println("Numero repetido detectado");
                i-=1;
            }
        } 
        num1=array[0];
        num2=array[1]; 
        num3=array[2]; 
        num4=array[3]; 
        num5=array[4]; 
        num6=array[5];
        complementario=array[6];
        reintegro=random.nextInt(9-0)+0;
      
    }
    public void imprimir(){
        System.out.println("**********");
        System.out.println("**BOLETO**");
        System.out.println("**********");
        System.out.println(num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6+" "+complementario+" "+reintegro+"\n");
    }

    public void imprimir2()throws InterruptedException{
        System.out.println("**********************");
        System.out.println("**NUMEROS DEL SORTEO**");
        System.out.println("**********************");
        System.out.print(num1+" ");
        Thread.sleep(500);
        System.out.print(num2+" ");
        Thread.sleep(500);
        System.out.print(num3+" ");
        Thread.sleep(500);
        System.out.print(num4+" ");
        Thread.sleep(500);
        System.out.print(num5+" ");
        Thread.sleep(500);
        System.out.print(num6+" ");
        Thread.sleep(500);
        System.out.print(complementario+" ");
        Thread.sleep(500);
        System.out.print(reintegro+"\n");
        Thread.sleep(500);
        //System.out.println(num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6+" "+complementario+" "+reintegro+"\n");
    }

}
