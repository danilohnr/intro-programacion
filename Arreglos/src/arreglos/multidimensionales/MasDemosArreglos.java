package arreglos.multidimensionales;

public class MasDemosArreglos {
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
		//Inicializaci�n de tipo iteraci�n
		int [][][] iaaa = new int[2][][];	//Creaci�n del arreglo de nivel superior de 2 elementos
		iaaa[0] = new int[3][];				//El primer elemento de ese arreglo, contiene 3 arreglos de int
		//Inicializaci�n de esos 3 arreglos 2D de int
		iaaa[0][0] = new int[] {1, 2, 3};	//Primer arreglo de int
		iaaa[0][1] = new int[] {1, 2};		//Segundo arreglo de int
		iaaa[0][2] = new int[] {1};			//Tercer arreglo de int
		//Llamada al m�todo mostrarArreglo2D()
		//Va a funcionar ya que los arreglos multidimensionales son arreglos de arreglos
		//Como par�metro de entrada tendr� el primer elemento del arreglo de nivel superior
		//El cual es un arreglo 2D
		mostrarArreglo2D(iaaa[1]);
	}
}

