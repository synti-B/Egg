//Escriba un programa que valide si una nota est� entre 0 y 10, sino est� entre 0 y 10 la nota
//se pedir� de nuevo hasta que la nota sea correcta.

Algoritmo ejercicio1
	Definir nota Como Entero
	Escribir "Ingresa una nota valida"
	Leer nota
	
	Mientras nota <0 O nota>10 Hacer
		
		Escribir "la nota ingresada ", nota ," es incorrecta ingresa una nota correcta"
		Leer nota
	FinMientras
	Escribir "la nota es correcta, la nota ingresada es: ", nota
	
FinAlgoritmo
