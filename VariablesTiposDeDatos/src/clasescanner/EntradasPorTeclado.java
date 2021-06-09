package clasescanner;

import java.util.Scanner;

public class EntradasPorTeclado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un número entero: ");
		int i = sc.nextInt();		
		System.out.println(i);
		System.out.print("Ingrese un número real: ");
		float f = sc.nextFloat();
		System.out.println(f);
		System.out.print("Ingrese otro número real: ");
		double d = sc.nextDouble();
		System.out.println(d);
		System.out.print("Ingrese su género (M/F): ");
		char c = sc.next().charAt(0);
		System.out.println(c);
		System.out.print("Ingrese su primer nombre: ");
		String n = sc.nextLine();
		System.out.println(n);
		sc.nextLine();	//Para manejar el caracter de siguiente línea (Enter)
		System.out.print("Ingrese su nombre completo: ");
		String nc = sc.nextLine();
		System.out.println(nc);		
		System.out.print("Ingrese su número de cédula: ");
		String id = sc.nextLine();
		System.out.println(id);
		sc.close();
	}

}
