import java.util.Scanner;
public class Ejer7 {
    
    public static void main (String args[]){

        Scanner lector=new Scanner(System.in);

        double cuota=500;
        int comprobante1;
        int comprobante2;
        double total1;
        double total2;
        double dcincuenta=(cuota/100)*50;
        double dveinticinco=(cuota/100)*25;
        double dtreintaycinco=(cuota/100)*35;

        System.out.println("Bienvenido al club de golf, miarma");
        System.out.println("La cuota son 500€");
        System.out.println("Tenemos descuentos para mayores de 65 años y menores de edad");
        System.out.println("Perteneces a algun grupo de estos?");
        System.out.println("(1) Mayor de 65 años");
        System.out.println("(2) Menor de edad");

        comprobante1=lector.nextInt();

        if(comprobante1==1){
            total1=cuota-dcincuenta;
            System.out.println("Aplicando el descuento para mayores de 65 años, la cuota se te queda en: "+total1);
        }
        else if (comprobante1==2){
            System.out.println("Tus padres son socios?");
            System.out.println("(1) Si");
            System.out.println("(2) No");
            comprobante2=lector.nextInt();

            if(comprobante2==1){
                total1=cuota-dtreintaycinco;
                System.out.println("Aplicando el descuento para menors de edad con padres socios, la cuota se te queda en: "+total1);
            }
            else if(comprobante2==2){
                total2=cuota-dveinticinco;
                System.out.println("Aplicando el descuento para menors de edad sin padres socios, la cuota se te queda en: "+total2);
            }

        }
        else{
            System.out.println("Dato incorrcto");
        }



    }
}
