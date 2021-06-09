package clases;

public class Cuenta {
	private String numero;
	private double balance;
	private String nombreCliente;
	private String email;
	private String numeroTelefono;
	//M�todos
	public void depositar(double montoDepositado) {
		this.balance += montoDepositado;
		System.out.println("Dep�sito de C$" + montoDepositado + " realizado.");
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
	//M�todos setters y getters
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
