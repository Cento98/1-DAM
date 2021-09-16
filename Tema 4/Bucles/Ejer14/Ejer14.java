import java.util.Random;
public class Ejer14 {

    public static void main (String args []){

        Random random = new Random();

        int dado;
        float duno=0;
        float ddos=0;
        float dtres=0;
        float dcuatro=0;
        float dcinco=0;
        float dseis=0;

        for(int i=0;i<1000000;i++){

            dado=random.nextInt(6)+1;

            switch(dado){
                case 1: duno++;
                break;
                case 2: ddos++;
                break;
                case 3: dtres++;
                break;
                case 4: dcuatro++;
                break;
                case 5: dcinco++;
                break;
                case 6: dseis++;
                break;
            }
        }
        float porcentajeDuno=duno/10000;
        float porcentajeDdos=ddos/10000;
        float porcentajeDtres=dtres/10000;
        float porcentajeDcuatro=dcuatro/10000;
        float porcentajeDcinco=dcinco/10000;
        float porcentajeDseis=dseis/10000;

        System.out.println("El uno a salido "+duno+" veces, que es igual al "+porcentajeDuno+"%");
        System.out.println("El dos a salido "+ddos+" veces, que es igual al "+porcentajeDdos+"%");
        System.out.println("El tres a salido "+dtres+" veces, que es igual al "+porcentajeDtres+"%");
        System.out.println("El cuatro a salido "+dcuatro+" veces, que es igual al "+porcentajeDcuatro+"%");
        System.out.println("El cinco a salido "+dcinco+" veces, que es igual al "+porcentajeDcinco+"%");
        System.out.println("El seis a salido "+dseis+" veces, que es igual al "+porcentajeDseis+"%");
        
    }
    
}
