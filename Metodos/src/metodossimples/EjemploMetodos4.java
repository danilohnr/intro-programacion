package metodossimples;

public class EjemploMetodos4 {
	//Método de tipo static.
	//No devuelve valor.
	//No recibe parámetros de entrada
	public static void MostrarAlgoEstatico() {
		System.out.println("Método estático");
	}
	public static void main(String[] args) {
		//Los métodos estáticos no necesitan ser acompañados
		//de la clase a la que pertenecen ni de la creación de un objeto
		//Son llamados directamente por su nombre
		MostrarAlgoEstatico();
	}
}

