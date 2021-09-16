import java.util.Scanner;
public class Ejer20 {
    
    public static void main (String [] args){

        System.out.println("Bienvenido al programa del Lucky Number");
        int number=lucky();
        System.out.println("Tu lucky Number es el: "+number);
    }

    static int lucky(){

        Scanner lector=new Scanner (System.in);
        Boolean boleano=false;
        String fecha;

        //Comprobacion de la entrada
        do{
        System.out.println("Introduce tu fecha de nacimiento con el formato dd-mm-aaaa");
        fecha=lector.nextLine();
            char comproba1=fecha.charAt(2);
            char comproba2=fecha.charAt(5);

            if (comproba1=='-' && comproba2=='-'){
                boleano=true;
            }
            else{
            System.out.println("Formato Incorrecto.");
            }
        }

        while(boleano==false);

            //Convertimos en caracteres separados
            char digitoDia1=fecha.charAt(0);
            char digitoDia2=fecha.charAt(1);

            char digitoMes1=fecha.charAt(3);
            char digitoMes2=fecha.charAt(4);

            char digitoAño1=fecha.charAt(6);
            char digitoAño2=fecha.charAt(7);
            char digitoAño3=fecha.charAt(8);
            char digitoAño4=fecha.charAt(9);

                //Convertimos los caracteres en INTs
                int dD1=Character.getNumericValue(digitoDia1);
                int dD2=Character.getNumericValue(digitoDia2);

                int dM1=Character.getNumericValue(digitoMes1);
                int dM2=Character.getNumericValue(digitoMes2);

                int dA1=Character.getNumericValue(digitoAño1);
                int dA2=Character.getNumericValue(digitoAño2);
                int dA3=Character.getNumericValue(digitoAño3);
                int dA4=Character.getNumericValue(digitoAño4);

        //Sumamos los INTs y lo pasamos a String
        int sumaFinal=dD1+dD2+dM1+dM2+dA1+dA2+dA3+dA4;
        String fechaString=String.valueOf(sumaFinal);

            //Convertimos en caracteres separados
            char digitoFinal1=fechaString.charAt(0);
            char digitoFinal2=fechaString.charAt(1);

                //Convertimos los caracteres en INTs
                int dF1=Character.getNumericValue(digitoFinal1);
                int dF2=Character.getNumericValue(digitoFinal2);

        int resultado=dF1+dF2;

        return resultado;
    }

}
