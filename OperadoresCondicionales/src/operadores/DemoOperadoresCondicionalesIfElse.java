package operadores;

public class DemoOperadoresCondicionalesIfElse {

	public static void main(String[] args) {
		int a = 10, b = 3;
		//Operadores condicionales
		System.out.println("****Operadores condicionales****");
		boolean prueba;
		
		prueba = a > b;
		System.out.println(a + " > " + b + " es " + prueba);
		prueba = b != 3;
		System.out.println(b + " es diferente de 3? es " + prueba);
		prueba = a <= 10;
		System.out.println(a + " <= 10? es " + prueba);
		prueba = !(b < a);
		System.out.println("!(b < a) es " + prueba);
	}
}

