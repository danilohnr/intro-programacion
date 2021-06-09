package POOMetodos;

public class SobrecargaDeMetodos {

	public int sumar(int arg1, int arg2) {
		arg1 = 100;
		int resultado = arg1 + arg2;
		System.out.println("Con el método de 2 argumentos");
		return resultado;
	}
	
	public int sumar(int arg1, int arg2, int arg3) {		
		int resultado = arg1 + arg2 + arg3;
		System.out.println("Con el método de 3 argumentos");
		return resultado;
	}
	
	public static void main(String[] args) {
		SobrecargaDeMetodos calc = new SobrecargaDeMetodos();
		int arg1 = 10, arg2 = 30, arg3 = 40;
		System.out.println("arg1 antes de ser pasado por valor = " + arg1);
		int resultado = calc.sumar(arg1, arg2);
		System.out.println("arg1 después de ser pasado por valor = " + arg1);
		System.out.println("resultado = " + resultado);
		resultado = calc.sumar(arg1, arg2, arg3);
		System.out.println("resultado de método sobrecargado = " + resultado);
	}
}

