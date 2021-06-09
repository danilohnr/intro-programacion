package operadores;

public class DemoSentenciasSwitch {

	public static void main(String[] args) {
		int a = 2;
		System.out.println("Sentencia antes de la primera sentencia switch");
		switch(a) {	//Comparando a con constantes en el bloque switch
			case 1:
				System.out.println("a tiene el valor 1");
				double d = 33.876, d2 = 44, d3 = 88.77;
				if(d > 40) {
					System.out.println("d > 40");
					if(d2 < d3) {	//if else anidado
						System.out.println("d2 < d3");
					} else {
						System.out.println("d2 > d3");
					}
				}
				break;
			case 2:
				System.out.println("a tiene el valor 2");
				break;
			case 3:
				System.out.println("a tiene el valor 3");
				break;
			default:
				System.out.println("a NO tiene los valores 1, 2 ni 3");
		}
		System.out.println("Sentencia después de la primera sentencia switch");
	}
}

