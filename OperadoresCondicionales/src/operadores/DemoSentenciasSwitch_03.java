package operadores;

public class DemoSentenciasSwitch_03 {

	public static void main(String[] args) {
		String nombre = "Danilo";
		System.out.println("Sentencia antes de la primera sentencia switch");
		switch(nombre) {	//Comparando nombre con constantes en el bloque switch
			case "Luis":
				System.out.println("nombre tiene el valor Luis");				
				break;
			case "Juan":
				System.out.println("nombre tiene el valor Juan");				
				break;
			case "Danilo":
				System.out.println("nombre tiene el valor Danilo");				
				break;
		}
		System.out.println("Sentencia después de la primera sentencia switch");
	}
}

