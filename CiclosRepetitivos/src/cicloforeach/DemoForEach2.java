package cicloforeach;

import java.util.ArrayList;

public class DemoForEach2 {

	public static void main(String[] args) {
		//Declaraci�n de una colecci�n gen�rica de String
		//Es un ArreyList de cadenas
		ArrayList<String> baldeString = new ArrayList<>();
		String nombre = "Danilo";
		baldeString.add("Hola");
		baldeString.add("Hello");
		baldeString.add("Hi");
		baldeString.add(nombre);
		//Vamos a cambiar String por Object
		//El cual es un tipo m�s general de cadena
		for (Object cadena : baldeString) {
			System.out.println("La cadena es " + cadena);
		}
	}
}

