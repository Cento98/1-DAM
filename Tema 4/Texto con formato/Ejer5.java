public class Ejer5{
    
    public static void main (String args[]){

        String num="         ";
        String num2;
        String num3=num;
        int colorTexto=30;
        
        for(int i=1;i<=9;i++){

            
            num2=String.valueOf(i);
            num3= num.replaceFirst(" ", "");
            num=num3+num2;
            System.out.printf("\u001B[0;%d;40m %s \u001B[0m\n",colorTexto,num);
            colorTexto++;

            if(colorTexto>37){
                colorTexto=30;
            }

        }
    }
}
