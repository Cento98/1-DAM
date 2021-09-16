import java.util.Scanner;
public class Ejercicio17{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
    
        System.out.println("A ver cuantas veces has gastado la gasofa crack");
        
       
        System.out.println("Me vas a decir 1º El precio del litro del combustible, 2º El total pagado cada vez que llenas el deposito, 3º El numero de kilometros que marca en el cuantakilometros");
        int LitroCombustible1 = reader.nextInt();
        int TotalPagado1 = reader.nextInt();
        int NumeroKilometros1 = reader.nextInt();

        System.out.println("Me vas a decir el precio del litro de combustible y el total pagado al llenar");
        int LitroCombustible2 = reader.nextInt();
        int TotalPagado2 = reader.nextInt();

        System.out.println("Me vas a decir el numero del cuenta kilometros");
        int NumeroKilometros2 = reader.nextInt();


        int KmTotales = NumeroKilometros1 - NumeroKilometros2;
        int ConsumoPor100 = 100 * (LitroCombustible1 + LitroCombustible2)/KmTotales;
        int CosteKilometro = (TotalPagado1 - TotalPagado2)/ KmTotales;
        System.out.println("El consumo por cada 100 kilomteros es" + ConsumoPor100);
        System.out.println("El coste por kilometro es de " + CosteKilometro);




    }
}