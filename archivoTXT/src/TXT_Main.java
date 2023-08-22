package reto13_archivoTXT;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TXT_Main {

	/*
	 * Crea un programa capaz de interactuar con un fichero TXT. IMPORTANTE: El
	 * fichero TXT NO debe subirse como parte de la corrección. Únicamente el
	 * código.
	 * 
	 * - Si no existe, debe crear un fichero llamado "text.txt". - Desde el programa
	 * debes ser capaz de introducir texto por consola y guardarlo en una nueva
	 * línea cada vez que se pulse el botón "Enter". - Si el fichero existe, el
	 * programa tiene que dar la opción de seguir escribiendo a continuación o
	 * borrar su contenido y comenzar desde el principio. - Si se selecciona
	 * continuar escribiendo, se tiene que mostrar por consola el texto que ya posee
	 * el fichero.
	 */

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		String ruta = "C:\\Users\\turbo\\eclipse-workspace\\RetosProgramacion_MoureDev\\src\\reto13_archivoTXT\\text.txt";
		String texto = "";
		char respuestaEscribir = ' ';
		int eleccionExiste = 0;
		boolean finalizar = false;

		boolean existencia = comprobarExistencia(ruta);

		if (existencia == false) {
			FileWriter text = new FileWriter(ruta);
			BufferedWriter textBuffer = new BufferedWriter(text);

			while (true) {

				System.out.println("Introduzca el texto que desee escribir en el archivo:");
				texto = sc.nextLine();

				textBuffer.write(texto);
				textBuffer.newLine();

				do {
					try {

						System.out.println("Desea escribir nuevo texto?(S/N):");
						respuestaEscribir = sc.next().toUpperCase().charAt(0);
						sc.nextLine();

						if (respuestaEscribir != 'S' && respuestaEscribir != 'N') {
							System.out.println("Solo respuestas validas");
						}
					} catch (Exception e) {
						System.out.println("Valor no valido");
						sc.next();
					}

				} while (respuestaEscribir != 'S' && respuestaEscribir != 'N');

				if (respuestaEscribir == 'N') {
					textBuffer.close();
					break;
				}

			}

		} else {

			while (true) {
				try {

					System.out.println("El fichero 'text.txt' ya existe, que desea hacer a continuacion?:");
					System.out.println("1- Seguir escribiendo a continuacion");
					System.out.println("2- Borrar su contenido y comenzar desde el principio");
					System.out.println("3- Salir");

					eleccionExiste = sc.nextInt();

					switch (eleccionExiste) {
					case 1:
						seguirEscribiendo(ruta);
						break;
					case 2:
						empezarNuevo(ruta);
						break;
					case 3:
						finalizar = true;

						File archivotxt = new File(ruta);

						if (!Desktop.isDesktopSupported()) {
							System.out.println("Cannot open file");
						} else {
							Desktop dsk = Desktop.getDesktop();
							dsk.open(archivotxt);
						}
						break;
					default:
						System.out.println("Opcion no disponible");
						break;
					}

					if (finalizar == true) {
						break;
					}

				} catch (Exception e) {
					System.out.println("Valor no valido");
					sc.next();
				}

			}
		}

	}

	public static boolean comprobarExistencia(String ruta) {

		File fileTest = new File(ruta);
		boolean existe = false;

		if (fileTest.exists()) {
			existe = true;
		} else {
			existe = false;
		}
		return existe;
	}

	public static void seguirEscribiendo(String ruta) throws IOException {

		FileWriter SE = new FileWriter(ruta, true);
		BufferedWriter SEB = new BufferedWriter(SE);

		Scanner sc = new Scanner(System.in);
		String texto = "";
		char respuestaEscribir = ' ';

		while (true) {

			System.out.println("Introduzca el texto que desee escribir en el archivo:");
			texto = sc.nextLine();

			SEB.write(texto);
			SEB.newLine();

			do {
				try {

					System.out.println("Desea escribir nuevo texto?(S/N):");
					respuestaEscribir = sc.next().toUpperCase().charAt(0);
					sc.nextLine();

					if (respuestaEscribir != 'S' && respuestaEscribir != 'N') {
						System.out.println("Solo respuestas validas");
					}
				} catch (Exception e) {
					System.out.println("Valor no valido");
					sc.next();
				}

			} while (respuestaEscribir != 'S' && respuestaEscribir != 'N');

			if (respuestaEscribir == 'N') {
				SEB.close();
				break;
			}
		}

	}

	public static void empezarNuevo(String ruta) throws IOException {

		FileWriter SE = new FileWriter(ruta, false);
		BufferedWriter SEB = new BufferedWriter(SE);

		Scanner sc = new Scanner(System.in);
		String texto = "";
		char respuestaEscribir = ' ';

		while (true) {

			System.out.println("Introduzca el texto que desee escribir en el archivo:");
			texto = sc.nextLine();

			SEB.write(texto);
			SEB.newLine();

			do {
				try {

					System.out.println("Desea escribir nuevo texto?(S/N):");
					respuestaEscribir = sc.next().toUpperCase().charAt(0);
					sc.nextLine();

					if (respuestaEscribir != 'S' && respuestaEscribir != 'N') {
						System.out.println("Solo respuestas validas");
					}
				} catch (Exception e) {
					System.out.println("Valor no valido");
					sc.next();
				}

			} while (respuestaEscribir != 'S' && respuestaEscribir != 'N');

			if (respuestaEscribir == 'N') {
				SEB.close();
				break;
			}
		}

	}

}
