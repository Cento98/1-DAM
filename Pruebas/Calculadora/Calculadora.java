import java.util.Scanner;
public class Calculadora{
    
    public static void main (String args[]){
    
        Scanner lector = new Scanner (System.in);
        
        double numeroUno;
        double numeroDos;
        double suma;
        double resta;
        double mult;
        double div;
        double modu;
        
        System.out.println("Instroduce el 1r numero");
            numeroUno = lector .nextDouble();
        System.out.println("Inserte el 2n numero");
            numeroDos = lector .nextDouble();
        
        
                    suma = numeroUno + numeroDos;
                    resta = numeroUno - numeroDos;
                    mult = numeroUno * numeroDos;
                    div = numeroUno / numeroDos;
                    modu = numeroUno % numeroDos;
                    
        
        System.out.println("La suma de los 2 numero es igual a " + suma);
        System.out.println("La resta de los 2 numeros es igual a " + resta);
        System.out.println("La multiplicacion de los 2 numeros es igual a " + mult);
        System.out.println("La division de los 2 numeros es igual a " + div);
        System.out.println("El modulo de los 2 numeros es igual a " + modu);
        
        
        
        
    }
}