public class Cartas {
    
    private int numero;
    private String palo;

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return this.palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public Cartas(){
        numero=0;
        palo="Joker";
    }

    public Cartas(int numero, String palo){
        this.numero=numero;
        this.palo=palo;
    }

    public void mostrarCarta()throws InterruptedException{
        Thread.sleep(500);
        switch(numero){
            case 11:
                System.out.println("Recibes la carta: "+"J"+" de "+palo);
            break;

            case 12:
                System.out.println("Recibes la carta: "+"Q"+" de "+palo);
            break;

            case 13:
                System.out.println("Recibes la carta: "+"K"+" de "+palo);
            break;

            default:
                System.out.println("Recibes la carta: "+numero+" de "+palo);
            break;
        }
        Thread.sleep(500);
    }
}
