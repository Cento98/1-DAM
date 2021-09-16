import java.util.Scanner;
public class Ejer6 {
    
    public static void main (String args[]){

        Scanner lector=new Scanner (System.in);

        int euros;
        int monedas;
        System.out.println("Introduce la cantidad de euros que quieras");
        euros=lector.nextInt();

        if(euros%2==0){
            monedas=euros/2;
            System.out.println(euros+" euros, son: "+monedas+" monedas de 2");
        }
        else{
            monedas=(euros-1)/2;
            System.out.println(euros+" euros, son: "+monedas+" monedas de 2 y una de 1");
        }

    }
}
