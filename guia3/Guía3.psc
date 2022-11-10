////1. Realizar una función que calcule la suma de dos números. En el algoritmo principal le
////	pediremos al usuario los dos números para pasárselos a la función. Después la función
////		calculará la suma y lo devolverá para imprimirlo en el algoritmo.
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
////2. Realizar una función que valide si un número es impar o no. Si es impar la función debe
////devolver un verdadero, si no es impar debe devolver falso. Nota: la función no debe tener
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
////3. Crea una función EsMultiplo que reciba los dos números pasados por el usuario, validando
////que el primer número múltiplo del segundo y devuelva verdadero si el primer número es
////múltiplo del segundo, sino es múltiplo que devuelva falso.
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
//	Escribir "Ingresar primer número"
//	leer num1
//	Escribir "Ingresar segundo número"
//	leer num2
//	si esmultiplo(num1,num2) = Verdadero
//		Escribir "El primer numero es Múltiplo del segundo número"
//	SiNo
//		Escribir "El primer numero no es Múltiplo del segundo número"
//	FinSi
//	
//FinAlgoritmo
////4. Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La
////función debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso de la
////función Subcadena().
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
////5. Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número es
////primo o no. Un número es primo cuando es divisible sólo por 1 y por sí mismo, por ejemplo: 2,
////3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.
