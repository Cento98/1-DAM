import java.util.*;
public class Ejer8 {
    
    public static void main (String[] args){

        Scanner lector=new Scanner (System.in);
        HashMap <String, String> map=new HashMap <String, String>();
        int elec;
        do{
            menu();
            elec=lector.nextInt();
            
            switch(elec){
                case 0:
                    System.out.println("Saliendo del programa...");
                break;

                case 1:
                    map=anyadirPalabra(map);
                break;

                case 2:
                    map=modificarPalabra(map);
                break;

                case 3:
                    map=eliminarPalabra(map);
                break;

                case 4:
                    consultarPalabra(map);
                break;

                case 5:
                    System.out.println(map);
                break;

                default:
                    System.out.println("Entrada erronea");
                break;
            }
        }
        while(elec!=0);
        
    }

    public static void consultarPalabra(HashMap <String, String> map){

        Scanner lector=new Scanner (System.in);

        String palabra;
        boolean compro;
        do{
            System.out.println("Introduce la palabra que quieres consultar");
            palabra=lector.nextLine();
            compro=map.containsKey(palabra);
            if(compro==false){
                System.out.println("Palabra no encontrada.");
            }
        }
        while(compro=false);
        System.out.println(map.get(palabra)); 
    }

    public static HashMap <String, String> eliminarPalabra(HashMap <String, String> map){

        Scanner lector=new Scanner (System.in);

        String palabra;
        boolean compro;
        do{
            System.out.println("Introduce la palabra que quieres eliminar o escriba Salir para salir ");
            palabra=lector.nextLine();
            compro=map.containsKey(palabra);
            if(compro==false){
                System.out.println("Palabra no encontrada.");
            }
        }
        while(compro=false || palabra.equals("Salir"));

        map.remove(palabra);
        
        
        return map;
    }

    public static HashMap <String, String> modificarPalabra(HashMap <String, String> map){

        Scanner lector=new Scanner (System.in);

        String palabra;
        boolean compro;
        do{
            System.out.println("Introduce la palabra que quieres modificar o escriba Salir para salir ");
            palabra=lector.nextLine();
            compro=map.containsKey(palabra);
            if(compro==false){
                System.out.println("Palabra no encontrada.");
            }
        }
        while(compro=false || palabra.equals("Salir"));

        map.remove(palabra);

        map=anyadirPalabra(map);

        return map;
    }

    public static HashMap <String, String> anyadirPalabra(HashMap <String, String> map){

        Scanner lector=new Scanner (System.in);

        String palabra;
        String definicion;
        System.out.println("Introduce la palabra que quieras anyadir");
        palabra=lector.nextLine();
        lector.nextLine();
        System.out.println("Introduce la definicion de la palabra");
        definicion=lector.nextLine();
        lector.nextLine();
        map.put(palabra, definicion);

        return map;
    }

    public static void menu(){
        System.out.println("*********************");
        System.out.println("*GESTION DICCIONARIO*");
        System.out.println("*********************");
        System.out.println("1. Añadir Palabra");
        System.out.println("2. Modificar Palabra");
        System.out.println("3. Eliminar Palabra");
        System.out.println("4. Consultar Palabra");
        System.out.println("5. Mostrar Diccionario");
        System.out.println("----------------------");
        System.out.println("0. Salir");
    }
}
