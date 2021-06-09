package modificadores;

public class DemoModificadores {

	Integer variableDeInstancia = 10;
	static Integer variableEstatica = 15;
	
	private void probar() {
		variableDeInstancia = 10;
		Integer variableLocal = 10;
		System.out.println("Dentro del método no estático probar()");
	}
	static void probarEstatico() {
		Integer OtraVariableLocal = 50;
		System.out.println("Dentro del método estático probarEstatico()");
	}
	
	public static void main(String[] args) {
		DemoModificadores objeto = new DemoModificadores();
		DemoModificadores otroObjeto = new DemoModificadores();
		System.out.println("Dentro del método main()");
		objeto.probar();
		probarEstatico();
		objeto.variableDeInstancia = 100;
		otroObjeto.variableDeInstancia = 500;
		
		variableEstatica = 25;
		DemoModificadores.variableEstatica = 30;
	}
}

