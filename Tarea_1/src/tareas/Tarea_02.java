package tareas;

public class Tarea_02 {

	public static void main(String[] args) {
		
		double a = 10.0, b = 3.0, c = 14.0, respuesta = 0.0;
		boolean es_Verdadero = false;
		
		respuesta = a * b + (2 * b);
		System.out.println("Respuesta es igual a: " + respuesta);
		
		es_Verdadero = b < a || a > 14;
		System.out.println("b < a || a > 14 es igual a: " + es_Verdadero);
	}
}
