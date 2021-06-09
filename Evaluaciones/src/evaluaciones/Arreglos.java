package evaluaciones;

import java.util.*;


public class Arreglos {
 
public static void main(String[] Args) {
	Scanner consola = new Scanner(System.in);
	int respuesta, filas1, columnas1, filas2, columnas2, identidad = 0, respuesta1;
	do {
		do {
			System.out.println();
			System.out.println("--------------------------------------------");
			System.out.println("   Bienvenido al programa paraíso de las matrices  ");
			System.out.println("--------------------------------------------");
			System.out.println();
			System.out.println("Qué operaciòn con matrices desea realizar?");
			System.out.println("1. Comparar la igualdad de 2 matrices");
			System.out.println("2. La suma de 2 matrices");
			System.out.println("3. Generar una matriz 0 de n * m");
			System.out.println("4. Obtener el inverso aditivo de una matriz de n * m");
			System.out.println("5. La resta de 2 matrices");
			System.out.println("6. Multiplicar un escalar por una matriz de n * m");
			System.out.println("7. Multiplicar 2 matrices compatibles");
			System.out.println("8. Obtener una matriz identidad de tamaño n");
			System.out.println("9. Obtener la inversa de una matriz de tamaño n");
			System.out.println("10. Obtener un determinante de una matriz de tamaño n");
			System.out.println("11. Salir");
			System.out.print("Respuesta: ");
			respuesta = consola.nextInt();
			if (respuesta != 1 && respuesta != 2 && respuesta != 3 && respuesta != 4 && respuesta != 5 && respuesta != 6 && respuesta != 7 && respuesta != 8 && respuesta != 9 && respuesta != 10 && respuesta != 11) {
				System.out.println("Por favor ingresar un numero que corresponda a los mencionados en las operaciones");
				System.out.println("");
			}
		} while (respuesta != 1 && respuesta != 2 && respuesta != 3 && respuesta != 4 && respuesta != 5 && respuesta != 6 && respuesta != 7 && respuesta != 8 && respuesta != 9 && respuesta != 10 && respuesta != 11);
		switch (respuesta) {
			case 1:
				System.out.println();
				System.out.println();
				System.out.println("----------------------------");
				System.out.println(" Dimensiones de la matriz 1 ");
				System.out.println("----------------------------");
				System.out.println("Ingrese las dimensiones de la primer matriz");
				do {
					System.out.print("Filas: ");
					filas1 = consola.nextInt();
					if (filas1 <= 0) {
						System.out.println("");
						System.out.println("El número de filas que ingreso no puede ser menor o igual a 0");
					}
				} while (filas1 <= 0);
				do {
					System.out.print("Columnas: ");
					columnas1 = consola.nextInt();
					if (filas1 <= 0) {
						System.out.println("");
						System.out.println("El número de columnas que ingreso no puede ser menor o igual a 0");
					}
				} while (columnas1 <= 0);
				int [][] matriz1 = new int [filas1][columnas1];
				System.out.println();
				System.out.println();
				System.out.println("----------------------------");
				System.out.println(" Dimensiones de la matriz 2 ");
				System.out.println("----------------------------");
				System.out.println("Ingrese las dimensiones de la segunda matriz");
				do {
					System.out.print("Filas: ");
					filas2 = consola.nextInt();
					if (filas2 <= 0) {
						System.out.println("");
						System.out.println("El número de filas que ingreso no puede ser menor o igual a 0");
					}
				} while (filas2 <= 0);
				do {
					System.out.print("Columnas: ");
					columnas2 = consola.nextInt();
					if (columnas2 <= 0) {
						System.out.println("");
						System.out.println("El número de columnas que ingreso no puede ser menor o igual a 0");
					}
				} while (columnas2 <= 0);
				int [][] matriz2 = new int [filas2][columnas2];
				System.out.println();
				System.out.println();
				System.out.println("---------------------------------------");
				System.out.println(" Comparación deigualdad entre matrices ");
				System.out.println("---------------------------------------");
				if ((filas1 == filas2) && (columnas1 == columnas2)) {
					System.out.println("Las matrices son iguales");
				} else {
					System.out.println("Las matrices son diferentes");
				}
				break;
			case 2:
				System.out.println();
				System.out.println();
				System.out.println("----------------------------");
				System.out.println(" Dimensiones de la matriz 1 ");
				System.out.println("----------------------------");
				System.out.println("Ingrese las dimensiones de la primer matriz");
				do {
					System.out.print("Filas: ");
					filas1 = consola.nextInt();
					if (filas1 <= 0) {
						System.out.println("");
						System.out.println("El número de filas que ingreso no puede ser menor o igual a 0");
					}
				} while (filas1 <= 0);
				do {
					System.out.print("Columnas: ");
					columnas1 = consola.nextInt();
					if (filas1 <= 0) {
						System.out.println("");
						System.out.println("El número de columnas que ingreso no puede ser menor o igual a 0");
					}
				} while (columnas1 <= 0);
				matriz1 = new int [filas1][columnas1];
				System.out.println();
				System.out.println();
				System.out.println("----------------------------");
				System.out.println(" Dimensiones de la matriz 2 ");
				System.out.println("----------------------------");
				System.out.println("Ingrese las dimensiones de la segunda matriz");
				do {
					System.out.print("Filas: ");
					filas2 = consola.nextInt();
					if (filas2 <= 0) {
						System.out.println("");
						System.out.println("El número de filas que ingreso no puede ser menor o igual a 0");
					}
				} while (filas2 <= 0);
				do {
					System.out.print("Columnas: ");
					columnas2 = consola.nextInt();
					if (columnas2 <= 0) {
						System.out.println("");
						System.out.println("El número de columnas que ingreso no puede ser menor o igual a 0");
					}
				} while (columnas2 <= 0);
				matriz2 = new int [filas2][columnas2];
				System.out.println();
				System.out.println();
				System.out.println("---------------------------------------");
				System.out.println("          Suma de 2 matrices           ");
				System.out.println("---------------------------------------");
				if ((filas1 == filas2) && (columnas1 == columnas2)) {
					int [][] matriz3 = new int [filas2][columnas2];
					for (int i = 0; i < matriz1.length; i++) {
						for (int j = 0; j < matriz1[i].length; j++) {
							System.out.print("Ingrese el elemento de la matriz 1 [ " + (i + 1) + " , " + (j + 1) + " ]: ");
							matriz1 [i] [j] = consola.nextInt(); 
						}
					}
					System.out.println();
					System.out.println();
					for (int i = 0; i < matriz2.length; i++) {
						for (int j = 0; j < matriz2[i].length; j++) {
							System.out.print("Ingrese el elemento de la matriz 2 [ " + (i + 1) + " , " + (j + 1) + " ]: ");
							matriz2 [i] [j] = consola.nextInt(); 
						}
					}
					System.out.println();
					System.out.println();
					System.out.println("Matriz 1");
					for (int i = 0; i < matriz1.length; i++) {
						System.out.print("|");
						for (int j = 0; j < matriz1[i].length; j++) {
							System.out.print(matriz1 [i] [j]);
							 if (j!=matriz1[i].length-1)
								 System.out.print("\t");
						}
						System.out.println("|");
					}
					System.out.println();
					System.out.println();
					System.out.println("Matriz 2");
					for (int i = 0; i < matriz2.length; i++) {
						System.out.print("|");
						for (int j = 0; j < matriz2[i].length; j++) {
							System.out.print(matriz2 [i] [j]);
							 if (j!=matriz2[i].length-1) {
								 System.out.print("\t"); 
							 }
						}
						System.out.println("|");
					}
					System.out.println();
					System.out.println();
					System.out.println("La suma de ambas matrices");
					for (int i = 0; i < matriz3.length; i++) {
						System.out.print("|");
						for (int j = 0; j < matriz3[i].length; j++) {
							matriz3 [i][j] = matriz1 [i][j] + matriz2 [i][j];
							System.out.print(matriz3 [i] [j]);
							 if (j!=matriz3[i].length-1) {
								 System.out.print("\t"); 
							 }
						}
						System.out.println("|");
					}
				} else {
					System.out.println("No se puede sumar las 2 matrices gracias a que tienen diferentes dimensiones");
				}
				break;
			case 3:
				System.out.println();
				System.out.println();
				System.out.println("----------------------------");
				System.out.println(" Dimensiones de la matriz 1 ");
				System.out.println("----------------------------");
				System.out.println("Ingrese las dimensiones de la primer matriz");
				do {
					System.out.print("Filas: ");
					filas1 = consola.nextInt();
					if (filas1 <= 0) {
						System.out.println("");
						System.out.println("El número de filas que ingreso no puede ser menor o igual a 0");
					}
				} while (filas1 <= 0);
				do {
					System.out.print("Columnas: ");
					columnas1 = consola.nextInt();
					if (filas1 <= 0) {
						System.out.println("");
						System.out.println("El número de columnas que ingreso no puede ser menor o igual a 0");
					}
				} while (columnas1 <= 0);
				matriz1 = new int [filas1][columnas1];
				System.out.println();
				System.out.println();
				System.out.println("---------------------------------------");
				System.out.println("           Matriz 0 de n * m           ");
				System.out.println("---------------------------------------");
				System.out.println();
				System.out.println();
				System.out.println("Matriz 1");
				for (int i = 0; i < matriz1.length; i++) {
					System.out.print("|");
					for (int j = 0; j < matriz1[i].length; j++) {
						System.out.print(matriz1 [i] [j]);
						 if (j!=matriz1[i].length-1) {
							 System.out.print("\t"); 
						 }
					}
					System.out.println("|");
				}
				break;
			case 4:
				System.out.println();
				System.out.println();
				System.out.println("----------------------------");
				System.out.println(" Dimensiones de la matriz 1 ");
				System.out.println("----------------------------");
				System.out.println("Ingrese las dimensiones de la primer matriz");
				do {
					System.out.print("Filas: ");
					filas1 = consola.nextInt();
					if (filas1 <= 0) {
						System.out.println("");
						System.out.println("El número de filas que ingreso no puede ser menor o igual a 0");
					}
				} while (filas1 <= 0);
				do {
					System.out.print("Columnas: ");
					columnas1 = consola.nextInt();
					if (filas1 <= 0) {
						System.out.println("");
						System.out.println("El número de columnas que ingreso no puede ser menor o igual a 0");
					}
				} while (columnas1 <= 0);
				matriz1 = new int [filas1][columnas1];
				System.out.println();
				System.out.println();
				System.out.println("---------------------------------------");
				System.out.println("  Inverso aditivo de una matriz n * m  ");
				System.out.println("---------------------------------------");
				for (int i = 0; i < matriz1.length; i++) {
					for (int j = 0; j < matriz1[i].length; j++) {
						System.out.print("Ingrese el elemento de la matriz 1 [ " + (i + 1) + " , " + (j + 1) + " ]: ");
						matriz1 [i] [j] = consola.nextInt(); 
						matriz1 [i] [j] = - matriz1 [i] [j];
					}
				}
				System.out.println();
				System.out.println();
				System.out.println("Matriz 1");
				for (int i = 0; i < matriz1.length; i++) {
					System.out.print("|");
					for (int j = 0; j < matriz1[i].length; j++) {
						System.out.print(matriz1 [i] [j]);
						 if (j!=matriz1[i].length-1) {
							 System.out.print("\t"); 
						 }
					}
					System.out.println("|");
				}
				break;
			case 5:
				System.out.println();
				System.out.println();
				System.out.println("----------------------------");
				System.out.println(" Dimensiones de la matriz 1 ");
				System.out.println("----------------------------");
				System.out.println("Ingrese las dimensiones de la primer matriz");
				do {
					System.out.print("Filas: ");
					filas1 = consola.nextInt();
					if (filas1 <= 0) {
						System.out.println("");
						System.out.println("El número de filas que ingreso no puede ser menor o igual a 0");
					}
				} while (filas1 <= 0);
				do {
					System.out.print("Columnas: ");
					columnas1 = consola.nextInt();
					if (filas1 <= 0) {
						System.out.println("");
						System.out.println("El número de columnas que ingreso no puede ser menor o igual a 0");
					}
				} while (columnas1 <= 0);
				matriz1 = new int [filas1][columnas1];
				System.out.println();
				System.out.println();
				System.out.println("----------------------------");
				System.out.println(" Dimensiones de la matriz 2 ");
				System.out.println("----------------------------");
				System.out.println("Ingrese las dimensiones de la segunda matriz");
				do {
					System.out.print("Filas: ");
					filas2 = consola.nextInt();
					if (filas2 <= 0) {
						System.out.println("");
						System.out.println("El número de flas que ingreso no puede ser menor o igual a 0");
					}
				} while (filas2 <= 0);
				do {
					System.out.print("Columnas: ");
					columnas2 = consola.nextInt();
					if (columnas2 <= 0) {
						System.out.println("");
						System.out.println("El número de columnas que ingreso no puede ser menor o igual a 0");
					}
				} while (columnas2 <= 0);
				matriz2 = new int [filas2][columnas2];
				System.out.println();
				System.out.println();
				System.out.println("---------------------------------------");
				System.out.println("          Resta de 2 matrices          ");
				System.out.println("---------------------------------------");
				if ((filas1 == filas2) && (columnas1 == columnas2)) {
					int [][] matriz3 = new int [filas2][columnas2];
					for (int i = 0; i < matriz1.length; i++) {
						for (int j = 0; j < matriz1[i].length; j++) {
							System.out.print("Ingrese el elemento de la matriz 1 [ " + (i + 1) + " , " + (j + 1) + " ]: ");
							matriz1 [i] [j] = consola.nextInt(); 
						}
					}
					System.out.println();
					System.out.println();
					for (int i = 0; i < matriz2.length; i++) {
						for (int j = 0; j < matriz2[i].length; j++) {
							System.out.print("Ingrese el elemento de la matriz 2 [ " + (i + 1) + " , " + (j + 1) + " ]: ");
							matriz2 [i] [j] = consola.nextInt(); 
						}
					}
					System.out.println();
					System.out.println();
					System.out.println("Matriz 1");
					for (int i = 0; i < matriz1.length; i++) {
						System.out.print("|");
						for (int j = 0; j < matriz1[i].length; j++) {
							System.out.print(matriz1 [i] [j]);
							 if (j!=matriz1[i].length-1)
								 System.out.print("\t");
						}
						System.out.println("|");
					}
					System.out.println();
					System.out.println();
					System.out.println("Matriz 2");
					for (int i = 0; i < matriz2.length; i++) {
						System.out.print("|");
						for (int j = 0; j < matriz2[i].length; j++) {
							System.out.print(matriz2 [i] [j]);
							 if (j!=matriz2[i].length-1) {
								 System.out.print("\t"); 
							 }
						}
						System.out.println("|");
					}
					System.out.println();
					System.out.println();
					System.out.println("La resta de ambas matrices");
					for (int i = 0; i < matriz3.length; i++) {
						System.out.print("|");
						for (int j = 0; j < matriz3[i].length; j++) {
							matriz3 [i][j] = matriz1 [i][j] - matriz2 [i][j];
							System.out.print(matriz3 [i] [j]);
							 if (j!=matriz3[i].length-1) {
								 System.out.print("\t"); 
							 }
						}
						System.out.println("|");
					}
				} else {
					System.out.println("No se puede restar las 2 matrices debido a que tienen diferentes dimensiones");
				}
				break;
			case 6:
				System.out.println();
				System.out.println();
				System.out.println("----------------------------");
				System.out.println(" Dimensiones de la matriz 1 ");
				System.out.println("----------------------------");
				System.out.println("Ingrese las dimensiones de la primer matriz");
				do {
					System.out.print("Filas: ");
					filas1 = consola.nextInt();
					if (filas1 <= 0) {
						System.out.println("");
						System.out.println("El número de filas que ingreso no puede ser menor o igual a 0");
					}
				} while (filas1 <= 0);
				do {
					System.out.print("Columnas: ");
					columnas1 = consola.nextInt();
					if (filas1 <= 0) {
						System.out.println("");
						System.out.println("El número de columnas que ingreso no puede ser menor o igual a 0");
					}
				} while (columnas1 <= 0);
				matriz1 = new int [filas1][columnas1];
				System.out.println();
				System.out.println();
				System.out.println("-------------------------------------------");
				System.out.println("Multiplicación de una matriz por un escalar");
				System.out.println("-------------------------------------------");
				int escalar;
				for (int i = 0; i < matriz1.length; i++) {
					for (int j = 0; j < matriz1[i].length; j++) {
						System.out.print("Ingrese el elemento de la matriz 1 [ " + (i + 1) + " , " + (j + 1) + " ]: ");
						matriz1 [i] [j] = consola.nextInt(); 
					}
				}
				System.out.println();
				System.out.println();
				System.out.println("Matriz 1"); 
				for (int i = 0; i < matriz1.length; i++) {
					System.out.print("|");
					for (int j = 0; j < matriz1[i].length; j++) {
						System.out.print(matriz1 [i] [j]);
						 if (j!=matriz1[i].length-1)
							 System.out.print("\t");
					}
					System.out.println("|");
				}
				System.out.println();
				System.out.print("Ingrese el escalar por el que va a multiplicar la matriz: ");
				escalar = consola.nextInt();
				System.out.println();
				System.out.println();
				System.out.println("Multiplicación de un escalar por la matriz");
				for (int i = 0; i < matriz1.length; i++) {
					System.out.print("|");
					for (int j = 0; j < matriz1[i].length; j++) {
						matriz1 [i][j] = matriz1 [i][j] * escalar;
						System.out.print(matriz1 [i] [j]);
						 if (j!=matriz1[i].length-1) {
							 System.out.print("\t"); 
						 }
					}
					System.out.println("|");
				}
				break;
			case 7:
				System.out.println();
				System.out.println();
				System.out.println("----------------------------");
				System.out.println(" Dimensiones de la matriz 1 ");
				System.out.println("----------------------------");
				System.out.println("Ingrese las dimensiones de la primer matriz");
				do {
					System.out.print("Filas: ");
					filas1 = consola.nextInt();
					if (filas1 <= 0) {
						System.out.println("");
						System.out.println("El número de filas que ingreso no puede ser menor o igual a 0");
					}
				} while (filas1 <= 0);
				do {
					System.out.print("Columnas: ");
					columnas1 = consola.nextInt();
					if (filas1 <= 0) {
						System.out.println("");
						System.out.println("El número de columnas que ingreso no puede ser menor o igual a 0");
					}
				} while (columnas1 <= 0);
				matriz1 = new int [filas1][columnas1];
				System.out.println();
				System.out.println();
				System.out.println("----------------------------");
				System.out.println(" Dimensiones de la matriz 2 ");
				System.out.println("----------------------------");
				System.out.println("Ingrese las dimensiones de la segunda matriz");
				do {
					System.out.print("Filas: ");
					filas2 = consola.nextInt();
					if (filas2 <= 0) {
						System.out.println("");
						System.out.println("El número de filas que ingreso no puede ser menor o igual a 0");
					}
				} while (filas2 <= 0);
				do {
					System.out.print("Columnas: ");
					columnas2 = consola.nextInt();
					if (columnas2 <= 0) {
						System.out.println("");
						System.out.println("El número de columnas que ingreso no puede ser menor o igual a 0");
					}
				} while (columnas2 <= 0);
				matriz2 = new int [filas2][columnas2];
				System.out.println();
				System.out.println();
				System.out.println("---------------------------------------");
				System.out.println(" Multiplicación de matrices compatibles");
				System.out.println("---------------------------------------");
				if (columnas1 == filas2) {
					int [][] matriz3 = new int [filas1][columnas2];
					for (int i = 0; i < matriz1.length; i++) {
						for (int j = 0; j < matriz1[i].length; j++) {
							System.out.print("Ingrese el elemento de la matriz 1 [ " + (i + 1) + " , " + (j + 1) + " ]: ");
							matriz1 [i] [j] = consola.nextInt(); 
						}
					}
					System.out.println();
					System.out.println();
					for (int i = 0; i < matriz2.length; i++) {
						for (int j = 0; j < matriz2[i].length; j++) {
							System.out.print("Ingrese el elemento de la matriz 2 [ " + (i + 1) + " , " + (j + 1) + " ]: ");
							matriz2 [i] [j] = consola.nextInt(); 
						}
					}
					System.out.println();
					System.out.println();
					System.out.println("Matriz 1");
					for (int i = 0; i < matriz1.length; i++) {
						System.out.print("|");
						for (int j = 0; j < matriz1[i].length; j++) {
							System.out.print(matriz1 [i] [j]);
							 if (j!=matriz1[i].length-1)
								 System.out.print("\t");
						}
						System.out.println("|");
					}
					System.out.println();
					System.out.println();
					System.out.println("Matriz 2");
					for (int i = 0; i < matriz2.length; i++) {
						System.out.print("|");
						for (int j = 0; j < matriz2[i].length; j++) {
							System.out.print(matriz2 [i] [j]);
							 if (j!=matriz2[i].length-1) {
								 System.out.print("\t"); 
							 }
						}
						System.out.println("|");
					}
					for (int i = 0; i < matriz3.length; i++) {
						for (int j = 0; j < matriz3[i].length; j++) {
							for (int l = 0; l < matriz1[i].length; l++) {
								matriz3[i][j] += matriz1 [i][l] * matriz2 [l][j];
							}
						}
					}
					System.out.println();
					System.out.println();
					System.out.println("La multiplicación de ambas matrices");
					for (int i = 0; i < matriz3.length; i++) {
						System.out.print("|");
						for (int j = 0; j < matriz3[i].length; j++) {
							System.out.print(matriz3 [i] [j]);
							 if (j!=matriz3[i].length-1) {
								 System.out.print("\t"); 
							 }
						}
						System.out.println("|");
					}
				} else {
					System.out.println("No se pueden multiplicar estas matrices ya que no son compatibles");
				}
				break;
			case 8:
				System.out.println();
				System.out.println();
				System.out.println("----------------------------");
				System.out.println(" Dimensiones de la matriz 1 ");
				System.out.println("----------------------------");
				System.out.println("Ingrese las dimensiones de la primer matriz");
				do {
					System.out.print("Filas: ");
					filas1 = consola.nextInt();
					if (filas1 <= 0) {
						System.out.println("");
						System.out.println("El número de filas que ingreso no puede ser menor o igual a 0");
					}
				} while (filas1 <= 0);
				do {
					System.out.print("Columnas: ");
					columnas1 = consola.nextInt();
					if (filas1 <= 0) {
						System.out.println("");
						System.out.println("El número de columnas que ingreso no puede ser menor o igual a 0");
					}
				} while (columnas1 <= 0);
				matriz1 = new int [filas1][columnas1];
				System.out.println();
				System.out.println();
				System.out.println("---------------------------------------");
				System.out.println("      Matriz identidad de tamaño n     ");
				System.out.println("---------------------------------------");
				if (filas1 == columnas1) { 
					for (int i = 0; i < matriz1.length; i++) {
						identidad = identidad + 0;
						matriz1[i][identidad] = 1;
						identidad++;
					}
					System.out.println();
					System.out.println();
					System.out.println("Matriz identidad");
					for (int i = 0; i < matriz1.length; i++) {
						System.out.print("|");
						for (int j = 0; j < matriz1[i].length; j++) {
							System.out.print(matriz1 [i] [j]);
							 if (j!=matriz1[i].length-1) {
								 System.out.print("\t"); 
							 }
						}
						System.out.println("|");
					}
				} else {
					System.out.println("Debido a que no es una matriz cuadrada no se puede realizar la matriz de identidad");
				}
				break;
			case 9:
				int temporal, temporal1;
				System.out.println();
				System.out.println();
				System.out.println("----------------------------");
				System.out.println(" Dimensiones de la matriz 1 ");
				System.out.println("----------------------------");
				System.out.println("Ingrese las dimensiones de la primer matriz");
				do {
					System.out.print("Filas: ");
					filas1 = consola.nextInt();
					if (filas1 <= 0) {
						System.out.println("");
						System.out.println("El número de filas que ingreso no puede ser menor o igual a 0");
					}
				} while (filas1 <= 0);
				do {
					System.out.print("Columnas: ");
					columnas1 = consola.nextInt();
					if (filas1 <= 0) {
						System.out.println("");
						System.out.println("El número de columnas que ingreso no puede ser menor o igual a 0");
					}
				} while (columnas1 <= 0);
				 matriz1 = new int [filas1][columnas1];
				 matriz2 = new int[filas1][columnas1];
				 for (int i = 0; i < matriz1.length; i++) {
						for (int j = 0; j < matriz1[i].length; j++) {
							System.out.print("Ingrese el elemento de la matriz 1 [ " + (i + 1) + " , " + (j + 1) + " ]: ");
							matriz1 [i] [j] = consola.nextInt();
							if (i == j) {
								matriz2 [i][j] = 1;
							} else {
								matriz2[i][j] = 0;
							}
						}
					}
				System.out.println();
				System.out.println("Matriz 1");
				for (int i = 0; i < matriz1.length; i++) {
					System.out.print("|");
					for (int j = 0; j < matriz1[i].length; j++) {
						System.out.print(matriz1 [i] [j]);
							if (j!=matriz1[i].length-1)
								System.out.print("\t");
					}
					System.out.println("|");
				}
				System.out.println();
				System.out.println("Matriz identidad");
				for (int i = 0; i < matriz2.length; i++) {
					System.out.print("|");
					for (int j = 0; j < matriz2[i].length; j++) {
						System.out.print(matriz2 [i] [j]);
							if (j!=matriz2[i].length-1)
								System.out.print("\t");
					}
					System.out.println("|");
				}
				for (int i = 0; i < filas1; i++) {
					temporal = matriz1[i][i];
					for (int j = 0; j < filas1; j++) {
						if (i != j) {
							temporal1 = matriz1[j][i];
							for (int l = 0; l < filas1; l++) {
								matriz1[j][l] = matriz1[j][l] - temporal1 * matriz1[i][l];
								matriz2[j][l] = matriz2[j][l] - temporal1 * matriz2[i][l];
							}
						}
					}
				}
				System.out.println();
				System.out.println("Matriz inversa");
				for (int i = 0; i < filas1; i++) {
					System.out.print("|");
					for (int j = 0; j < filas1; j++) {
						System.out.print(matriz2 [i] [j]);
							if (j!=matriz2[i].length-1)
								System.out.print("\t");
					}
					System.out.println("|");
				}
				break;
			case 10:
				int matriz, recorrido = 1, determinante;
				System.out.println();
				System.out.println();
				System.out.println("---------------------------------------");
				System.out.println("      Determinante de una matriz        ");
				System.out.println("---------------------------------------");
				do {
					System.out.println();
					System.out.println("En qué dimensiones trabajara con la matriz?");
					System.out.println("1. \"2 * 2\" ");
					System.out.println("2. \"3 * 3\" ");
					System.out.print("Respuesta: ");
					matriz = consola.nextInt();
					if (matriz != 1 && matriz != 2) {
						System.out.println("seleccione un numero valido porfavor");
					}
				} while (matriz != 1 && matriz != 2);
				if (matriz == 1) {
					matriz1 = new int [2][2];
					System.out.println();
					for (int i = 0; i < matriz1.length; i++) {
						for (int j = 0; j < matriz1[i].length; j++) {
							System.out.print("Ingrese el elemento de la matriz 1 [ " + (i + 1) + " , " + (j + 1) + " ]: ");
							matriz1 [i] [j] = consola.nextInt();
						}
					}
					System.out.println();
					System.out.println();
					System.out.println("Matriz 1");
					for (int i = 0; i < matriz1.length; i++) {
						System.out.print("|");
						for (int j = 0; j < matriz1[i].length; j++) {
							System.out.print(matriz1 [i] [j]);
							 if (j!=matriz1[i].length-1) {
								 System.out.print("\t"); 
							 }
						}
						System.out.println("|");
					}
					determinante = (matriz1[0][0]*matriz1[1][1]) - (matriz1[0][1]*matriz1[1][0]);
					System.out.println();
					System.out.println();
					System.out.println("La determinante de la matriz");
					System.out.println(determinante);
				} else {
					matriz1 = new int [3][3];
					int [] matrizDeterminante = new int [7];
					System.out.println();
					for (int i = 0; i < matriz1.length; i++) {
						for (int j = 0; j < matriz1[i].length; j++) {
							System.out.print("Ingrese el elemento de la matriz 1 [ " + (i + 1) + " , " + (j + 1) + " ]: ");
							matriz1 [i] [j] = consola.nextInt();
						}
					}
					System.out.println();
					System.out.println();
					System.out.println("Matriz 1");
					for (int i = 0; i < matriz1.length; i++) {
						System.out.print("|");
						for (int j = 0; j < matriz1[i].length; j++) {
							System.out.print(matriz1 [i] [j]);
							 if (j!=matriz1[i].length-1) {
								 System.out.print("\t"); 
							 }
						}
						System.out.println("|");
					}
					matrizDeterminante[0] = matriz1[0][0] * matriz1[1][1] * matriz1[2][2];
					matrizDeterminante[1] = matriz1[0][1] * matriz1[1][2] * matriz1[2][0];
					matrizDeterminante[2] = matriz1[1][0] * matriz1[2][1] * matriz1[0][2];
					matrizDeterminante[3] = matriz1[0][2] * matriz1[1][1] * matriz1[2][0];
					matrizDeterminante[4] = matriz1[0][1] * matriz1[1][0] * matriz1[2][2];
					matrizDeterminante[5] = matriz1[1][2] * matriz1[2][1] * matriz1[0][0];
					matrizDeterminante[6] = matrizDeterminante[0] + matrizDeterminante[1] + matrizDeterminante[2] - matrizDeterminante[3] - matrizDeterminante[4] - matrizDeterminante[5];
					System.out.println();
					System.out.println();
					System.out.println("La determinante de la matriz");
					System.out.println(matrizDeterminante[6]);
				}
				break;
		}
		System.out.println();
		do {
			System.out.println("Desea realizar otra operación?");
			System.out.println("1. Si");
			System.out.println("2. No");
			System.out.print("Respuesta: ");
			respuesta1 = consola.nextInt();
			if (respuesta1 != 1 && respuesta1 != 2) {
				System.out.println();
				System.out.println("favor ingresar los numeros que aparecen en las opciones");
			}
		} while (respuesta1 != 1 && respuesta1 != 2);
	} while (respuesta1 == 1);
	System.out.println("Espero el programa este funcionando correctamente, Gracias por utilizarlo");
}
}