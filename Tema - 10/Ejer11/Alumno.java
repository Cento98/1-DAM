package Ejer11;

public class Alumno {
    
    private int ide;
    private String nombre;
    private Grupo grupo;
    private Asignatura asignatura;

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

    public Grupo getGrupo() {
        return this.grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Asignatura getAsignatura() {
        return this.asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Alumno(){
        ide=1;
        nombre="Cento";
        grupo.getIde();
        grupo.getNombre();
        grupo.getAula().getIde();
        grupo.getAula().getM2();
        asignatura.getIde();
        asignatura.getNombre();
        asignatura.getProfesor().getDni();
        asignatura.getProfesor().getNombre();
        asignatura.getProfesor().getSueldo();
    }

    public Alumno(int ide, String nombre, Grupo grupo, Asignatura asignatura){
        this.ide=ide;
        this.nombre=nombre;
        this.grupo=grupo;
        this.asignatura=asignatura;
    }

    public void imprimirAlumno(){
        System.out.println("ALUMNO:");
        System.out.println("IDE: "+ide);
        System.out.println("Nombre: "+nombre);
        System.out.println("GRUPO:");
        System.out.println("IDE: "+grupo.getIde());
        System.out.println("Nombre: "+grupo.getNombre());
        System.out.println("AULA:");
        System.out.println("IDE: "+grupo.getAula().getIde());
        System.out.println("M2: "+grupo.getAula().getM2());
        System.out.println("ASIGNATURA:");
        System.out.println("IDE: "+asignatura.getIde());
        System.out.println("Nombre: "+asignatura.getNombre());
        System.out.println("PROFESOR:");
        System.out.println("DNI: "+asignatura.getProfesor().getDni());
        System.out.println("Nombre: "+asignatura.getProfesor().getNombre());
        System.out.println("Sueldo: "+asignatura.getProfesor().getSueldo());
    }
}
