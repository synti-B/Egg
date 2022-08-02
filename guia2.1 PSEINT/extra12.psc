//Una empresa tiene personal de distintas áreas con distintas condiciones de contratación y
//formas de pago. El departamento de contabilidad necesita calcular los sueldos semanales
//(lunes a viernes) en base a las 3 modalidades de sueldo:
//	a) comisión
//	b) salario fijo + comisión, y
//	c) salario fijo
//	a) Para la modalidad salario por comisión se debe ingresar el monto total de las ventas
//	realizadas en la semana, y el 40% de ese monto total corresponde al salario del
//	empleado.
//	b) Para la condición de salario fijo + comisión, se debe ingresar el valor que se paga por
//	hora, la cantidad de horas trabajadas semanalmente y el monto total de las ventas en
//	esa semana. En este tipo de contrato las horas extras no están contempladas y se fija
//	como máximo 40 horas por semana. La comisión por las ventas se calcula como 25%
//	del valor de venta total.
//	c) Finalmente, para la modalidad de salario fijo se debe ingresar el valor que se paga por
//	hora y la cantidad de horas trabajadas en la semana. En el caso de exceder las 40
//	horas semanales, las horas extras se deben pagar con un extra del 50% del valor de la
//	hora. Realizar un menú de opciones para poder elegir el tipo de contrato que tiene un
//empleado.
Algoritmo extra12	
	
	Definir sueldo, comision, ventas, modalidad, horas,valorxHora, salario Como Real
	
	Escribir "Ingrese la condicion de contratacion"
	Escribir ""
	Escribir "1- Comision"
	Escribir "2- salario fijo + comision"
	Escribir "3- salario fijo"	
	Leer modalidad
	
	Si modalidad = 1 Entonces
		
		Escribir "Ingrese el monto total de las ventas realizadas en la semana"
		Leer ventas
		
		comision = ventas*0.4
		Escribir "el monto para cobrar esta semana es de: ", comision
	SiNo
		Si modalidad =2 Entonces
			
			Escribir "Ingresa el valor  por cada hora"
			Leer valorxHora
			Escribir "Ingresa las horas trabajadas en la semana maximo 40 horas "
			Leer horas
			Escribir "Ingrese el monto total de las ventas realizadas en la semana"
			Leer ventas
			
			comision=ventas*0.25			
			sueldo = valorxHora*horas			
			salario=  sueldo+comision
			
			Escribir "el monto para cobrar esta semana es de: ", salario			
		SiNo
			si modalidad =3 Entonces
				Escribir "Ingresa el valor  por cada hora"
				Leer valorxHora
				Escribir "Ingresa las horas trabajadas en la semana maximo 40 horas "
				Leer horas
				Si horas>0 y horas<=40 Entonces
					salario= valorxHora*horas
					Escribir "el monto para cobrar esta semana es de: ", salario 
				SiNo
					Si horas>40 Entonces						
						salario= (valorxHora*horas)+(((horas-40)*0.5)*valorxHora)						
						Escribir "el monto para cobrar esta semana es de: ", salario 				
												
					FinSi
				FinSi				
			FinSi
		FinSi	
		
	FinSi	
FinAlgoritmo
