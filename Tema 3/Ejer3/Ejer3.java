public class Ejer3 {
	public static void main (String arg[]){
		System.out.println("Aplicando un 15% de descuento a 85%");
		float zapatos = 85f;
		float precioFinal = zapatos - (zapatos * 0.15f);
	
		System.out.println("El precio con el descuento aplicado es de " + precioFinal + "€");
	}
}