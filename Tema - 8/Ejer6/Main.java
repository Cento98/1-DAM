package Ejer6;
import java.util.Scanner;
public class Main {
    
    public static void main (String[]args){

        Bicicleta bicis[]=new Bicicleta[5];

        //Hacks activados
        Bicicleta bici1=new Bicicleta();
        Bicicleta bici2=new Bicicleta(2,"Toyota","Trial",6,4.2,"No",2013,200.18,1);
        Bicicleta bici3=new Bicicleta(3,"Susuki","BMX2",3,2.6,"No",1200,1999.02,1);
        Bicicleta bici4=new Bicicleta(4,"Ford","Trial2",8,54.2,"Si",1750,12.50,1);
        Bicicleta bici5=new Bicicleta(5," Mercedes","Carretera",16,9.12,"Si",2020,1000.20,1);
        bicis[0]=bici1;
        bicis[1]=bici2;
        bicis[2]=bici3;
        bicis[3]=bici4;
        bicis[4]=bici5;
        //Hacks desactivados
        menu(bicis);
    }

    static void limpiar(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void menu(Bicicleta[] bicis){

        Scanner lector=new Scanner (System.in);
        int elec;
        do{
            System.out.println("**************************");
            System.out.println("** GESTION DE BICICLETAS**");
            System.out.println("**************************");
            System.out.println("1.-Añadir bicicleta...");
            System.out.println("2.-Vender bicicleta...");
            System.out.println("3.-Consultar bicicleta...");
            System.out.println("4.-Mostrar stock");
            System.out.println("---------------------------");
            System.out.println("0.-Salir");
            elec=lector.nextInt();
            switch(elec){
                case 0:
                    System.out.println("Saliendo del programa...");
                break;

                case 1:
                    limpiar();
                    anyadirBici(bicis);
                break;

                case 2:
                    limpiar();
                    venderBici(bicis);
                break;

                case 3:
                    limpiar();
                    consultarBici(bicis);
                break;

                case 4:
                    limpiar();
                    mostrarStock(bicis);
                break;

                default:
                    System.out.println("What are you doing, tas bobo o que?");
                break;
            }
        }
        while(elec<0 | elec>4);     
    }

    public static void anyadirBici(Bicicleta[] bicis){

       Scanner lector=new Scanner (System.in);
       int elec;
       boolean compro=false;

       System.out.print("Introduce la referencia...");
       elec=lector.nextInt();
       System.out.println("");

       for(int i=0;i<5;i++){
           if(bicis[i]!=null){
                if(bicis[i].getReferencia()==elec){
                    bicis[i].setExistencias(bicis[i].getExistencias()+1);
                    compro=true;
                    System.out.println("Se ha añadido la bici correctamente");
                    break;
                }
           }
       }
       if(compro==false){
           int llena=0;
           int compro2;
           for(int i=0;i<5;i++){
               if(bicis[i]==null){
                   llena++;
               }
           }
           if(llena==0){
                System.out.println("La tienda esta llena, no se pueden añadir mas bicis con referencias diferentes");
           }
           else{
               System.out.println("No hay ninguna bici con esa referencia y hay espacio en la tienda...");
               System.out.println("Que quieres hacer?");
               System.out.println("1.Introducir la nueva bici...");
               System.out.println("2. Salir...");
               compro2=lector.nextInt();
               switch(compro2){
                   case 1:
                        Bicicleta biciAux=new Bicicleta();
                        for(int i=0;i<5;i++){
                            if(bicis[i]==null){
                                bicis[i]=biciAux;
                                bicis[i].setReferencia(elec);
                                System.out.println("Introduce la marca de la bici");
                                bicis[i].setMarca(lector.nextLine());
                                lector.nextLine();
                                System.out.println("Introduce el modelo de la bici");
                                bicis[i].setModelo(lector.nextLine());
                                lector.nextLine();
                                System.out.println("Introduce los KG de la bici");
                                bicis[i].setKilos(lector.nextInt());
                                System.out.println("Introduce las pulgadas de las ruedas");
                                bicis[i].setPulgadasR(lector.nextDouble());
                                System.out.println("Introduce si tiene motor o no");
                                bicis[i].setMotor(lector.nextLine());
                                lector.nextLine();
                                bicis[i].setAnyo(lector.nextInt());
                                System.out.println("Introduce el precio de la bici");
                                bicis[i].setPrecio(lector.nextDouble());
                                System.out.println("Cuantas quieres añadir?");
                                bicis[i].setExistencias(lector.nextInt());
                                System.out.println("Bici introducida correctamente!");
                                break;
                            }
                        }
                    break;

                    case 2:
                        System.out.println("Saliendo al menu principal...");
                    break;

                    default:
                        System.out.println("Tas bobo o que?");
                    break;        
               }
           }
       }
       menu(bicis);
    }

    public static void venderBici(Bicicleta[] bicis){

        Scanner lector=new Scanner (System.in);
        int elec;
        int elec2;
        boolean compro=false;
        do{
            System.out.println("Introduce la referencia de la bici que quieres vender");
            elec=lector.nextInt();

            for(int i=0;i<5;i++){
                if(bicis[i]!=null){
                    if(bicis[i].getReferencia()==elec){
                        compro=true;
                        bicis[i].setExistencias(bicis[i].getExistencias()-1);
                        System.out.println("La bicicleta "+bicis[i].getMarca()+" ha sido vendida perfectamente");
                        if(bicis[i].getExistencias()==0){
                            bicis[i]=null;
                        }
                    }
                }
            }
            if(compro==false){
                System.out.println("Referencia no encontrada...");
                System.out.println("1.Volver a intentar?");
                System.out.println("2.Salir al menu principal...");
                elec2=lector.nextInt();
                if(elec2==2){
                    compro=true;
                }
            }
        }
        while(compro==false);
        menu(bicis);
    }

    public static void mostrarStock(Bicicleta[] bicis){

        int stock=0;
        for(int i=0;i<5;i++){
            if(bicis[i]!=null){
                bicis[i].imprimirStock();
            }
            else{
                stock++;
            }
        }
        System.out.println("Hay "+stock+" huecos en la tienda para otro tipo de bici");
        menu(bicis);
    }

    public static void consultarBici(Bicicleta[] bicis){

        Scanner lector=new Scanner (System.in);
        int elec;
        int elec2=2;
        boolean compro=false;
        int referen;

        System.out.println("**********************");
        System.out.println("**CONSULTA BICICLETA**");
        System.out.println("**********************");
        System.out.println("1.-Consultar por referencia...");
        System.out.println("2.-Consultar por marca...");
        System.out.println("3.-Consulta por modelo...");
        System.out.println("--------------------------");
        System.out.println("0.-Vovler al menu principal...");
        elec=lector.nextInt();
        switch(elec){
            case 0:
                System.out.println("Volviendo al menu principal...");
            break;

            case 1:
                referencia(bicis);
            break;

            case 2:
                marca(bicis);
            break;

            case 3:
                modelo(bicis);
            break;

            default:
                System.out.println("Te equivocaste wachin.");
            break;
        }
        menu(bicis);
    }

    public static void referencia(Bicicleta[] bicis){

        Scanner lector= new Scanner (System.in);
        boolean compro1=false;
        do{
            System.out.println("Introduce la referencia de la bicicleta que buscas.");
            int refe=lector.nextInt();

            for(int i=0;i<bicis.length;i++){
                if(bicis[i].getReferencia()==refe && bicis[i]!=null){
                    compro1=true;
                    bicis[i].imprimirPorReferencia();
                    break;
                }
            }
            if(compro1==false){
                System.out.println("Referencia no existente, prueba otra vez...");
            }
        }
        while(compro1=false);
        
    }

    public static void marca(Bicicleta[] bicis){

        Scanner lector= new Scanner (System.in);
        boolean compro1=false;
        do{
            System.out.println("Introduce la marca de la bicicleta que buscas.");
            String marca=lector.nextLine();

            for(int i=0;i<bicis.length;i++){
                if(bicis[i].getMarca().equals(marca) && bicis[i]!=null){
                    compro1=true;
                    bicis[i].imprimirPorReferencia();
                    break;
                }
            }
            if(compro1==false){
                System.out.println("Marca no existente, prueba otra vez...");
            }
        }
        while(compro1=false);

    }

    public static void modelo (Bicicleta[] bicis){

        Scanner lector= new Scanner (System.in);
        boolean compro1=false;
        do{
            System.out.println("Introduce el modelo de la bicicleta que buscas.");
            String modelo=lector.nextLine();

            for(int i=0;i<bicis.length;i++){
                if(bicis[i].getModelo().equals(modelo) && bicis[i]!=null){
                    compro1=true;
                    bicis[i].imprimirPorReferencia();
                    break;
                }
            }
            if(compro1==false){
                System.out.println("Modelo no existente, prueba otra vez...");
            }
        }
        while(compro1=false);
    }

}
