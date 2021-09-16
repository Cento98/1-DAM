package Ejer5;

public class Alumnos {
    private String nombre;
    private int edad;
    private double altura;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    } 

    public Alumnos(){
        nombre="Vicent";
        edad=23;
        altura=1.90;
    }

    public Alumnos(String nombre, int edad, double altura){
        this.nombre=nombre;
        this.edad=edad;
        this.altura=altura;
    }

    public void imprimir(){
        System.out.println(nombre+" "+edad+" "+altura);
    }

    public void mayor(Alumnos dos){
        if(this.edad>dos.getEdad()){
            System.out.println(this.nombre+" Es mayor que"+dos.getNombre());
        }
        else{
            System.out.println(dos.getNombre()+" es mayor que "+this.nombre);
        }
    }
}


