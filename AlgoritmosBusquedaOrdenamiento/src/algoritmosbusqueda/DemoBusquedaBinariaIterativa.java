package algoritmosbusqueda;
import static java.lang.Math.*;
public class DemoBusquedaBinariaIterativa {
	
	public int busquedaBinariaIterativa(int A[], int n, int buscado) {
		int indiceIzq = 0;
		int indiceDer = n - 1;		
		while (indiceIzq <= indiceDer) {
			int indiceMedio = round((indiceIzq + indiceDer) / 2);
			if (A[indiceMedio] == buscado) {
				return indiceMedio;
			} else if (A[indiceMedio] > buscado) {
				indiceDer = indiceMedio - 1;
			} else if (A[indiceMedio] < buscado) {
				indiceIzq = indiceMedio + 1;
			}			
		}
		return -1;
	}
	public static void main(String[] args) {
		DemoBusquedaBinariaIterativa obj = new DemoBusquedaBinariaIterativa();
		
		int A[] = {15, 21, 47, 84, 96};
		
		int buscado = 100;
		
		int hallado = obj.busquedaBinariaIterativa(A, A.length, buscado);
		
		if (hallado != -1) {
			System.out.println("El valor " + buscado + " fue encontrado en la posición " + hallado);
		} else {
			System.out.println("El valor " + buscado + " no fue encontrado");
		}
	}
}

