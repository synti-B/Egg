//Un hombre desea saber si su sueldo es mayor al sueldo mínimo, el programa le pedirá al
//usuario su sueldo actual y el sueldo mínimo. Si el sueldo es mayor al mínimo se debe
//mostrar un mensaje por pantalla indicándolo.

Algoritmo ejercicio1
	
	Definir sueldo, sueldominimo Como Real
	
	Escribir "Ingrese el sueldo minimo de tu pais"
	Leer sueldominimo
	
	Escribir "Ingrese tu sueldo"
	Leer sueldo
	
	
	Si sueldo> sueldominimo Entonces
		Escribir "su sueldo es mayor al minimo"
	SiNo
		Escribir "su sueldo es menor al minimo"
	FinSi
	
FinAlgoritmo
