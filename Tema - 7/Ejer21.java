import java.util.Scanner;
import java.util.Random;
public class Ejer21 {
    
    public static void main (String[] args){

        int array[]=new int[10];
        menu1(array);
    }

    static void menu1 (int[] array){

        Scanner lector=new Scanner (System.in);
        int seleccion;
        do{
            System.out.println("==============");
            System.out.println("MENU PRINCIPAL");
            System.out.println("==============");
            System.out.println("1.-Rellena array.");
            System.out.println("2.-Visualizar contenido del array");
            System.out.println("3.-Visualizar contenido par");
            System.out.println("4.-Visualizar contenido multiplo de 3");
            System.out.println("0.-Salir del menu");
            System.out.println("Selecciona una opcion");
            seleccion=lector.nextInt();

            if(seleccion==2 || seleccion==3 || seleccion==4){
                System.out.println("Array vacia, operacion imposible");
            }
            else if(seleccion>4){
                System.out.println("Eleccion no valida");
            }
        }
        while(seleccion>=2);
        
        if(seleccion==1){
            crearArray(array);
        }
        else{
            System.out.println("Saliendo del programa...");
        }
        
    }

    public static void crearArray(int[] vector){

        Random random = new Random();

        System.out.println("Rellenando array...");
        for(int i=0;i<10;i++){
            vector[i]=random.nextInt(0+(50-0));
        }
        System.out.println("Array rellenada.");
        menuPrincipal(vector);
    }

    public static void menuPrincipal(int[] vector){

        Scanner lector=new Scanner (System.in);
        int seleccion;

        do{
            System.out.println("==============");
            System.out.println("MENU PRINCIPAL");
            System.out.println("==============");
            System.out.println("1.-Rellena array.");
            System.out.println("2.-Visualizar contenido del array");
            System.out.println("3.-Visualizar contenido par");
            System.out.println("4.-Visualizar contenido multiplo de 3");
            System.out.println("0.-Salir del menu");
            System.out.println("Selecciona una opcion");
            seleccion=lector.nextInt();

            switch(seleccion){

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                case 1:
                    System.out.println("La array ya esta rellenada");
                    break;
                
                case 2:
                    visualitzarArray(vector);
                    break;

                case 3:
                    visualitzarParell(vector); 
                    break;
                
                case 4:
                    visualitzarMultiple3(vector);
                    break;
                
                default:
                    System.out.println("0, 1, 2, 3 o 4...");
                    break;
            }
        }
        while(seleccion!=0);
       

    }

    public static void visualitzarArray(int[] vector){

        System.out.println("Visualizando todo el contenido del array");
        for(int i=0;i<10;i++){
            int numero=vector[i];
            System.out.println(numero);
        }
    }

    public static void visualitzarParell(int[] vector){
        
        System.out.println("Visualizando numeros PAR");
        for(int i=0;i<10;i++){
            int numero=vector[i];    
            if(numero%2==0 && numero!=0){
                System.out.println(numero+" En la posicion "+i);
            } 
        }
    }

    public static void visualitzarMultiple3(int[] vector){

        System.out.println("Visualizando multiples de 3");
        for(int i=0;i<10;i++){
            int numero=vector[i];    
            if(numero%3==0 && numero!=0){
                System.out.println(numero+" En la posicion "+i);
            } 
        }
    }


}
