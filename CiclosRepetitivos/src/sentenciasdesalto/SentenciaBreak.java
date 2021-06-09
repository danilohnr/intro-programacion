package sentenciasdesalto;

public class SentenciaBreak {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			if(Math.random() > 0.5) {
				System.out.println("Ni modo, tengo que salir de aquí!");
				break;
			}			
			System.out.println("Volvamos a hacerlo para el siguiente número!");
		}
		System.out.println("Ciclo finalizado. Cuántas veces contamos?");
	}
}

