package Ejer4;

public class Main {
    
    public static void main (String[]args){

        //Ejer4

        Punto punto1=new Punto();
        punto1.visualizarPunt();

        Punto punto2=new Punto();
        punto2.setX(10);
        punto2.setY(5);
        punto2.visualizarPunt();
        System.out.println("La distancia entre los 2 puntos es de: "+punto1.calcularDistancia(punto2));

        System.out.println("====================");
        
        //Ejer5
        Circulo circulo1=new Circulo(punto1, 20);
        circulo1.visualizarCirculo();
        System.out.println("El area del circulo es: "+circulo1.calcularArea());
        System.out.println("El perimetro del circulo es: "+circulo1.calcularPerimetro());

        Circulo circulo2=new Circulo(punto2, 20);
        System.out.println("El area del circulo es: "+circulo2.calcularArea());
        System.out.println("El perimetro del circulo es: "+circulo2.calcularPerimetro());

        System.out.println("La distancia entre el punto 1 y el circulo 1 es: "+punto1.calcularDistancia(punto2));
    }
}
