////1. Realizar una funci�n que calcule la suma de dos n�meros. En el algoritmo principal le
////	pediremos al usuario los dos n�meros para pas�rselos a la funci�n. Despu�s la funci�n
////		calcular� la suma y lo devolver� para imprimirlo en el algoritmo.
//Funcion Sum <- Bisuma ( num1, num2 )
//	definir sum Como Entero
//	sum = num1 + num2
//	Fin Funcion
//
//Algoritmo Sumando2numeros
//		definir num1, num2, sum como entero
//		Escribir "Ingresar Num1 a sumar"
//		leer num1
//		Escribir "Ingresar Num2 a sumas"
//		leer num2
//		Escribir Bisuma(num1, num2)
//FinAlgoritmo
////2. Realizar una funci�n que valide si un n�mero es impar o no. Si es impar la funci�n debe
////devolver un verdadero, si no es impar debe devolver falso. Nota: la funci�n no debe tener
////mensajes que digan si es par o no, eso debe pasar en el Algoritmo.
//Funcion retorno <- par ( num1 )
//definir retorno Como logico
//si num1 mod 2 = 0 
//	retorno = Verdadero
//FinSi
//
//Fin Funcion
//
//Algoritmo parverdad
//	definir num1 Como Entero
//	definir retorno Como Logico
//	Escribir "Ingresar Numero"
//	leer num1
//	
//	si par(num1) = Verdadero
//		Escribir "El numero ingresado es Par"
//	SiNo
//		Escribir "El numero ingresado es Impar"
//	FinSi
//	
//FinAlgoritmo
////3. Crea una funci�n EsMultiplo que reciba los dos n�meros pasados por el usuario, validando
////que el primer n�mero m�ltiplo del segundo y devuelva verdadero si el primer n�mero es
////m�ltiplo del segundo, sino es m�ltiplo que devuelva falso.
//Funcion retorno <- esmultiplo ( num1, num2 )
//	definir retorno Como Logico
//	si num2 mod num1 = 0
//		retorno = Verdadero
//	sino
//		retorno = Falso
//	FinSi
//Fin Funcion
//
//Algoritmo multiplo
//	definir retorno Como Logico
//	definir num1, num2 Como Entero
//	Escribir "Ingresar primer n�mero"
//	leer num1
//	Escribir "Ingresar segundo n�mero"
//	leer num2
//	si esmultiplo(num1,num2) = Verdadero
//		Escribir "El primer numero es M�ltiplo del segundo n�mero"
//	SiNo
//		Escribir "El primer numero no es M�ltiplo del segundo n�mero"
//	FinSi
//	
//FinAlgoritmo
////4. Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La
////funci�n debe devolver la cantidad de veces que encontr� la letra. Nota: recordar el uso de la
////funci�n Subcadena().
//Funcion retorno <- buscaletras ( frase, letra )
//	definir retorno, cont Como entero
//	retorno = 0
//	cont = 0
//	Repetir
//		si SubCadena(frase,cont,cont) = letra
//			retorno = retorno + 1
//		FinSi
//		cont = cont + 1
//	Mientras Que cont <> Longitud(frase)
//Fin Funcion
//
//Algoritmo cuentaletras
//	definir frase, letra Como Caracter
//	definir retorno, cont Como Entero
//	retorno = 0
//	Escribir "Ingresar una frase"
//	leer frase
//	Escribir "Ingresar letra"
//	leer letra
//	
//	Escribir "La cantidad de veces que se encuentra la letra: " letra Sin Saltar
//	Escribir " en la frase: " frase Sin Saltar
//	Escribir " es: " buscaletras(frase,letra)
//FinAlgoritmo
////5. Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero es
////primo o no. Un n�mero es primo cuando es divisible s�lo por 1 y por s� mismo, por ejemplo: 2,
////3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.
