import java.util.Random;
import java.util.Scanner;
public class Ejer16 {
    
    public static void main (String args[]){
        //Imports
        Scanner lector=new Scanner (System.in);
        Random aleatorio = new Random();

        //Variables
        int random;
        int random2;
        int decision=0;
        int numJugador=0;
        int numMaquina=0;
        boolean plantarse=false;
        int porraJugador=0;
        int porraMaquina=0;

        //Empieza el juego
        System.out.println("Bienvenido al juego del black jack.");
        System.out.println("Tu seras el primero en jugar");
        
           
            

                    //Bucle main
                    while(porraJugador <5 && porraMaquina <5){

                        

                        //Se muestra los puntos 
                        System.out.println("Puntos del jugador: "+porraJugador);
                        System.out.println("Puntos de la maquina "+porraMaquina);

                        //Se genera el numero aleatorio y se muestra
                        random=aleatorio.nextInt(6)+1;
                        numJugador=numJugador+random;
                        System.out.println("Has sacado: "+random);
                        System.out.println("Total: "+numJugador);

                        //Comprobacion del numero sacado por el jugador =11, suma de la porra y reinicio del numero
                        if(numJugador==11){
                            System.out.println("Enhorabuena, has ganado 1 punto");
                            porraJugador++;
                            numJugador=0;
                            numMaquina=0;
                        }

                        //Comprobacion del numero sacado por el jugador >11, suma de la porra y reinicio del numero
                        else if (numJugador>11){
                            System.out.println("Te has pasado!, la maquina gana 1 punto");
                            porraMaquina++;
                            numJugador=0;
                            numMaquina=0;
                        }
                        
                        //Decisión del jugador cuando no saca 11 o se pasa de 11
                        else{
                                //Hacemos un bucle y un switch para comprobar que quiere hacer y que no meta otro numero
                             do{
                                System.out.println("(1) Quieres tirar otra vez o (2) Plantarte");
                                decision=lector.nextInt();
                                switch(decision){
                                    case 1: plantarse=false;
                                    break;

                                    case 2: plantarse=true;
                                    break;

                                    default: System.out.println("Accion no permitida");
                                    break;
                                }
                            }

                            while(decision<1 || decision>2);

                                //Si elige plantarse
                                if(plantarse){
                                System.out.println("Te has plantado con: "+numJugador+" puntos");

                                System.out.println("Ahora es turno de la maquina");
                                
                                
                                //2nd Bucle (numero de la maquina)
                                while(numMaquina<numJugador){
                                    random2=aleatorio.nextInt(6)+1;
                                    numMaquina=numMaquina+random2;
                                }

                                //Comprobacion numero maquina =11, suma de la porra y reinicio del numero
                                if(numMaquina==11){
                                    System.out.println("La maquina ha sacado un 11, gana 1 punto");
                                    porraMaquina++;
                                    numJugador=0;
                                    numMaquina=0;
                                }

                                //Comprobacion numero maquina mayor que numero jugador, pero menor que 11, suma de la porra y reinicio del numero
                                else if(numMaquina>numJugador && numMaquina<11){
                                    System.out.println("La maquina ha sacado "+numMaquina+", gana 1 punto");
                                    porraMaquina++;
                                    numJugador=0;
                                    numMaquina=0;
                                }

                                //Comprobacion de empate, suma de la porra y reinicio del numero
                                else if(numMaquina==numJugador){
                                    System.out.println("La maquina ha empatado contigo, gana 1 punto.");
                                    porraMaquina++;
                                    numJugador=0;
                                    numMaquina=0;
                                }

                                //Comprobacion numero maquina > 11, suma de la porra y reinicio del numero
                                else{
                                    System.out.println("La maquina se ha pasado, ganas 1 punto");
                                    porraJugador++;
                                    numJugador=0;
                                    numMaquina=0;
                                }

                            }

                        }
                        
                    }

              
          

         //Sacado por pantalla de quien gana
         if(porraJugador>=5){
            System.out.println("Enhorabuena, le has ganado a la maquina");
        }

        else if(porraMaquina>=5){
            System.out.println("GAME OVER");
        } 
    }
}
