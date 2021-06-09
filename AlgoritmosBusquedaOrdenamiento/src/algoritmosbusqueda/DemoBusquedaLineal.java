package algoritmosbusqueda;

public class DemoBusquedaLineal {
	
	public int busquedaLineal(int A[], int n, int buscado) {
		int indice = 0;
		while (indice < n) {
			if (A[indice] == buscado) {
				return indice;			
			}
			indice = indice + 1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		DemoBusquedaLineal obj = new DemoBusquedaLineal();
		
		int A[] = {84, 21, 47, 96, 15};
		
		int buscado = 100;
		
		int hallado = obj.busquedaLineal(A, A.length, buscado);
		
		if (hallado != -1) {
			System.out.println("El valor " + buscado + " fue encontrado en la posición " + hallado);
		} else {
			System.out.println("El valor " + buscado + " no fue encontrado");
		}	
		
	}
}

