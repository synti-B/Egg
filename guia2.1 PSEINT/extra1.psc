//Realizar un programa que pida tres notas y determine si un alumno aprueba o reprueba un
//curso, sabiendo que aprobará el curso si su promedio de tres calificaciones es mayor o
//igual a 70; y reprueba en caso contrario.

Algoritmo extra1
	Definir nota1, nota2, nota3, promedio Como Real
	Escribir "Ingresa la nota 1"
	Leer nota1
	Escribir "Ingresa la nota 2"
	Leer nota2
	Escribir "Ingresa la nota 3"
	Leer nota3
	
	promedio= (nota1+nota2+nota3)/3
	
	Si  promedio >=70 Entonces
		Escribir "APRUEBA"
	SiNo
		Escribir "REPRUEBA"
	FinSi
	
	
FinAlgoritmo
