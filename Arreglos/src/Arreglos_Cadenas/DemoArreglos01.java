package Arreglos_Cadenas;

public class DemoArreglos01 {

	public static void main(String[] args) {
		//Diferentes formas de declarar un arreglo
		int []arreglo = {2,4,6,8,10};
		int[] otroArreglo = new int[10];
		int [] otroArregloEnteros = new int[] {1,3,5,7,9};
		System.out.println("====Valores de arreglo[]====");
		System.out.println(arreglo[0]);
		System.out.println(arreglo[2]);
		System.out.println(arreglo[4]);
		System.out.println("====Valores de otroArreglo[]====");
		System.out.println(otroArreglo[2]);
		System.out.println(otroArreglo[5]);
		System.out.println(otroArreglo[9]);
		System.out.println("====Valores de otroArregloEnteros[]====");
		System.out.println(otroArregloEnteros[0]);
		System.out.println(otroArregloEnteros[1]);
		System.out.println(otroArregloEnteros[2]);
		System.out.println(otroArregloEnteros[8]);
	}
}

