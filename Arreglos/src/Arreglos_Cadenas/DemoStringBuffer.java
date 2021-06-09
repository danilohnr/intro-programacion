package Arreglos_Cadenas;

public class DemoStringBuffer {

	public static void main(String[] args) {
		//Creación de una cadena con StringBuffer
		StringBuffer str = new StringBuffer("Hola mundo!");
		//Uso del método .append() para concatenar
		str.append(" Bienvenido a programación!");
		System.out.println(str);	//Hola mundo! Bienvenido a programación!
		//Uso del método .insert() para insertar contenido nuevo
		str.insert(0, '¡');
		System.out.println(str);    //¡Hola mundo! Bienvenido a programación!
		//Creación de una cadena con StringBuffer
		StringBuffer cad = new StringBuffer("Hola mundo!");
		
		//Uso del método .replace() para reemplazar contenido
		cad.replace(0,2,"hOL");
		System.out.println(cad);	//hOLla mundo!
		//Uso del método .delete() para eliminar contenido
		cad.delete(0,1);
		System.out.println(cad);	//OLla mundo!
		
		//Creación de una cadena con StringBuffer
		StringBuffer cadena = new StringBuffer("Universidad");
		//Uso del método .reverse() para invertir contenido
		System.out.println(cadena.reverse());   //dadisrevinU
		//Uso del método .capacity() para medir la capacidad del StringBuffer
		//La cantidad de almacenamiento disponible para los caracteres recién insertados
		System.out.println(cadena.capacity());  //27 -> 16 (declaración) + 11 (Universidad)
	}
}

