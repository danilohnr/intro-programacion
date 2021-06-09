package ciclos;

import java.util.Scanner;

public class OtraDemoCicloWhile {

	public static void main(String[] args) {
		System.out.println("Segundo ciclo While, ciclo centinela");
		Scanner sc = new Scanner(System.in);
		String SioNo = "Si";
		int num1 = 0;
		while(true) {
			//(int) convierte a entero el valor real generado por random()
			num1 = (int)(Math.random() * 11);
			System.out.println("num1 = " + num1);
			System.out.println("Ingrese Si para continuar o No para salir");
			SioNo = sc.next();
			if(SioNo.equalsIgnoreCase("No")) {
				break;
			}
		}
		System.out.println("La sentencia break lo ha sacado del ciclo while(true)");
	}
}

