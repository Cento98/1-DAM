package Ejer1;

public class Coche {

    private String modelo;
    private String color;
    private String metalizada;
    private String matricula;
    private String tipo;
    private int ano;
    private String seguro;

    public Coche(){
        modelo="Ford Fiesta";
        color="Rojo";
        metalizada="Si";
        matricula="ABC123";
        tipo="MINI";
        ano=1995;
        seguro="A todo riesgo";
    }

    public Coche(String modelo, String color, int ano){
        this.modelo=modelo;
        this.color=color;
        this.ano=ano;
    }

    public void imprimirCoche(){
        System.out.println("El modelo es el: "+modelo);
        System.out.println("El color es el: "+color);
    }
    
	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMetalizada() {
		return this.metalizada;
	}

	public void setMetalizada(String metalizada) {
		this.metalizada = metalizada;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getSeguro() {
		return this.seguro;
	}

	public void setSeguro(String seguro) {
		this.seguro = seguro;
	}


}


