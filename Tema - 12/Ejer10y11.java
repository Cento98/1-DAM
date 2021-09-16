import java.util.*;
import java.io.*;
public class Ejer10y11 {
    
    public static void main (String[] args){
        
        Scanner lector=new Scanner (System.in);

        File fichero = new File("ficheros/ejer10A.txt");
        File fichero2 = new File("ficheros/ejer10B.txt");
        System.out.println("Escribe el contenido del primero fichero");
        String primer=lector.nextLine();
        System.out.println("Escribe el contenido del segundo fichero");
        String segundo=lector.nextLine();

        try{
            fichero.createNewFile();
            FileWriter fw=new FileWriter(fichero);
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write(primer);
            bw.close();

            fichero2.createNewFile();
            FileWriter fw2=new FileWriter(fichero2);
            BufferedWriter bw2=new BufferedWriter(fw2);
            bw2.write(segundo);
            bw2.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }

        concat(fichero, fichero2);
        concatLines(fichero, fichero2);

    }

    public static void concat(File fichero1, File fichero2){

        File fichero3 = new File("ficheros/ejer10C.txt");

        try{
            fichero3.createNewFile();

            FileReader fr=new FileReader(fichero1);
            BufferedReader br= new BufferedReader(fr);

            FileReader fr2=new FileReader(fichero2);
            BufferedReader br2= new BufferedReader(fr2);
            
            FileWriter fw=new FileWriter(fichero3);
            BufferedWriter bw=new BufferedWriter(fw);

            String line=br.readLine();
            while(line!=null){
                bw.write(line+"\n");
                line=br.readLine();
            }
            br.close();

            String line2=br2.readLine();
            while(line2!=null){
                bw.write(line2+"\n");
                line2=br2.readLine();
            }
            br2.close();
            bw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
    }

    public static void concatLines(File fichero1, File fichero2){

        File fichero3 = new File("ficheros/ejer10D.txt");

        try{
            fichero3.createNewFile();

            FileReader fr=new FileReader(fichero1);
            BufferedReader br= new BufferedReader(fr);

            FileReader fr2=new FileReader(fichero2);
            BufferedReader br2= new BufferedReader(fr2);
            
            FileWriter fw=new FileWriter(fichero3);
            BufferedWriter bw=new BufferedWriter(fw);

            String line=br.readLine();
            String line2=br2.readLine();
            while(line!=null && line2!=null){
                bw.write(line+" "+line2);
                line=br.readLine();
                line2=br2.readLine();
            }
            br.close();
            br2.close();
            bw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }



    }
}
