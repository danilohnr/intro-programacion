package tareas;

public class Tarea_03 {

	public static void main(String[] args) {
		double F = 32, C = 32, respuesta = 0.0;
		
		respuesta = (F - 32)*(5.0/9.0);
		System.out.println(F + " grados Fahrenheit = " + respuesta + " grados Celcius");
		
		respuesta = ((C * (9.0/5.0)) + 32);
		System.out.println(F + " grados Celcius = " + respuesta + " grados Fahrenheit");
	}
}
