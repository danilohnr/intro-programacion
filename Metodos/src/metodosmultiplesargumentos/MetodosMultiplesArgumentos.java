package metodosmultiplesargumentos;

public class MetodosMultiplesArgumentos {
	public static int sumarNums(int [] valores) {
		int suma = 0;
		for (int i : valores) {
			suma += i;
		}
		return suma;
	}
	public static void main(String[] args) {
		System.out.println("La suma es = " + sumarNums(new int[] {1,2,3}));
		System.out.println("La suma es = " + sumarNums(new int[] {1,2,3,4,5,6,7,8,9,10}));
		System.out.println("La suma es = " + sumarNums(new int[] {}));
	}
}

