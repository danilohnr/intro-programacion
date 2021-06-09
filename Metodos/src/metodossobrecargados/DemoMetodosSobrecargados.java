package metodossobrecargados;

public class DemoMetodosSobrecargados {
	
	public void hacerAlgo() {
		System.out.println("M�todo sobrecargado sin argumentos!");
	}
	public void hacerAlgo(String s) {
		System.out.println("M�todo sobrecargado con argumento String = " + s);
	}
	public int hacerAlgo(int i) {
		System.out.println("M�todo sobrecargado con argumento int = " + i);
		return i * 2;
	}
	/*public float hacerAlgo(int i) {
		System.out.println("M�todo sobrecargado con argumento int = " + i);
		return i * 2;
	}*/
	/*
	 * public void hacerAlgo(String t) {
	 * System.out.println("Esto no va a funcionar!"); }
	 */
	public static void main(String[] args) {
		//Como son m�todos no est�ticos se debe crear un objeto (instancia)
		DemoMetodosSobrecargados obj = new DemoMetodosSobrecargados();
		
		obj.hacerAlgo();
		obj.hacerAlgo("Hola");
		int x = obj.hacerAlgo(10);
		/*float y = obj.hacerAlgo(10);*/
	}
}

