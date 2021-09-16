import java.util.Scanner;
public class Conversor{
    
    public static void main (String args[]){
        Scanner lector = new Scanner (System.in);
        
        double dato;
        double pulg;
        double cent;
        double pp;
        double cmp;
        
        System.out.println("Escribe 1 si quieres pasar de Pulgadas a Centimetros o escribe 2 si quieres pasar de Centimetros a Pulgadas");
        
            dato=lector.nextDouble();
            
         if (1 == dato) {
        
        System.out.println("Escribe las piulgadas que quieres pasar?");
            
            pulg=lector.nextDouble();
                
                pp = pulg * 2.54;
        
        System.out.println(pulg + (" pulgadas es igual a ") + pp + (" centimetros"));
            
        }
        
        else if (2 == dato) {
        
        System.out.println("Escribe los centimetros que quieres pasar");
            
            cent = lector .nextDouble();
            
            cmp = cent / 2.54;
            
        System.out.print(cent + (" centimetros es igual a ") + cmp + (" pulgadas"));
        } 
           
        else {
            System.out.println("Valor incorrecto");
        }
    }
}
