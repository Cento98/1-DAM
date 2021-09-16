package Ejer10;

public class Hijo {
    
    private String nombre;
    private int edad;

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

    public Hijo(){
        nombre="Vicent";
        edad=17;
    }

    public Hijo(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
}
