package excepciones;

import java.io.*;

public class ExcepcionesVerificadas {

	public static void main(String[] args) {
		File archivo;
		FileReader lectorArchivo;
		BufferedReader lectorBuffer;
		
		String nombreEmpresa = null;
		
		archivo = new File("src/excepciones/nombres.txt");
		try {
			lectorArchivo = new FileReader(archivo);
			lectorBuffer = new BufferedReader(lectorArchivo);		
			
			nombreEmpresa = lectorBuffer.readLine();
			while(nombreEmpresa != null) {
				System.out.println("Nombre de la empresa: " + nombreEmpresa);
				nombreEmpresa = lectorBuffer.readLine();
			}
		} catch (IOException e) {
			System.out.println("NO se encontró el archivo!");
			e.printStackTrace();
		}
	}
}

