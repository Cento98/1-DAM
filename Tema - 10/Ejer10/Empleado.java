package Ejer10;

public class Empleado {
    
    private String dni;
    private String nombre;
    private String fecha;
    private double sueldo;
    private String hijos;

    public Empleado(){
        dni="48683421B";
        nombre="Cento";
        fecha="10-03-1998";
        sueldo=1600.43;
        hijos="Si";
    }

    public Empleado(String dni, String nombre, String fecha, Double sueldo, String hijos){
        this.dni=dni;
        this.nombre=nombre;
        this.fecha=fecha;
        this.sueldo=sueldo;
        this.hijos=hijos;
    }

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

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String isHijos() {
        return this.hijos;
    }

    public void setHijos(String hijos) {
        this.hijos = hijos;
    }

}
