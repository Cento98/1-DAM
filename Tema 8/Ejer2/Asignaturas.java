package Ejer2;

public class Asignaturas {

    private String nombre;
    private int codigo;
    private int curso;

    public Asignaturas() {
        nombre = "Programacion";
        codigo = 1017;
        curso = 1;
    }

    public Asignaturas(String nombre, int codigo, int curso) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.curso = curso;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCurso() {
        return this.curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public void imprimir(){
        System.out.println(nombre);
        System.out.println(codigo);
        System.out.println(curso);
    }
}


