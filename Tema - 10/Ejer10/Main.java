package Ejer10;
import java.util.*;

public class Main {
    
    public static void main (String[] args){

        ArrayList <Empleado> empleados=new ArrayList <Empleado>();
        ArrayList <Hijo> aHijos=new ArrayList <Hijo>();
        HashMap <String, ArrayList<Hijo>> hijos=new HashMap <String, ArrayList<Hijo>>();
        Empleado empleadoHack=new Empleado();
        empleados.add(empleadoHack);
        Scanner lector=new Scanner (System.in);
        int elec;

        do{
            menu();
            elec=lector.nextInt();

            switch(elec){

                case 0:
                    System.out.println("Saliendo del programa...");
                break;

                case 1:
                    empleados=nuevoEmpleado(empleados);
                break;

                case 2:
                    hijos=nuevoHijo(empleados, hijos, aHijos);
                break;
                case 3:
                    System.out.println(hijos);
                break;
            }
        }
        while(elec!=0);
        
    }

    public static HashMap <String, ArrayList<Hijo>> nuevoHijo(ArrayList <Empleado> empleados, HashMap <String, ArrayList<Hijo>> hijos, ArrayList <Hijo> aHijos){

        Scanner lector=new Scanner (System.in);

        boolean compro=false;
        String dni;
        String nombre;
        int edad;
        do{
            
            System.out.println("Introduce el dni del empleado");
            dni=lector.nextLine();
            lector.nextLine();
            for(int i=0;i<empleados.size();i++){
                if(empleados.get(i).getDni().equals(dni)){
                    compro=true;
                    System.out.println("El dni que estas introduciendo no existe...");
                }
            }
        }
        while(compro==false);

        System.out.println("Introduce el nombre del hijo");
        nombre=lector.nextLine();
        lector.nextLine();

        System.out.println("Introduce la edad del hijo");
        edad=lector.nextInt();

        Hijo hijo1=new Hijo(nombre, edad);
        aHijos.add(hijo1);
        hijos.put(dni, aHijos);

        return hijos;
    }

    public static ArrayList <Empleado> nuevoEmpleado(ArrayList <Empleado> empleados){

        Scanner lector=new Scanner (System.in);

        boolean compro=false;
        String dni;
        String nombre;
        String fecha;
        double sueldo;
        String hijos;

        do{
            
            System.out.println("Introduce el dni del nuevo empleado");
            dni=lector.nextLine();
            lector.nextLine();
            for(int i=0;i<empleados.size();i++){
                if(empleados.get(i).getDni().equals(dni)){
                    compro=true;
                    System.out.println("El dni que estas introduciendo ya existe...");
                }
            }
        }
        while(compro==true);

        System.out.println("Introduce el nombre del empleado");
        nombre=lector.nextLine();
        lector.nextLine();

        System.out.println("Introduce la fecha de nacimiento del empleado");
        fecha=lector.nextLine();
        lector.nextLine();

        System.out.println("Introduce el sueldo del empleado");
        sueldo=lector.nextDouble();

        System.out.println("El empleado tiene hijos?");
        hijos=lector.nextLine();
        lector.nextLine();

        Empleado empleado=new Empleado(dni, nombre, fecha, sueldo, hijos);
        empleados.add(empleado);

        return empleados;
    }

    public static void menu(){
        System.out.println("**********************");
        System.out.println("*GESTION DE EMPLEADOS*");
        System.out.println("**********************");
        System.out.println("1.Nuevo empleado.");
        System.out.println("2.Nuevo hijo.");
        System.out.println("3.Modificar sueldo.");
        System.out.println("4.Borrar empleado.");
        System.out.println("5.Borrar hijo.");
        System.out.println("6.Consultas.");
        System.out.println("----------------------");
        System.out.println("0.Salir.");
    }
}
