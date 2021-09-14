import java.util.*;
public class Main {
    
    private static Baraja baraja1= new Baraja();
    private static int puntosJ=0;
    private static int puntosC=0;
    private static int dineroJ=100;
    private static int dineroC=500;
    private static int apuesta=0;
    public static void main (String[] args) throws InterruptedException{

        Scanner lector=new Scanner (System.in);

        int elec=0;
        
        do{
            menu();
            elec=lector.nextInt();
            switch(elec){
                case 1:
                    juego();
                break;

                case 2:
                    mostrarE();
                break;

                default:
                    System.out.println("Saliendo del programa...");
                break;
            }

            if(dineroJ<20){
                System.out.println("No tienes dinero suficiente para apostar...GAME OVER");
            }
            if(dineroC<20){
                System.out.println("La CPU se ha quedado sin dinero, ENHORABUENA!"); 
            }
            
        }
        while(elec!=0 && dineroJ>20 && dineroC>20);

        
    }

    public static void juego()throws InterruptedException{
        
        Scanner lector=new Scanner (System.in);

        
        int manoJ=0;
        int manoC=0;

        baraja1.rellenarBaraja();

        System.out.println("La CPU recibe 2 cartas");
        manoC=baraja1.repartirC(manoC);
        manoC=baraja1.repartirC(manoC);
        tiempo();
        manoJ=baraja1.repartirJ(manoJ);
        manoJ=baraja1.repartirJ(manoJ);

        boolean compro=false;
        do{
            System.out.println("Cuanto quieres apostar?");
            System.out.println("Apuesta minima: 20");
            System.out.println("Tu saldo: "+dineroJ);
            System.out.println("Tu mano: "+manoJ);
            apuesta=lector.nextInt();
            if(dineroJ-apuesta<=0 || apuesta<20){
                if(apuesta<20){
                    System.out.println("Apuesta no valida...");
                }
                if(dineroJ-apuesta<=0){
                    System.out.println("No tienes tanto dinero...");
                }
            }
            else{
                System.out.println("Apuesta aceptada...");
                dineroC=dineroC-apuesta;
                dineroJ=dineroJ-apuesta;
                compro=true;
            }
        }
        while(compro==false);

        tiempo();
        System.out.println("***TU TURNO***");
        tiempo();

        int elec2=0;

        do{
            System.out.println("Tu mano: "+manoJ);
            System.out.println("(1).Pedir carta.");
            System.out.println("(0).Plantarse");
            elec2=lector.nextInt();
            if(elec2==1){
                tiempo();
                manoJ=baraja1.repartirC(manoJ);
            }
        }
        while(elec2!=0 && manoJ<21);

        if(manoJ>21){
            System.out.println("Te has pasado, gana la CPU");
            puntosC++;
            dineroC=dineroC+(apuesta*2);
        }
        else{
            System.out.println("***TURNO DE LA CPU***");
            do{
                manoC=baraja1.repartirC(manoC);
            }
            while(manoC<=16);

            if(manoC>21){
                System.out.println("La CPU se ha pasado, tu ganas!");
                puntosJ++;
                puntosJ=puntosJ+(apuesta*2);
            }
            else{
                resultados(manoC, manoJ);
            }
        }
    }

    public static void resultados(int cpu, int jug)throws InterruptedException{

        tiempo();
        System.out.println("****************");
        System.out.println("***RESULTADOS***");
        System.out.println("****************");
        tiempo();

        System.out.println("Mano CPU: "+cpu);
        tiempo();

        System.out.println("Tu mano: "+jug);

        if(jug>cpu){
            System.out.println("ENHORABUENA, TU GANAS!");
            puntosJ++;
            if(jug==21){
                puntosJ=puntosJ+(apuesta*2)+(apuesta/2);
            }
            else{
                puntosJ=puntosJ+(apuesta*2);
            }
            tiempoF();
        }
        else{
            System.out.println("LA CPU GANA!");
            puntosC++;
            if(cpu==21){
                puntosC=puntosC+(apuesta*2)+(apuesta/2);
            }
            else{
                puntosC=puntosC+(apuesta*2);
            }
            tiempoF();
        }
    }

    public static void mostrarE()throws InterruptedException{
        tiempoF();
        System.out.println("Tus manos ganadas: "+puntosJ);
        System.out.println("Manos ganadas por la CPU: "+puntosC);
        tiempoF();
    }

    public static void menu()throws InterruptedException{
        System.out.println("*****************");
        System.out.println("****BLACKJACK****");
        System.out.println("*****************");
        tiempo();
        System.out.println("(1).Nueva partida");
        tiempo();
        System.out.println("(2).Mostrar estadisticas");
        tiempo();
        System.out.println("(0).Salir");
        
    }

    public static void tiempo()throws InterruptedException{
        Thread.sleep(500);
    }

    public static void tiempoF()throws InterruptedException{
        Thread.sleep(2000);
    }
}
