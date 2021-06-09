package estructura;

public class ClaseEstructura {
	
		//M�todo
		public float obtenerTemperatura() {
			return temperatura;
		}
		//M�todo
		public static int obtenerNumeroGrande() {
			return UN_NUMERO_GRANDE;
		}
		//Variables
		private static int UN_NUMERO_GRANDE = 123456;
		private float temperatura;
		//M�todo constructor
		public ClaseEstructura() {
			temperatura = 98.4F;
		}
		//M�todo
		public void hacerUno() {
			//Creaci�n  de un objeto (instancia)
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

