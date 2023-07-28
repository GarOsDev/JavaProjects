package ticTacToe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe_Main {
	
	static ArrayList<Integer> posicionesJugador = new ArrayList<Integer>();
	static ArrayList<Integer> posicionesCPU = new ArrayList<Integer>();

	public static void main(String[] args) {
		
		char[][] tableroJuego = {{' ', '|', ' ', '|', ' '}, 
								{'-', '+', '-', '+', '-'},
								{' ', '|', ' ', '|', ' '},
								{'-', '+', '-', '+', '-'},
								{' ', '|', ' ', '|', ' '}};
		
		dibujarTablero(tableroJuego);
		
		
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduzca lugar de ficha: ");
			int playerPos = sc.nextInt();
			
			while(posicionesJugador.contains(playerPos) || posicionesCPU.contains(playerPos)) {
				System.out.println("Posicion ocupada! Introduzca una correcta");
				playerPos = sc.nextInt();
			}
			
			colocarPieza(tableroJuego, playerPos, "player");
			
			String resultado = comprobarGanador();
			
			if(resultado.length() > 0) {
				System.out.println(resultado);
				dibujarTablero(tableroJuego);
				break;
			}
			
			Random rand = new Random();
			int cpuPos = rand.nextInt(9)+1;
			
			while(posicionesJugador.contains(cpuPos) || posicionesCPU.contains(cpuPos)) {
				playerPos = cpuPos = rand.nextInt(9)+1;
			}
			
			colocarPieza(tableroJuego, cpuPos, "cpu");

			dibujarTablero(tableroJuego);
			
			resultado = comprobarGanador();
			if(resultado.length() > 0) {
				System.out.println(resultado);
				dibujarTablero(tableroJuego);
				break;
			}
			
			
		}
		
	}
	
	public static void dibujarTablero(char[][] tableroJuego) {
		for (char[] row : tableroJuego) {
			for(char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
	public static void colocarPieza(char[][] tableroJuego, int pos, String user) {
		
		char symbol = 'X';
		
		if(user.equals("player")) {
			symbol = 'X';
			posicionesJugador.add(pos);
		}else if(user.equals("cpu")) {
			symbol = 'O';
			posicionesCPU.add(pos);
		}
		
			switch(pos) {
				case 1:
					tableroJuego[0][0] = symbol;
					break;
				case 2:
					tableroJuego[0][2] = symbol;
					break;
				case 3:
					tableroJuego[0][4] = symbol;
					break;
				case 4:
					tableroJuego[2][0] = symbol;
					break;
				case 5:
					tableroJuego[2][2] = symbol;
					break;
				case 6:
					tableroJuego[2][4] = symbol;
					break;
				case 7:
					tableroJuego[4][0] = symbol;
					break;
				case 8:
					tableroJuego[4][2] = symbol;
					break;
				case 9:
					tableroJuego[4][4] = symbol;
					break;
				default:
					break;
			}
	}
	
	public static String comprobarGanador() {
		
		List filaSup = Arrays.asList(1, 2, 3);
		List filaMid = Arrays.asList(4, 5, 6);
		List filaInf = Arrays.asList(7, 8, 9);
		
		List colIzda = Arrays.asList(1, 4, 7);
		List colMid = Arrays.asList(2, 5, 8);
		List colDcha = Arrays.asList(3, 6, 9);
		
		List cruzDcha = Arrays.asList(7, 5, 3);
		List cruzIzda = Arrays.asList(1, 5, 9);
	
		List<List> ganador = new ArrayList<List>();
		ganador.add(filaSup);
		ganador.add(filaMid);
		ganador.add(filaInf);
		
		ganador.add(colIzda);
		ganador.add(colMid);
		ganador.add(colDcha);
		
		ganador.add(cruzDcha);
		ganador.add(cruzIzda);
		
		for(List l : ganador) {
			if(posicionesJugador.containsAll(l)) {
				return "Felicidades, ganaste!";
			}else if(posicionesCPU.containsAll(l)){
				return "CPU wins!";
			}else if (posicionesJugador.size() + posicionesCPU.size() == 9) {
				return "CAT!";
			}
		}
		
		return "";
	}

}
