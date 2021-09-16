package Ejer6;

public class Parejas {
    
    private String espanol;
    private String ingles;

    public String getEspanol() {
        return this.espanol;
    }

    public void setEspanol(String espanol) {
        this.espanol = espanol;
    }

    public String getIngles() {
        return this.ingles;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }

    public Parejas(String ingles, String espanol){
        this.ingles=ingles;
        this.espanol=espanol;
    }
}
