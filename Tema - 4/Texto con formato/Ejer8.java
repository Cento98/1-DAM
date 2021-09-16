public class Ejer8 {
    
    public static void main (String args[]){

        for(int i=0;i<=1;i++){

            for(int j=30;j<=37;j++){

                for(int k=40;k<=47;k++){

                    System.out.printf("\u001B[%d;%d;%dm %d;%d;%d \u001B[0m",i,j,k,i,j,k);

                    if(k==47){
                        System.out.println("");
                    }

             
                }    
            }
        }
    }
}
