package Ejer3;
import java.util.Scanner;
import java.util.GregorianCalendar;
public class Main {
    
    public static void main (String[]args){
        Alumnos alumnos[]=new Alumnos[5];
        menu(alumnos);
    }

    static void limpiar(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void menu(Alumnos[] alumnos){

        Scanner lector=new Scanner (System.in);
        int elec;
        do{
            System.out.println("************************");
            System.out.println("** GESTION DE ALUMNOS **");
            System.out.println("************************");
            System.out.println("1. Nuevo alumno...");
            System.out.println("2. Baja de alumno...");
            System.out.println("3. Consultas...");
            System.out.println("-------------------------");
            System.out.println("0. Salir...");
    
            elec=lector.nextInt();
    
            switch(elec){
                
                case 0:
                    System.out.println("");
                    System.out.println("Saliendo del programa...");
                break;

                case 1:
                    limpiar();
                    nuevoAlumno(alumnos);
                break;
    
                case 2:
                    limpiar();
                    bajaAlumno(alumnos); 
                break;
    
                case 3:
                    limpiar();
                    consultas(alumnos);
                break;
    
                default: 
                    limpiar();
                    System.out.println("Eleccion incorrecta, tas bobo o que?");
                break;
            }
        }
        while(elec<0 || elec>=4);  
    }

    static void nuevoAlumno(Alumnos[] alumnos){

        Scanner lector=new Scanner (System.in);                 //Comprobamos si la array esta vacía, sino, la rellenamos con el objeto
        boolean niaB=false;
        int valor=5;
        String compro;
        Alumnos alum=new Alumnos();
        for(int i=0;i<5;i++){
            if(alumnos[i]==null){
                valor=i;
                alumnos[i]=alum;
                break;
            }
        }
        if(valor>4){
            System.out.println("No se pueden introducir mas alumnos.");         //En caso de que este lleno, volvemos al menu con un mensaje de error
            menu(alumnos);
        }
        else{
            do{
                do{
                    System.out.print("Introduce el nia del alumno: ");          //Introducimos datos del objeto
                    alum.setNia(lector.nextInt());
                    lector.nextLine();
                    System.out.println("");
                    for(int i=0;i<5;i++){                                      //Comprobamos que la posicion del array no este vacía y no sea = a la que introducimos
                        if(alumnos[i]!=null && i!=valor){                   
                            niaB=alum.getNia()==alumnos[i].getNia();            //Comprobamos si hay otro nia repetido
                            if(niaB==true){
                                System.out.println("El nia introducido ya existe, accion imposible");
                                break;
                            }
                        }
                    }
                }
                while(niaB==true);
                
                System.out.print("Introduce el nombre del alumno: ");
                alum.setNombre(lector.nextLine());
                System.out.println("");
    
                System.out.print("Introduce los apellidos del alumno: ");
                alum.setApellidos(lector.nextLine());
                System.out.println("");
    
                System.out.print("Introduce el dia de nacimiento del alumno: ");
                alum.setDia(lector.nextInt());
                lector.nextLine();
                System.out.println("");
    
                System.out.print("Introduce el mes de nacimiento del alumno: ");
                alum.setMes(lector.nextInt());
                lector.nextLine();
                System.out.println("");
    
                System.out.print("Introduce el anyo de nacimiento del alumno: ");
                alum.setAno(lector.nextInt());
                lector.nextLine();
                System.out.println("");
    
                System.out.print("Introduce el grupo del alumno: ");
                alum.setGrupo(lector.nextLine());
                System.out.println("");
    
                System.out.print("Introduce el telefono del alumno: ");
                alum.setTelefono(lector.nextInt());
                lector.nextLine();
                System.out.println("");
    
                do{                                                                        //Sacamos los datos introducidos y le preguntamos confirmacion
                    limpiar();
                    System.out.println("Los datos introducidos son correctos? (s/n): ");
                    alum.imprimir();
                    compro=lector.nextLine();
                }
                while(!compro.equalsIgnoreCase("n") && !compro.equalsIgnoreCase("s"));  //Comprobamos que el usuario introduzca s o n solamente
                
            }
            while(compro.equals("n"));                  //Si el usuario introduce que no, repetimos
            limpiar();
            menu(alumnos);
        }
        
    }


    static void bajaAlumno(Alumnos[] alumnos){

        Scanner lector=new Scanner (System.in);
        int vacio=0;
        int bNia;
        boolean borrar=false;
        int elec;

        for(int i=0;i<5;i++){
            if(alumnos[i]==null){
                vacio++;
            }
        }
        if(vacio==5){
            System.out.println("No hay alumnos en la base de datos");
            menu(alumnos);
        }
        else{
            do{
                System.out.print("Introduce el nia del alumno que quieres eliminar:");
                bNia=lector.nextInt();
                System.out.println("");
                for(int i=0;i<5;i++){
                    if(alumnos[i]!=null){
                        if(bNia==alumnos[i].getNia()){
                            alumnos[i]=null;
                            borrar=true;
                            break;
                        }
                    }
                }
                if(borrar==false){
                    do{
                        System.out.println("No se ha encontrado el nia introducido");
                        System.out.println("Que quieres hacer?");
                        System.out.println("1. Introducir de nuevo...");
                        System.out.println("2. Salir al manu principal...");
                        elec=lector.nextInt();
                        switch(elec){
                            case 1:
                                limpiar();
                                bajaAlumno(alumnos);
                            break;
                            case 2:
                                limpiar();
                                menu(alumnos);
                            break;
                            default:
                                System.out.println("Introduccion incorrecta, tas bobo o que?");
                            break;
                        }
                    }
                    while(elec!=1 && elec!=2); 
                }
                else{
                    System.out.println("Alumno borrado exitosamente");
                    menu(alumnos);
                }
            }
            while(borrar==false);
        }
    }

    static void consultas(Alumnos[] alumnos){

        Scanner lector=new Scanner (System.in);
        int elec;

        do{
            System.out.println("***************");
            System.out.println("** CONSULTAS **");
            System.out.println("***************");
            System.out.println("1. Por grupo...");
            System.out.println("2. Por edad...");
            System.out.println("3. Por nia...");
            System.out.println("4. Por apellido");
            System.out.println("---------------");
            System.out.println("0. Volver al menu principal");
            elec=lector.nextInt();
            switch(elec){
                case 0:
                    limpiar();
                    menu(alumnos);
                break;

                case 1:
                    limpiar();
                    grupo(alumnos);
                break;

                case 2:
                    limpiar();
                    edad(alumnos);
                break;

                case 3:
                    limpiar();
                    nia(alumnos);
                break;

                case 4:
                    limpiar();
                    apellido(alumnos);
                break;

                default:
                    System.out.println("Introduccion incorrecta, tas bobo o que?");
                break;
            }
        }
        while(elec<0 || elec>4);
    }

    static void grupo(Alumnos[] alumnos){
        
        Scanner lector=new Scanner (System.in);
        String grup;
        boolean exists=false;
        
        System.out.println("Introduce el grupo");
        grup=lector.nextLine();
        limpiar();
        for(int i=0;i<5;i++){
            if(alumnos[i]!=null){
                if(grup.equals(alumnos[i].getGrupo())){
                    alumnos[i].imprimir();
                    exists=true;
                }
            }
        }
        if(exists==false){
            limpiar();
            System.out.println("Grupo no encontrado");
            consultas(alumnos);
        }
        else{
            System.out.println("");
            System.out.println("Introduce intro para continuar...");
            lector.nextLine();
            limpiar();
            consultas(alumnos);
        }
    }

    static void edad(Alumnos[] alumnos){
        
        Scanner lector=new Scanner (System.in);
        int edad;
        boolean exists=false;
        System.out.println("Introduce la edad que quieres buscar...");
        edad=lector.nextInt();
        for(int i=0;i<5;i++){
            if(alumnos[i]!=null){
                if(2021-edad==alumnos[i].getAno()){
                    alumnos[i].imprimir();
                    exists=true;
                }
            }
        }
        if(exists==false){
            limpiar();
            System.out.println("Edad no encontrada");
            consultas(alumnos);
        }
        else{
            System.out.println("");
            System.out.println("Introduce intro para continuar...");
            lector.nextLine();
            lector.nextLine();
            limpiar();
            consultas(alumnos);
        }
    }

    static void nia(Alumnos[] alumnos){

        Scanner lector=new Scanner (System.in);
        int nia;
        boolean exists=false;
        System.out.println("Introduce el nia que quieres buscar...");
        nia=lector.nextInt();
        for(int i=0;i<5;i++){
            if(alumnos[i]!=null){
                if(nia==alumnos[i].getNia()){
                    alumnos[i].imprimir();
                    exists=true;
                }
            }
        }
        if(exists==false){
            limpiar();
            System.out.println("nia no encontrado");
            consultas(alumnos);
        }
        else{
            System.out.println("");
            System.out.println("Introduce intro para continuar...");
            lector.nextLine();
            lector.nextLine();
            limpiar();
            consultas(alumnos);
        }
    }

    static void apellido(Alumnos[] alumnos){

        Scanner lector=new Scanner (System.in);
        String apell;
        String carac;
        boolean exists=false;
        System.out.println("Introduce las 3 primeras letras del apellido...");
        apell=lector.nextLine();
        for(int i=0;i<5;i++){
            if(alumnos[i]!=null){
                carac="";
                for(int j=0;j<3;j++){
                    char letra=alumnos[i].getApellidos().charAt(j);
                    String aux=Character.toString(letra);
                    carac=carac+aux;
                }
                if(apell.equalsIgnoreCase(carac)){
                    alumnos[i].imprimir();
                    exists=true;
                }
            }
        }
        if(exists==false){
            limpiar();
            System.out.println("Apellido no encontrado");
            consultas(alumnos);
        }
        else{
            System.out.println("");
            System.out.println("Introduce intro para continuar...");
            lector.nextLine();
            limpiar();
            consultas(alumnos);
        }
    }
}
