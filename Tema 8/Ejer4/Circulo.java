package Ejer4;
import java.lang.Math;
public class Circulo {
    
    Punto p1 = new Punto();
    private double radio;

    public Circulo(Punto xy, double r){
        this.radio=r;
        xy=new Punto();
    }

    public Circulo(double x, double y, double r){
        this.radio=r;
        p1.setX(x);
        p1.setY(y);
    }

    public Circulo(){
        this.radio=4.6;
        Punto p3=new Punto();   
    }

    public double calcularDistancia(Punto dos){
        double x1=p1.getX();
        double y1=p1.getY();
        double x2=dos.getX();
        double y2=dos.getY();
        double distancia=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        return distancia;
    }

    public double calcularArea(){
        double area=(this.radio*this.radio)*3.14;
        return area;
    }

    public double calcularPerimetro(){
        double perimetro=(3.14*3.14)*this.radio;
        return perimetro;
    }

    public void visualizarCirculo(){
        double x=p1.getX();
        double y=p1.getY();
        System.out.println("Circulo de radio "+radio+"cm"+" situado en ek origen de cordenadas "+"("+x+","+y+")");
    }

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

}

