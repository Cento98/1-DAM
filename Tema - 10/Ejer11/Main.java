package Ejer11;
import java.util.*;
public class Main {
    
    public static void main (String[] args){
        
        Scanner lector=new Scanner (System.in);
        int elec;
        ArrayList <Alumno> alumnos=new ArrayList <Alumno>();
        ArrayList <Asignatura> asignaturas=new ArrayList <Asignatura>();
        ArrayList <Grupo> grupos=new ArrayList <Grupo>();
        ArrayList <Aula> aulas=new ArrayList <Aula>();
        ArrayList <Profesor> profesors=new ArrayList <Profesor>();
        Alumno alumno=new Alumno();
        
        do{
            menu();
            elec=lector.nextInt();

            switch(elec){

                case 0:
                    System.out.println("Saliendo del programa...");
                break;

                case 1:
                    alumno=altaAlumnos();
                break;

                case 2:
                    asignaturas=altaAsignaturas(asignaturas);
                break;

                case 3:
                    grupos=altaGrupos(grupos);
                break;

                case 4:
                    aulas=altaAulas(aulas);
                break;

                case 5:
                    profesors=altaProfesores(profesors);
                break;

                case 6:
                    mostrarGrupo(alumnos);
                break;

                case 7:
                    mostrarProfesor(alumnos);
                break;

                default:
                    System.out.println("Entrada erronea...");
                break;

            }
        }
        while(elec!=0);
        
    }

    public static void mostrarProfesor(ArrayList <Alumno> alumnos){

        Scanner lector=new Scanner (System.in);
        String profesor;
        boolean compro=false;
        do{
            System.out.println("Introduce el Profesor que quieres buscar");
            profesor=lector.nextLine();
            for(int i=0;i<alumnos.size();i++){
                if(alumnos.get(i).getAsignatura().getNombre().equals(profesor)){
                    compro=true;
                    alumnos.get(i).imprimirAlumno();
                }
            }
            if(compro=false){
                System.out.println("Profesor no encontrado");
            }
        }
        while(compro==false);
        
    }

    public static void mostrarGrupo(ArrayList <Alumno> alumnos){

        Scanner lector=new Scanner (System.in);
        String grupo;
        boolean compro=false;
        do{
            System.out.println("Introduce el grupo que quieres buscar");
            grupo=lector.nextLine();
            for(int i=0;i<alumnos.size();i++){
                if(alumnos.get(i).getGrupo().getNombre().equals(grupo)){
                    compro=true;
                }
            }
            if(compro=false){
                System.out.println("Grupo no encontrado");
            }
        }
        while(compro==false);
        
    }

    public static ArrayList <Profesor> altaProfesores(ArrayList <Profesor> profesors){

        Scanner lector=new Scanner (System.in);
        Profesor profesor=new Profesor();
        System.out.println("Introduce el dni del profesor");
        profesor.setDni(lector.nextLine());
        lector.nextLine();
        System.out.println("Introduce el nombre del profesor");
        profesor.setNombre(lector.nextLine());
        lector.nextLine();
        System.out.println("Introduce el sueldo del profesor");
        profesor.setSueldo(lector.nextDouble());
        return profesors;
    }

    public static ArrayList <Grupo> altaGrupos(ArrayList <Grupo> grupos){

        Scanner lector=new Scanner (System.in);
        Grupo grupo=new Grupo();
        System.out.println("Introduce el ide del grupo");
        grupo.setIde(lector.nextInt());
        System.out.println("Introduce el nombre del grupo");
        grupo.setNombre(lector.nextLine());
        return grupos;
    }

    public static ArrayList <Aula> altaAulas(ArrayList <Aula> aulas){

        Scanner lector=new Scanner (System.in);
        Aula aula=new Aula();
        System.out.println("Introduce el ide del aula");
        aula.setIde(lector.nextInt());
        System.out.println("Introduce los m2 del aula");
        aula.setM2(lector.nextDouble());
        return aulas;
    }

    public static ArrayList <Asignatura> altaAsignaturas(ArrayList <Asignatura> asignaturas){

        Scanner lector=new Scanner (System.in);
        Asignatura asignatura=new Asignatura();

        System.out.println("Introduce el ide de la asignatura");
        asignatura.setIde(lector.nextInt());
        System.out.println("Introduce el nombre de la asignatura");
        asignatura.setNombre(lector.nextLine());
        return asignaturas;
    }

    public static Alumno altaAlumnos(){

        Scanner lector=new Scanner (System.in);
        Alumno alumno=new Alumno();
        System.out.println("Introduce el ide del Alumno");
        alumno.setIde(lector.nextInt());
        System.out.println("Introduce el nombre del alumno");
        alumno.setNombre(lector.nextLine());
        lector.nextLine();
        System.out.println("Introduce el ide del grupo");
        alumno.getGrupo().setIde(lector.nextInt());
        System.out.println("Introduce el nombre del grupo");
        alumno.getGrupo().setNombre(lector.nextLine());
        lector.nextLine();
        System.out.println("Introduce el ide del aula");
        alumno.getGrupo().getAula().setIde(lector.nextInt());
        System.out.println("introduce los m2 del aula");
        alumno.getGrupo().getAula().setM2(lector.nextDouble());
        System.out.println("Introduce el ide de la asigantura");
        alumno.getAsignatura().setIde(lector.nextInt());
        System.out.println("Introduce el nombre de la asignatura");
        alumno.getAsignatura().setNombre(lector.nextLine());
        lector.nextLine();
        System.out.println("Introduce el dni del profesor");
        alumno.getAsignatura().getProfesor().setDni(lector.nextLine());
        System.out.println("Introduce el nombre del profesor");
        alumno.getAsignatura().getProfesor().setNombre(lector.nextLine());
        System.out.println("Introduce el suledo del profesor");
        alumno.getAsignatura().getProfesor().setSueldo(lector.nextDouble());

        return alumno;
    }

    public static void menu(){

        System.out.println("************************");
        System.out.println("*ADMINISTRACION COLEGIO*");
        System.out.println("************************");
        System.out.println("1. Alta Alumno.");
        System.out.println("2. Alta Asignatura.");
        System.out.println("3. Alta Grupo.");
        System.out.println("4. Alta Aula.");
        System.out.println("5. Alta Profesor.");
        System.out.println("6. Mostrar alumno por grupo");
        System.out.println("7. Mostrar alumno por profesor");
        System.out.println("------------------------");
        System.out.println("0. Salir");
    }
}
