package variablesdatos;

public class DemoVariablesTiposDatos {

	public static void main(String[] args) {
		// Este es un comentario de una sola línea.
		/*
		 * Comentario de múltiples líneas, debajo hay varias
		 * ubicaciones en memoria con nombre de diferentes tipos
		 * de datos primitivos.
		 * */
		int nota;	//Declaración de una variable de tipo de dato primitivo.
		
		nota = 10;	//10 es asignado a la ubicación en memoria llamada nota,
					//la cual es de tipo de dato primitivo int. A esto
					//también se le llama Inicialización
		//Ahora a imprimir algo en pantalla
		System.out.println("nota tiene el valor de: " + nota);
		
		double salario = 1250.99;	//Declaración e inicialización
		System.out.println("salario tiene el valor de: " + salario);

	}

}
