import java.util.Random;
public class Ejer16 {
    
    public static void main (String[] args){

        array();
    }

    static void array(){

        Random random=new Random();
        double array[]=new double[30];
        double media=0;
        double media5=0;
        double contador=0;

        for(int i=0;i<30;i++){
            array[i]=0+(10-0)*random.nextDouble();
            double numero=array[i];
            System.out.println(numero);

            if(numero>=5){

                media=media+numero;
                media5=media5+numero;
                contador++;
            }
            else{
                media=media+numero;
            }
        }

        double mediaFinal=media/30;
        double media5Final=media5/contador;

        System.out.println("La media de las notas que superan el 5 es: "+media5Final);
        System.out.println("La media de todas las notas es: "+mediaFinal);
    }
}
