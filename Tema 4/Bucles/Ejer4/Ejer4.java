public class Ejer4{
    
    public static void main (String args[]){

        int contador = 0;
        for(int i=1;i<=100;i=i+2){
          

            contador++;
            System.out.println(i);
            
        }
        System.out.println("Hay "+contador+" Impares");
    }
}