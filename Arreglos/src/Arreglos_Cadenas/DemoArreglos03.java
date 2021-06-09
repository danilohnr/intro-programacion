package Arreglos_Cadenas;

public class DemoArreglos03 {

	public static void main(String[] args) {
		int[] a = {2,4,6,8,10};
		for(int i = 0;i < 5; i++) {
			System.out.println("a["+i+"] = " + a[i]);
		}
		int[][] b = {
				{1,2,3,4},
				{3,6,9}
		};
		System.out.println("Tamaño de la fila 1 del arreglo b= " + b[0].length);
		System.out.println("Tamaño de la fila 2 del arreglo b= " + b[1].length);
	}
}

