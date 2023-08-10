package reto3_GeneradorContraseñas;

import java.util.Scanner;

public class GeneradorMain {

	/*
	 * Escribe un programa que sea capaz de generar contraseñas de forma aleatoria.
	 * Podrás configurar generar contraseñas con los siguientes parámetros: -
	 * Longitud: Entre 8 y 16. - Con o sin letras mayúsculas. - Con o sin números. -
	 * Con o sin símbolos. (Pudiendo combinar todos estos parámetros entre ellos)
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String contrasena = "";
		int longitud = 0;
		char respuestaMayus = ' ', respuestaNumeros = ' ', respuestaSimbolos = ' ';
		String passTemp = "";

		while (true) {
			System.out.print("Indique longitud de la contraseña (8-45): ");
			longitud = sc.nextInt();

			if (longitud >= 8 && longitud <= 45) {
				break;
			} else {
				System.out.println("La contraseña ha de tener de 8 a 45 caracteres");
			}
		}

		System.out.print("Desea que tenga mayusculas?(S/N): ");
		respuestaMayus = sc.next().toUpperCase().charAt(0);
		System.out.print("Desea que tenga numeros?(S/N): ");
		respuestaNumeros = sc.next().toUpperCase().charAt(0);
		System.out.print("Desea que tenga simbolos?(S/N): ");
		respuestaSimbolos = sc.next().toUpperCase().charAt(0);

		for (int i = 0; i < longitud; i++) {

			if (respuestaMayus == 'S' && respuestaNumeros == 'S' && respuestaSimbolos == 'S') {
				int valorAleatorio = (int) (Math.random() * 94 + 32);
				char caracter = (char) valorAleatorio;
				contrasena += caracter;
			} else if (respuestaMayus == 'S' && respuestaNumeros == 'S' && respuestaSimbolos == 'N') {

				for (int j = 0; j < longitud; j++) {
					int numeroAleatorio = (int) (Math.random() * 9 + 48);
					int mayusculaAleatoria = (int) (Math.random() * 25 + 65);
					int minusculaAleatoria = (int) (Math.random() * 25 + 97);

					passTemp += (char) numeroAleatorio;
					passTemp += (char) mayusculaAleatoria;
					passTemp += (char) minusculaAleatoria;

				}

				for (int j = 0; j < longitud; j++) {
					int valRandTemp = (int) (Math.random() * passTemp.length());
					contrasena += passTemp.charAt(valRandTemp);
				}

				break;
			} else if (respuestaMayus == 'S' && respuestaNumeros == 'N' && respuestaSimbolos == 'N') {

				for (int j = 0; j < longitud; j++) {

					int mayusculaAleatoria = (int) (Math.random() * 25 + 65);
					int minusculaAleatoria = (int) (Math.random() * 25 + 97);

					passTemp += (char) mayusculaAleatoria;
					passTemp += (char) minusculaAleatoria;

				}

				for (int j = 0; j < longitud; j++) {
					int valRandTemp = (int) (Math.random() * passTemp.length());
					contrasena += passTemp.charAt(valRandTemp);
				}

				break;

			} else if (respuestaMayus == 'N' && respuestaNumeros == 'N' && respuestaSimbolos == 'N') {

				for (int j = 0; j < longitud; j++) {

					int minusculaAleatoria = (int) (Math.random() * 25 + 97);

					passTemp += (char) minusculaAleatoria;

				}

				for (int j = 0; j < longitud; j++) {
					int valRandTemp = (int) (Math.random() * passTemp.length());
					contrasena += passTemp.charAt(valRandTemp);
				}

				break;

			}else if (respuestaMayus == 'N' && respuestaNumeros == 'S' && respuestaSimbolos == 'S') {

				for (int j = 0; j < longitud; j++) {
					int numeroAleatorio = (int) (Math.random() * 9 + 48);
					int minusculaAleatoria = (int) (Math.random() * 25 + 97);
					int simboloAleatorio1 = (int) (Math.random() * 14 + 32);
					int simboloAleatorio2 = (int) (Math.random() * 6 + 58);
					int simboloAleatorio3 = (int) (Math.random() * 5 + 91);

					passTemp += (char) numeroAleatorio;
					passTemp += (char) minusculaAleatoria;
					passTemp += (char) simboloAleatorio1;
					passTemp += (char) simboloAleatorio2;
					passTemp += (char) simboloAleatorio3;

				}

				for (int j = 0; j < longitud; j++) {
					int valRandTemp = (int) (Math.random() * passTemp.length());
					contrasena += passTemp.charAt(valRandTemp);
				}

				break;
			}else if (respuestaMayus == 'N' && respuestaNumeros == 'N' && respuestaSimbolos == 'S') {

				for (int j = 0; j < longitud; j++) {
					
					int minusculaAleatoria = (int) (Math.random() * 25 + 97);
					int simboloAleatorio1 = (int) (Math.random() * 14 + 32);
					int simboloAleatorio2 = (int) (Math.random() * 6 + 58);
					int simboloAleatorio3 = (int) (Math.random() * 5 + 91);

					passTemp += (char) minusculaAleatoria;
					passTemp += (char) simboloAleatorio1;
					passTemp += (char) simboloAleatorio2;
					passTemp += (char) simboloAleatorio3;

				}

				for (int j = 0; j < longitud; j++) {
					int valRandTemp = (int) (Math.random() * passTemp.length());
					contrasena += passTemp.charAt(valRandTemp);
				}

				break;
			}else if (respuestaMayus == 'S' && respuestaNumeros == 'N' && respuestaSimbolos == 'S') {

				for (int j = 0; j < longitud; j++) {
					int mayusculaAleatoria = (int) (Math.random() * 25 + 65);
					int minusculaAleatoria = (int) (Math.random() * 25 + 97);
					int simboloAleatorio1 = (int) (Math.random() * 14 + 32);
					int simboloAleatorio2 = (int) (Math.random() * 6 + 58);
					int simboloAleatorio3 = (int) (Math.random() * 5 + 91);

					passTemp += (char) mayusculaAleatoria;
					passTemp += (char) minusculaAleatoria;
					passTemp += (char) simboloAleatorio1;
					passTemp += (char) simboloAleatorio2;
					passTemp += (char) simboloAleatorio3;

				}

				for (int j = 0; j < longitud; j++) {
					int valRandTemp = (int) (Math.random() * passTemp.length());
					contrasena += passTemp.charAt(valRandTemp);
				}

				break;
			}
		}

		System.out.println(contrasena);

	}

}
