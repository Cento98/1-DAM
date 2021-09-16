import java.util.Scanner;
public class Ejer15 {
    
    public static void main (String [] args){

        
        int eleccion=menu();

        comparar(eleccion);

    }

    public static int menu(){
        Scanner lector = new Scanner (System.in);

        System.out.println("MENU PRINCIPAL");
        for (int j=1;j<=14;j++){
            System.out.print("=");
        }    
        System.out.println("");
        
        System.out.println("1. Palabra mas larga.");
        System.out.println("2. Palabra mas corta");
        System.out.println("3. Numero de vocales");
        for(int k=1;k<=35;k++){
            System.out.print("-");
        }
        System.out.println("");
        System.out.println("0. Salir");

        int elec = lector.nextInt();

        return elec;
    }


    static void comparar(int a){
        Scanner introducir=new Scanner (System.in);
        
        switch(a){
        case 0: 
        System.out.println("Saliendo del programa...");
        break;

        case 1:
        case 2:
        System.out.println("Introduce las 3 palabras que quieres comparar");
        System.out.println("1ra Palabra");
        String palabra1=introducir.nextLine();
        System.out.println("2nd Palabra");
        String palabra2=introducir.nextLine();
        System.out.println("3ra Palabra");
        String palabra3=introducir.nextLine();

        int p1=palabra1.length();
        int p2=palabra2.length();
        int p3=palabra3.length();

        if(a==1){
            if (p1>p2 && p1>p3){
                System.out.println("La palabra mas larga es: "+palabra1);
            }
            else if (p2>p1 && p2>p3){
                System.out.println("La palabra mas larga es: "+palabra2);
            }
            else {
                System.out.println("La palabra mas larga es: "+palabra3);
            }
        }
        else if(a==2){
            if (p1<p2 && p1<p3){
                System.out.println("La palabra mas corta es: "+palabra1);
            }
            else if (p2<p1 && p2<p3){
                System.out.println("La palabra mas corta es: "+palabra2);
            }
            else {
                System.out.println("La palabra mas corta es: "+palabra3);
            }
        }
        break;

        case 3: 
        System.out.println("Introduce la palabra que quieras:");
        String paso3=new String();
        paso3=introducir.nextLine();
        int longitudString=paso3.length();
        int contador=0;
        System.out.println(paso3);
        for(int n=0;n<longitudString;n++){
           char letra=paso3.charAt(n);
            if (letra=='a' || letra=='A' || letra=='á' || letra=='Á' || letra=='e' || letra=='E' || letra=='é' || letra=='É' || letra=='i' || letra=='I' || letra=='í' || letra=='Í' || letra=='o' || letra=='O' || letra=='ó' || letra=='Ó' || letra=='u' || letra=='U' || letra=='ú' || letra=='Ú'){
                contador++;
            }
        }
        System.out.println("Hay "+contador+" vocales en la palabra "+paso3);
    }  
}

    
}
