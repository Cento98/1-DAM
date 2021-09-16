import java.util.Scanner;
public class Ejer17{
    
    public static void main (String args[]){
        
        Scanner lector = new Scanner (System.in);
        
        System.out.println("Bienvenido al programa para calcular el consumo mdedio de un automovil.");
        System.out.println("Necesitaremos datos sobre las 3 ultimas veces que se repostó combustible.");
        
        System.out.println("1ra respostada");
        System.out.println("      - Precio del litro.");
        System.out.println("      - Total pagado al llenar deposito.");
        System.out.println("      - Cuantos KM marca el cuenta kilometros.");
            float precio1 = lector.nextFloat();
            float total1 = lector.nextFloat();
            float km1 = lector.nextFloat();
        
        System.out.println("2nd respostada");
        System.out.println("      - Precio del litro.");
        System.out.println("      - Total pagado al llenar deposito.");
             float precio2 = lector.nextFloat();
             float total2 = lector.nextFloat();
             
        System.out.println("3ra respostada");
        System.out.println("      - Cuantos KM marca el cuenta kilometros.");
             float km3 = lector.nextFloat();
             
        
        float totalTotal = total1 + total2;
        float kmTotal = km1 + km3;
        float final1 = totalTotal/kmTotal * 100;
        float preciokm = totalTotal / km3;
        
        System.out.println("El consumo cada 100km es de: " + final1);
        System.out.println("El coste por kilometro es de: " + preciokm);
        
    }
}