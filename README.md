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

************************************************** TECLADO T9 ******************************************************

Los primeros dispositivos móviles tenían un teclado llamado T9 con el que se
podía escribir texto utilizando únicamente su teclado numérico (del 0 al 9).

Crea una función que transforme las pulsaciones del T9 a su representación
con letras. - Debes buscar cuál era su correspondencia original. - Cada
bloque de pulsaciones va separado por un guión. - Si un bloque tiene más de
un número, debe ser siempre el mismo. - Ejemplo: Entrada:
4-2-777-666-7777-3-33-888 Salida: GAROSDEV

************************************************ TIC TAC TOE GAME **************************************************

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

************************************************* GENERADOR CONTRASEÑAS ********************************************

Escribe un programa que sea capaz de generar contraseñas de forma aleatoria.
Podrás configurar generar contraseñas con los siguientes parámetros: 
	- Longitud: Entre 8 y 16.
	- Con o sin letras mayúsculas.
	- Con o sin números.
	- Con o sin símbolos. (Pudiendo combinar todos estos parámetros entre ellos)

**************************************************** ADIVINAR PALABRA **********************************************

Crea un pequeño juego que consista en adivinar palabras en un número máximo de intentos: 
	- El juego comienza proponiendo una palabra aleatoria incompleta
	- Por ejemplo "m_ur_d_v", y el número de intentos que le quedan 
	- El usuario puede introducir únicamente una letra o una palabra (de la misma longitud a la palabra a adivinar)
	- Si escribe una letra y acierta, se muestra esa letra en la palabra. Si falla, se resta uno al número de intentos 
	- Si escribe una resolución y acierta, finaliza el juego, en caso contrario, se resta uno al número de intentos
	- Si el contador de intentos llega a 0, el jugador pierde
	- La palabra debe ocultar de forma aleatoria letras, y nunca puede comenzar ocultando más del 60% 
	- Puedes utilizar las palabras que quieras y el número de intentos que consideres

**************************************************** COLUMNAS EXCEL ************************************************

Crea una función que calcule el número de la columna de una hoja de Excel teniendo en cuenta su nombre. 
	 - Las columnas se designan por letras de la "A" a la "Z" de forma infinita. 
	 - Ejemplos: A = 1, Z = 26, AA = 27, CA = 79.

****************************************************** CUENTA ATRÁS ************************************************

Crea una función que reciba dos parámetros para crear una cuenta atrás. 
	 - El primero, representa el número en el que comienza la cuenta. 
	 - El segundo, los segundos que tienen que transcurrir entre cada cuenta. 
	 - Sólo se aceptan números enteros positivos para el numero inicial y decimales para el espacio de conteo 
	 - El programa finaliza al llegar a cero. 
	 - Debes imprimir cada número de la cuenta atrás.

****************************************** HETEROGRAMA/ISOGRAMA/PANGRAMA *******************************************

Crea 3 funciones, cada una encargada de detectar si una cadena de texto es un heterograma, un isograma o un pangrama.
	
	- Heterograma: es una palabra o frase que no contiene ninguna letra repetida
	- Isograma: palabra o frase en la que cada letra aparece el mismo número de veces 
	- Pangrama: textos en los que debe aparecer todas las letras del abecedario

********************************************** PARÁMETROS URL ******************************************************

Dada una URL con parámetros, crea una función que obtenga sus valores.
No se pueden usar operaciones del lenguaje que realicen esta tarea directamente.
	 
Ejemplo: En la url https://retosdeprogramacion.com?year=2023&challenge=0 los parámetros serían ["2023", "0"]

******************************************* PRIMO/FIBONACCI/PAR ****************************************************

Escribe un programa que, dado un número, compruebe y muestre si es primo, fibonacci y par.
	Ejemplos:
	- Con el número 2, nos dirá: "2 es primo, fibonacci y es par"
	- Con el número 7, nos dirá: "7 es primo, no es fibonacci y es impar"

******************************************* PIEDRA-PAPEL-TIJERA ****************************************************

Minijuego en consola de piedra/papel/tijera contra el ordenador

********************************************** ESCALERA ************************************************************

Crea una función que dibuje una escalera según su número de escalones. 
	- Si el número es positivo, será ascendente de izquiera a derecha. 
	- Si el número es negativo, será descendente de izquiera a derecha. 
	- Si el número es cero, se dibujarán dos guiones bajos (__).

********************************************** ARCHIVO TXT *********************************************************

Crea un programa capaz de interactuar con un fichero TXT. IMPORTANTE: El
fichero TXT NO debe subirse como parte de la corrección. Únicamente el
código.
	
- Si no existe, debe crear un fichero llamado "text.txt". 
- Desde el programa debes ser capaz de introducir texto por consola y guardarlo en una nueva línea cada vez 
que se pulse el botón "Enter". 
- Si el fichero existe, el programa tiene que dar la opción de seguir escribiendo a continuación o borrar su 
contenido y comenzar desde el principio. 
- Si se selecciona continuar escribiendo, se tiene que mostrar por consola el texto que ya posee el fichero.