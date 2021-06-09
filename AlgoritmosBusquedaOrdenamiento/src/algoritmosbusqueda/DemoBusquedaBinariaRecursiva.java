package algoritmosbusqueda;
import static java.lang.Math.*;

public class DemoBusquedaBinariaRecursiva {

	public int BusquedaBinariaRecursiva(int A[], int buscado, int indiceIzq, int indiceDer) {
		if (indiceIzq > indiceDer) {
			return -1;
		} else {
			int indiceMedio = round((indiceIzq + indiceDer) / 2);
			if (A[indiceMedio] == buscado) {
				return indiceMedio;
			} else if (A[indiceMedio] > buscado) {
				return BusquedaBinariaRecursiva(A, buscado, indiceIzq, indiceMedio - 1);				
			} else if (A[indiceMedio] < buscado) {
				return BusquedaBinariaRecursiva(A, buscado, indiceMedio + 1, indiceDer);
			}			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		DemoBusquedaBinariaRecursiva obj = new DemoBusquedaBinariaRecursiva();
		
		int A[] = {15, 21, 47, 84, 96};
		
		int buscado = 100;
		
		int hallado = obj.BusquedaBinariaRecursiva(A, buscado, 0, A.length - 1);
		
		if (hallado != -1) {
			System.out.println("El valor " + buscado + " fue encontrado en la posición " + hallado);
		} else {
			System.out.println("El valor " + buscado + " no fue encontrado");
		}
	}
}

