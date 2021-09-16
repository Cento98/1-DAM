package Ejer3;

public class Alumnos {

    private int nia;
    private String nombre;
    private String apellidos;
    private int dia;
    private int mes;
    private int ano;
    private String grupo;
    private int telefono;

    public Alumnos(){
        nia=000000;
        nombre="Vicent";
        apellidos="Roig Saval";
        dia=10;
        mes=3;
        ano=1998;
        grupo="1DAW";
        telefono=606780157;
    }

    public Alumnos(int nia, String nombre, String apellidos, int dia, int mes, int ano, String grupo, int telefono){
        this.nia=nia;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.dia=dia;
        this.mes=mes;
        this.ano=ano;
        this.grupo=grupo;
        this.telefono=telefono;
    }

    public void imprimir(){
        System.out.println(nia+" "+nombre+" "+apellidos+" "+dia+"-"+mes+"-"+ano+" "+grupo+" "+telefono);
    }

    public int getNia() {
        return this.nia;
    }

    public void setNia(int nia) {
        this.nia = nia;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGrupo() {
        return this.grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
