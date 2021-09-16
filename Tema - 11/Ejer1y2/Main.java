package Ejer1y2;
import java.util.*;
public class Main {
    
    public static void main (String[] args){

        Punto punto1=new Punto(0,0);
        Punto punto2=new Punto(2,0);
        Punto punto3=new Punto(2,2);
        Punto punto4=new Punto(0,2);

        ArrayList <Punto> lista=new ArrayList<Punto>();

        lista.add(punto1);
        lista.add(punto2);
        lista.add(punto3);
        lista.add(punto4);

        Poligono poligono = new Poligono(lista);

        poligono.numVertex();
        poligono.toString(lista);
        poligono.perimetro(lista);

        poligono.translada(lista, 4, -3, 0);
        poligono.translada(lista, 4, -3, 1);
        poligono.translada(lista, 4, -3, 2);
        poligono.translada(lista, 4, -3, 3);

        poligono.numVertex();
        poligono.toString(lista);
        poligono.perimetro(lista);

    }
}
