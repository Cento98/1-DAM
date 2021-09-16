package Ejer7;
import java.util.Scanner;
public class Main {
    
    public static void main (String[]args){

        Scanner lector=new Scanner (System.in);
        Pacientes[] nuevoPaci=new Pacientes[40];
        Pacientes[] pacienteAtendido=new Pacientes[39];
        int elec;
        
        do{
            do{
                menuPrincipal();
                elec=lector.nextInt();
                if(elec<0 || elec>4){
                    System.out.println("Entrada incorrecta");
                }
            }
            while(elec<0 || elec>4);
            
            switch(elec){
                
                case 0:
                    System.out.println("Saliendo del programa...");
                break;
    
                case 1:
                    nuevoPaciente(nuevoPaci);
                break;
    
                case 2:
                    pacienteAtendido=atenderPaciente(nuevoPaci, pacienteAtendido);
                break;
            }
        }
        while(elec!=0);

    }

    public static Pacientes[] atenderPaciente(Pacientes[] nuevoPaci, Pacientes[] pacienteAtendido){

        int contador=40;
        for(int i=0;i<pacienteAtendido.length;i++){
            if(pacienteAtendido[i]!=null){
                contador--;
            }
        }

        if(contador==0){
            System.out.println("Lo siento, no se pueden atender a mas pacientes");
        }
        else{
            for(int i=0;i<nuevoPaci.length;i++){
                if(nuevoPaci[i]!=null){
                    nuevoPaci[i].imprimirNuevo();
                }
            }
            System.out.println("Que paciente quiere atender?");

        }

        return pacienteAtendido;
    }

    public static Pacientes[] nuevoPaciente(Pacientes[] nuevoPaci){

        Scanner lector=new Scanner (System.in);
        Pacientes paciente=new Pacientes();

        System.out.println("SIP del paciente");
        paciente.setSip(lector.nextInt());

        System.out.println("Nombre del paciente");
        paciente.setNombre(lector.nextLine());
        lector.nextLine();

        System.out.println("Edad del paciente");
        paciente.setEdad(lector.nextInt());

        System.out.println("Sexo del paciente");
        paciente.setSexo(lector.nextLine());
        lector.nextLine();

        System.out.println("Fecha de entrada");
        paciente.setFecha(lector.nextLine());

        System.out.println("Hora de la entrada");
        paciente.setHora(lector.nextInt());

        System.out.println("Minutos de la entrada");
        paciente.setMinutos(lector.nextInt());

        System.out.println("Sintomas del paciente");
        paciente.setSintomas(lector.nextLine());
        lector.nextLine();

        for(int i=0;i<nuevoPaci.length;i++){
            if(nuevoPaci[i]!=null){
                nuevoPaci[i]=paciente;
                break;
            }
        }

        return nuevoPaci;
    }


    public static void menuPrincipal(){

        System.out.println("*************");
        System.out.println("**URGENCIAS**");
        System.out.println("*************");
        System.out.println("(1). Nuevo paciente...");
        System.out.println("(2). Atender paciente...");
        System.out.println("(3). Consultas...");
        System.out.println("(4). Alta medica...");
        System.out.println("----------------------------");
        System.out.println("(0). Salir...");

    }
}
