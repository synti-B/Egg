//Si se compran menos de cinco llantas el precio es de $3000 cada una, si se compran
//entre 5 y 10 el precio es de $2500, y si se compran más de 10 el precio es $2000.
//Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las
//llantas que compra, y el monto total que tiene que pagar por el total de la compra.

Algoritmo extra8
	
	Definir llantas, total Como Entero
	Escribir "Ingrese la cantidad de llantas compradas"
	Leer llantas
	
	Si llantas>=5 y llantas<=10 Entonces
		total= llantas *2500
		Escribir "El precio por cada llanta que compraste es de  2500"
		Escribir "El precio total a pagar por ", llantas "es de: ", total
	Sino 
		Si llantas>10 Entonces
			total= llantas*2000
			Escribir "El precio por cada llanta que compraste es de  2000"
			Escribir "El precio total a pagar por ", llantas " llantas es de: ", total
		FinSi
	
		total= llantas*3000
		Escribir "El precio por cada llanta que compraste es de  3000"
		Escribir "El precio total a pagar por ", llantas " llantas es de: ", total
	FinSi
	
	
FinAlgoritmo
