//Continuando el ejercicio anterior, ahora se pedir� una frase o palabra y se validara si la
//primera letra de la frase es igual a la �ltima letra de la frase. Se deber� de imprimir un
//mensaje por pantalla que diga "CORRECTO", en caso contrario, se deber� imprimir
//INCORRECTO".
Algoritmo ejercicio8
	
	Definir palabra, letraI, letraF Como Caracter
	Escribir "Ingresa la palabra"
	Leer palabra
	long=Longitud(palabra)
	letraI<- Subcadena(palabra,0,0)
	letraF<- Subcadena(palabra,long-1,long-1)
	
	Si letraI=letraF Entonces
		Escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"
	FinSi
	
FinAlgoritmo


