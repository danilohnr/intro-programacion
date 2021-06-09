package modificadores;

public class DemoModificadores {

	Integer variableDeInstancia = 10;
	static Integer variableEstatica = 15;
	
	private void probar() {
		variableDeInstancia = 10;
		Integer variableLocal = 10;
		System.out.println("Dentro del m�todo no est�tico probar()");
	}
	static void probarEstatico() {
		Integer OtraVariableLocal = 50;
		System.out.println("Dentro del m�todo est�tico probarEstatico()");
	}
	
	public static void main(String[] args) {
		DemoModificadores objeto = new DemoModificadores();
		DemoModificadores otroObjeto = new DemoModificadores();
		System.out.println("Dentro del m�todo main()");
		objeto.probar();
		probarEstatico();
		objeto.variableDeInstancia = 100;
		otroObjeto.variableDeInstancia = 500;
		
		variableEstatica = 25;
		DemoModificadores.variableEstatica = 30;
	}
}

