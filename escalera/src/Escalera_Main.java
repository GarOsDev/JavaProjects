package reto11_escalera;

import java.util.Scanner;

public class Escalera_Main {

	public static void main(String[] args) {

		/*
		 * Crea una función que dibuje una escalera según su número de escalones. 
		 * - Si el número es positivo, será ascendente de izquiera a derecha. 
		 * - Si el número es negativo, será descendente de izquiera a derecha. 
		 * - Si el número es cero, se dibujarán dos guiones bajos (__).
		 * 
		 * Ejemplo: 4 _ _| _| _| _|
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		int escalones = 0;

		while (true) {
			try {
				System.out.print("Introduzca numero de escalones: ");
				escalones = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Valor inválido");
				sc.next();
			}
		}

		crearEscalera(escalones);

	}

	public static void crearEscalera(int escalones) {

		if (escalones == 0) {
			System.out.println("__");
		} else if (escalones > 0) {
			escalones *= 2;
			for (int i = escalones; i > 0; i--) {

				if (i == escalones) {
					for (int j = 0; j <= i; j++) {
						if (j == i) {
							System.out.print("_");
						} else {
							System.out.print(" ");
						}
					}

				} else if (i < escalones) {
					i -= 1;
					for (int j = 0; j <= i; j++) {
						if (j == i) {
							System.out.print("_|");
						} else {
							System.out.print(" ");
						}
					}
				}
				System.out.println();
			}
		}else if (escalones < 0) {
			escalones *= 2;
			for (int i = escalones; i < 0; i++) {
				if (i == escalones) {
					for (int j = escalones; j <= i; j++) {
						if (j == i) {
							System.out.print("_");
						}
					}
				} else if (i > escalones) {
					i += 1;
					for (int j = escalones; j <= i; j++) {
						if (j == i) {
							System.out.print("|_");
						} else {
							if (j == escalones) {
								continue;
							}
							System.out.print(" ");
						}
					}
				}
				System.out.println();
			}
		}
		
		
		
		
	}

}
