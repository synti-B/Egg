//Construir un programa que simule un menú de opciones para realizar las cuatro
//operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores
//numéricos enteros. El usuario, además, debe especificar la operación con el primer
//carácter de la operación que desea realizar: ?S' o ?s? para la suma, ?R? o ?r? para la resta, ?M?
//o ?m? para la multiplicación y ?D? o ?d? para la división.


Algoritmo ejercicio9
	Definir opciones Como Caracter
	Definir suma, resta, division, multiplicacion, num1,num2 Como Real
	
	Escribir "Calculadora con condicion multiple"
	Escribir ""
	
	Escribir "ingrese el primer numero"
	Leer num1
	Escribir "Ingrese el segundo numero"
	Leer num2
	
	Escribir "----------- M E N U -------------"
	Escribir ""
	Escribir "Indica la operacion a realizar"
	Escribir ""
	Escribir "S o s para sumar"
	Escribir "R o r para restar"
	Escribir "M o m para multiplicar"
	Escribir "D o d para dividir"
	Leer opciones
	
	Segun opciones hacer
		
		"S"O "s":
			Escribir  "la suma de los numeros es:", num1+num2
		"R"O "r":
			Escribir  "la resta de los numeros es:", num1-num2
		"M"O "m":
			Escribir  "la multiplicacion de los numeros es:", num1*num2
		"D"O "d":
			Escribir  "la division de los numeros es:", num1/num2
		De Otro Modo:
			Escribir "OPCION INCORRECTA"
	FinSegun
	
	
	
FinAlgoritmo
