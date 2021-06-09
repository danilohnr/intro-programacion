package clases;

public class Carro {
	//Atributos
	private String marca;
	private String modelo;
	private String motor;
	private int anio;	
	private int cantidadPuertas;
	String tipoCombustible;
	static String propietario;
	//Métodos
	//Métodos setters
	public void establecerMarca(String marca) {
		String marcaValida = marca.toLowerCase();
		if(marcaValida.equals("toyota") || marcaValida.equals("hyundai")) {
			this.marca = marca;
		} else {
			this.marca = "Desconocida";
		}
	}
	public void establecerModelo(String modelo) {
		this.modelo = modelo;
	}
	public void establecerMotor(String motor) {
		this.motor = motor;
	}
	public void establecerAnio(int anio) {
		this.anio = anio;
	}
	public void establecerCantidadPuertas(int cantidadPuertas) {
		this.cantidadPuertas = cantidadPuertas;
	}
	//Métodos getters
	public String mostrarMarca() {
		return this.marca;
	}
	public String mostrarModelo() {
		return this.modelo;
	}
	public String mostrarMotor() {
		return this.motor;
	}
	public int mostrarAnio() {
		return this.anio;
	}
	public int mostrarCantidadPuertas() {
		return this.cantidadPuertas;
	}
}
