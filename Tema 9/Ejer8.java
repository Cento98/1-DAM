public class Ejer8 {
    
    public static void main (String[] args){

        int array[]=new int[4];
        Integer x=null;
        array[0]=4;
        array[1]=0;
        array[3]=6;
        

        for(int i=0;i<array.length+2;i++){
            try{
                if(i==2){
                    array[i]=x;
                    System.out.println(2/array[i]);
                }
                System.out.println(2/array[i]);
            }
            catch(ArithmeticException a){
                System.out.println("Division por 0 detectada");
            }
            catch(NullPointerException n){
                System.out.println("Posicion null detectada");
            }
            catch( IndexOutOfBoundsException b){
                System.out.println("Error en posicion del array detectada");
            }
        }
    }
}
