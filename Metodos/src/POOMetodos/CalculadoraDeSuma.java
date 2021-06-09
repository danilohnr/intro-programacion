package POOMetodos;

public class CalculadoraDeSuma {

	public Integer sumar(Integer sumandoX, Integer sumandoY) {
		int resultado = sumandoX + sumandoY;
		return resultado;
	}
	public static void main(String[] args) {
		CalculadoraDeSuma calc = new CalculadoraDeSuma();
		Integer suma = calc.sumar(10, 30);
		System.out.println("Resultado de la suma = " + suma);
	}
}

