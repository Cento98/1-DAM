public class Ejer5{
    
    public static void main (String args[]){
      int j=0;  
      int contadorPar=0;
      int contadorImpar=0;
      int contador5=0;
      int sumaPar=0;
      int sumaImpar=0;
      int suma5=0;
        for(int i=1;i<=100;i++){
            j++;
            if(j%2==0){
                System.out.println(j+" Es par");
                contadorPar++;
                sumaPar = sumaPar + j;
            }
            else {
                System.out.println(j+" Es impar");
                contadorImpar++;
                sumaImpar = sumaImpar+j;
            }
            if(j%5==0){
                System.out.println(j+" Es multiplo de 5");
                contador5++;
                suma5=suma5+j;
            }
           
        }
        System.out.println("Hay "+contadorPar+" numeros pares, y su suma es = "+sumaPar);
        System.out.println("Hay "+contadorImpar+" numeros inpares y, su suma es = "+sumaImpar);
        System.out.println("Hay "+contador5+" numeros multiplos de 5, y su suma es = "+suma5);
    }
}