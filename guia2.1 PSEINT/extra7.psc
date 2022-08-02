//Hacer un algoritmo que lea un número por el teclado y determine si tiene tres dígitos.

Algoritmo extra7
	
	Definir  num Como Entero
	Escribir "Ingresa un numero"
	Leer num
	
	numers= ConvertirATexto(num)
	
	long= Longitud(numers)
	
	Segun long Hacer
		
		3: 
			escribir "tu numero tiene 3 digito"
			
		De Otro Modo:
			Escribir "tu numero posee ", long , " digitos"
	FinSegun
	
	
FinAlgoritmo
