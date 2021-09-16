package Ejer9;
import java.io.*;
public class Alumnos {

    public Alumnos(){}

    public void insertarAlumnos(String[] alumnos, String directorio, String archivo) throws IOException{

        File fichero = new File(directorio+"/"+archivo);

        fichero.createNewFile();

        FileWriter fw=new FileWriter(fichero);
        BufferedWriter bw=new BufferedWriter(fw);

        for(int i=0;i<alumnos.length;i++){
            bw.write(alumnos[i]+"\n");
            bw.flush(); 
        }
        bw.close();
    }

    public void eliminarAlumnos(int num, String eliminar, String directorio, String archivo) throws IOException {

        String array[]=new String[num];

        FileReader fr= new FileReader(directorio+"/"+archivo);
        BufferedReader br=new BufferedReader(fr);

        for(int i=0;i<array.length;i++){
            array[i]=br.readLine();
            if(array[i].equalsIgnoreCase(eliminar)){
                array[i]=null;
            }
        }
        br.close();

        FileWriter fw=new FileWriter(directorio+"/"+archivo);
        BufferedWriter bw=new BufferedWriter(fw);
        
        for(int i=0;i<array.length;i++){
            if(array[i]!=null){
                bw.write(array[i]+"\n");
            } 
        }
        bw.close();
        
    }
}
