import java.util.Random;
public class Ejer13 {
    
    public static void main (String args[]){

        Random aleatorio=new Random();

       
        float cara=0;
        float cruz=0;
        int random;
        
        
        for(float i=1;i<=1000000;i++){
            
            random=aleatorio.nextInt(2)+1;
            
        
                if (random == 2){
                    cara++;
            }

                else{
                    cruz++;
            }

                
        }
       
        float porcentajeCara = cara/10000;
        float porcentajeCruz = cruz/10000;

        System.out.println(porcentajeCara+"% cara");
        System.out.println(porcentajeCruz+"% cruz");
        
    }
}
