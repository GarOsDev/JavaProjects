package reto5_PrimoFibonacciPar;

import java.util.Scanner;

public class PFP {
	
	
	/*
	 * Escribe un programa que, dado un número, compruebe y muestre si es primo, fibonacci y par.
	 * Ejemplos:
	 * - Con el número 2, nos dirá: "2 es primo, fibonacci y es par"
	 * - Con el número 7, nos dirá: "7 es primo, no es fibonacci y es impar"
	 */
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		
		while (true) {
			try {
				System.out.print("Ingrese valor numerico: ");
				numero = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Formato de valor inválido, sólo valores numericos");
				sc.next();
			}
		}
		
		comprobarPrimo(numero);
		calcularFibonacci(numero);
		comprobarPar(numero);
		
	}
	
	public static void comprobarPrimo(int numero) {
		
		boolean verif = false;
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				verif = true;
				break;
			}
		}
		
		if (verif == true) {
			System.out.println("El numero no es primo");
		}else {
			System.out.println("El numero es primo");
		}
	}
	
	public static void calcularFibonacci(int numero) {
		
		double fibbo = 1;
		
		for (int i = 1; i <= numero; i++) {
			fibbo *= i;
		}
		
		System.out.println("El valor Fibbonacci de " + numero + " es " + fibbo);
	}
	
	public static void comprobarPar(int numero) {
		if (numero % 2 == 0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es impar");
		}
	}

}
