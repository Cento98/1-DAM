package Ejer6;

public class Bicicleta {
    private int referencia;
    private String marca;
    private String modelo;
    private int kilos;
    private double pulgadasR;
    private String motor;
    private int anyo;
    private double precio;
    private int existencias;

    public Bicicleta(){
        referencia=1;
        marca="Honda";
        modelo="BMX";
        kilos=5;
        pulgadasR=2.4;
        motor="No";
        anyo=1998;
        precio=306.65;
        existencias=1;
    }

    public Bicicleta(int referencia, String marca, String modelo, int kilos, double pulgadasR, String motor, int anyo,double precio, int existencias){
        this.referencia=referencia;
        this.marca=marca;
        this.modelo=modelo;
        this.kilos=kilos;
        this.pulgadasR=pulgadasR;
        this.motor=motor;
        this.anyo=anyo;
        this.precio=precio;
        this.existencias=existencias;
    }

    public void imprimirStock(){
        System.out.println("De la bicicleta con referencia "+referencia+" hay "+existencias+" en stock");
    }

    public void imprimirPorReferencia(){
        System.out.println("*******************");
        System.out.println("Referencia: "+referencia);
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Kilos: "+kilos);
        System.out.println("Pulgadas: "+pulgadasR);
        System.out.println("Motor: "+motor);
        System.out.println("Año: "+anyo);
        System.out.println("Precio: "+precio);
        System.out.println("Existencias(Stock): "+existencias);
        System.out.println("*******************");
    }

    public int getReferencia() {
        return this.referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilos() {
        return this.kilos;
    }

    public void setKilos(int kilos) {
        this.kilos = kilos;
    }

    public double getPulgadasR() {
        return this.pulgadasR;
    }

    public void setPulgadasR(double pulgadasR) {
        this.pulgadasR = pulgadasR;
    }

    public String getMotor() {
        return this.motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getAnyo() {
        return this.anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencias() {
        return this.existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }
}
