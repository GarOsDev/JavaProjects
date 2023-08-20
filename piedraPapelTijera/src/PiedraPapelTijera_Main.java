package reto6_PiedraPapelTijera;

import java.util.ArrayList;
import java.util.Scanner;

public class PiedraPapelTijera_Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> posibilidades = new ArrayList<String>();

		posibilidades.add("PIEDRA");
		posibilidades.add("PAPEL");
		posibilidades.add("TIJERA");

		int contador = 0, contadorJugador = 0, contadorOrdenador = 0, contadorEmpate = 0;
		String eleccionJugador = "", eleccionOrd = "", ganador = "";
		char respuesta = ' ';

		System.out.println("Bienvenido al juego Piedra-Papel-Tijera");
		System.out.println("Jugará contra el ordenador, para ello, elija una de las tres opciones: ");
		
		while (true) {
			
			while (true) {
				try {
					System.out.print("Escriba a continuacion: ");
					eleccionJugador = sc.next().toUpperCase();

					if (posibilidades.contains(eleccionJugador)) {
						break;
					} else {
						System.out.println("Opcion no disponible. Elija otra");
					}

				} catch (Exception e) {
					System.out.println("Error producido: " + e.getMessage());
				}
			}
			System.out.println();
			eleccionOrd = eleccionOrdenador(posibilidades);
			ganador = ganador(eleccionJugador, eleccionOrd);
			
			if (ganador.equals("JUGADOR")) {
				contadorJugador += 1;
			}else if (ganador.equals("ORDENADOR")) {
				contadorOrdenador += 1;
			}else {
				contadorEmpate += 1;
			}
			
			System.out.println("Jugador: " + contadorJugador + " | Ordenador: " + contadorOrdenador + " | Empate: " + contadorEmpate);
			System.out.print("\nDesea jugar otra vez?(S/N): ");
			respuesta = sc.next().toUpperCase().charAt(0);
			
			if (respuesta == 'S') {
				continue;
			}else {
				System.out.println("Gracias por jugar");
				break;
			}
		}

		

		

	}

	public static String eleccionOrdenador(ArrayList<String> posibilidades) {

		String eleccionOrdenador = "";
		int valorAleatorio = (int) (Math.random() * 3);
		eleccionOrdenador = posibilidades.get(valorAleatorio);
		return eleccionOrdenador;
	}

	public static String ganador(String eleccionJugador, String eleccionOrdenador) {

		String ganador = "";
		int valorJugador = 0, valorOrdenador = 0;
		System.out.println("Eleccion jugador: " + eleccionJugador);
		System.out.println("Eleccion ordenador: " + eleccionOrdenador);
		
		switch (eleccionJugador) {
		case "PIEDRA":
			valorJugador = 1;
			break;
		case "PAPEL":
			valorJugador = 2;
			break;
		case "TIJERA":
			valorJugador = 3;
			break;

		default:
			break;
		}

		switch (eleccionOrdenador) {
		case "PIEDRA":
			valorOrdenador = 1;
			break;
		case "PAPEL":
			valorOrdenador = 2;
			break;
		case "TIJERA":
			valorOrdenador = 3;
			break;

		default:
			break;
		}

		if (valorJugador == 1 && valorOrdenador == 1) {
			ganador = "EMPATE";
			System.out.println("EMPATE");
		}else if (valorJugador == 2 && valorOrdenador == 2) {
			ganador = "EMPATE";
			System.out.println("EMPATE");
		}else if (valorJugador == 3 && valorOrdenador == 3) {
			ganador = "EMPATE";
			System.out.println("EMPATE");
		}else if (valorJugador == 1 && valorOrdenador == 2) {
			ganador = "ORDENADOR";
			System.out.println("GANA ORDENADOR");
		}else if (valorJugador == 1 && valorOrdenador == 3) {
			ganador = "JUGADOR";
			System.out.println("GANA JUGADOR");
		}else if (valorJugador == 2 && valorOrdenador == 1) {
			ganador = "JUGADOR";
			System.out.println("GANA JUGADOR");
		}else if (valorJugador == 2 && valorOrdenador == 3) {
			ganador = "ORDENADOR";
			System.out.println("GANA ORDENADOR");
		}else if (valorJugador == 3 && valorOrdenador == 1) {
			ganador = "ORDENADOR";
			System.out.println("GANA ORDENADOR");
		}else if (valorJugador == 3 && valorOrdenador == 2) {
			ganador = "JUGADOR";
			System.out.println("GANA JUGADOR");
		}
		
		return ganador;

	}

}
