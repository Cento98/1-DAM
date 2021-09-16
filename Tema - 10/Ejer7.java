import java.util.*;

public class Ejer7 {
    
    public static void main (String[] args){

        Scanner lector=new Scanner (System.in);
        double euros;
        String elec;
        double total;

        HashMap<String, Double> map = new HashMap<String, Double>();

        map.put("USD", 1.21);
        map.put("GBP", 0.87);
        map.put("INR", 92.32);
        map.put("AUD", 1.55);
        map.put("CAD", 1.50);
        map.put("ARS", 112.76);
        map.put("BOB", 8.34);
        map.put("CLP", 815.65);
        map.put("VEZ", 4424.65);
        map.put("CRC", 742.97);
        map.put("CUP", 29.02);
        map.put("DOP", 68.82);
        map.put("MXN", 23.98);

        System.out.println("Cuantos euros quieres cambiar?");
        euros=lector.nextDouble();
        System.out.println("A que moneda quieres cambiar?");
        monedas();
        lector.nextLine();
        elec=lector.nextLine();
        double x=map.get(elec);
        total=euros*x;

        System.out.println("El cambio de "+euros+" euros a "+elec+" seria de "+total);
    }

    public static void monedas(){
        System.out.println("USD");
        System.out.println("GBP");
        System.out.println("INR");
        System.out.println("AUD");
        System.out.println("CAD");
        System.out.println("ARS");
        System.out.println("BOB");
        System.out.println("CLP");
        System.out.println("VEZ");
        System.out.println("CRC");
        System.out.println("CUP");
        System.out.println("DOP");
        System.out.println("MXN");
    }


}
