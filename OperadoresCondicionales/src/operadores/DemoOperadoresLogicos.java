package operadores;

public class DemoOperadoresLogicos {

	public static void main(String[] args) {
		int a = 5, b = 10, c = 15, d = 0;
		System.out.println("a = " + a + " b = " + b + " c = " + c + " d = " + d);
		boolean respuesta = false;
		//Primer caso
		respuesta = (a == 5) && (b != 11) && (c >= d);
		System.out.println("Primer caso");
		System.out.println("respuesta = " + respuesta);
		//Segundo caso
		respuesta = (a == 5) && (b != 11) && !(c >= d);
		System.out.println("Segundo caso");
		System.out.println("respuesta = " + respuesta);
		//Tercer caso
		respuesta = (c > b) || (b < 11) && !(d == -2);
		System.out.println("Tercer caso");
		System.out.println("respuesta = " + respuesta);
		//Cuarto caso
		respuesta = ((a + b) == 20);
		System.out.println("Cuarto caso");
		System.out.println("respuesta = " + respuesta);
	}
}

