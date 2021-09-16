package Primitiva;
import java.util.Scanner;
public class Main {
    
    private static Boleto boleto = null;
    

    public static void main (String[] args) throws InterruptedException{
        
        Scanner lector=new Scanner (System.in);
        int array[]=new int[7];
        int elec;

        menuPrincipal();
        do{
            elec=lector.nextInt();
            if(elec!=1 && elec!=2){
                System.out.println("Entrada incorrecta...");
            }
        }
        while(elec!=1 && elec!=2);

        if(elec==1){
            limpiar();
            boleto = new Boleto();
        }
        else{
            limpiar();
            boleto = new Boleto(array);
        }
        
        limpiar();
        
        boleto.imprimir();

        menuJuego();
        int elec2;
        do{
            elec2=lector.nextInt();
            if(elec2<1 && elec2>5){
            System.out.println("Entrada incorrecta...");
            }
        }
        while(elec2<1 && elec2>5);

        switch(elec2){
            case 1:
                juegoUnico(boleto);
            break;

            case 2: 
                juegoHastaPremio(boleto);
            break;

            case 3:
                juegoHastaPremioSinReint(boleto);
            break;

            case 4:
                cicloMil(boleto);
            break;

            case 5: 
                catEspecial(boleto);
            break;

            default:
                System.out.println("Entrada incorrecta...");
            break;
        }
    }

    public static void catEspecial(Boleto boleto)throws InterruptedException{

        int compro;
        int contador=0;
        do{
            contador+=1;
            Boleto boletoMaquina=new Boleto();
            compro=comprobacion(boleto, boletoMaquina);
        }
        while(compro!=9);
        Thread.sleep(500);
        System.out.println("El sorteo se ha repetido "+contador+" de veces hasta obtener el premio especial.");
    }

    public static void cicloMil(Boleto boleto){

        int sinPremio=0;
        int cat5=0;
        int cat4=0;
        int cat3=0;
        int cat2=0;
        int cat1=0;
        int catEsp=0;
        int compro;

        for(int i=1;i<=10000;i++){
            Boleto boletoMaquina=new Boleto();
            compro=comprobacion(boleto, boletoMaquina);

            switch(compro){

                case 3:
                    cat5++;
                break;
    
                case 4: 
                    cat4++;
                break;
    
                case 5:
                    cat3++;
                break;
                
                case 6:
                    cat1++;
                break;
    
                case 7:
                    cat2++;
                break;
    
                case 9:
                    catEsp++;
                break;
    
                default:
                    sinPremio++;
            }
        }
        System.out.println("En el ciclo de 10000 juegos se ha obtenido");
        System.out.println("Premio categoria especial "+catEsp+" veces");
        System.out.println("Premio 1º categoria "+cat1+" veces");
        System.out.println("Premio 2º categoria "+cat2+" veces");
        System.out.println("Premio 3º categoria "+cat3+" veces");
        System.out.println("Premio 4º categoria "+cat4+" veces");
        System.out.println("Premio 5º categoria "+cat5+" veces");
        System.out.println("Sin obtener premio "+sinPremio+" veces");
    }

    public static void juegoHastaPremio(Boleto boleto)throws InterruptedException{

        int compro;
        int contador=0;
        do{
            contador+=1;
            Boleto boletoMaquina=new Boleto();
            compro=comprobacion(boleto, boletoMaquina);
        }
        while(compro<3 || compro>7 && compro!=9);
        Thread.sleep(500);
        System.out.println("El sorteo se ha repetido "+contador+" de veces hasta obtener un premio.");
        Thread.sleep(500);
        resultadoUnico(compro);
    }

    public static void juegoHastaPremioSinReint(Boleto boleto)throws InterruptedException{
        int compro;
        int contador=0;
        do{
            contador+=1;
            Boleto boletoMaquina=new Boleto();
            compro=comprobacion(boleto, boletoMaquina);
        }
        while(compro<3 || compro>7);
        Thread.sleep(500);
        System.out.println("El sorteo se ha repetido "+contador+" de veces hasta obtener un premio (Sin tener en cuenta el reintegro).");
        Thread.sleep(500);
        resultadoUnico(compro);
    }

    public static void juegoUnico(Boleto boleto)throws InterruptedException{

        Boleto boletoMaquina=new Boleto();
        boletoMaquina.imprimir2();

        int compro=comprobacion(boleto, boletoMaquina);

        resultadoUnico(compro);
    }

    public static void resultadoUnico(int compro){

        switch(compro){

            case 3:
                System.out.println("Enhorabuena, ha ganado el premio de 5º categoria.");
            break;

            case 4: 
                System.out.println("Enhorabuena, ha ganado el premio de 4º categoria.");
            break;

            case 5:
                System.out.println("Enhorabuena, ha ganado el premio de 3º categoria.");
            break;
            
            case 6:
                System.out.println("Enhorabuena, ha ganado el premio de 1º categoria.");
            break;

            case 7:
                System.out.println("Enhorabuena, ha ganado el premio de 2º categoria.");
            break;

            case 9:
                System.out.println("Enhorabuena, ha ganado el premio de categoria especial!!!");
            break;

            default:
                System.out.println("Lo siento, no has ganado nada.");
        }
    }

    public static int comprobacion(Boleto boleto, Boleto boletoMaquina){

        int compro=0;
        if(boleto.getNum1()==boletoMaquina.getNum1()){
            compro=compro+1;
        }
        if(boleto.getNum2()==boletoMaquina.getNum2()){
            compro=compro+1;
        }
        if(boleto.getNum3()==boletoMaquina.getNum3()){
            compro=compro+1;
        }
        if(boleto.getNum4()==boletoMaquina.getNum4()){
            compro=compro+1;
        }
        if(boleto.getNum5()==boletoMaquina.getNum5()){
            compro=compro+1;
        }
        if(boleto.getNum6()==boletoMaquina.getNum6()){
            compro=compro+1;
        }
        if(boleto.getComplementario()==boletoMaquina.getComplementario()){
            compro=compro+2;
        }
        if(boleto.getReintegro()==boletoMaquina.getReintegro()){
            compro=compro+3;
        }
        return compro;
    }

    public static void menuJuego() throws InterruptedException{

        Thread.sleep(500);
        System.out.println("**********************");
        System.out.println("**MODALIDAD DE JUEGO**");
        System.out.println("**********************");
        Thread.sleep(500);
        System.out.println("(1). JUEGO UNICO...");
        Thread.sleep(500);
        System.out.println("(2). JUEGO HASTA OBTENER PREMIO...");
        Thread.sleep(500);
        System.out.println("(3). jUEGO HASTA OBTENER PREMIO (SIN REINTEGRO)...");
        Thread.sleep(500);
        System.out.println("(4). CICLO DE 10000 SORTEOS...");
        Thread.sleep(500);
        System.out.println("(5). JUGAR HASTA OBTENER PREMIO CATEGORIA ESPECIAL...");
    }
    
    public static void menuPrincipal() throws InterruptedException{
        
        System.out.println("****************************************");
        System.out.println("**BIENVENIDOS AL JUEGO DE LA PRIMITIVA**");
        System.out.println("****************************************");
        Thread.sleep(3000);

        limpiar();

        System.out.println("(1) NUMEROS ALEATORIOS...");
        System.out.println("(2) INTRODUCIR MANUALMENTE...");
        Thread.sleep(1000);
        
    }

    static void limpiar(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
