package estructura;

public class ClaseEstructura {
	
		//Método
		public float obtenerTemperatura() {
			return temperatura;
		}
		//Método
		public static int obtenerNumeroGrande() {
			return UN_NUMERO_GRANDE;
		}
		//Variables
		private static int UN_NUMERO_GRANDE = 123456;
		private float temperatura;
		//Método constructor
		public ClaseEstructura() {
			temperatura = 98.4F;
		}
		//Método
		public void hacerUno() {
			//Creación  de un objeto (instancia)
			UnConcepto uc = new UnConcepto();
		}
		//Variable de una clase de otro paquete
		//Nombre completo, ya que no fue importado
		public estructura.sub.ClaseSecreta cs;
		//Clase interna a la clase principal
		class ClaseInterna{
			public void hacerAlgo() {}
		}	
}

