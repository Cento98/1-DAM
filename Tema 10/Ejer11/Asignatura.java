package Ejer11;

public class Asignatura {
    
    private int ide;
    private String nombre;
    private Profesor profesor;

    public int getIde() {
        return this.ide;
    }

    public void setIde(int ide) {
        this.ide = ide;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return this.profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Asignatura(){
        ide=1;
        nombre="Programacion";
        profesor.getDni();
        profesor.getNombre();
        profesor.getSueldo();
    }

    public Asignatura(int ide, String nombre, Profesor profesor){
        this.ide=ide;
        this.nombre=nombre;
        this.profesor=profesor;
    }
}
