package reto4_ColumnaExcel;

import java.util.Scanner;

public class ColumnaMain {

	/*
	 * Crea una función que calcule el número de la columna de una hoja de Excel
	 * teniendo en cuenta su nombre. - Las columnas se designan por letras de la "A"
	 * a la "Z" de forma infinita. - Ejemplos: A = 1, Z = 26, AA = 27, CA = 79.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String letras = "";
		boolean verif = false;

		while (true) {

			System.out.println("Introduzca el valor de la columna: ");
			letras = sc.next().toUpperCase();

			for (int i = 0; i < letras.length(); i++) {
				if (Character.isAlphabetic(letras.charAt(i))) {
					verif = true;
				} else {
					System.out.println("Los valores de las columna han de ser alfabéticos");
					verif = false;
					break;
				}
			}

			if (verif == true) {
				break;
			}
		}

		System.out.println(numeroCol(letras));

	}

	public static int numeroCol(String letras) {

		int posicionletra = 0;

		char[] abecedario = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

		for (int i = 0; i < letras.length(); i++) {
			for (int j = 0; j < abecedario.length; j++) {

				if (letras.charAt(i) == abecedario[j]) {
					posicionletra = (posicionletra * abecedario.length) + (j + 1);
					break;
				}

			}
		}

		return posicionletra;

	}

}
