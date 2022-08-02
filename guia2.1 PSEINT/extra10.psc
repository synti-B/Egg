//Una verdulería ofrece las manzanas con descuento según la siguiente tabla:
//	No DE KILOS COMPRADOS % DESCUENTO
//	0 a 2 kg -> 0%
//	2.01 a 5 kg -> 10%
//	5.01 a 10 kg -> 15%
//	10.01 kg en adelante-> 20%
//	Determinar cuánto pagará una persona que compre manzanas en esa verdulería

Algoritmo extra10
	
	Definir manzanas, precio, total, descuento Como Real
	
	Escribir "Ingrese los kg de manzandas compradas."
	Leer manzanas
	
	Escribir "Ingrese el precio por kg de  manzana"
	Leer precio
	
	Si manzanas>0 Y manzanas <=2 Entonces
		
		total= manzanas*precio
		Escribir "El total a pagar por ", manzanas, "kg de manzana es de: $", total 
		
	SiNo
		Si manzanas>2 Y manzanas <=5 Entonces
			descuento= precio*0.1
			total= (precio*manzanas)-(descuento*manzanas) 
			
			Escribir "El total a pagar por ", manzanas, "kg de manzana es de: $", total
		SiNo
			Si manzanas>5 Y manzanas <11 Entonces
				descuento= precio*0.15
				total= (precio*manzanas)-(descuento*manzanas) 
				Escribir "El total a pagar por ", manzanas, "kg de manzana es de: $", total				
			FinSi
			
		FinSi
		
		descuento= precio*0.2
		total= (precio*manzanas)-(descuento*manzanas)
		Escribir "El total a pagar por ", manzanas, "kg de manzana es de: $", total
		
	FinSi
	
FinAlgoritmo
