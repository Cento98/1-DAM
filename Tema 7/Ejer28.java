import java.util.Random;
public class Ejer28 {
    
    public static void main (String[] args){

        char letras[]=new char[26];
        char array[]=new char[500];

        concurrencias(letras, array);

    }

    static void concurrencias(char[] array, char[] letras){

        Random random=new Random();

        int concu[]=new int[26];

        int contador=0;
        for(int i=65;i<=90;i++){
            letras[contador]=(char)i;
            contador++;
        }

        int contador2=0;
        for(int j=0;j<array.length;j++){
            array[j]=(char)(random.nextInt(90-65+1)+65);
            System.out.println(array[j]);
            for(int k=0;k<letras.length;k++){

                if(array[j]==letras[contador2]){
                    concu[contador2]++;
                }
                contador2++;
                if(contador2==25){
                    contador2=0;
                }
            }
        }
        for(int n=0;n<concu.length;n++){
            System.out.println(letras[n]+"-->"+concu[n]);
        }

    }
}
