//Construir un programa que simule un men� de opciones para realizar las cuatro
//operaciones aritm�ticas b�sicas (suma, resta, multiplicaci�n y divisi�n) con dos valores
//num�ricos enteros. El usuario, adem�s, debe especificar la operaci�n con el primer
//car�cter de la operaci�n que desea realizar: ?S' o ?s? para la suma, ?R? o ?r? para la resta, ?M?
//o ?m? para la multiplicaci�n y ?D? o ?d? para la divisi�n.


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
