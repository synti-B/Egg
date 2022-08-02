//Realice un programa que, dado un año, nos diga si es bisiesto o no. Un año es bisiesto
//bajo las siguientes condiciones: Un año divisible por 4 es bisiesto y no debe ser divisible
//por 100. Si un año es divisible por 100 y además es divisible por 400, también resulta
//bisiesto. Nota: recuerde la función mod de PseInt

Algoritmo extra9	
	Definir anhio Como Entero
	Escribir "Escribe un anhio y te diremos si es bisiesto  o no."
	Leer anhio
	
	Si anhio mod 4 <> 0 Entonces
		Escribir anhio " no es bisiesto"
	SiNo
		Si anhio mod 4 ==0 Y anhio mod 100 <>0 Entonces
			Escribir  anhio " es bisiesto"
		Sino 
			Si anhio mod 4 ==0 Y anhio mod 100 == 0 Y anhio mod 400 <>0 Entonces
				Escribir  anhio " no es bisiesto"
			SiNo
				si  anhio mod 4 ==0 Y anhio mod 100 == 0 Y anhio mod 400 ==0 Entonces
					Escribir  anhio " es bisiesto"
				FinSi
				
			FinSi
			
		FinSi
	FinSi
FinAlgoritmo
 