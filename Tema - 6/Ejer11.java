import java.util.Random;
public class Ejer11 {
    
    public static void main (String [] args){
        
        for(int i=1;i<=15;i++){
            int resultado=valorAleatorio();
            if(i<10){
                if(resultado==1){
                    System.out.println("Partido"+i+"    1");
                }
                else if(resultado==2){
                    System.out.println("Partido"+i+"    2");
                }
                else {
                    System.out.println("Partido"+i+"    X");
                }
            }
            else { 
                if(resultado==1){
                    System.out.println("Partido"+i+"   1");
                }
                else if(resultado==2){
                    System.out.println("Partido"+i+"   2");
                }
                else {
                    System.out.println("Partido"+i+"   X");
                }
            }
        }
    }

    static int valorAleatorio(){
        Random aleatorio = new Random();
        int a=aleatorio.nextInt(3)+1;
        int b=valor(a);
        return b;
    }

    static int valor(int c){

        if (c==1){
            return 1;
        }
        else if(c==2){
            return 2;
        }
        else {
            return 3;
        }
    }
}
