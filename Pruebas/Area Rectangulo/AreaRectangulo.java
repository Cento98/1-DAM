import java.util.Scanner;
public class AreaRectangulo{

    public static void main (String args[]){
        
        Scanner lector = new Scanner (System.in);
        
        double alt;
        double anch;
        double area;
        
        System.out.println("Introduce la altura");
        alt = lector.nextDouble();
        System.out.println("Introduce la anchura");
        anch = lector .nextDouble();
        
        area = alt * anch;
        
        System.out.println("El area del rectangulo es " + area);
    }
}
