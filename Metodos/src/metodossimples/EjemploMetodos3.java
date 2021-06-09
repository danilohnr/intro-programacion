package metodossimples;

public class EjemploMetodos3 {
	//M�todo no est�tico que no devuelve o retorna valor
	//Tiene una lista de argumentos o par�metros de entrada
	public void ImprimirArgumentosSimples(String s, int y) {
		System.out.println("La cadena es " + s);
		System.out.println("El entero es " + y);
	}
	public static void main(String[] args) {
		//Para los m�todos no est�ticos se debe crear un objeto
		//para poder llamarlos o invocarlos
		EjemploMetodos3 ej = new EjemploMetodos3();
		//Al momento de llamar al m�todo se le debe agregar
		//los valores de los argumentos
		ej.ImprimirArgumentosSimples("Danilo", 36);
	}
}

