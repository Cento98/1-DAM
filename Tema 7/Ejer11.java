import java.util.Scanner;
public class Ejer11 {

    public static void main (String[] args){

        Scanner lector = new Scanner (System.in);

        System.out.println("Escribe tu nombre");
        String nombre=lector.nextLine();

        System.out.println("Escribe tu 1r apellido");
        String primerApellido=lector.nextLine();

        System.out.println("Escribe tu 2nd apellido");
        String segundoApellido=lector.nextLine();

        cadenas(nombre, primerApellido, segundoApellido);
    }

    static void cadenas (String nom, String cognom, String cognom2){

        String cadena=nom+" "+cognom+" "+cognom2;

        String nombreCompletoMinus=cadena.toLowerCase();
        System.out.println(nombreCompletoMinus);

        String nombreCompletoMayus=cadena.toUpperCase();
        System.out.println(nombreCompletoMayus);

        int longitudCadena=cadena.length();
        System.out.println(longitudCadena);

        String nom5="";
        if (longitudCadena>=5){

            for(int i=0;i<=5;i++){
                char caracterNom=nom.charAt(i);
                String nomC5=Character.toString(caracterNom);
                nom5=nom5+nomC5;
            }
            System.out.println(nom5);

        }

        if (longitudCadena>=2){

            int longitud2=longitudCadena-2;

            for (int j=longitud2;j<longitudCadena;j++){
                char caracteresFinales=cadena.charAt(j);
                System.out.print(caracteresFinales);
            }
            System.out.println("");
        }

        int contador1=0;
        int longitud3=longitudCadena-1;
        char caracterFinal=cadena.charAt(longitud3);
        String ScaracterFinal=Character.toString(caracterFinal);
        for(int k=0;k<longitudCadena;k++){
            char ocurrenciasFinal=cadena.charAt(k);
            String SocurrenciasFinal=Character.toString(ocurrenciasFinal);
            
            if(ScaracterFinal.equals(SocurrenciasFinal)){
                contador1++;
            }

        }
        System.out.println("El caracter "+caracterFinal+" tiene "+contador1+" ocurrencias.");


        char primeraLetra=cadena.charAt(0);
        String SprimeraLetra=Character.toString(primeraLetra);
        System.out.println(cadena.replaceAll(SprimeraLetra, SprimeraLetra.toUpperCase()));

        System.out.println("***"+cadena+"***");

        String cadenaInvertida= new StringBuilder(cadena).reverse().toString();
        System.out.println(cadenaInvertida);

    }
}
