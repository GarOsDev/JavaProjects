package reto10_HeterogramaIsogramaPangrama;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HIP_Main {

	public static void main(String[] args) {

		/*
		 * Crea 3 funciones, cada una encargada de detectar si una cadena de texto es un
		 * heterograma, un isograma o un pangrama.
		 * 
		 * - Heterograma: es una palabra o frase que no contiene ninguna letra repetida
		 * - Isograma: palabra o frase en la que cada letra aparece el mismo número de veces 
		 * - Pangrama: textos en los que debe aparecer todas las letras del abecedario
		 */

		Scanner sc = new Scanner(System.in);

		String texto = "";

		System.out.println("Este programa estudiará si el texto que introduzcas es un heterograma, isograma o pangrama");
		System.out.println("Introduzca texto de estudio: ");
		texto = sc.nextLine();

		boolean VerifHeterograma = verificarHeterograma(texto);
		boolean VerifIsograma = verificarIsograma(texto);
		boolean VerifPangrama = verificarpangrama(texto);

		if (VerifHeterograma == true) {
			System.out.println("Su texto es un heterograma");
		}
		if (VerifIsograma == true) {
			System.out.println("El texto es un isograma");
		}
		if (VerifPangrama == true) {
			System.out.println("El texto es un pangrama");
		}

	}

	public static boolean verificarHeterograma(String texto) {

		boolean verificador = false;
		int contador = 0;
		ArrayList<Character> abecedario = new ArrayList<Character>();
		Collections.addAll(abecedario, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'j', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');

		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) == ' ') {
				continue;
			}
			for (int j = 0; j < abecedario.size(); j++) {
				if (texto.charAt(i) == abecedario.get(j)) {
					contador++;
					abecedario.remove(j);
					break;
				}
			}
		}
		
		if (contador == texto.length()) {
			verificador = true;
		}

		return verificador;

	}

	public static boolean verificarIsograma(String texto) {

		boolean verificador = false;
		ArrayList<Character> abecedario = new ArrayList<Character>();
		Collections.addAll(abecedario, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'j', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
		ArrayList<Character> letrasTexto = new ArrayList<Character>();
		ArrayList<Integer> cantidadRepeticiones = new ArrayList<Integer>();

		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) == ' ') {
				continue;
			}
			letrasTexto.add(texto.charAt(i));
		}
		

		for (int i = 0; i < letrasTexto.size()+1; i++) {
			i = 0;
			int cantidad = Collections.frequency(letrasTexto, letrasTexto.get(i));
			cantidadRepeticiones.add(cantidad);
			letrasTexto.removeAll(Collections.singleton(letrasTexto.get(i)));
		}

		for (int i = 0; i < cantidadRepeticiones.size(); i++) {
			
			if (i == (cantidadRepeticiones.size()-1)) {
				break;
			}
			if (cantidadRepeticiones.get(i) == cantidadRepeticiones.get(i+1)) {
				verificador = true;
			}else {
				verificador = false;
				break;
			}
			
		}

		return verificador;

	}
	
	public static boolean verificarpangrama(String texto) {
		
		boolean verificador = false;
		ArrayList<Character> abecedario = new ArrayList<Character>();
		Collections.addAll(abecedario, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'j', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
		ArrayList<Character> letrasTexto = new ArrayList<Character>();
		
		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) == ' ') {
				continue;
			}
			letrasTexto.add(texto.charAt(i));
		}
		
		for (int i = 0; i < abecedario.size(); i++) {
			if (letrasTexto.contains(abecedario.get(i))) {
				verificador = true;
			}else {
				verificador = false;
				break;
			}
		}
		return verificador;
	}

}
