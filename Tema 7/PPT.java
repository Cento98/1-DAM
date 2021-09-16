import java.util.Scanner;
import java.util.Random;
public class PPT {
    
    public static void main (String[]args){

        int array[]=new int[3];
        int puntosJ=0;
        int puntosM=0;
        int puntosE=0;

        array[0]=puntosJ;
        array[1]=puntosM;
        array[2]=puntosE;
        
        menu(array);
    }

    static void menu (int[] array){

        Scanner lector=new Scanner (System.in);
        int eleccion;
       
        do{
            System.out.println("===========================");
            System.out.println("  PIEDRA, PAPEL O TIJERAS  ");
            System.out.println("===========================");
            System.out.println("1. Nueva Partida...");
            System.out.println("2. Mostrar puntuaciones...");
            System.out.println("---------------------------");
            System.out.println("0. Salir");
            System.out.println("");
            System.out.println("Elige una opcion: ");
            eleccion=lector.nextInt();

            switch(eleccion){
                case 1:
                    array=partida(array);
                break;

                case 2:
                    puntuaciones(array);
                break;

                case 0:
                    System.out.println("Saliendo del programa...");
                break;

                default:
                    System.out.println("Introduccion incorrecta");
                break;
            }
        }
        while(eleccion!=0);
    }

    static int[] partida (int[] array){

        Scanner reader=new Scanner (System.in);
        Random random=new Random();
        int compro=1;
        int compro2=2;

        menuP();

        int seleccionJ=reader.nextInt();
        int seleccionM=random.nextInt(3-1+1)+1;

        System.out.println(muestraEleccion(seleccionJ, compro));
        System.out.println(muestraEleccion(seleccionM, compro2));

        switch(seleccionJ){
            case 1:
                if(seleccionM==2){
                    System.out.println("La maquina gana 1 punto");
                    array[1]++;
                }
                else if(seleccionM==3){
                    System.out.println("Ganas 1 punto");
                    array[0]++;
                }
                else{
                    System.out.println("Empatais");
                    array[2]++;
                }
            break;

            case 2:
                if(seleccionM==1){
                    System.out.println("Ganas 1 punto");
                    array[0]++;
                }
                else if(seleccionM==3){
                    System.out.println("La CPU gana 1 punto");
                    array[1]++;
                }
                else{
                    System.out.println("Empatais");
                    array[2]++;
                }
            break;
            
            case 3:
                if(seleccionM==1){
                    System.out.println("La CPU gana 1 punto");
                    array[1]++;
                }
                else if(seleccionM==2){
                    System.out.println("Ganas 1 punto");
                    array[0]++;
                }
                else{
                    System.out.println("Empatais");
                    array[2]++;
                }
            break;

        }

        System.out.println("");
        System.out.println("Introduce INTRO para continuar");
        String intro2=reader.nextLine();
        String intro3=reader.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();

        return array;

    }

    static String muestraEleccion(int seleccion, int compro){

        compro++;
        String dev="";
        if(compro%2==0){
            switch(seleccion){
                case 1:
                    dev="Player elige Piedra";
                break;
                case 2:
                    dev="Player elige Papel";
                break;
                case 3:
                    dev="Player elige Tijeras";
                break;
                default:
                    dev="Capasao";
                break;
            }  
        }
        else{
            switch(seleccion){
                case 1:
                    dev="CPU elige Piedra";
                break;
                case 2:
                    dev="CPU elige Papel";
                break;
                case 3:
                    dev="CPU elige Tijeras";
                break;
                default:
                    dev="Capasao";
                break;
            } 
        }

        return dev;
    }

    static void puntuaciones(int[] array){

        Scanner lector=new Scanner (System.in);

        System.out.println("***** PUNTUACINES *****");
        System.out.println("Victorias Player:     "+array[0]);
        System.out.println("Victorias CPU:        "+array[1]);
        System.out.println("Empatadas:            "+array[2]);
        System.out.println("");
        System.out.println("Introduce INTRO para continuar");
        String intro=lector.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();

    }

    static void menuP(){
        System.out.println("***********");
        System.out.println("*  ELIGE  *");
        System.out.println("***********");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijeras");
        System.out.println("");
        System.out.println("Indica tu eleccion");
    }
}
