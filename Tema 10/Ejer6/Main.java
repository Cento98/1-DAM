package Ejer6;
import java.util.*;
public class Main {
    
    public static void main (String[] args){

        Scanner lector=new Scanner (System.in);
        ArrayList <String> listaEspañol= new ArrayList <String>();
        ArrayList <String> listaIngles= new ArrayList <String>();
        int elec;
        int parejas;
        boolean compro=false;
        boolean compro2=false;
        String palabra;
        do{
            menuPrincipal();
            elec=lector.nextInt();

            switch(elec){
                case 0:
                    System.out.println("Saliendo del programa");
                break;
                
                case 1:
                    compro=true;
                    System.out.println("Cuantas parejas quieres introducir?");
                    parejas=lector.nextInt();
                    for(int i=1;i<=parejas;i++){
                        System.out.println("Introduce la palabra en ingles: ");
                        listaIngles.add(lector.nextLine());
                        lector.nextLine();
                        System.out.println("Introduce la traduccion al Español: ");
                        listaEspañol.add(lector.nextLine());
                        lector.nextLine();
                    }
                break;

                case 2:
                    if(compro==true){
                        System.out.println("Palabra a buscar: ");
                        palabra=lector.nextLine();
                        lector.nextLine();
                        for(int i=0;i<listaIngles.size();i++){
                            if(palabra.equals(listaIngles.get(i))){
                                System.out.println(listaEspañol.get(i));
                                compro2=true;
                            }
                        }
                        if(compro2==false){
                            System.out.println("La palabra no existe");
                        }
                        
                    }
                    else{
                        System.out.println("No hay palabras introducidas...");
                    }
                break;

                default:
                    System.out.println("Elecion erronea");
                break;
            }
        }
        while(elec!=0);
    }

    public static void menuPrincipal(){
        System.out.println("MENU PRINCIPAL");
        System.out.println("==============");
        System.out.println("1. Introducir parejas de palabras.");
        System.out.println("2. Traducir palabras.");
        System.out.println("0. Salir de la aplicacion.");
    }
}
