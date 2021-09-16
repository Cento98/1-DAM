package Ejer11;
public class Grupo {
    
    private int ide;
    private String nombre;
    private Aula aula;

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

    public Aula getAula() {
        return this.aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public Grupo(){
        ide=1;
        nombre="DAM";
        aula.getIde();
        aula.getM2();
    }

    public Grupo(int ide, String nombre, Aula aula){
        this.ide=ide;
        this.nombre=nombre;
        this.aula=aula;
    }

}
