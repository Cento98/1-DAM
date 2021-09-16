package Ejer1y2;
import java.util.*;
public class Poligono {
    
    private ArrayList<Punto> lista;

    public ArrayList <Punto> getLista()
    {
		return this.lista;
	}

    public void setLista(ArrayList<Punto> lista)
    {
		this.lista = lista;
	}

    public Poligono(ArrayList <Punto> lista){
        this.lista=lista;
    }

    public void translada(ArrayList <Punto> lista, double dx, double dy, int pv){
        
        lista.get(pv).setAtributo1(lista.get(pv).getAtributo1()+dx);
        lista.get(pv).setAtributo2(lista.get(pv).getAtributo2()+dy);
    }

    public void numVertex(){
        System.out.println("El poligono tiene "+lista.size()+" vertices");
    }

    public void toString (ArrayList <Punto> lista){
        for(int i=0;i<lista.size();i++){
            lista.get(i);
        }
    }

    public void perimetro (ArrayList <Punto> lista){
        double uno=lista.get(0).getAtributo1()+lista.get(0).getAtributo2();
        double dos=lista.get(1).getAtributo1()+lista.get(1).getAtributo2();
        double tres=lista.get(2).getAtributo1()+lista.get(2).getAtributo2();
        double cuatro=lista.get(3).getAtributo1()+lista.get(3).getAtributo2();
        double resultado=uno+dos+tres+cuatro;
        System.out.println("El perimetro del poligono es de "+resultado);
    }
}
