//Realizar un programa que pida un n�mero y determine si ese n�mero es par o impar.
//Mostrar en pantalla un mensaje que indique si el n�mero es par o impar. (para que un
//n�mero sea par, se debe dividir entre dos y su resto debe ser igual a 0). Nota: investigar
//la funci�n mod de PseInt.

Algoritmo ejercicio3
	Definir  num Como Entero
	
	Escribir "Ingresa un numero y te diremos si es par o impar"
	Leer num
	
	Si num mod 2= 0 Entonces
		
		Escribir "Tu numero es par"
	sino
		Escribir  "Tu numero es impar"
	FinSi
	
FinAlgoritmo
