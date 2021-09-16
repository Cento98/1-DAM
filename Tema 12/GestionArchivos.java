import java.io.*;
import java.util.*;
public class GestionArchivos {
    
    public Boolean crearArchivo(String directorio, String archivo) throws IOException{

        File fichero=new File(directorio+"/"+archivo);

        return fichero.createNewFile();
    }

    public void listarDirectorio(String directorio){

        File fichero=new File(directorio);

        for(String i:fichero.list()){
            
            File aux=new File(i);

            System.out.println(aux.getName());
            if(aux.isDirectory()){
                System.out.println("D");
            }
            else{
                System.out.println("F");
            }

            if(aux.canRead()){
                System.out.println("Se puede leer");
            }
            else{
                System.out.println("No se puede leer");
            }

            if(aux.canWrite()){
                System.out.println("Se puede escribir");
            }
            else{
                System.out.println("No se puede escribir");
            }

            System.out.println(aux.length()+" Bytes");
        }
    }

    public void verInfo(String directorio, String archivo){

        File fichero=new File(directorio+"/"+archivo);

        System.out.println(fichero.getName());

        System.out.println(fichero.getAbsolutePath());

        if(fichero.canRead()){
            System.out.println("Se puede leer");
        }
        else{
            System.out.println("No se puede leer");
        }

        if(fichero.canWrite()){
            System.out.println("Se puede escribir");
        }
        else{
            System.out.println("No se puede escribir");
        }
        if(fichero.isDirectory()){
            System.out.println("Es un directorio");
        }
        else{
            System.out.println("Es un fichero");
        }
    }

    public void mostrarContenido(String directorio, String archivo) throws FileNotFoundException, IOException{

        File fichero=new File(directorio+"/"+archivo);
        FileReader fr=null;
        BufferedReader br=null;
        fr=new FileReader(fichero);
        br=new BufferedReader(fr);

        String linea;
        while((linea=br.readLine())!=null){
            System.out.println(linea);
        }
        fr.close();
    }

    public void mostrarBinario(String directorio, String archivo) throws IOException{

        Scanner lector=new Scanner (System.in);
        FileOutputStream crear=new FileOutputStream(directorio+"/"+archivo);

        System.out.println("Introduce una cadena");

        lector.nextLine();
        String cadena=lector.nextLine();

        byte baits[]=cadena.getBytes();

        crear.write(baits);

        FileInputStream leer=new FileInputStream(directorio+"/"+archivo);

        int valor=leer.read();
            while(valor!=-1){
                String valor2=Integer.toHexString(valor);
                System.out.print(valor2);
                valor=leer.read();
            }
        leer.close();
    }

}
