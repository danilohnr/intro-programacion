package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemploExcepcion {
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) {
		int dividendo, divisor, cociente;
		try {
			System.out.print("Ingrese el dividendo: ");					
			dividendo = console.nextInt();
			System.out.println();
			System.out.print("Ingrese el divisor: ");
			divisor = console.nextInt();
			System.out.println();
			cociente = dividendo / divisor;
			System.out.println("Cociente = " + cociente);
		} catch (Exception e) {
			
			if (e instanceof ArithmeticException) {
				System.out.println(e.toString());
			} else if (e instanceof InputMismatchException) {				
				System.out.println(e.toString());
			}		
			
		}		
	}
}

