package Ejer11;
public class Aula {
    
    private int ide;
    private double m2;

    public int getIde() {
        return this.ide;
    }

    public void setIde(int ide) {
        this.ide = ide;
    }

    public double getM2() {
        return this.m2;
    }

    public void setM2(double m2) {
        this.m2 = m2;
    }

    public Aula(){
        ide=1;
        m2=40.2;
    }
    public Aula(int ide, double m2){
        this.ide=ide;
        this.m2=m2;
    }

}
