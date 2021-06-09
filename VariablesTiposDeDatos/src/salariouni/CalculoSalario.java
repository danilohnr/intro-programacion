package salariouni;
import java.util.Scanner;

public class CalculoSalario {
	//Declaración de constantes (En este caso son tasas)
	static final double INSS = 7;
	static final double IR = 15.6;
	static final int SINDICATO = 1;
	static final int ANTIGUEDAD = 15;
	static final double INSS_PATRONAL = 22.5;
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		//Datos de entrada
		double montoINSS, montoIR, montoSindicato, montoAntiguedad, montoINSSPatronal;
		double ingresoBruto, ingresoTotal, totalDeducciones, ingresoNeto;
		System.out.print("Ingreso bruto (básico) = ");
		ingresoBruto = lector.nextDouble();
		//Procesamiento
		//Ingresos
		montoAntiguedad = ingresoBruto * ANTIGUEDAD/100;
		//Deducciones al empleado
		//Cálculos sobre el ingreso bruto
		montoSindicato = ingresoBruto * SINDICATO/100;
		//Cálculo sobre el ingreso total
		ingresoTotal = ingresoBruto + montoAntiguedad;
		montoINSS = ingresoTotal * INSS/100;
		montoIR = ingresoTotal * IR/100;
		totalDeducciones = montoINSS + montoIR + montoSindicato;
		//Deducciones al empleador
		montoINSSPatronal = ingresoTotal * INSS_PATRONAL/100;
		//Datos de salida
		ingresoNeto = ingresoTotal - totalDeducciones;
		System.out.println("----Tasas----");
		System.out.println("inss = " + INSS + "%");
		System.out.println("ir = " + IR + "%");
		System.out.println("sindicato = " + SINDICATO + "%");
		System.out.println("antiguedad = " + ANTIGUEDAD + "%");
		System.out.println("---Ingresos del empleado----");
		System.out.println("Ingreso bruto (básico) = C$" + ingresoBruto);
		System.out.println("Antiguedad = C$" + montoAntiguedad);
		System.out.println("Ingreso total = C$" + ingresoTotal);
		System.out.println("----Deducciones al empleado----");
		System.out.println("--Deducciones sobre el ingreso bruto--");
		System.out.println("Monto del sindicato = C$" + montoSindicato);
		System.out.println("--Deducciones sobre el ingreso total--");
		System.out.println("Monto del INSS = C$" + montoINSS);
		System.out.println("Monto del IR = C$" + montoIR);
		System.out.println("Total de deducciones = C$" + totalDeducciones);
		System.out.println("----Deducciones al empleador----");
		System.out.println("Monto del INSS Patronal = C$" + montoINSSPatronal);
		System.out.println("----Total a pagar----");
		System.out.println("Ingreso neto = C$" + ingresoNeto);
		lector.close();
	}
}

