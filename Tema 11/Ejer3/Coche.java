package Ejer3;

public class Coche {
    
    protected String matricula;
    protected int vActual;
    protected int mActual;
    protected int[] marchas;

    public Coche(String matricula){
        this.matricula=matricula;
        vActual=0;
        mActual=0;
        int[] marchas2={30,60,90,120,160};
        marchas=marchas2;
    }

    public void acelerar(int acelerar){
        vActual=vActual+acelerar;
        System.out.println("La velocidad actual es de "+vActual);
    }

    public void frenar(int frenar){
        vActual=vActual-frenar;
        System.out.println("La velocidad actual es de "+vActual);
    }

    public void oTString(){
        System.out.println("La matricula del coche es "+matricula);
        System.out.println("La velocidad actual del coche es de "+vActual);
        System.out.println("La marcha actual del coche es la "+mActual);
    }

    public void canviarMarcha(int marcha){
        mActual=marcha;
    }

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getVActual() {
		return this.vActual;
	}

	public void setVActual(int vActual) {
		this.vActual = vActual;
	}

	public int getMActual() {
		return this.mActual;
	}

	public void setMActual(int mActual) {
		this.mActual = mActual;
	}

	public int[] getMarchas() {
		return this.marchas;
	}

	public void setMarchas(int marchas[]) {
		this.marchas = marchas;
	}

}
