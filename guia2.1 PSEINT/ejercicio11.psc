//Escriba un programa para obtener el grado de eficiencia de un operario de una f�brica de
//tornillos, de acuerdo a las siguientes dos condiciones que se le imponen para un per�odo
//de prueba:
//? Producir menos de 200 tornillos defectuosos.
//? Producir m�s de 10000 tornillos sin defectos.
// El grado de eficiencia se determina de la siguiente manera:
//? Si no cumple ninguna de las condiciones, grado 5.
//? Si s�lo cumple la primera condici�n, grado 6.
//? Si s�lo cumple la segunda condici�n, grado 7.
//? Si cumple las dos condiciones, grado 8

Algoritmo ejercicio11	
	Definir  defectuso, sinDefecto Como Entero
	
	Escribir "Ingresa la cantidad de tornillos sin defectos"
	Leer sinDefecto
	
	Escribir "Ingresa la cantidad de tornillos defectuosos"
	Leer defectuso
	
	Si defectuso>200 Y sinDefecto<10000 Entonces
		Escribir "grado 5"
	SiNo
		
		Si defectuso<200 Y sinDefecto<10000 Entonces
			Escribir "grado 6"
		SiNo
			Si defectuso>200 Y sinDefecto>=10000 Entonces
				Escribir "grado 7"
			SiNo
				si defectuso<200 Y sinDefecto>=10000 Entonces
					Escribir "grado 8"
					
				FinSi				
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
