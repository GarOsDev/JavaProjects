package tecladoT9;

import java.util.Scanner;

public class TecladoMain {

	public static void main(String[] args) {

		/*
		 * Los primeros dispositivos móviles tenían un teclado llamado T9 con el que se
		 * podía escribir texto utilizando únicamente su teclado numérico (del 0 al 9).
		 *
		 * Crea una función que transforme las pulsaciones del T9 a su representación
		 * con letras. - Debes buscar cuál era su correspondencia original. - Cada
		 * bloque de pulsaciones va separado por un guión. - Si un bloque tiene más de
		 * un número, debe ser siempre el mismo. - Ejemplo: Entrada:
		 * 6-666-88-777-33-3-33-888 Salida: MOUREDEV
		 */

		Scanner sc = new Scanner(System.in);

		String entrada = "", secuencia = "", mensaje = "";
		int valorNumerico = 0, contador = 0;

		System.out.print("Introduzca secuencia de entrada separado por guiones: ");
		entrada = sc.nextLine();

		while (true) {

			for (int i = contador; i < entrada.length(); contador++) {
				
				if (contador == entrada.length()) {
					break;
				}
				
				if (entrada.charAt(contador) == '-') {
					break;
				} else {
					secuencia += entrada.charAt(contador);	
				}		
			}
			
			valorNumerico = Integer.parseInt(secuencia);
			
			switch (valorNumerico) {
			case 2:
				mensaje += 'A';
				break;
			case 22:
				mensaje += 'B';
				break;
			case 222:
				mensaje += 'C';
				break;
				
			case 3:
				mensaje += 'D';
				break;
			case 33:
				mensaje += 'E';
				break;
			case 333:
				mensaje += 'F';
				break;
				
			case 4:
				mensaje += 'G';
				break;
			case 44:
				mensaje += 'H';
				break;
			case 444:
				mensaje += 'I';
				break;
				
			case 5:
				mensaje += 'J';
				break;
			case 55:
				mensaje += 'K';
				break;
			case 555:
				mensaje += 'L';
				break;
				
			case 6:
				mensaje += 'M';
				break;
			case 66:
				mensaje += 'N';
				break;
			case 666:
				mensaje += 'O';
				break;
				
			case 7:
				mensaje += 'P';
				break;
			case 77:
				mensaje += 'Q';
				break;
			case 777:
				mensaje += 'R';
				break;
			case 7777:
				mensaje += 'S';
				break;
				
			case 8:
				mensaje += 'T';
				break;
			case 88:
				mensaje += 'U';
				break;
			case 888:
				mensaje += 'V';
				break;
				
			case 9:
				mensaje += 'W';
				break;
			case 99:
				mensaje += 'X';
				break;
			case 999:
				mensaje += 'Y';
				break;
			case 9999:
				mensaje += 'Z';
				break;

			default:
				break;
			}
			
			if (contador == entrada.length()) {
				break;
			}else {
				secuencia = "";
				valorNumerico = 0;
				contador ++;
			}

		}
		
		System.out.println(mensaje);

	}

}
