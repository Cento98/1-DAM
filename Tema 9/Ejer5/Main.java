package Ejer5;
import java.util.*;
public class Main {
    
    public static void main (String[] args){
        
        Scanner lector=new Scanner (System.in);
        Alumnos alumno1=new Alumnos();
        Alumnos alumno2=new Alumnos();
        boolean compro=false;
        do{
            try{
                System.out.println("Introduce el nombre del alumno");
                alumno2.setNombre(lector.nextLine());
                System.out.println("Introduce la edad del alumno");
                alumno2.setEdad(lector.nextInt());
                System.out.println("Introduce la altura del alumno");
                alumno2.setAltura(lector.nextDouble());
                compro=true;
            }
            catch(InputMismatchException a){
                lector.nextLine();
                System.out.println("Dato erroneo introducido.");
            }
        }
        while(compro==false);
        
        alumno1.imprimir();
        alumno2.imprimir();
        alumno1.mayor(alumno2);
    }
}
