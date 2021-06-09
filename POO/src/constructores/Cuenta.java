package constructores;

public class Cuenta {
	private String numero;
	private double balance;
	private String nombreCliente;
	private String email;
	private String numeroTelefono;
	//Métodos constructores
	public Cuenta() {
		this("987654", 2.50, "Nombre", "Correo", "Teléfono");
		System.out.println("Constructor sin parámetros fue llamado");
	}
	public Cuenta(String numero, double balance, String nombreCliente, String email, String numeroTelefono) {
		System.out.println("Constructor con parámetros fue llamado");
		this.numero = numero;
		this.balance = balance;
		this.nombreCliente = nombreCliente;
		this.email = email;
		this.numeroTelefono = numeroTelefono;
		//También podemos invocar los métodos setters, aunque no es una práctica recomendada (por el tema de Herencia)
		//Se recomienda acceder directamente a las variables, ya que algo podría salir mal con los métodos setters  
		//setNumero(numero);
	}
	//Podemos crear otro constructor con ciertos parámetros de entrada (no todos)
	public Cuenta(String nombreCliente, String email, String numeroTelefono) {
		//Podemos mandar a inicializar el resto de campos (numero y balance)
		this("999999", 10.00, nombreCliente, email, numeroTelefono);
		//this.nombreCliente = nombreCliente;
		//this.email = email;
		//this.numeroTelefono = numeroTelefono;
	}
	//Métodos para funcionalidad
	public void depositar(double montoDepositado) {
		this.balance += montoDepositado;
		System.out.println("Depósito de C$" + montoDepositado + " realizado.");
		System.out.println("Saldo disponible: C$" + this.balance);
	}
	public void retirar(double montoRetirado) {
		if (this.balance - montoRetirado < 0) {
			System.out.println("Solo tiene C$" + this.balance + " disponible.");
			System.out.println("No se pudo realizar el retiro.");
		} else {
			this.balance -= montoRetirado;
			System.out.println("Monto retirado C$" + montoRetirado + " realizado.");
			System.out.println("Saldo disponible: C$" + this.balance);
		}
	}
	//Métodos setters y getters
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	
}
