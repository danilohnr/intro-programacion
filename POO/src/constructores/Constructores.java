package constructores;

public class Constructores {

	public static void main(String[] args) {
		//Con un constructor se puede realizar la funci�n que realizan los m�todos setters
		//al momento de crear un objeto o instancia de una clase.
		//Permite establecer valores iniciales a los par�metros o campos de la clase al crear un objeto
		//Los m�todos constructores tienen el mismo nombre de la clase.
		//Hay un constructor que es creado autom�ticamente por Java, el constructor sin par�metros.
		// new Clase() -> Este es el constructor predeterminado, sin par�metros. Lo usamos para crear objetos.
		
		//Cuenta cuenta = new Cuenta();
		//Se debe respetar el orden de los par�metros
		//String numero, double balance, String nombreCliente, String email, String numeroTelefono
		//Cuenta nuevaCuenta = new Cuenta("123456", 500.00, "Danilo Noguera", "danilo.noguera@gmail.com", "8803-7049");
		//Podemos llamar un constructor dentro de otro constructor
		//Para eso usamos la variable de referencia this() y dentro del par�ntesis agregamos los valores iniciales
		//Y deber�a ser la primera l�nea ejecutada dentro del constructor que llama a otro constructor
		
		ClienteVIP persona1 = new ClienteVIP();
		System.out.println(persona1.getNombre());
		
		ClienteVIP persona2 = new ClienteVIP("Danilo Noguera", 2500.00);
		System.out.println(persona2.getNombre());
		
		ClienteVIP persona3 = new ClienteVIP("Luis Rocha", 3000.00, "luis@gmail.com");
		System.out.println(persona3.getNombre());
	}
}

