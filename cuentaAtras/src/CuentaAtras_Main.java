package reto9_CuentaAtras;

import java.util.Scanner;

public class CuentaAtras_Main {
	
	/**
	 * VARIABLE PARA LETRAS COLOR ROJO CONSOLA
	 */
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_GREEN = "\u001B[32m";

	public static void main(String[] args) throws InterruptedException {

		/*
		 * Crea una función que reciba dos parámetros para crear una cuenta atrás. 
		 * - El primero, representa el número en el que comienza la cuenta. 
		 * - El segundo, los segundos que tienen que transcurrir entre cada cuenta. 
		 * - Sólo se aceptan números enteros positivos para el numero inicial y decimales para el
		 *   espacio de conteo 
		 * - El programa finaliza al llegar a cero. 
		 * - Debes imprimir cada número de la cuenta atrás.
		 */

		Scanner sc = new Scanner(System.in);

		int numeroComienzo = 0; 
		float espacioCuenta = 0;
		

		while (true) {
			try {

				System.out.print("Introduzca numero(segundos) de comienzo: ");
				numeroComienzo = sc.nextInt();

				System.out.print("Introduzca espacio de conteo(segundos):");
				espacioCuenta = sc.nextFloat();

				if (numeroComienzo < 0 || espacioCuenta < 0) {
					System.out.println("Los dos valores han de ser positivos");
				} else {
					break;
				}

			} catch (Exception e) {
				System.out.println("Solo numeros enteros y positivos");
				sc.next();
			}
		}
		
		cuentaAtras(numeroComienzo, espacioCuenta,ANSI_RED, ANSI_GREEN, ANSI_RESET);

	}
	
	

	public static void cuentaAtras(int numeroComienzo, float espacioCuenta, String ANSI_RED,String ANSI_GREEN, String ANSI_RESET) throws InterruptedException {

		for (int i = numeroComienzo; i >= 0; i--) {
			
			if (numeroComienzo % 2 == 0) {
				System.out.println(ANSI_RED + numeroComienzo + ANSI_RESET);
			}else {
				System.out.println(numeroComienzo);
			}
			
			if (numeroComienzo == 0) {
				System.out.println(ANSI_GREEN + "Cuenta atrás terminó!" + ANSI_RESET);
			}
			
			numeroComienzo -= 1;
			Thread.sleep((long) (espacioCuenta*1000));
		}
		
		
	}

}
