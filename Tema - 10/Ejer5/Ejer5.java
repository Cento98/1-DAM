package Ejer5;
import java.util.*;
public class Ejer5 {
        
    public static void main (String[] args){
        
        ArrayList <Pacientes> pacientes;
        int array1[]= new int[2];
        int array2[]= new int[2];
        double imc; 
    
        pacientes=crearPacientes();
    
        array1=majorMenor(pacientes);
        System.out.println("Paciente mayor Edad "+array1[0]);
        System.out.println("Paciente menor Edad "+array1[1]);

        array2=pacientsPerSexe(pacientes);
        System.out.println("Cantidad de pacientes por sexo:");
        System.out.println("Hombres: "+array2[0]);
        System.out.println("Mujeres: "+array2[1]);

        for(int i=0;i<pacientes.size();i++){
            imc=0;
            imc=calcularImc(pacientes.get(i));
            if(imc<18.5){
                System.out.println("Paciente numero "+i+": Peso Insuficiente");
            }
            else if(imc>=18.5 && imc<=24.9){
                System.out.println("Paciente numero "+i+": Peso normal");
            }
            else if(imc>=25 && imc<=26.9){
                System.out.println("Paciente numero "+i+": Sobrepeso grado 1");
            }
            else if(imc>=27 && imc<=29.9){
                System.out.println("Paciente numero "+i+": Sobrepeso grado 2");
            }
            else{
                System.out.println("Paciente numero "+i+": Sobrepeso grado 3");
            }

        }
    }

    public static double calcularImc(Pacientes pacientes){

        double peso=pacientes.getPeso();
        double altura=pacientes.getMetros();
        double imc=peso/(altura*altura);
        return imc;
    }
    
    public static int[] pacientsPerSexe(ArrayList<Pacientes> pacientes){
            
        int array[]=new int[2];
        int contM=0;
        int contF=0;
    
        for(int i=0;i<pacientes.size();i++){
    
            if(pacientes.get(i).getSexo()=='M'){
                    contM++;
            }
            else{
                contF++;
            }
        }
        array[0]=contM;
        array[1]=contF;
    
        return array;
    }
    
    public static int[] majorMenor(ArrayList<Pacientes> pacientes){
    
        int array[]=new int[2];
        int max=0;
        int min=100;
    
        for(int i=0;i<pacientes.size();i++){
    
            if(2021-pacientes.get(i).getAnyo()>max){
                   max=2021-pacientes.get(i).getAnyo();
            }
            if(2021-pacientes.get(i).getAnyo()<min){
                min=2021-pacientes.get(i).getAnyo();
            }
    
        }
    
        array[0]=min;
        array[1]=max;
    
        return array;
    }
    
    public static ArrayList<Pacientes> crearPacientes(){
    
        ArrayList <Pacientes> pacientes=new ArrayList<Pacientes>();
    
        Pacientes paciente1=new Pacientes();
        Pacientes paciente2=new Pacientes(2,"Angel",14,05,1999,'M',1.70,100);
        Pacientes paciente3=new Pacientes(3,"Ainoa",25,10,1995,'F',1.60,60);
            
        pacientes.add(paciente1);
        pacientes.add(paciente2);
        pacientes.add(paciente3);
        return pacientes;
    }
}


