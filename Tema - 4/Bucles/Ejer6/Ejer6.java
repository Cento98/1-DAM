import java.util.Scanner;
public class Ejer6{
    public static void main (String args[]){
        Scanner lector = new Scanner (System.in);
        int elec;
        
        do{
            System.out.println("Elige la tabla que quieres mostrar del 1 al 10");
            elec = lector.nextInt();
        }
        while(elec <=0 || elec >=10);{

        for(int i=1;i<=10;i++){
            int elec2 = i * elec;
            System.out.println(elec+" * "+i+" = "+elec2);
        }
    }
    }
}