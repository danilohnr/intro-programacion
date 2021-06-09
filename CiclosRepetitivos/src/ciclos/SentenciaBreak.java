package ciclos;

public class SentenciaBreak {

	public static void main(String[] args) {
		for(int i = 10; i > 5; i--) {
			if(i == 7) {
				break;
			}
			System.out.println("i = " + i);
		}
	}
}

