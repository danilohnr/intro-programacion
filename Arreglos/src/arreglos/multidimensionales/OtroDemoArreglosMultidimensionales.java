package arreglos.multidimensionales;

public class OtroDemoArreglosMultidimensionales {
	//M�todo que muestra contenido de un arreglo
	//Como par�metro de entrada necesita un arreglo multidimensional
	public static void mostrarArreglo2D(int[][] iaa){
		System.out.println("El arreglo contiene: ");
		//Itera sobre el arreglo superior (m�s grande)
		for (int i = 0; i < iaa.length; i++) {	//Va a tomar arreglos individuales de int
			//Imprime el n�mero de elementos del arreglo de int que va a mostrar luego
			System.out.print(iaa[i].length + " elementos: ");
			//Itera sobre el subarreglo para mostrar los int individuales
			for (int j = 0; j < iaa[i].length; j++) {
				System.out.print(" " + iaa[i][j]);	//Elementos int individuales
			}
			System.out.println();	//Muestra un salto de l�nea
		}
	}
	
	public static void main(String[] args) {
		//Llamada al m�todo mostrarArreglo2D()
		//Con un arreglo reci�n creado como par�matro de entrada
		mostrarArreglo2D(new int[][] {
			{1, 2, 3},
			{2, 3, 4}
		});
	}
}

