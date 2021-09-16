Algoritmo Ecuacion2nG
	Definir valor2a, valor4ac, valor2b,  valorb24ac, valorRaiz, menosB como entero
	Definir poritiv, negativ, finalPositiv, finalNegativ, num1, num2, num3 como entero 
	Escribir "Introduce los 3 valores a operar"
	Leer num1
	Leer num2
	Leer num3
	valor2a = 2*num1
	valor4ac = 4*num1*num3
	valorb2 = num2*num2
	valorb24ac = valorb2-valor4ac
	Si valorb24ac<=0 Entonces
		Escribir "La ecuacion no tiene una resolucion real"
		Escribir "El descriminate es igual a: ",valorb24ac
	SiNo
		valorRaiz = rc(valorb24ac)
		menosB = num2*(-1)
		positiv = menosB+valorRaiz
		negativ = menosB+valorRaiz
		finalPositiv = positiv/valor2a
		finalNegativ = negativ/valor2a
		Escribir "El resultado positivo de la ecuacion es:",finalPositiv
		Escribir "El resultado negativo de la ecuacion es: ",finalNegativ
	FinSi
FinAlgoritmo
