package Arreglos_Cadenas;

public class DemoStringPool02 {

	public static void main(String[] args) {
		String str1 = "Hola";
		System.out.println("Cadena original = " + str1);
		
		str1 = str1.concat(" �C�mo est�s?");
		System.out.println("Despu�s de la concatenaci�n la cadena es " + str1);
	}
}

