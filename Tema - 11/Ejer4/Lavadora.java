package Ejer4;

public class Lavadora extends Electrodomesticos {
    
    protected int carga;

    public int getCarga() {
        return this.carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public Lavadora(){
        super();
        carga=5;
    }

    public Lavadora(int precioBase, double peso){
        super();
        this.precioBase=precioBase;
        this.peso=peso;
        carga=5;
    }

    public Lavadora(int carga){
        super();
        this.carga=carga;
    }

    public void precioFinal(){

        int precioFinal=0;

        if(carga>30){
            precioFinal+=50;
        }

        super.precioFinal(); 
    }
}
