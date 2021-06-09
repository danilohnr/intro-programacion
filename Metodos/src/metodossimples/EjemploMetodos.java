package metodossimples;
import static java.lang.Math.*;
public class EjemploMetodos {
	//Método no estático que no devuelve o retorna valor
	//, y no recibe parámetros de entrada (argumentos)
	public void imprimirAlgo() {
		if (random() > 0.5) {
			System.out.println("Número muy grande!");
			return;
		} else {
			System.out.println("Número muy pequeño!");
		}
		System.out.println("Desde el final del primer método!");
	}
	
	public static void main(String[] args) {
		//Para los métodos no estáticos se debe crear un objeto
		//para poder llamarlos o invocarlos
		EjemploMetodos ej = new EjemploMetodos();
		ej.imprimirAlgo();
	
	}
}

