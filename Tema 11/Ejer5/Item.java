package Ejer5;

public abstract class Item {
    
    protected int id;
    protected String nombre;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Item(){
        id=0;
        nombre="uno";
    }

    public Item(int id, String nombre){
        this.id=id;
        this.nombre=nombre;
    }

}
