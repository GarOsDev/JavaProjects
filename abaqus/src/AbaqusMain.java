package abaqus;

public class AbaqusMain {

	public static void main(String[] args) {
		
		/*
		 * Crea una función que sea capaz de leer el número representado por el ábaco.
		 * - El ábaco se representa por un array con 7 elementos.
		 * - Cada elemento tendrá 9 "O" (aunque habitualmente tiene 10 para realizar
		 *   operaciones) para las cuentas y una secuencia de "---" para el alambre.
		 * - El primer elemento del array representa los millones, y el último las unidades.
		 * - El número en cada elemento se representa por las cuentas que están a
		 *   la izquierda del alambre.
		 *
		 * Ejemplo de array y resultado:
		 * ["O---OOOOOOOO",
		 *  "OOO---OOOOOO",
		 *  "---OOOOOOOOO",
		 *  "OO---OOOOOOO",
		 *  "OOOOOOO---OO",
		 *  "OOOOOOOOO---",
		 *  "---OOOOOOOOO"]
		 *  
		 *  Resultado: 1.302.790
		 */
		
		String[] valoresAbaco = {"O---OOOOOOOO", "OOO---OOOOOO", "---OOOOOOOOO", "OO---OOOOOOO", "OOOOOOO---OO", "OOOOOOOOO---", "---OOOOOOOOO"};
		
		System.out.print("El numero representado en el ábaco es el: ");
		abaqus(valoresAbaco);

	}
	
	public static void abaqus(String[] valoresAbaco) {
		
		int contador = 0, numero = 0;
		
		
		for (int i = 0; i < valoresAbaco.length; i++) {
			
			String valorFila = valoresAbaco[i];
				
			for (int j = 0; j < valorFila.length(); j++) {
				if (valorFila.charAt(j) == 'O') {
					contador++;
				}else {
					break;
				}
			}
			
			switch (i) {
				case 0:
					numero += contador * 1000000;
					break;
				case 1:
					numero += contador * 100000;
					break;
				case 2:
					numero += contador * 10000;
					break;
				case 3:
					numero += contador * 1000;
					break;
				case 4:
					numero += contador * 100;
					break;
				case 5:
					numero += contador * 10;
					break;
				case 6:
					numero += contador * 1;
					break;
	
				default:
					break;
			}
			
			contador = 0;
			
		}
		
		System.out.println(numero);
		
	}

}
