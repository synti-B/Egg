//Un hombre desea saber si su sueldo es mayor al sueldo m�nimo, el programa le pedir� al
//usuario su sueldo actual y el sueldo m�nimo. Si el sueldo es mayor al m�nimo se debe
//mostrar un mensaje por pantalla indic�ndolo.

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
