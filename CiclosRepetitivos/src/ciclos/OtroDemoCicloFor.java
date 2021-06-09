package ciclos;

public class OtroDemoCicloFor {

	public static void main(String[] args) {
		System.out.println("Segundo ciclo For, controlado con contador");
		int contador = 100;
		for(;contador >= 0;) {
			System.out.println("Contador = " + contador);
			contador = contador - 30;
		}
		System.out.println("Fin segundo ciclo For, controlado con contador");
	}
}

