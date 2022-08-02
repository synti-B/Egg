//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
//números al usuario hasta que la suma de los números introducidos supere el límite inicial.

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
