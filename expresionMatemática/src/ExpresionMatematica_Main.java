package reto2_Expresion_Matematica;

import java.util.Scanner;

public class ExpresionMatematica_Main {

	/**
	 * Crea una función que reciba una expresión matemática (String) y compruebe si
	 * es correcta. Retornará true o false.
	 * 
	 * - Para que una expresión matemática sea correcta debe poseer un número, una
	 * operación y otro número separados por espacios. Tantos números y operaciones
	 * como queramos. - Números positivos, negativos, enteros o decimales. -
	 * Operaciones soportadas: + - * / %
	 *
	 * Ejemplos: "5 + 6 / 7 - 4" -> true "5 a 6" -> false
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String expresionMatematica = "";

		System.out.println("Introduzca la expresion matematica deseada: ");
		expresionMatematica = sc.nextLine();

		comprobador(expresionMatematica);
	}

	public static void comprobador(String expresionMatematica) {

		boolean verif = false;
		int longitudCadena = expresionMatematica.length();
		

		for (int i = 0; i < expresionMatematica.length(); i++) {
			
			int indice = expresionMatematica.indexOf(expresionMatematica.charAt(i))+1;

			if (expresionMatematica.charAt(i) == ' ' || indice == longitudCadena) {
				if (Character.isAlphabetic(expresionMatematica.charAt(i))) {
					verif = false;
				} else {
					verif = true;
				}
			} else {
				if (Character.isAlphabetic(expresionMatematica.charAt(i)) || expresionMatematica.charAt(i + 1) != ' ') {
					verif = false;
					break;
				} else {
					verif = true;
				}
			}
			
			if (verif == false) {
				break;
			}
		}

		System.out.println(verif);
		
	}

}
