Algoritmo vocalSecreta
	
	Definir vocal, letraSecreta Como Caracter
	Escribir "Ingrese una vocal secreta para que otra persona lo adivine"
	Leer letraSecreta
	Escribir "Ingrese la vocal que crees que es la secreta"
	Leer vocal
	
	Mientras vocal <>  letraSecreta Hacer
		
		Escribir "la vocal ingresada es incorrecta vuelve a intentarlo"
		Leer vocal
		
	FinMientras
	Escribir "Correcto la vocal secreta es: " letraSecreta
	
FinAlgoritmo
