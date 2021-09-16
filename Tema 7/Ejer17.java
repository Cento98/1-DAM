import java.util.Scanner;
public class Ejer17 {
    
    public static void main (String[] args){

        Scanner reader=new Scanner (System.in);

        System.out.println("Cuantas estaturas quieres intoducir?");
        int veces=reader.nextInt();
        alturas(veces);
    }

    static void alturas(int a){

        Scanner lector=new Scanner (System.in);
        double array[]=new double[a];
        double superiorM=0;
        double media=0;

        System.out.println("Introduce las estaturas:");

        for(int i=0;i<a;i++){
            array[i]=lector.nextDouble();
        }

        for(int j=0;j<a;j++){
            double altura=array[j];
            
            if(altura>1.65){
                media=media+altura;
                superiorM++;
            }
            else{
                media=media+altura;

            }
        }
        double mediaFinal=media/5;
        System.out.println("La estatuda media es de: "+mediaFinal+"y hay "+superiorM+" alturas, que superan a la media");

    }
}
