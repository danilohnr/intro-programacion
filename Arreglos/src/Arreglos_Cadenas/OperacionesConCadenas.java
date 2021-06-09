package Arreglos_Cadenas;

public class OperacionesConCadenas {

	public static void main(String[] args) {		
		String str = "Introducción a la programación";
		System.out.println("str = " + str);
		System.out.println("Tamaño de la str = " + str.length());
		System.out.println("Contenido de str a partir del caracter 18 = " + str.substring(18));
		System.out.println("str está vacía? -> " + str.isEmpty());
		System.out.println("str en minúsculas = " + str.toLowerCase());
		System.out.println("str en mayúsculas = " + str.toUpperCase());
		String cad = "Introduccion a la programacion";
		//str1 - cad -> Según UNICODE -> o = 111 y ó = 243
		System.out.println("str = " + str);
		System.out.println("cad = " + cad);
		System.out.println("Diferencia lexicográfica entre str y cad = " + str.compareTo(cad));
		int a = 50;
		System.out.println("a = " + a);
		String entero = String.valueOf(a);
		System.out.println("a convertido a cadena = " + entero);
		String reemplazo = cad.replace('o','ó');
		System.out.println("cad con la letra o reemplazada por ó = " + reemplazo);
		System.out.println("Nueva cad contiene la letra e? -> " + reemplazo.contains("e"));
		System.out.println("str es igual a Nueva cad? -> " + str.equals(reemplazo));
		System.out.println("¿Qué hay en str en la posición 18? -> " + str.charAt(18));
		System.out.println("¿str termina con la letra n? -> " + str.endsWith("n"));
	}
}

