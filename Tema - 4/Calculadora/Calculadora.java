import java.util.Scanner;
public class Calculadora{
    
    public static void main (String args[]){
     
            Scanner lector = new Scanner (System.in);
            int opcion, num1, num2, total;
            String enter;
            
            
            do
            {
                System.out.println("Elige una opción:");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Resto división");
                System.out.println("------------------");
                System.out.println("0. Salir");
                
                opcion = lector.nextInt();
           
                switch(opcion){
                
                    case 1:
                        System.out.println("Escribe el 1r numero que quieres sumar");
                        num1 = lector.nextInt();
                        System.out.println("Escribe el 2nd numero que quieres sumar");
                        num2 = lector.nextInt();
                        total = num1+num2;
                        System.out.println("El resultado es "+total);
                        System.out.println("Presione enter para continuar");
                        enter=lector.nextLine();
                        enter=lector.nextLine();
                        break;
                        
                    case 2:
                        System.out.println("Escribe el 1r numero que quieres restar");
                        num1 = lector.nextInt();
                        System.out.println("Escribe el 2nd numero que quieres restar");
                        num2 = lector.nextInt();
                        total = num1-num2;
                        System.out.println("El resultado es "+total);
                        System.out.println("Presione enter para continuar");
                        enter=lector.nextLine();
                        enter=lector.nextLine();
                        break;
                        
                    case 3:
                        System.out.println("Escribe el 1r numero que quieres multiplicar");
                        num1 = lector.nextInt();
                        System.out.println("Escribe el 2nd numero que quieres multiplicar");
                        num2 = lector.nextInt();
                        total = num1*num2;
                        System.out.println("El resultado es "+total);
                        System.out.println("Presione enter para continuar");
                        enter=lector.nextLine();
                        enter=lector.nextLine();
                        break;
                        
                    case 4:
                        System.out.println("Escribe el 1r numero que quieres dividir");
                        num1 = lector.nextInt();
                        System.out.println("Escribe el 2nd numero que quieres dividir");
                        num2 = lector.nextInt();
                        total = num1/num2;
                        System.out.println("El resultado es "+total);
                        System.out.println("Presione enter para continuar");
                        enter=lector.nextLine();
                        enter=lector.nextLine();
                        break;
                        
                    case 5:
                        System.out.println("Escribe el 1r numero que quieres modular");
                        num1 = lector.nextInt();
                        System.out.println("Escribe el 2nd numero que quieres modular");
                        num2 = lector.nextInt();
                        total = num1%num2;
                        System.out.println("El resultado es "+total);
                        System.out.println("Presione enter para continuar");
                        enter=lector.nextLine();
                        enter=lector.nextLine();
                        break;
                }
                
              System.out.println("Cerrando app");
            }
            while(opcion !=0);
            
    }
}