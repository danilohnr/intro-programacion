package clasescanner;

import java.util.Scanner;

public class InfoUsuario {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		System.out.print("Año de nacimiento = ");
		int anioNacimiento = lector.nextInt();
		lector.nextLine();	//Para manejar el caracter de siguiente línea (Enter)
		System.out.print("Nombre= ");
		String nombre = lector.nextLine();
		
		int edad = 2021 - anioNacimiento;
		
		System.out.println(nombre + " tu edad es de " + edad + " años.");
		
		lector.close();
	}
}

