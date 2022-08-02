//Leer tres números que denoten una fecha (día, mes, año) y comprobar que sea una fecha
//válida. Si la fecha no es válida escribir un mensaje de error por pantalla. Si la fecha es
//		válida se debe imprimir la fecha cambiando el número que representa el mes por su
//	nombre. Por ejemplo: si se introduce 1 2 2006, se deberá imprimir "1 de febrero de 2006".

Algoritmo extra6
	Definir dia, mes , anhio Como Entero
	
	Escribir "ingrese el un numero para el dia "
	Leer dia 
	Escribir "ingrese un numero para el mes"
	Leer mes 
	Escribir "Ingrese un numero de 3 digitos para el anhio"
	Leer anhio
	
	Si dia>0 y dia<32  Y mes>=1 y mes<13 Y anhio> 1000 y anhio <10000 Entonces
		
		Segun mes hacer
			1:
				Escribir dia ," de enero  de ", anhio
			2:
				Escribir dia ," de febrero  de ", anhio 
			3:
				Escribir dia ," de marzo  de ", anhio 
			4:
				Escribir dia ," de abril  de ", anhio 
			5:
				Escribir dia ," de mayo  de ", anhio 
			6:
				Escribir dia ," de junio  de ", anhio 
			7:
				Escribir dia ," de julio  de ", anhio 
			8:
				Escribir dia ," de agosto  de ", anhio 
			9:
				Escribir dia ," de septiembre  de ", anhio 
			10:
				Escribir dia ," de octubre  de ", anhio 
			11:
				Escribir dia ," de noviembre  de ", anhio 
			12:
				Escribir dia ," de diciembre  de ", anhio 
			
		FinSegun
	SiNo
		Escribir "Datos ingresados incorrectos"
		
	FinSi
	
	
	
FinAlgoritmo
