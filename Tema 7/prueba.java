import java.util.Scanner;
public class prueba {
    
    public static void main (String []args){

        Scanner lector=new Scanner (System.in);

        int anos;
        int trienos;

        System.out.println("Introduce los años trabajados");
        anos=lector.nextInt();

        if(anos%3==0){
            trienos=anos/3;
            System.out.println(trienos+" trienos");
        }
        else if(anos%2==0){
            trienos=(anos-2)/3;
            System.out.println(trienos+" trienos");
        }
        else{
            trienos=(anos-1)/3;
            System.out.println(trienos+" trienos");
        }
    }
}
