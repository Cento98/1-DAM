package Ejer4;
import java.util.*;
public class Main {
    
    public static void main (String[] args){

        ArrayList <Electrodomesticos> aparatos = new ArrayList <Electrodomesticos>();

        Electrodomesticos aparato1= new Electrodomesticos(50, 5, "Rojo", 'B');
        Electrodomesticos aparato2= new Electrodomesticos(60, 10, "Azul", 'C');
        Electrodomesticos aparato3= new Electrodomesticos(70, 15, "Negro", 'D');
        Electrodomesticos aparato4= new Electrodomesticos(80, 20, "Gris", 'A');

        Lavadora lavadora1= new Lavadora(5);
        Lavadora lavadora2= new Lavadora(10);
        Lavadora lavadora3= new Lavadora(20);

        Television tele1 = new Television(10.5, false);
        Television tele2 = new Television(15, false);
        Television tele3 = new Television(20, true);

        aparatos.add(aparato1);
        aparatos.add(aparato2);
        aparatos.add(aparato3);
        aparatos.add(aparato4);
        aparatos.add(lavadora1);
        aparatos.add(lavadora2);
        aparatos.add(lavadora3);
        aparatos.add(tele1);
        aparatos.add(tele2);
        aparatos.add(tele3);


        for(int i=0;i<aparatos.size();i++){
            aparatos.get(i).precioFinal();
        }

    }
}
