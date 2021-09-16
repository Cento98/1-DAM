public class Ejer6{
    
    public static void main (String args[]){

        String num="         ";
        String num2;
        String num3=num;
        String num4="";
        
        for(int i=1;i<=9;i++){


            num2=String.valueOf(i);
            num3= num.replaceFirst(" ", "");
            num=num3+num2;
            num4=num4+num2;
            System.out.println(num+num4);
        }
    }
}
 