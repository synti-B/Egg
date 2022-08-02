
	Algoritmo ejercicio3
		
		Definir  num, limite, acumulador, contador Como Real
		
		acumulador=0	
		contador=0
		
		Mientras  num <> -1 Hacer	
			Escribir "ingrese un numero"
			Leer num	
			acumulador= acumulador+num
			contador=contador+1			
		FinMientras	
		Escribir"La cantidad de numeros ingresados es: ", contador-1		
		Escribir ""
		Escribir "La suma de todos los numeros ingresados es: ", acumulador+1
		Escribir ""
		Escribir "El promedio de los numeros ingresados es: ", (acumulador+1)/(contador-1)
FinAlgoritmo


