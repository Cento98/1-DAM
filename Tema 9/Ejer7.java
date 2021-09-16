public class Ejer7 {
    
    public static void main (String[] args){

        String array[]=new String[4];
        array[0]="Hola";
        array[1]="k";
        array[2]="ase";
        mostrarCadenesArray(array);
    }

    static void mostrarCadenesArray(String[] array){

        for(int i=0;i<array.length;i++){
            try{
                System.out.println(array[i].charAt(0));
            }
            catch( NullPointerException npe){
                System.out.println("Posicion Null detectada");
            }
            
        }
    }
}
