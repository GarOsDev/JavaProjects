# Proyectos_Java
Porfolio con diversos proyectos en Java

************************************************* ABAQUS *************************************************

Crea una función que sea capaz de leer el número representado por el ábaco.
		 - El ábaco se representa por un array con 7 elementos.
		 - Cada elemento tendrá 9 "O" (aunque habitualmente tiene 10 para realizar
		   operaciones) para las cuentas y una secuencia de "---" para el alambre.
		 - El primer elemento del array representa los millones, y el último las unidades.
		 - El número en cada elemento se representa por las cuentas que están a
		   la izquierda del alambre.
		 
		  Ejemplo de array y resultado:
		   ["O---OOOOOOOO",
		   "OOO---OOOOOO",
		   "---OOOOOOOOO",
		   "OO---OOOOOOO",
		   "OOOOOOO---OO",
		   "OOOOOOOOO---",
		   "---OOOOOOOOO"]
		   
		   Resultado: 1.302.790

************************************************* TECLADO T9 *************************************************

Los primeros dispositivos móviles tenían un teclado llamado T9 con el que se
podía escribir texto utilizando únicamente su teclado numérico (del 0 al 9).

Crea una función que transforme las pulsaciones del T9 a su representación
con letras. - Debes buscar cuál era su correspondencia original. - Cada
bloque de pulsaciones va separado por un guión. - Si un bloque tiene más de
un número, debe ser siempre el mismo. - Ejemplo: Entrada:
4-2-777-666-7777-3-33-888 Salida: GAROSDEV

************************************************* TIC TAC TOE GAME *************************************************

Juego de las tres en raya con el ordenador como contrincante

************************************************* CARACTER INFILTRADO **********************************************

Crea una función que reciba dos cadenas de texto casi iguales, a excepción de
uno o varios caracteres. La función debe encontrarlos y retornarlos en
formato lista/array. - Ambas cadenas de texto deben ser iguales en longitud.
 - Las cadenas de texto son iguales elemento a elemento. - No se pueden
   utilizar operaciones propias del lenguaje que lo resuelvan directamente.
   
Ejemplos: 
- Me llamo mouredev / Me llemo mouredov -> ["e", "o"] 
- Me llamo.Brais Moure / Me llamo brais moure -> [" ", "b", "m"]

************************************************* EXPRESIONES MATEMÁTICAS ******************************************

Crea una función que reciba una expresión matemática (String) y compruebe si
es correcta. Retornará true o false.

 - Para que una expresión matemática sea correcta debe poseer un número, una
   operación y otro número separados por espacios. Tantos números y operaciones
   como queramos.
 - Números positivos, negativos, enteros o decimales.
 - Operaciones soportadas: + - * / %

Ejemplos: "5 + 6 / 7 - 4" -> true "5 a 6" -> false

************************************************* GENERADOR CONTRASEÑAS *************************************************

Escribe un programa que sea capaz de generar contraseñas de forma aleatoria.
Podrás configurar generar contraseñas con los siguientes parámetros: 
- Longitud: Entre 8 y 16.
- Con o sin letras mayúsculas.
- Con o sin números.
- Con o sin símbolos. (Pudiendo combinar todos estos parámetros entre ellos)
