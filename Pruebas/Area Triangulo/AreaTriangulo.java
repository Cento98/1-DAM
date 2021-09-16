import java.util.Scanner;
public class AreaTriangulo {
    
    public static void main (String args[]){
        
        double alt;
        double anch;
        double area;
        
        Scanner lector = new Scanner (System.in);
        
        System.out.println("Introduce la altura del triangulo");
            alt = lector .nextDouble();
        
        System.out.println("Introduce la base del triangulo");
            anch = lector .nextDouble();
            
        area = (anch * alt) /2;
        
        System.out.println("La Area del triangulo es " + area);
        
        
        
    }
}