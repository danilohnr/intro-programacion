package metodossimples;

public class EjemploMetodos4 {
	//M�todo de tipo static.
	//No devuelve valor.
	//No recibe par�metros de entrada
	public static void MostrarAlgoEstatico() {
		System.out.println("M�todo est�tico");
	}
	public static void main(String[] args) {
		//Los m�todos est�ticos no necesitan ser acompa�ados
		//de la clase a la que pertenecen ni de la creaci�n de un objeto
		//Son llamados directamente por su nombre
		MostrarAlgoEstatico();
	}
}

