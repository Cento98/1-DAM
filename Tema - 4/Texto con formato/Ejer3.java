public class Ejer3{
    
    public static void main (String args[]){

        String num="         ";
        String num2;
        String num3=num;
        
        for(int i=1;i<=9;i++){


            num2=String.valueOf(i);
            num3= num.replaceFirst(" ", "");
            num=num3+num2;
            System.out.println(num);
        }
    }
}


