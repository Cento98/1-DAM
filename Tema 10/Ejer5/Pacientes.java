package Ejer5;
public class Pacientes {
    
    private long ide;
    private String nombre;
    private int dia;
    private int mes;
    private int anyo;
    private char sexo;
    private double metros;
    private double peso;

    public long getIde() {
        return this.ide;
    }

    public void setIde(long ide) {
        this.ide = ide;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnyo() {
        return this.anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getMetros() {
        return this.metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    public Pacientes(){
        this.ide=1;
        this.nombre="Vicent";
        this.dia=10;
        this.mes=03;
        this.anyo=1998;
        this.sexo='M';
        this.metros=1.85;
        this.peso=120;
    }

    public Pacientes(long ide, String nombre, int dia, int mes, int anyo, char sexo, double metros, double peso){
        this.ide=ide;
        this.nombre=nombre;
        this.dia=dia;
        this.mes=mes;
        this.anyo=anyo;
        this.sexo=sexo;
        this.metros=metros;
        this.peso=peso;
    }
}
