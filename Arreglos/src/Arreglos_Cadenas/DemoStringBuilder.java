package Arreglos_Cadenas;

public class DemoStringBuilder {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Hola mundo!");
		str.append(" Bienvenido!");
		System.out.println(str);
		
		System.out.println(str.delete(0,2));
		
		System.out.println(str.insert(0, "Programando "));
		
		System.out.println(str.reverse());
	}
}

