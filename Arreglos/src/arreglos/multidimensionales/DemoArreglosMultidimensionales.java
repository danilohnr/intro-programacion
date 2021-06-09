package arreglos.multidimensionales;

public class DemoArreglosMultidimensionales {
	//Método que muestra contenido de un arreglo
	//Como parámetro de entrada necesita un arreglo multidimensional
	public static void mostrarArreglo2D(int[][] iaa){
		System.out.println("El arreglo contiene: ");
		//Itera sobre el arreglo superior (más grande)
		for (int i = 0; i < iaa.length; i++) {	//Va a tomar arreglos individuales de int
			//Imprime el número de elementos del arreglo de int que va a mostrar luego
			System.out.print(iaa[i].length + " elementos: ");
			//Itera sobre el subarreglo para mostrar los int individuales
			for (int j = 0; j < iaa[i].length; j++) {
				System.out.print(" " + iaa[i][j]);	//Elementos int individuales
			}
			System.out.println();	//Muestra un salto de línea
		}
	}
	
	public static void main(String[] args) {
		//Declaración de un arreglo multidimensional inmediatamente inicializado (No rectangular)
		int[][] iaa1 = {
				{1, 3, 5, 7, 9},
				{2},
				{3, 2, 3, 4},
				{4, 2}
		};
		//Llamada al método mostrarArreglo2D()
		mostrarArreglo2D(iaa1);
	}
}

