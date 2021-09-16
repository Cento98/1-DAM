package Ejer4;
import java.util.*;

public class Main { 

    public static void main(String[] args){
        Queue<Integer> cola = new LinkedList<>();
        for(int i=0;i<10;i++){
            cola.add(i); 
        }
        System.out.println(cola);
        cola.remove(); 
        System.out.println(cola); 
        System.out.println(cola.peek()); 
        System.out.println(cola.size()); 
        System.out.println(cola.isEmpty()); 
    }
}

