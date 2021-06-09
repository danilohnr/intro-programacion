package variablesdatos;

public class ConversionesImplicitas {

	public static void main(String[] args) {
		char c = 'a';
		System.out.println("c = " + c);
		System.out.println("====Conversiones implícitas====");
		int k = c;
		System.out.println("k = " + k);
		float f = c;
		System.out.println("f = " + f);
		long l = c;
		System.out.println("l = " + l);
		double d = c;
		System.out.println("d = " + d);
		System.out.println("====Conversión implícita no permisible====");
		//char b = d;
	}
}

