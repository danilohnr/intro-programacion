package metodossimples;
import static java.lang.Math.*;
public class EjemploMetodos2 {
	//M�todo no est�tico que devuelve o retorna valor
	//, y no recibe par�metros de entrada (argumentos)
	public String imprimirOtraCosa() {
		if (random() > 0.5) {
			return "Dentro del if";
		}
		return "Desde el final del segundo m�todo";
	}
	public static void main(String[] args) {
		//Para los m�todos no est�ticos se debe crear un objeto
		//para poder llamarlos o invocarlos
		EjemploMetodos2 ej = new EjemploMetodos2();
		ej.imprimirOtraCosa();
		//Para recibir algo de un m�todo que devuelve algo se va a guardar
		//en una variable el valor retornado
		String cadena = ej.imprimirOtraCosa();
		System.out.println("El m�todo que devuelve una cadena, retorn�: " + cadena);
		//Tambi�n podemos invocar un m�todo que devuelve algo
		//desde otro m�todo, por ejemplo, println()
		System.out.println(ej.imprimirOtraCosa());
	}
}

