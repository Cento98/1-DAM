package Ejer1;

public class Principal {
    
    public static void main (String[]args){

        System.out.println("");
        System.out.println("Coche1");
        System.out.println("");

        Coche coche1=new Coche();
        System.out.println(coche1.getModelo());
        System.out.println(coche1.getColor());
        System.out.println(coche1.getAno());
        System.out.println(coche1.getMatricula());
        System.out.println(coche1.getMetalizada());
        System.out.println(coche1.getTipo());
        System.out.println(coche1.getSeguro());

        System.out.println("");
        System.out.println("Coche2");
        System.out.println("");

        Coche coche2=new Coche("Ferrari", "Morado", 1985);
        System.out.println(coche2.getModelo());
        System.out.println(coche2.getColor());
        System.out.println(coche2.getAno());

        System.out.println("");
        System.out.println("Coche1 Modificado");
        System.out.println("");

        coche1.setModelo("Toyota");
        System.out.println(coche1.getModelo());
        coche1.setColor("Amarillo");
        System.out.println(coche1.getColor());
        coche1.setAno(2020);
        System.out.println(coche1.getAno());
        coche1.setMatricula("YXZ987");
        System.out.println(coche1.getMatricula());
        coche1.setMetalizada("No");
        System.out.println(coche1.getMetalizada());
        coche1.setTipo("Utilitario");
        System.out.println(coche1.getTipo());
        coche1.setSeguro("A terceros");
        System.out.println(coche1.getSeguro());

        System.out.println("");
        System.out.println("Coche2 Modificado");
        System.out.println("");

        coche2.setModelo("Honda");
        System.out.println(coche2.getModelo());
        coche2.setColor("Plateado");
        System.out.println(coche2.getColor());
        coche2.setAno(1800);
        System.out.println(coche2.getAno());

    }
}
