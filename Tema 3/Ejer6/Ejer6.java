public class Ejer6{
    
    public static void main (String args[]){
    
        int a=25, a1=20, a2=13, a3=5;
        int b=10+4, b1=15-3, b2=2*5+1, b3=14-2*2;
        int c=4*2, c1=8, c2=2*2, c3=5, c4=4, c5=3+1;
        int d=10, d1=2*5, d2=3, d3=4, d4=8, d5=7, d6=3*2, d7=4*2-1;
        
        if (a>a1&&a2>a3){
            System.out.println("a) True");
        }
        else{
            System.out.println("a) False");
        }
        
        if (b<b1||b2>b3){
            System.out.println("b) True");
        }
        else{
            System.out.println("b) False");
        }
        
        if(c<c1||c2<c3&&c4>c5){
            System.out.println("c) True");
        }
        else{
            System.out.println("c) False");
        }
        
        if(d<=d1&&d2<d3||d4<d5&&d6<=d7){
            System.out.println("d) True");
        }
        else{
            System.out.println("d) False");
        }
    }

}
