package algoritmosordenamiento;
import static java.lang.Math.*;
public class PorMezcla {
	
	public void OrdenPorMezcla(int A[], int indiceIzq, int indiceDer) {
		if (indiceIzq < indiceDer) {
			int indiceMedio = round((indiceIzq + indiceDer) / 2);
			OrdenPorMezcla(A, indiceIzq, indiceMedio);
			OrdenPorMezcla(A, indiceMedio + 1, indiceDer);
			mezcla(A, indiceIzq, indiceMedio, indiceDer);
		}
	}
	public void mezcla(int A[], int indiceIzq, int indiceMedio, int indiceDer) {
		int i = indiceIzq;
		int j = indiceMedio + 1;
		int k = indiceIzq;
		int B[] = new int[indiceDer + 1];
		while((i <= indiceMedio) && (j <= indiceDer)) {
			if (A[i] < A[j]) {
				B[k] = A[i];
				i = i + 1;
			} else {
				B[k] = A[j];
				j = j + 1;
			}
			k = k + 1;
		}
		while (i <= indiceMedio) {
			B[k] = A[i];
			i = i + 1; k = k + 1;
		}
		while (j <= indiceDer) {
			B[k] = A[j];
			j = j + 1; k = k + 1;
		}
		for (int x = indiceIzq; x < indiceDer + 1; x++) {
			A[x] = B[x];
		}		
	}
	public void mostrarArreglo(int A[], int n) {
		for(int i = 0; i < n; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		PorMezcla obj = new PorMezcla();
		
		int A[] = {3, 5, 8, 9, 5, 2};
		
		System.out.println("Arreglo original: ");
		
		obj.mostrarArreglo(A, A.length);
		
		obj.OrdenPorMezcla(A, 0, A.length - 1);
		
		System.out.println("Arreglo ordenado: ");
		
		obj.mostrarArreglo(A, A.length);
	}
}

