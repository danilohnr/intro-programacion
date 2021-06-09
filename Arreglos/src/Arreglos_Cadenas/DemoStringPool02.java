package Arreglos_Cadenas;

public class DemoStringPool02 {

	public static void main(String[] args) {
		String str1 = "Hola";
		System.out.println("Cadena original = " + str1);
		
		str1 = str1.concat(" ¿Cómo estás?");
		System.out.println("Después de la concatenación la cadena es " + str1);
	}
}

