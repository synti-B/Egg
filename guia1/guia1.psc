// hacer un programa que te pida el nombre y lo imprima por pantalla
///Algoritmo <nombre_del_programa>
//Algoritmo  MiPrimerPrograma
//	///Definir < identificadores/nombres separados por coma> Como >tipo_de_datos>
//	definir mi_nombre  Como Caracter
//	///Escribir <expresiones o constantes a imprimir separados por coma>
//	Escribir "Ingresa tu nombre"
//	Leer mi_nombre
//	Escribir "HOLA MUNDO!",mi_nombre, " y este es mi primer programa!"
//FinAlgoritmo
//Ejercicio 1
//	Conocido el n�mero en matem�tica PI ?, pedir al usuario que ingrese el valor del radio de
//una circunferencia y calcular y mostrar por pantalla el �rea y per�metro. Recuerde que para
//calcular el �rea y el per�metro se utilizan las siguientes f�rmulas:
//	area = PI * radio2
//	perimetro = 2 * PI * radio
//Algoritmo Ejercicio_1
//	Definir radio Como Real
//	Escribir "Ingrese el valor de una radio de una circunferencia "
//	Leer radio
//
//	Escribir "El area de la circunferencia es: ",(radio*PI)
//	Escribir "El perimetro de la circunferencia es: ",(2*PI*radio)
//FinAlgoritmo
//	Ejercicio 2
//Escribir un programa que calcule el precio promedio de un producto. El precio promedio se
//debe calcular a partir del precio del mismo producto en tres establecimientos distintos.
//Algoritmo Ejercicio_2
//	Definir precio1,precio2, precio3 Como Real
//	Escribir "Ingrese los tres valores de los precios "
//	Leer precio1, precio2, precio3
//	Escribir "El precio promedio del producto es " ((precio1+precio2+precio3)/3)
//FinAlgoritmo
//Ejercicio 3
//A partir de una conocida cantidad de metros que el usuario ingresa a trav�s del teclado se
//debe obtener su equivalente en cent�metros, en mil�metros y en pulgadas.
//Ayuda: 1 pulgada equivale a 2.54 cent�metros.
//Algoritmo Ejercicio_3
//	Definir metros Como Real
//	Escribir "Ingrese la cantidad de metros"
//	Leer metros
//	Escribir  metros," metros, su equivalente en cm es ",(metros*100)
//	Escribir  metros," metros, su equivalente en mm es ",(metros*1000)
//	Escribir  metros," metros, su equivalente en in es ",((metros*100)/2.54)
//	
//FinAlgoritmo
//	
// ejercicio 4
//Escribir un programa que calcule cu�ntos litros de combustible consumi� un autom�vil. El
//usuario ingresar� una cantidad de litros de combustible cargados en la estaci�n y una
//cantidad de kil�metros recorridos, despu�s, el programa calcular� el consumo (km/lt) y se lo
//mostrar� al usuario.
//Algoritmo Ejercicio_4
//Definir nafta, kilometros Como Real
//	Escribir "Ingrese la cantidad de litros de combustible cargados en la estaci�n "
//	Leer litros
//   Escribir "Ingrese la cantidad de kil�metros recorrido "
//   Leer kilometros
//   Escribir "El consumo es " (kilometros/litros)
//FinAlgoritmo
//Ejercicio 5
//Escriba un programa que permita al usuario ingresar el valor de dos variables num�ricas de
//tipo entero. Posteriormente, el programa debe intercambiar los valores de ambas variables y
//mostrar el resultado final por pantalla.
//Por ejemplo, si el usuario ingresa los valores num1 = 9 y num2 = 3, la salida a del programa
//deber� mostrar: num1 = 3 y num2 = 9

//Algoritmo Ejercicio_5
//	Definir variable1, variable2, aux Como Entero
//	Escribir "Ingrese la primera variable "
//	leer variable1
//	Escribir "Ingrese la segunda variable"
//	Leer variable2
//	
//	aux = variable1
//	variable1=variable2
//	variable2= aux
//	Escribir " Intercambio de variables, primera variable ",variable1, ", segunda variable ",variable2
//	
//FinAlgoritmo


// EJERCICIOS EXTRAS**
//Un colegio desea saber qu� porcentaje de ni�os y qu� porcentaje de ni�as hay en el curso
//actual. Dise�ar un algoritmo para este prop�sito. Recuerda que para calcular el porcentaje
//puedes hacer una regla de 3 simple. El programa debe solicitar al usuario que ingrese la
//cantidad total de ni�os, y la cantidad total de ni�as que hay en el curso.

//Algoritmo Extra_1
//	Definir ninas, ninos Como Entero
//	Definir procentaje Como Entero
//	Escribir "Ingrese la cantidad total de ni�as "
//	Leer ninas
//	Escribir "Ingrese la cantidad total de ni�os"
//	Leer ninos
//	Escribir "El procentaje de ni�as es ",(((ninas + ninos)*ninas)/100)
//	Escribir "El procentaje de ni�os es ", (((ninas +ninos)*ninos)/100)
//FinAlgoritmo

//Extra 2
//Solicitar al usuario que ingrese la base y altura de un rect�ngulo, y calcular y mostrar por
//pantalla el �rea y per�metro del mismo
//area = base * altura
//perimetro = 2 * altura + 2 * base.
//Algoritmo Extra_2
//	definir base, altura Como Real
//	Escribir "Ingrese la base de un rectangulo"
//	Leer base
//	Escribir "Ingrese la altura de un rectangulo"
//	Leer altura
//	Escribir "El �rea del rectangulo es " (base*altura)
//	Escribir "El perimetro del rectangulo es " (2*altura)+(2*base)
//FinAlgoritmo
// extra 3
//Escribir un programa que calcule el volumen de un cilindro. Para ello se deber� solicitar al
//	usuario que ingrese el radio y la altura. Mostrar el resultado por pantalla.
//	volumen = ? * radio2 * altura

//Algoritmo extra_3
//	Definir radio, altura Como Real
//	Escribir "Ingrese el radio "
//	Leer radio
//	Escribir "Ingrese la altura"
//	Leer altura
//	Escribir "El volumen de un cilindro es ", (pi*(radio^2)*altura)
//FinAlgoritmo

//extra 4
//A partir de una conocida cantidad de d�as que el usuario ingresa a trav�s del teclado, escriba
//un programa para convertir los d�as en horas, en minutos y en segundos. Por ejemplo
//	1 d�a = 24 horas = 1440 minutos = 86400 segundos
//Algoritmo extra_4
//	definir dia Como Entero
//	Escribir "Ingrese la cantidad de d�as " 
//	Leer dia
//	Escribir "La cantidad de d�as", dia,"es igual a ",(dia*24), " en horas."
//	Escribir "La cantidad de d�as", dia,"es igual a ",(dia*1440), " en minutos."
//	Escribir "La cantidad de d�as", dia,"es igual a ",(dia*86400), " en segundos."
//FinAlgoritmo

//extra 5
//Crear un programa que solicite al usuario que ingrese el precio de un producto al inicio del
//a�o, y el precio del mismo producto al finalizar el a�o. El programa debe calcular cu�l fue el
//porcentaje de aumento que tuvo ese producto en el a�o y mostrarlo por pantalla.
//
//Algoritmo extra_5
//	Definir precioPrincipio, precioFin Como Real
//	Escribir "Ingrese el precio del producto al inicio del a�o"
//	Leer precioPrincipio
//	Escribir "Ingrese el precio del producto al final del a�o"
//	Leer precioFin
//	Escribir "El procentaje del aumento que tuvo este producto es de ", ((precioFin/precioPrincipio)*100)-100
//FinAlgoritmo
//Algoritmo repaso
//	Definir num,unidades,decenas,centenas Como Entero
//	Escribir "ingrese un numero de 3 cifras"
//	Leer num
//	
//	unidades=num mod 10
//	num= trunc(n/10)
//	decenas = num mod 10
//	num= trunc(n/10)
//	centenas=num mod 10
//	
//	Escribir "la unidad es: ", unidades
//	Escribir "la decena es: ", decenas
//	Escribir "la centena es: ",centenas
//	
//FinAlgoritmo


//Algoritmo integrados
//	Definir num Como Entero
//	Definir centena, decena, unidad como real
//	Definir aux1, aux2 Como Real
//	
//	Escribir "Ingrese un numero de 3 cifras: "
//	Leer num
//	
//	aux1 = num MOD 100
//	aux2 = aux1 MOD 10
//	
//	centena = trunc(num/100)
//	decena = trunc(aux1/10)
//	unidad = aux2
//	
//	Escribir "La centena del numero ingresado es: ", centena
//	Escribir "La decena del numero ingresado es: ", decena
//	Escribir "La decena del numero ingresado es: ", unidad
//	
//	
//FinAlgoritmo
//1)Escribir un programa que pregunte al usuario su nombre, y luego lo salude.
//Algoritmo repaso_1
//	Definir nombre Como Caracter
//	Escribir "Ingrese su nombre "
//	Leer nombre
//	Escribir "Hola ",nombre,"�como estas?"
//FinAlgoritmo
//2)Calcular el cambio de monedas en d�lares y euros al ingresar cierta cantidad de dinero en pesos.
//Algoritmo repaso_2
//	Definir  cantidadPesos Como Real
//	Escribir "Ingrese la cantidad de pesos que deseas cambiar"
//	Leer cantidadPesos
//	Escribir "El cambio de ", cantidadPesos, " pesos,  en dolares es ",cantidadPesos /124
//	Escribir "El cambio de ", cantidadPesos, " pesos,  en dolares es ",cantidadPesos /131
//FinAlgoritmo
//algoritmo repaso_3
//3)Hacer un programa que calcule el salario de un empleado, si se descuenta el 20% de su salario bruto.
//Algoritmo repaso_3
//	Definir salario Como Real
//	Escribir "Ingrese el salario en bruto "
//	Leer salario
//	Escribir "El monto del salario en neto es ", (salario*0.8)
//FinAlgoritmo
//4)Hacer un programa que ingrese por teclado un n�mero total de segundos y que luego pueda mostrar la cantidad de horas, minutos y segundos que existen en el valor ingresado.
Algoritmo repaso_4
	Definir seg Como Real
	Escribir "Ingrese el total de segundos"
	Leer seg
	Escribir "Total de segundos ",seg," en horas ",(seg*0.000277778)
	Escribir "Total de "
	
	
	
FinAlgoritmo
