//Una tienda ofrece para los meses de septiembre, octubre y noviembre un descuento del
//10% sobre el total de la compra que realiza un cliente. Solicitar al usuario que ingrese un
//mes y el importe de la compra. El programa debe calcular cuál es el monto total que se
//debe cobrar al cliente e imprimirlo por pantalla.

Algoritmo extra2
	Definir mes Como Caracter
	Definir compra Como Real
	Escribir"Ingrese el mes de la compra"
	Leer mes
	
	Escribir"Ingrese el valor de la compra"
	Leer compra	
	
	Si	mes= "septiembre" o mes="octubre"o mes="noviembre" Entonces	

		Escribir " USTED TIENE UN DESCUENTO DEL 10% EL VALOR DE SU COMRPA ES: ", compra -(compra*0.1) 
	SiNo
		Escribir "EL Valor de su compra es: " compra
		
	FinSi

FinAlgoritmo
