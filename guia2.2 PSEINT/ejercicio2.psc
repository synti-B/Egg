//Escriba un programa en el cual se ingrese un valor l�mite positivo, y a continuaci�n solicite
//n�meros al usuario hasta que la suma de los n�meros introducidos supere el l�mite inicial.

Algoritmo ejercicio2
	
	Definir  num, limite, acumulador Como Real
	
	Escribir "Ingrese un el limite  para el usuario"
	Leer limite	
	acumulador=0	
	Mientras  limite> acumulador Hacer	
		Escribir "ingrese un numero"
		Leer num	
		acumulador= acumulador+num			
				
	FinMientras
	
	Escribir "la suma de todos los numeros ingresados es: ", acumulador
FinAlgoritmo
