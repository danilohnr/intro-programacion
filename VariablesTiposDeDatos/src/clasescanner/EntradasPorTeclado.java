package clasescanner;

import java.util.Scanner;

public class EntradasPorTeclado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un n�mero entero: ");
		int i = sc.nextInt();		
		System.out.println(i);
		System.out.print("Ingrese un n�mero real: ");
		float f = sc.nextFloat();
		System.out.println(f);
		System.out.print("Ingrese otro n�mero real: ");
		double d = sc.nextDouble();
		System.out.println(d);
		System.out.print("Ingrese su g�nero (M/F): ");
		char c = sc.next().charAt(0);
		System.out.println(c);
		System.out.print("Ingrese su primer nombre: ");
		String n = sc.nextLine();
		System.out.println(n);
		sc.nextLine();	//Para manejar el caracter de siguiente l�nea (Enter)
		System.out.print("Ingrese su nombre completo: ");
		String nc = sc.nextLine();
		System.out.println(nc);		
		System.out.print("Ingrese su n�mero de c�dula: ");
		String id = sc.nextLine();
		System.out.println(id);
		sc.close();
	}

}
