package Ejer1y2;
public class Punto {
    
    private double atributo1;
    private double atributo2;

    public double getAtributo1() {
        return this.atributo1;
    }

    public void setAtributo1(double atributo1) {
        this.atributo1 = atributo1;
    }

    public double getAtributo2() {
        return this.atributo2;
    }

    public void setAtributo2(double atributo2) {
        this.atributo2 = atributo2;
    }


    public Punto(){
        atributo1=4.2;
        atributo2=1.1;
    }

    public Punto(double a1, double a2){
        this.atributo1=a1;
        this.atributo2=a2;
    }

    public static double distancia(Punto punto){
        double a=0;
        return a;
    }

    public void toString(Punto punto){
        System.out.println("("+punto.getAtributo1()+","+punto.getAtributo2()+")");
    }
}
