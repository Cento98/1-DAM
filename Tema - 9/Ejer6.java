public class Ejer6 {
    
    public static void main (String[] args){

        int[] array={-2,-1,0,1,2};
        dividirEntreArray2(2,array);

    }

    static void dividirEntreArray(int num, int[] array){

        int resul;
        try{
            for(int i=0;i<array.length;i++){
                resul=num/array[i];
                System.out.println(resul);
            }
        }
        catch(ArithmeticException e){
            System.out.println("Division por 0 detectada.");
        }
    }

    static void dividirEntreArray2(int num, int[] array){

        int resul;
        
            for(int i=0;i<array.length;i++){
                try{
                    resul=num/array[i];
                    System.out.println(resul);
                    }
                
            catch(ArithmeticException e){
                System.out.println("Division por 0 detectada.");
                }
            }
        
    }
}
