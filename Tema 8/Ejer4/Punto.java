package Ejer4;
import java.lang.Math;
public class Punto {
    
    private double x;
    private double y;

    public Punto(){
        x=1;
        y=4;
    }

    public Punto(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcularDistancia(Punto dos){

        double x1=x;
        double y1=y;
        double x2=dos.getX();
        double y2=dos.getY();
        double distancia=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        return distancia;
    }

    public void visualizarPunt(){
        System.out.println("("+x+","+y+")");
    }
}
