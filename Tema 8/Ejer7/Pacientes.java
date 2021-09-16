package Ejer7;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Pacientes {
    
    private long sip;
    private String nombre;
    private int edad;
    private String sexo;
    private String fecha;
    private int hora;
    private int minutos;
    private String sintomas;
    private int vital[]=new int[4];

    public Pacientes(){
        sip=1234569;
        nombre="Vicent Roig";
        edad=23;
        sexo="Hombre";
        fecha="10-03-2021";
        hora=16;
        minutos=40;
        sintomas="Dolor de espalda";
    }

    public Pacientes(long sip, String nombre, int edad, String sexo, String fecha, int hora, int minutos, String sintomas){
        this.sip=sip;
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.fecha=fecha;
        this.hora=hora;
        this.minutos=minutos;
        this.sintomas=sintomas;

    }

    public void imprimirNuevo(){
        System.out.println(sip+" "+nombre+" "+edad+" "+sexo+" "+fecha+" "+hora+":"+minutos+" "+sintomas);
    }
    public int[] getVital(){
        return vital;
    }

    public void setVital(int[] vital){
        this.vital=vital;
    }

    public long getSip() {
        return this.sip;
    }

    public void setSip(long sip) {
        this.sip = sip;
    }

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

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return this.hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return this.minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public String getSintomas() {
        return this.sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }
    
}
