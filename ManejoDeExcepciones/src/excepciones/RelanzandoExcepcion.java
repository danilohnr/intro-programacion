package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RelanzandoExcepcion {
	static Scanner leer = new Scanner(System.in);
	
	public int obtenerNumero() throws InputMismatchException {
		int num;	
		try {
			System.out.print("Ingrese un número entero: ");
			num =  leer.nextInt();
			System.out.println();
			return num;
		} catch (InputMismatchException e) {
			throw e;
		}
	}
	
	public static void main(String[] args) {
		int numero;
		RelanzandoExcepcion obj = new RelanzandoExcepcion(); 
		try {
			numero = obj.obtenerNumero();
			System.out.println("Número = " + numero);
		} catch (InputMismatchException e) {
			System.out.println("Excepción: " + e.toString());
		}
	}
}

