//El promedio de los trabajos prácticos de un curso se calcula en base a cuatro notas de las
//cuales se elimina la nota menor y se promedian las tres notas más altas. Escriba un
//programa que determine cuál es la nota eliminada y el promedio de los trabajos prácticos
//de un estudiante.

Algoritmo extra11
	
	Definir nota1, nota2, nota3, nota4, promedio Como Entero
	
	Escribir "Ingrese la nota 1"
	Leer nota1
	Escribir "Ingrese la nota 2"
	Leer nota2
	Escribir "Ingrese la nota 3"
	Leer nota3
	Escribir "Ingrese la nota 4"
	Leer nota4
	
	
	Si nota1< nota2  y nota1< nota3 y nota1< nota4 Entonces
		
		promedio= (nota2+nota3+nota4)/3
		
		Escribir "la nota mas baja  eliminada es : ", nota1 ," y el promedio de las notas mas altas es: ", promedio
	SiNo
		Si nota2< nota1  y nota2< nota3 y nota2< nota4 Entonces
			
			promedio= (nota1+nota3+nota4)/3
			
			Escribir "la nota mas baja  eliminada es : ", nota2 ," y el promedio de las notas mas altas es: ", promedio
		SiNo
			Si nota3< nota1  y nota3< nota2 y nota3< nota4 Entonces
				
				promedio= (nota1+nota2+nota4)/3
				
				Escribir "la nota mas baja  eliminada es : ", nota3 ," y el promedio de las notas mas altas es: ", promedio
			SiNo
				Si nota4< nota1  y nota4< nota2 y nota4< nota3 Entonces
					
					promedio= (nota1+nota2+nota3)/3
					
					Escribir "la nota mas baja : ", nota4 ," y el promedio de las notas mas altas es: ", promedio
				SiNo
					
				FinSi				
			FinSi
		FinSi
		
	FinSi
	

	
FinAlgoritmo
