package Arreglos_Cadenas;

public class OperacionesConCadenas {

	public static void main(String[] args) {		
		String str = "Introducci�n a la programaci�n";
		System.out.println("str = " + str);
		System.out.println("Tama�o de la str = " + str.length());
		System.out.println("Contenido de str a partir del caracter 18 = " + str.substring(18));
		System.out.println("str est� vac�a? -> " + str.isEmpty());
		System.out.println("str en min�sculas = " + str.toLowerCase());
		System.out.println("str en may�sculas = " + str.toUpperCase());
		String cad = "Introduccion a la programacion";
		//str1 - cad -> Seg�n UNICODE -> o = 111 y � = 243
		System.out.println("str = " + str);
		System.out.println("cad = " + cad);
		System.out.println("Diferencia lexicogr�fica entre str y cad = " + str.compareTo(cad));
		int a = 50;
		System.out.println("a = " + a);
		String entero = String.valueOf(a);
		System.out.println("a convertido a cadena = " + entero);
		String reemplazo = cad.replace('o','�');
		System.out.println("cad con la letra o reemplazada por � = " + reemplazo);
		System.out.println("Nueva cad contiene la letra e? -> " + reemplazo.contains("e"));
		System.out.println("str es igual a Nueva cad? -> " + str.equals(reemplazo));
		System.out.println("�Qu� hay en str en la posici�n 18? -> " + str.charAt(18));
		System.out.println("�str termina con la letra n? -> " + str.endsWith("n"));
	}
}

