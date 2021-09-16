package Ejer9;
import java.io.IOException;
import java.util.*;
public class Main {
    
    public static void main (String[] args){

        Scanner lector=new Scanner (System.in);

        System.out.println("Cuantos alumnos quieres?");
        Alumnos alumno = new Alumnos();
        int alum=lector.nextInt();
        lector.nextLine();

        String alumnos[] = new String[alum];
        for(int i=0;i<alumnos.length;i++){
            System.out.println("Introduce el alumno");
            alumnos[i]=lector.nextLine();
        }

        try{
            alumno.insertarAlumnos(alumnos, "ficheros", "prueba.txt");
        }
        catch(IOException e){
            e.printStackTrace();
        }

        System.out.println("Que alumno quieres eliminar?");
        String eliminar=lector.nextLine();
        try{
            alumno.eliminarAlumnos(alum, eliminar, "ficheros", "prueba.txt");
        }
        catch(IOException e){
            e.printStackTrace();
        }
        

    }
}
