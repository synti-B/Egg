//Realiza un programa que s�lo permita introducir los caracteres ?S? y ?N?. Si el usuario
//ingresa alguno de esos dos caracteres se deber� de imprimir un mensaje por pantalla que
//diga "CORRECTO", en caso contrario, se deber� imprimir "INCORRECTO".

Algoritmo ejercicio2
	Definir  caract Como Caracter
	Escribir "Ingrese un caracter"
	Leer caract
	
	Si caract= "S" O caract="N" Entonces		
		Escribir "Correcto"
	SiNo
		Escribir "Incorrecto"
	FinSi

	
FinAlgoritmo
