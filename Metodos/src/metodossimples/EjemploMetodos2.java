package metodossimples;
import static java.lang.Math.*;
public class EjemploMetodos2 {
	//Método no estático que devuelve o retorna valor
	//, y no recibe parámetros de entrada (argumentos)
	public String imprimirOtraCosa() {
		if (random() > 0.5) {
			return "Dentro del if";
		}
		return "Desde el final del segundo método";
	}
	public static void main(String[] args) {
		//Para los métodos no estáticos se debe crear un objeto
		//para poder llamarlos o invocarlos
		EjemploMetodos2 ej = new EjemploMetodos2();
		ej.imprimirOtraCosa();
		//Para recibir algo de un método que devuelve algo se va a guardar
		//en una variable el valor retornado
		String cadena = ej.imprimirOtraCosa();
		System.out.println("El método que devuelve una cadena, retornó: " + cadena);
		//También podemos invocar un método que devuelve algo
		//desde otro método, por ejemplo, println()
		System.out.println(ej.imprimirOtraCosa());
	}
}

