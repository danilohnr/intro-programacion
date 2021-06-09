package clases;

public class PC {
	//Una clase vac�a de nada sirve
	//Debemos especificarle atributos (estados) y comportamientos (m�todos)
	//A las variables y miembros de una clase se les conoce como miembros o campos
	//A las variables generalmente se les antepone el modificador de acceso private
	//Para evitar que otra clase fuera de esta clase, tenga acceso directo a las variables
	//Ejemplo de atributos o estados de una PC
	private String marca;
	private double tamanoMonitor;
	private double cantidadRAM;
	private String sistemaOperativo;
	private int cantidadDiscos;
	private double espacioDisco;
	private double velocidadCPU;
	//Ejemplo de comportamientos o m�todos de una PC
	//Asignar valor a la variable marca
	public void establecerMarca(String marca) {
		//this.marca es la variable de instancia de la Clase
		//marca es la variable local que es pasada como par�metro al m�todo
		//this.marca = marca;
		//tambi�n podemos realizar validaciones de los par�metros
		String marcaValida = marca.toLowerCase();
		if(marcaValida.equals("hp") || marcaValida.equals("asus")) {
			this.marca = marca;
		} else {
			this.marca = "Desconocido";
		}
		
	}
	//Mostrar el valor de la variable marca
	public String mostrarMarca() {
		return this.marca;
	}
}
