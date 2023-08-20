package reto8_adivinarPalabra;

import java.util.Iterator;
import java.util.Scanner;

public class AdivinarMain {

	/*
	 * Crea un pequeño juego que consista en adivinar palabras en un número máximo
	 * de intentos: 
	 * - El juego comienza proponiendo una palabra aleatoria incompleta
	 * - Por ejemplo "m_ur_d_v", y el número de intentos que le quedan 
	 * - El usuario puede introducir únicamente una letra o una palabra (de la misma longitud que
	 * la palabra a adivinar) 
	 * - Si escribe una letra y acierta, se muestra esa letra en la palabra. Si falla, se resta uno al número de intentos 
	 * - Si escribe una resolución y acierta, finaliza el juego, en caso contrario, se resta uno al
	 * número de intentos 
	 * - Si el contador de intentos llega a 0, el jugador pierde
	 * - La palabra debe ocultar de forma aleatoria letras, y nunca puede comenzar ocultando más del 60% 
	 * - Puedes utilizar las palabras que quieras y el número de intentos que consideres
	 */

	public static void main(String[] args) {

		String[] palabras = new String[] { "azuzena", "esquimal", "cocodrilo", "ordenador", "agricultor", "montaña", "carretera", "elefante", "programador" };

		String palabraGenerada = generarPalabra(palabras);
		String palabraOcultada = ocultarPalabra(palabraGenerada);

		System.out.println("La palabra incompleta es: " + palabraOcultada);

		adivinarPalabra(palabraOcultada, palabraGenerada, palabras);
	}

	public static String generarPalabra(String[] palabras) {

		String palabraEscogida = "";

		palabraEscogida = palabras[(int) (Math.random() * palabras.length)];
		return palabraEscogida;

	}

	public static String ocultarPalabra(String palabra) {

		int cantidadOcultada = (int) (palabra.length() * 0.5);
		String palabraOcultaBase = "", palabraOcultaFinal = "";

		for (int i = 0; i < cantidadOcultada; i++) {

			int posicionAleatoria = (int) (Math.random() * palabra.length());
			char letraOcultada = palabra.charAt(posicionAleatoria);

			for (int j = 0; j < palabra.length(); j++) {
				if (palabra.charAt(j) == letraOcultada) {
					palabraOcultaBase = palabra.replace(letraOcultada, '_');
					break;
				}
			}

			palabra = palabraOcultaBase;

		}

		return palabra;

	}

	public static void adivinarPalabra(String palabraOcultada, String palabraGenerada, String[] palabras) {

		Scanner sc = new Scanner(System.in);

		int intentos = 3;
		char letraEscogida = ' ', respuesta = ' ';
		boolean verif = false, verifGanar = false;
		String palabraElegida = "";

		StringBuilder constructor = new StringBuilder(palabraOcultada);

		while (true) {

			System.out.println("Tienes " + intentos + " intentos para adivinar la palabra/acertar letra");
			System.out.print("Introduzca una letra: ");
			letraEscogida = sc.next().toLowerCase().charAt(0);

			for (int i = 0; i < palabraGenerada.length(); i++) {
				if (palabraGenerada.charAt(i) == letraEscogida) {
					if (constructor.charAt(i) == '_') {
						constructor.setCharAt(i, letraEscogida);
						System.out.println(constructor);
						intentos -= 1;
						verif = true;
						break;
					} else {
						continue;
					}
				}
			}

			if (verif == true) {
				verif = false;
			} else {
				intentos -= 1;
				System.out.println("No acertó. Le quedan " + intentos + " intentos");
				if (intentos == 0) {
					System.out.println("Agotó todos los intentos, finalizó la partida");
					break;
				}
			}

			System.out.print("Conoce la palabra(S/N)?: ");
			respuesta = sc.next().toUpperCase().charAt(0);

			if (respuesta == 'S') {
				System.out.print("Introduzcala a continuación: ");
				palabraElegida = sc.next();

				for (int i = 0; i < palabras.length; i++) {
					if (palabras[i].equals(palabraElegida)) {
						System.out.println("FELICIDADES, ACERTASTE!!");
						verifGanar = true;
						break;
					}
				}
			} else {
				
				if (intentos == 0) {
					System.out.println("Agotó todos los intentos, finalizó la partida");
					break;
				}
				continue;
			}

			if (verifGanar == true) {
				break;
			} else {
				intentos -= 1;
				System.out.println("Fallaste! Intentalo de nuevo!");
				if (intentos == 0) {
					System.out.println("Agotó todos los intentos, finalizó la partida");
					break;
				}
			}
			
			
		}

	}

}
