package clasescanner;

import java.util.Scanner;

public class PiesPulgadas {
	static Scanner lector = new Scanner(System.in);
	public static void main(String[] args) {		
		int pies;
		int pulgadas;
		System.out.println("Ingrese los valores de pies y pulgadas: ");
		
		pies = lector.nextInt();
		pulgadas = lector.nextInt();
		
		System.out.println("pies = " + pies);
		System.out.println("pulgadas = " + pulgadas);
	}
}

