package cicloforeach;

import java.util.ArrayList;

public class DemoForEach {

	public static void main(String[] args) {
		//Declaraci�n e inicializaci�n de un ArrayList
		ArrayList balde = new ArrayList();
		//Agregamos al ArrayList unas cadenas
		//El m�todo .add() est� disponible dentro de ArrayList
		balde.add("Hola");
		balde.add("Hello");
		balde.add("Hi");
		
		for (Object obj : balde) {
			System.out.println("El objeto es " + obj);
		}
	}
}

