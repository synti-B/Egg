//Realizar un programa que pida una frase o palabra y si la frase o palabra es de 4
//caracteres de largo, el programa le concatenara un signo de exclamación al final, y si no
//es de 4 caracteres el programa le concatenara un signo de interrogación al final. El
//programa mostrará después la frase final. Nota: investigar la función Longitud() y
//Concatenar() de PseInt.

Algoritmo ejercicio5
	
	Definir frase Como Caracter
	Escribir "ingresa una frase"
	Leer frase
	long=Longitud(frase)
	
	si long=4 Entonces
		
		Escribir   Concatenar(frase,"!")
	SiNo
		Escribir Concatenar(frase,"?")
	FinSi
	
	
FinAlgoritmo
