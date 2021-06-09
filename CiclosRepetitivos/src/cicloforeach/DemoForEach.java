package cicloforeach;

import java.util.ArrayList;

public class DemoForEach {

	public static void main(String[] args) {
		//Declaración e inicialización de un ArrayList
		ArrayList balde = new ArrayList();
		//Agregamos al ArrayList unas cadenas
		//El método .add() está disponible dentro de ArrayList
		balde.add("Hola");
		balde.add("Hello");
		balde.add("Hi");
		
		for (Object obj : balde) {
			System.out.println("El objeto es " + obj);
		}
	}
}

