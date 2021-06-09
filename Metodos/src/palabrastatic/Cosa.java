package palabrastatic;
public class Cosa {
	//Miembros de la clase
	private int x;		//No static
	private static int y;
	//main es un m�todo static
	public static void main(String[] args) {
		y = 99;		//Valor de y asociado a la clase Cosa
		System.out.println("y = " + y);
		//Creaci�n de instancias de Cosa
		Cosa c1 = new Cosa();
		Cosa c2 = new Cosa();
		System.out.println("=======Instancias de Cosa=======");
		System.out.println("c1.y = " + c1.y);
		System.out.println("c2.y = " + c2.y);
		//Asignaci�n de valores de x
		c1.x = 100;
		c2.x = 200;
		System.out.println("=======Instancias de Cosa=======");
		System.out.println("c1.x = " + c1.x);
		System.out.println("c2.x = " + c2.x);
		System.out.println("=======M�todo static mostrarY()=======");
		mostrarY();		//Invocaci�n o llamada al m�todo
		System.out.println("=======M�todo no static mostrarX()=======");
		c1.mostrarX();//Invocaci�n o llamada al m�todo
		c2.mostrarX();//Invocaci�n o llamada al m�todo
		System.out.println("=======M�todo static sobrecargado mostrarX(Cosa objeto)=======");
		mostrarX(c1);
		mostrarX(c2);		
	}
	//M�todo static sobrecargado
	static void mostrarX(Cosa objeto) {
		System.out.println("objeto.x = " + objeto.x);
	}
	//M�todo no static
	void mostrarX() {
		System.out.println("x = " + x);
		System.out.println("This.x = " + this.x);
		//System.out.println("Cosa.x = " + Cosa.x);
		System.out.println("y = " + y);
		System.out.println("Cosa.y = " + Cosa.y);
		System.out.println("This.y = " + this.y);		
	}
	//M�todo static
	static void mostrarY() {
		System.out.println("y = " + y);
		System.out.println("Cosa.y = " + Cosa.y);
		//System.out.println("This.y = " + this.y);
		//System.out.println("x = " + x);
		//System.out.println("This.x = " + this.x);
	}
}

