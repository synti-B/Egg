//Realizar un programa que, dado un n�mero entero, visualice en pantalla si es par o impar.
//En caso de que el valor ingresado sea 0, se debe mostrar "el n�mero no es par ni impar".
//Nota: investigar la funci�n mod de PSeInt

Algoritmo ejercicio10
	
	
	Definir num Como Entero
	Escribir "ingrese un numero"
	leer num
	
	Si num=0 Entonces
		Escribir "el numero no es par ni impar"
	SiNo
		si num mod 2=0 Entonces
			Escribir "El numero es Par"
		SiNo
			Escribir "El numero es impar"
		FinSi
	FinSi
	
FinAlgoritmo
