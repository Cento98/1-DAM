import java.util.*;
public class Ejer9 {

    ArrayList <String> indice=new ArrayList<String>();

    public ArrayList <String> getIndice()
    {
		return this.indice;
	}

    public void setIndice(ArrayList <String> indice)
    {
		this.indice = indice;
	}

    public void main (String[] args){

        
        
        Scanner lector=new Scanner (System.in);
        HashMap <String, String> map=new HashMap <String, String>();
        HashMap <String, Integer> puntuaciones=new HashMap <String, Integer>();
   
        int elec;
        do{
            menu();
            elec=lector.nextInt();
            
            switch(elec){
                case 0:
                    System.out.println("Saliendo del programa...");
                break;

                case 1:
                    map=anyadirPalabra(map);
                break;

                case 2:
                    map=modificarPalabra(map);
                break;

                case 3:
                    map=eliminarPalabra(map);
                break;

                case 4:
                    consultarPalabra(map);
                break;

                case 5:
                    System.out.println(map);
                break;

                case 6:
                    puntuaciones=jugar(map, puntuaciones);
                break;

                case 7:
                    System.out.println(puntuaciones);
                break;

                default:
                    System.out.println("Entrada erronea");
                break;
            }
        }
        while(elec!=0);
        
    }

    public  HashMap <String, Integer> jugar(HashMap <String, String> map, HashMap <String, Integer> puntuaciones){

        Scanner lector=new Scanner (System.in);
        Random random=new Random();

        int tope=indice.size()-1;
        int aleatorio;
        int puntu=0;
        String nombre;
        boolean compro=false;
        String palabra;
        String key;

        do{
            System.out.println("Escribe tu nombre");
            nombre=lector.nextLine();
            aleatorio=random.nextInt(tope);
            key=indice.get(aleatorio);
            System.out.println(map.get(key));
            palabra=lector.nextLine();

            if(palabra.equals(key)){
                System.out.println("enhorabuena, has ganado un punto");
                puntu++;
            }
            else{
                System.out.println("Error, has perdido");
                System.out.println("Puntuacion obtenido: "+puntu);
                compro=true;
            }
        }
        while(compro==false);

        puntuaciones.put(nombre, puntu);

        return puntuaciones;
    }

    public void consultarPalabra(HashMap <String, String> map){

        Scanner lector=new Scanner (System.in);

        String palabra;
        boolean compro;
        do{
            System.out.println("Introduce la palabra que quieres consultar");
            palabra=lector.nextLine();
            compro=map.containsKey(palabra);
            if(compro==false){
                System.out.println("Palabra no encontrada.");
            }
        }
        while(compro=false);
        System.out.println(map.get(palabra)); 
    }

    public HashMap <String, String> eliminarPalabra(HashMap <String, String> map){

        Scanner lector=new Scanner (System.in);

        String palabra;
        boolean compro;
        do{
            System.out.println("Introduce la palabra que quieres eliminar o escriba Salir para salir ");
            palabra=lector.nextLine();
            compro=map.containsKey(palabra);
            if(compro==false){
                System.out.println("Palabra no encontrada.");
            }
        }
        while(compro=false || palabra.equals("Salir"));

        map.remove(palabra);
        
        
        return map;
    }

    public HashMap <String, String> modificarPalabra(HashMap <String, String> map){

        Scanner lector=new Scanner (System.in);

        String palabra;
        boolean compro;
        do{
            System.out.println("Introduce la palabra que quieres modificar o escriba Salir para salir ");
            palabra=lector.nextLine();
            compro=map.containsKey(palabra);
            if(compro==false){
                System.out.println("Palabra no encontrada.");
            }
        }
        while(compro=false || palabra.equals("Salir"));

        map.remove(palabra);

        map=anyadirPalabra(map);

        return map;
    }

    public HashMap <String, String> anyadirPalabra(HashMap <String, String> map){

        Scanner lector=new Scanner (System.in);

        String palabra;
        String definicion;
        System.out.println("Introduce la palabra que quieras anyadir");
        palabra=lector.nextLine();
        lector.nextLine();
        System.out.println("Introduce la definicion de la palabra");
        definicion=lector.nextLine();
        lector.nextLine();

        indice.add(palabra);
        map.put(palabra, definicion);

        return map;
    }

    public void menu(){
        System.out.println("*********************");
        System.out.println("*GESTION DICCIONARIO*");
        System.out.println("*********************");
        System.out.println("1. Añadir Palabra");
        System.out.println("2. Modificar Palabra");
        System.out.println("3. Eliminar Palabra");
        System.out.println("4. Consultar Palabra");
        System.out.println("5. Mostrar Diccionario");
        System.out.println("6. Jugar");
        System.out.println("7. Mostrar puntuaciones");
        System.out.println("----------------------");
        System.out.println("0. Salir");
    }
}
