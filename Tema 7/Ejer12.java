public class Ejer12 {
    
    public static void main (String[] args){

        String cadena="esto1234es5678bueno900";
        System.out.println(cadena);

        String cadena2=nopor(cadena);
        System.out.println(cadena2);

        String cadena3=digitos(cadena);
        System.out.println(cadena3);
    }

    static String nopor(String a){

        String b=a.replaceAll("es", "no por");
        return b;
    }

    static String digitos (String a){

        String b=a.replaceAll("\\d+","*");
        return b;
    }
}
