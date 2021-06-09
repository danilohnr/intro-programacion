package Arreglos_Cadenas;

public class DemoArreglos02 {

	public static void main(String[] args) {
		//Arreglo de 2 x 2
		int[][] matrizA = {
				{1,2},
				{3,4}
		};
		//Arreglo de 3 x 2
		int[][] matrizB = {
				{5,6},
				{7,8},
				{9,10}
		};
		System.out.println("Tamaño de matrizA = " + matrizA.length);
		System.out.println("Tamaño de matrizB = " + matrizB.length);
		System.out.println("Tamaño del primer arreglo dentro de matrizA = " + matrizA[0].length);
		System.out.println("Tamaño del primer arreglo dentro de matrizB = " + matrizB[0].length);
	}
}

