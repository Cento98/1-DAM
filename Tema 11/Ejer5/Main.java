package Ejer5;
import java.util.*;
public class Main {
    
    public static int stack[] = new int[7];
    public static Item inventario[]= new Item[7];
    public static int id=0;
    public static Is64 is64;
    public static Is16 is16;
    public static IsNo isNo;
    public static void main (String[] args){

        Scanner lector=new Scanner (System.in);

        int elec=0;

        id++;
        Is64 madera=new Is64(id, "Madera");

        inventario[0]=madera;
        stack[0]=63;
        do{
            menu();
            elec=lector.nextInt();
            switch(elec){
                case 1:
                    anyadirItem();
                break;
                case 2:
                    eliminarItem();
                break;
                case 3:
                    mostrar();
                break;
                default:
                    System.out.println("Saliendo del programa");
                break;
            }
        }
        while(elec!=0);
    }

    public static void anyadirItem(){
        
        Scanner lector = new Scanner (System.in);
        int elec=0;
        boolean compro1=false;
        boolean compro2=false;
        System.out.println("Que item quieres añadir?");
        System.out.println("1. Madera");
        System.out.println("2. Piedra");
        System.out.println("3. Huevo");
        System.out.println("4. Perla");
        System.out.println("5. Pico");
        System.out.println("6. Espada");

        elec=lector.nextInt();

        switch(elec){
            case 1:
                for(int i=0;i<inventario.length;i++){
                    if(inventario[i].getId()==elec && inventario[i]!=null && stack[i]<64){
                        stack[i]++;
                        compro1=true;
                    }
                    if(compro1==false){
                        id++;
                        is64=new Is64(id, "Madera");
                        for(int j=0;j<inventario.length;j++){
                            if(inventario[j]==null){
                                inventario[j]=is64;
                                compro2=true;
                            }
                        }
                    }
                    if(compro2==false){
                        System.out.println("No se pueden añadir mas items");
                    }
                }
            break;
            case 2:
            for(int i=0;i<inventario.length;i++){
                if(inventario[i].getId()==elec && inventario[i]!=null && stack[i]<64){
                    stack[i]++;
                    compro1=true;
                }
                if(compro1==false){
                    id++;
                    is64=new Is64(id, "Piedra");
                    for(int j=0;j<inventario.length;j++){
                        if(inventario[j]==null){
                            inventario[j]=is64;
                            compro2=true;
                        }
                    }
                }
                if(compro2==false){
                    System.out.println("No se pueden añadir mas items");
                }
            }
            break;

        }
    }

    public static void eliminarItem(){
        
    }

    public static void mostrar(){
        
        for(int i=0;i<inventario.length;i++){
            System.out.println(inventario[i].getNombre());
        }
    }

    public static void menu(){

        System.out.println("*********************");
        System.out.println("*INVENTARIO MAINCRAFT");
        System.out.println("*********************");
        System.out.println("1. Añadir al inventario");
        System.out.println("2. Eliminar del inventario");
        System.out.println("3. Mostrar Inventario");
        System.out.println("0. Salir");
    }
}
