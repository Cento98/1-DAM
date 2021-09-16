package Ejer2;

public class Main {

    public static void main (String[]args){

        System.out.println("");
        System.out.println("Asignatura 1");
        asignatura1();
        System.out.println("");
        System.out.println("Asignatura 2");
        asignatura2();
        System.out.println("");
        System.out.println("Asignatura 3");
        asignatura3();
    }

    static void asignatura1(){

        Asignaturas asig1= new Asignaturas();
        asig1.imprimir();
    }

    static void asignatura2(){

        Asignaturas asig2=new Asignaturas("Base de datos",2019,2);
        asig2.imprimir();
    }

    static void asignatura3(){
        
        Asignaturas asig3=new Asignaturas();
        asig3.setNombre("Sistemas");
        asig3.setCodigo(1500);
        asig3.setCurso(3);
        asig3.imprimir();
        
    }
}
