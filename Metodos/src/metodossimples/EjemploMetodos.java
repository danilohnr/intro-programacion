package metodossimples;
import static java.lang.Math.*;
public class EjemploMetodos {
	//M�todo no est�tico que no devuelve o retorna valor
	//, y no recibe par�metros de entrada (argumentos)
	public void imprimirAlgo() {
		if (random() > 0.5) {
			System.out.println("N�mero muy grande!");
			return;
		} else {
			System.out.println("N�mero muy peque�o!");
		}
		System.out.println("Desde el final del primer m�todo!");
	}
	
	public static void main(String[] args) {
		//Para los m�todos no est�ticos se debe crear un objeto
		//para poder llamarlos o invocarlos
		EjemploMetodos ej = new EjemploMetodos();
		ej.imprimirAlgo();
	
	}
}

