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
//	Conocido el número en matemática PI ?, pedir al usuario que ingrese el valor del radio de
//una circunferencia y calcular y mostrar por pantalla el área y perímetro. Recuerde que para
//calcular el área y el perímetro se utilizan las siguientes fórmulas:
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
//A partir de una conocida cantidad de metros que el usuario ingresa a través del teclado se
//debe obtener su equivalente en centímetros, en milímetros y en pulgadas.
//Ayuda: 1 pulgada equivale a 2.54 centímetros.
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
//Escribir un programa que calcule cuántos litros de combustible consumió un automóvil. El
//usuario ingresará una cantidad de litros de combustible cargados en la estación y una
//cantidad de kilómetros recorridos, después, el programa calculará el consumo (km/lt) y se lo
//mostrará al usuario.
//Algoritmo Ejercicio_4
//Definir nafta, kilometros Como Real
//	Escribir "Ingrese la cantidad de litros de combustible cargados en la estación "
//	Leer litros
//   Escribir "Ingrese la cantidad de kilómetros recorrido "
//   Leer kilometros
//   Escribir "El consumo es " (kilometros/litros)
//FinAlgoritmo
//Ejercicio 5
//Escriba un programa que permita al usuario ingresar el valor de dos variables numéricas de
//tipo entero. Posteriormente, el programa debe intercambiar los valores de ambas variables y
//mostrar el resultado final por pantalla.
//Por ejemplo, si el usuario ingresa los valores num1 = 9 y num2 = 3, la salida a del programa
//deberá mostrar: num1 = 3 y num2 = 9

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
//Un colegio desea saber qué porcentaje de niños y qué porcentaje de niñas hay en el curso
//actual. Diseñar un algoritmo para este propósito. Recuerda que para calcular el porcentaje
//puedes hacer una regla de 3 simple. El programa debe solicitar al usuario que ingrese la
//cantidad total de niños, y la cantidad total de niñas que hay en el curso.

//Algoritmo Extra_1
//	Definir ninas, ninos Como Entero
//	Definir procentaje Como Entero
//	Escribir "Ingrese la cantidad total de niñas "
//	Leer ninas
//	Escribir "Ingrese la cantidad total de niños"
//	Leer ninos
//	Escribir "El procentaje de niñas es ",(((ninas + ninos)*ninas)/100)
//	Escribir "El procentaje de niños es ", (((ninas +ninos)*ninos)/100)
//FinAlgoritmo

//Extra 2
//Solicitar al usuario que ingrese la base y altura de un rectángulo, y calcular y mostrar por
//pantalla el área y perímetro del mismo
//area = base * altura
//perimetro = 2 * altura + 2 * base.
//Algoritmo Extra_2
//	definir base, altura Como Real
//	Escribir "Ingrese la base de un rectangulo"
//	Leer base
//	Escribir "Ingrese la altura de un rectangulo"
//	Leer altura
//	Escribir "El área del rectangulo es " (base*altura)
//	Escribir "El perimetro del rectangulo es " (2*altura)+(2*base)
//FinAlgoritmo
// extra 3
//Escribir un programa que calcule el volumen de un cilindro. Para ello se deberá solicitar al
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
//A partir de una conocida cantidad de días que el usuario ingresa a través del teclado, escriba
//un programa para convertir los días en horas, en minutos y en segundos. Por ejemplo
//	1 día = 24 horas = 1440 minutos = 86400 segundos
//Algoritmo extra_4
//	definir dia Como Entero
//	Escribir "Ingrese la cantidad de días " 
//	Leer dia
//	Escribir "La cantidad de días", dia,"es igual a ",(dia*24), " en horas."
//	Escribir "La cantidad de días", dia,"es igual a ",(dia*1440), " en minutos."
//	Escribir "La cantidad de días", dia,"es igual a ",(dia*86400), " en segundos."
//FinAlgoritmo

//extra 5
//Crear un programa que solicite al usuario que ingrese el precio de un producto al inicio del
//año, y el precio del mismo producto al finalizar el año. El programa debe calcular cuál fue el
//porcentaje de aumento que tuvo ese producto en el año y mostrarlo por pantalla.
//
//Algoritmo extra_5
//	Definir precioPrincipio, precioFin Como Real
//	Escribir "Ingrese el precio del producto al inicio del año"
//	Leer precioPrincipio
//	Escribir "Ingrese el precio del producto al final del año"
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
//	Escribir "Hola ",nombre,"¿como estas?"
//FinAlgoritmo
//2)Calcular el cambio de monedas en dólares y euros al ingresar cierta cantidad de dinero en pesos.
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
//4)Hacer un programa que ingrese por teclado un número total de segundos y que luego pueda mostrar la cantidad de horas, minutos y segundos que existen en el valor ingresado.
Algoritmo repaso_4
	Definir seg Como Real
	Escribir "Ingrese el total de segundos"
	Leer seg
	Escribir "Total de segundos ",seg," en horas ",(seg*0.000277778)
	Escribir "Total de "
	
	
	
FinAlgoritmo
