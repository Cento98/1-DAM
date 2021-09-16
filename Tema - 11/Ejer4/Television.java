package Ejer4;

public class Television extends Electrodomesticos{
    
    protected double pulgadas;
    protected boolean smartTV;

    public double getPulgadas() {
        return this.pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSmartTV() {
        return this.smartTV;
    }

    public void setSmartTV(boolean smartTV) {
        this.smartTV = smartTV;
    }

    public Television(){
        pulgadas=20;
        smartTV=false;
    }

    public Television(int precioBase, double peso){
        super();
        this.precioBase=precioBase;
        this.peso=peso;
    }

    public Television(double pulgadas, boolean smartTV){
        super();
        this.pulgadas=pulgadas;
        this.smartTV=smartTV;
    }

    public void precioFinal(){

        int precioFinal=0;
        int porcentaje=0;

        if(pulgadas>40 && smartTV==true){
            porcentaje=(precioFinal/100)*30;
            precioFinal+=porcentaje;
            precioFinal+=50;
        }

        super.precioFinal(); 
    }

}
