package algoritmosordenamiento;

public class PorInsercion {
	
	public void ordenamientoPorInsercion(int A[], int n) {
		for (int i = 1; i < n; i++) {
			int valorC = A[i];
			int posicion = i;
			while ((posicion > 0) && (A[posicion - 1] > valorC)) {
				A[posicion] = A[posicion -1];
				posicion = posicion - 1;
			}
			A[posicion] = valorC;
		}
	}
	public void mostrarArreglo(int A[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		PorInsercion obj = new PorInsercion();
		
		int A[] = {3, 5, 8, 9, 5, 2};
		
		System.out.println("Arreglo original: ");
		
		obj.mostrarArreglo(A, A.length);
		
		obj.ordenamientoPorInsercion(A, A.length);
		
		System.out.println("Arreglo ordenado: ");
		
		obj.mostrarArreglo(A, A.length);
	}
}

