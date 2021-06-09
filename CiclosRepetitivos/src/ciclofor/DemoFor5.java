package ciclofor;

public class DemoFor5 {

	public static void main(String[] args) {
		int t;
		int a = 0;
		int b = 0;
		int c = 0;
		for(t = (int)(Math.random() * 10.0);a < 5;a++, b += 10, saludar()) {
			System.out.println(":D");
		}
	}
	public static void saludar() {
		System.out.println("Hola!");
	}
}

