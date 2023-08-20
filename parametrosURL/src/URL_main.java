package reto7_URLParams;

import java.util.ArrayList;
import java.util.Scanner;

public class URL_main {
	
	/*
	 * Dada una URL con parámetros, crea una función que obtenga sus valores.
	 * No se pueden usar operaciones del lenguaje que realicen esta tarea directamente.
	 *
	 * Ejemplo: En la url https://retosdeprogramacion.com?year=2023&challenge=0
	 * los parámetros serían ["2023", "0"]
	 */

	public static void main(String[] args) {
		
		String URL = introducirURL();
		analizadorURL(URL);
	}
	
	public static String introducirURL(){
		
		Scanner sc = new Scanner(System.in);
		String URL = "";
		
		System.out.print("Introduzca URL de estudio: ");
		URL = sc.next();
		
		return URL;
	}
	
	public static void analizadorURL(String URL) {
		
		String año = "", challenge = "";
		int contador = 0;
		ArrayList<String> contenedor = new ArrayList<String>();
		
		for (int i = 0; i < URL.length(); i++) {
			
			if (URL.charAt(i) == '=') {
				contador += 1;
				continue;
			}
			
			if (contador == 1) {
				if (!Character.isDigit(URL.charAt(i))) {
					continue;
				}
				año += URL.charAt(i);
			}else if (contador == 2) {
				challenge += URL.charAt(i);
			}
		}
		
		contenedor.add(año);
		contenedor.add(challenge);
		
		System.out.println(contenedor);
		
	}

}
