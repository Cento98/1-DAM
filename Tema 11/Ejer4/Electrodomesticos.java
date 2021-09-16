package Ejer4;

public class Electrodomesticos {
 
    protected int precioBase;
    protected String color;
    protected char consumo;
    protected double peso;

    public int getPrecioBase() {
        return this.precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return this.consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Electrodomesticos(){
        color="Blanco";
        consumo='F';
        precioBase=100;
        peso=5.0;
    }

    public Electrodomesticos(int precioBase, double peso){
        this.precioBase=precioBase;
        this.peso=peso;
        color="Blanco";
        consumo='F';
    }

    public Electrodomesticos(int precioBase, double peso, String color, char consumo){
        this.precioBase=precioBase;
        this.peso=peso;

        if(comprobarConsumoEnergetico(consumo)){
            this.consumo=consumo;
        }
        else{
            consumo='F';
        }

        if(comprobarColor(color)){
            this.color=color;
        }
        else{
            color="Blanco";
        }
    }

    public boolean comprobarConsumoEnergetico(char letra){
        boolean compro;
        if(consumo=='A' || consumo=='B' || consumo=='C' || consumo=='D' || consumo=='E' || consumo=='F'){
            compro=true;
        }
        else{
            compro=false;
        }
        return compro;
    }

    public boolean comprobarColor(String color){
        boolean compro;
        if(color.equals("Blanco") || color.equals("Negro") || color.equals("Rojo") || color.equals("Azul") || color.equals("Gris")){
            compro=true;
        }
        else{
            compro=false;
        }
        return compro;
    }

    public void precioFinal(){

        int precioFinal=0;

        if(peso>=0 && peso<=19){
            precioFinal=precioBase+10;
        }
        else if(peso>=20 && peso<=49){
            precioFinal=precioBase+50;
        }
        else if(peso>=50 && peso<=79){
            precioFinal=precioBase+80;
        }
        else{
            precioFinal=precioBase+100;
        }

        if(consumo=='A'){
            precioFinal+=100;
        }
        else if(consumo=='B'){
            precioFinal+=80;
        }
        else if(consumo=='C'){
            precioFinal+=60;
        }
        else if(consumo=='D'){
            precioFinal+=50;
        }
        else if(consumo=='E'){
            precioFinal+=30;
        }
        else{
            precioFinal+=10;
        }

        System.out.println("El precio final del electrodomestico es: "+precioFinal);
    }
}
