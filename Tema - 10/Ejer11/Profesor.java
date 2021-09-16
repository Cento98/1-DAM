package Ejer11;

public class Profesor {
    
    private String dni;
    private String nombre;
    private double sueldo;

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Profesor(){
        dni="48683421B";
        nombre="Esteban";
        sueldo=1850.43;
    }

    public Profesor(String dni, String nombre, double sueldo){
        this.dni=dni;
        this.nombre=nombre;
        this.sueldo=sueldo;
    }
}
