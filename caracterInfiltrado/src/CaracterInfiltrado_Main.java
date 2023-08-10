package caracterI;

import java.util.ArrayList;
import java.util.Scanner;

public class CaracterInfiltrado_Main {

	/**
	 * Crea una función que reciba dos cadenas de texto casi iguales, a excepción de
	 * uno o varios caracteres. La función debe encontrarlos y retornarlos en
	 * formato lista/array. - Ambas cadenas de texto deben ser iguales en longitud.
	 * - Las cadenas de texto son iguales elemento a elemento. - No se pueden
	 * utilizar operaciones propias del lenguaje que lo resuelvan directamente.
	 * 
	 * Ejemplos: - Me llamo mouredev / Me llemo mouredov -> ["e", "o"] - Me
	 * llamo.Brais Moure / Me llamo brais moure -> [" ", "b", "m"]
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String texto1 = "", texto2 = "";
		int validador = 0;

		while (true) {

			if (validador == 0) {
				System.out.println("Para comenzar este ejercicio, introduzca las frases que desea analizar: ");
				System.out.print("Frase Nº1: ");
				texto1 = sc.nextLine();
				System.out.print("Frase Nº2: ");
				texto2 = sc.nextLine();
			}else {
				System.out.print("Frase Nº1: ");
				texto1 = sc.nextLine();
				System.out.print("Frase Nº2: ");
				texto2 = sc.nextLine();
			}
			
			if (texto1.length() != texto2.length()) {
				System.out.println("Ambas frases tienen que tener la misma longitud");
				validador++;
			} else {
				System.out.println((analizador(texto1, texto2)));
			}
		}
	}

	public static ArrayList<Character> analizador(String texto1, String texto2) {

		ArrayList<Character> caracteresDistintos = new ArrayList<Character>();

		int contador = 0, indice = 0;

		for (int i = 0; i < texto1.length(); i++) {
			for (int j = indice; j < texto2.length();) {
				if (texto1.charAt(i) == texto2.charAt(j)) {
					break;
				} else {
					caracteresDistintos.add(texto2.charAt(j));
					contador++;
					break;
				}
			}

			indice++;
		}

		return caracteresDistintos;

	}

}
