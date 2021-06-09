package POOMetodos;

public class LlamadaPorValor {
	
	int dato = 50;
	int operar(int dato) {
		dato = dato*2/6;
		return dato;
	}
	
	public static void main(String[] args) {
		LlamadaPorValor a = new LlamadaPorValor();
		System.out.println("Antes de operar() el valor de dato = " + a.dato);
		a.operar(500);
		System.out.println("Después de operar() el valor de dato = " + a.dato);
	}
}

