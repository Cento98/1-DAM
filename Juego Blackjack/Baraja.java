import java.util.*;
public class Baraja {
    
    private Cartas[] cartas;

    public Cartas[] getCartas() {
        return this.cartas;
    }

    public void setCartas(Cartas[] cartas) {
        this.cartas = cartas;
    }

    public Baraja(){
        cartas=rellenarBaraja();
    }

    public int repartirJ(int mano)throws InterruptedException{
        Random alea=new Random();
        int carta;
        int num;
        do{
            carta=alea.nextInt(51-0)+1;
            if(cartas[carta]!=null){
                num=cartas[carta].getNumero();
                cartas[carta].mostrarCarta();
                cartas[carta]=null;
            }
            else{
                num=0;
            }
        }
        while(num==0);
        if(num==11 || num==12 || num==13){
            num=10;
        }
        mano=mano+num;
        return mano;
    }

    public int repartirC(int mano)throws InterruptedException{
        Random alea=new Random();
        int carta;
        int num;
        do{
            carta=alea.nextInt(51-0)+1;
            if(cartas[carta]!=null){
                num=cartas[carta].getNumero();
                cartas[carta]=null;
            }
            else{
                num=0;
            }
        }
        while(num==0);
        if(num==11 || num==12 || num==13){
            num=10;
        }
        mano=mano+num;
        return mano;
    }

    public Cartas[] rellenarBaraja(){
        Cartas[] cartas2 = new Cartas[52];

        int aux=1;
        for(int i=0;i<13;i++){
            Cartas carta=new Cartas(aux,"Diamantes");
            cartas2[i]=carta;
            aux++;
        }

        aux=1;
        for(int i=13;i<26;i++){
            Cartas carta2=new Cartas(aux,"Corazones");
            cartas2[i]=carta2;
            aux++;
        }

        aux=1;
        for(int i=26;i<39;i++){
            Cartas carta3=new Cartas(aux,"Treboles");
            cartas2[i]=carta3;
            aux++;
        }

        aux=1;
        for(int i=39;i<cartas2.length;i++){
            Cartas carta4=new Cartas(aux,"Picas");
            cartas2[i]=carta4;
            aux++;
        }
        return cartas2;
    }
}
