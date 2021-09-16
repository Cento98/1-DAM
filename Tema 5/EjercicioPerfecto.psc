Algoritmo EjerPerfecto
	Definir contador,i,num Como Entero
	contador <- 0
	Escribir 'Bienvenido al programa para calcular si un numero es perfecto o no'
	Escribir 'Introduzca el numero que quieras'
	Leer num1
	Para i<-1 Hasta num1-1 Hacer
		Si num1 MOD i == 0 Entonces
			contador <- contador+i
		FinSi
	FinPara
	Si contador==num1 Entonces
		Escribir "El numero es perfecto"
	SiNo
		Escribir "El numero no es perfecto"
	FinSi
FinAlgoritmo
