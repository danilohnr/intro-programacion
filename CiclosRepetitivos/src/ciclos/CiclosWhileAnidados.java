package ciclos;

public class CiclosWhileAnidados {

	public static void main(String[] args) {
		System.out.println("Este es un ciclo while anidado");
		int contadorFilas = 0;
		int contadorColumnas = 0;
		while(contadorFilas < 2) {
			while(contadorColumnas < 3) {
				//Notar el uso y efecto de print()
				System.out.print(contadorColumnas + " ");
				contadorColumnas++;
			}
			System.out.println();
			contadorColumnas = 0;	//Reinicia el conteo de columnas
			contadorFilas++;
		}
	}
}

