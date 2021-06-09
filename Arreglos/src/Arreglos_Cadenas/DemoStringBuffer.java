package Arreglos_Cadenas;

public class DemoStringBuffer {

	public static void main(String[] args) {
		//Creaci�n de una cadena con StringBuffer
		StringBuffer str = new StringBuffer("Hola mundo!");
		//Uso del m�todo .append() para concatenar
		str.append(" Bienvenido a programaci�n!");
		System.out.println(str);	//Hola mundo! Bienvenido a programaci�n!
		//Uso del m�todo .insert() para insertar contenido nuevo
		str.insert(0, '�');
		System.out.println(str);    //�Hola mundo! Bienvenido a programaci�n!
		//Creaci�n de una cadena con StringBuffer
		StringBuffer cad = new StringBuffer("Hola mundo!");
		
		//Uso del m�todo .replace() para reemplazar contenido
		cad.replace(0,2,"hOL");
		System.out.println(cad);	//hOLla mundo!
		//Uso del m�todo .delete() para eliminar contenido
		cad.delete(0,1);
		System.out.println(cad);	//OLla mundo!
		
		//Creaci�n de una cadena con StringBuffer
		StringBuffer cadena = new StringBuffer("Universidad");
		//Uso del m�todo .reverse() para invertir contenido
		System.out.println(cadena.reverse());   //dadisrevinU
		//Uso del m�todo .capacity() para medir la capacidad del StringBuffer
		//La cantidad de almacenamiento disponible para los caracteres reci�n insertados
		System.out.println(cadena.capacity());  //27 -> 16 (declaraci�n) + 11 (Universidad)
	}
}

