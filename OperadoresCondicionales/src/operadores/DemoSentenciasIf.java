package operadores;

public class DemoSentenciasIf {

	public static void main(String[] args) {
		int a = 10, b = 3, respuesta = 0;
		System.out.println("****Sentencias if****");
		System.out.println("Sentencia antes de la primera sentencia if");
		if(a == 10) {
			System.out.println("Dentro del bloque if(a == 10)");
			System.out.println("a = 10");
		}
		System.out.println("Sentencia después de la primera sentencia if");
		System.out.println("b = " + b);
		b++;
		System.out.println("b = " + b);
		respuesta = a + b;
		if(respuesta <= 13) {
			System.out.println("Dentro del bloque if(respuesta <= 13)");
			System.out.println("respuesta no es menor o igual a 13");
		} else {
			System.out.println("Dentro del bloque else de (respuesta <= 13)");
			System.out.println("respuesta no es menor o igual a 13");
			System.out.println("respuesta = " + respuesta);
		}
		System.out.println("Sentencia después de la sentencia if/else");
	}
}

