package constructores;

public class ClienteVIP {
	private String nombre;
	private double limiteCredito;
	private String email;
	
	public ClienteVIP() {
		this("Nombre", 0.00, "usuario@email.com");
	}


	public ClienteVIP(String nombre, double limiteCredito) {
		this(nombre, limiteCredito, "desconocido");
	}


	public ClienteVIP(String nombre, double limiteCredito, String email) {
		this.nombre = nombre;
		this.limiteCredito = limiteCredito;
		this.email = email;
	}


	public String getNombre() {
		return nombre;
	}


	public double getLimiteCredito() {
		return limiteCredito;
	}


	public String getEmail() {
		return email;
	}
	
	
}
