package ejer_C;

import java.util.Scanner;

public class ClaseEjerCondicionales {
	
	//Metodo para mostrar el Menu Principal
	public int mostrarMenu(Scanner sn) {
		int opcion;
		System.out.println("\n - Menu Principal - \n");
		System.out.print(" 1 - Ejercicio 1 \n 2 - Ejercicio 2 \n 3 - Ejercicio 3\n"
		+ " 4 - Ejercicio 4\n 5 - Ejercicio 5\n 6 - Ejercicio 6\n 7 - Ejercicio 7 \n 8 - Ejercicio 8\n "
		+ "9 - Ejercicio 9\n 10 - Ejercicio 10\n 11 - Ejercicio 11\n 12 - Ejercicio 12\n 13 - Ejercicio 13\n 14 - Ejercicio 14\n" );
		System.out.print("\nIngrese un numero: ");
		opcion = sn.nextInt();
		return opcion;
	}
	// Ejercicio 1
	public void muestraBooleanoMultiploDe10(Scanner sn) {
		System.out.print("Ingrese el numero para saber si es multiplo de 10 : ");
		int num = sn.nextInt();
		if(num % 10 == 0) {
			System.out.print("El numero " + num + " si es multiplo de 10\n");
		}
		else {
			System.out.print("El numero " + num + " no es multiplo de 10\n");
		}	
	}
	//Ejercicio 2
	public void esMayorOIgual(Scanner sn) {
		int num1,num2;
		System.out.println("Pedir dos numeros y decir cual es el mayor o si son iguales");
		System.out.print("\nIngrese un numero: ");
		num1 = sn.nextInt();
		System.out.print("\nIngrese otro numero: ");
		num2 = sn.nextInt();
		if(num1 > num2) {
			System.out.print("El numero " + num1 + " es mayor que " + num2 + "\n");
		}
		else if(num2 > num1) {
			System.out.print("El numero " + num2 + " es mayor que " + num1 + "\n");
		}
		else {
			System.out.print("Los dos numeros son iguales");
		}
	}
	//Ejercicio 3
	public void esMayusculaOMinuscula(Scanner sn) {
		char caracter;
		System.out.println("Hacer un programa que lea un caracter por teclado y compruebe si es una letra mayuscula");
		System.out.print("\nIngrese un caracter: ");
		caracter = sn.next().charAt(0);
		if(caracter >= 65 && caracter <= 90) {
			System.out.print("\nEl caracter ingresado esta en Mayuscula\n");
		}
		else {
			System.out.print("\nEl caracter ingresado no esta en Mayuscula\n");
		}
	}
	//Ejercicio 4
	public float devuelvePrecioAPagar(Scanner sn) {
		float precioTotal;
		System.out.println("Hacer un programa que descuente el 20% del precio a clientes que superen los 300$");
		System.out.print("\nIngrese el precio del producto: ");
		precioTotal = sn.nextFloat();
		if(precioTotal > 300) {
			precioTotal = precioTotal*0.80f;
			return precioTotal;
		}
		return precioTotal;
	}
	//Ejercicio 5
	public void mostrarSalarioSemanalObrero(Scanner sn) {
		int horasTrabajadas,salarioSemanal = 0;
		System.out.println("Calcular el salario semanal de un obrero");
		//Si trabaja 40 horas o menos cobra 16$ x hora
		//Si trabaja mas de 40 horas cobra 16$ y 20 por cada hora extra
		System.out.print("\nHoras trabajadas por el obrero: ");
		horasTrabajadas = sn.nextInt();
		if(horasTrabajadas <= 40) {
			salarioSemanal = horasTrabajadas*16;
		}
		else {
			salarioSemanal = (horasTrabajadas - 40)*20;
			salarioSemanal += (40*16); // --> mmmm
			
		}
		System.out.print("El salario semanal del obrero es: " + salarioSemanal + "$\n");
		//Reutilize la misma variable horasTrabajadas pero al final use salarioSemanal porque quedaba
		//"El salario semanal del obrero es: " + horasTrabajadas --> medio raro
	}
	//Ejercicio 6
	public void mostrarParOImpar(Scanner sn) {
		int num1,num2;
		System.out.println("Hacer un programa que pida dos numero e imprima si son pares o impares");
		System.out.print("\nIngrese el primer numero: ");
		num1 = sn.nextInt();
		System.out.print("\nIngrese el segundo numero: ");
		num2 = sn.nextInt();
		if(num1%2 == 0 && num2%2 == 0) {
			System.out.print("\nAmbos numero son pares\n");
		}
		else {
			if(num1%2 == 1 && num2%2 == 1) {
				System.out.print("\nAmbos numeros son impares\n");
			}
			else if(num1%2 == 1){
				System.out.print("\nEl numero " + num2 + " es impar\n");
			}
			else if(num2%2 == 1) {
				System.out.print("\nEl numero " + num2 + " es impar\n");
			}
		}
		
	}
	//Ejercicio 7
	public void mostrarMayorAMenor(Scanner sn) {
		float num1,num2,num3;
		System.out.println("Hacer un programa que pida tres numeros y los imprima ordenados de mayor a menor");
		System.out.print("\nIngrese un numero: ");
		num1 = sn.nextFloat();
		System.out.print("\nIngrese otro numero: ");
		num2 = sn.nextFloat();
		System.out.print("\nIngrese otro numero: ");
		num3 = sn.nextFloat();
		if(num1 > num2 && num2 > num3) {
			System.out.print("\nEl orden es : " + num1 + ", " + num2 + ", " + num3);
		}
		else if(num1 > num3 && num3 > num2) {
			System.out.print("\nEl orden es : " + num1 + ", " + num3 + ", " + num2);
		}
		else if(num2 > num1 && num1 > num3) {
			System.out.print("\nEl orden es : " + num2 + ", " + num1 + ", " + num3);
		}
		else if(num2 > num3 && num3 > num1) {
			System.out.print("\nEl orden es : " + num2 + ", " + num3 + ", " + num1);
		}
		else if(num3 > num1 && num1 > num2) {
			System.out.print("\nEl orden es : " + num3 + ", " + num1 + ", " + num2);
		}
		else {
			System.out.print("\nEl orden es : " + num3 + ", " + num2 + ", " + num1);
		}
	}
	//Ejercicio 8
	public int devuelveCifrasNumero(Scanner sn) {
		int num;
		System.out.println("Crear un programa que pida un numero entre 0 y 99999 e imprima cuantas cifras tiene");
		System.out.print("\nIngrese un numero entre 0 y 99.999: ");
		num = sn.nextInt();
		if(num >= 0 && num <= 99999) {
			if(num < 9) {
				return 1;
			}
			else if(num > 9) {
				return 2;
			}
			else if(num > 99) {
				return 3;
			}
			else if(num > 999) {
				return 4;
			}
			else if(num > 9999) {
				return 5;
			}
			else if(num > 99999) {
				return 6;
			}
		}
		return 0;
	}
	//Ejercicio 9
	public boolean determinaLafechaCorrecta(Scanner sn) {
		//Suponiendo que todos los meses tienen 30 dias
		int dia,mes,anio;
		System.out.println("Hacer un programa que pida dia, mes y año e imprima si la fecha es correcta");
		System.out.print("\nIngrese el dia: ");
		dia = sn.nextInt();
		System.out.print("\nIngrese el mes: ");
		mes = sn.nextInt();
		System.out.print("\nIngrese el año: ");
		anio = sn.nextInt();
		if(dia < 1 || dia > 30) {
			return false;
		}
		else if(mes < 1 || dia > 12) {
			return false;
		}
		else if(anio < 1900 || anio > 2021) {
			return false;
		}
		return true;
	}
	//Ejercicio 10
	public boolean determinaLafechaCorrecta2(Scanner sn) {
		//Suponiendo que los meses tienen 28, 30, y 31 dias
		int dia,mes,anio;
		System.out.println("Hacer un programa que pida dia, mes y año e imprima si la fecha es correcta");
		System.out.print("\nIngrese el dia: ");
		dia = sn.nextInt();
		System.out.print("\nIngrese el mes: ");
		mes = sn.nextInt();
		System.out.print("\nIngrese el año: ");
		anio = sn.nextInt();
		if(dia < 1 || dia > 31) {
			return false;
		}
		else if(mes < 1 || dia > 12) {
			return false;
		}
		else if(anio < 1900 || anio > 2021) {
			return false;
		}
		return true;
	}
	//Ejercicio 11
	public float calculadora(Scanner sn) {
		char opcion;
		float num1,num2,res = 0;
		System.out.println("Calculadora");
		System.out.print("\nIngrese la operacion de desea hacer : S - Suma, R - Resta, M - Multiplicacion, D - Division, P - Producto: ");
		opcion = sn.next().charAt(0);
		System.out.print("\nIngrese un numero: ");
		num1 = sn.nextFloat();
		System.out.print("\nIngrese otro numero: ");
		num2 = sn.nextFloat();
		switch(opcion) {
		case 'S':
		case 's':{
			res = num1+num2;
		}break;
		case 'R':
		case 'r':{
			res = num1-num2;
		}break;
		case 'M':
		case 'm':{
			res = num1*num2;
		}break;
		case 'D':
		case 'd':{
			res = num1/num2;
		}break;
		case 'P':
		case 'p':{
			res = num1%num2;
		}break;
		}
		return res;
	}
	//Ejercicio 12
	public void clasificadorDeNotas(Scanner sn) {
		int notaAlumno;
		System.out.println("Pedir una nota de 0 a 10 y mostrarla como: Insuficiente - Suficiente - Bien - Notable o Sobresaliente");
		System.out.print("\nIngrese la nota del alumno (1 - 10): ");
		notaAlumno = sn.nextInt();
		if(notaAlumno >= 0 && notaAlumno <= 10) {
			if(notaAlumno > 0 && notaAlumno < 4) {
				System.out.print("\nLa nota ingresada es Insuficiente\n");
			}
			else if(notaAlumno >= 4 && notaAlumno <= 6) {
				System.out.print("\nLa nota ingresada es Suficiente\n");
			}
			else if(notaAlumno > 6 && notaAlumno < 8) {
				System.out.print("\nLa nota ingresada es Bien\n");
			}
			else if(notaAlumno >= 8 && notaAlumno < 10) {
				System.out.print("\nLa nota ingresada es Notable\n");
			}
			else {
				System.out.print("\nLa nota ingresada es Sobresaliente\n");
			}
		}
		else {
			System.out.print("\nLa nota ingresada esta fuera del rango que se pide");
		}
	}
	//Ejercicio 13
	public void menuCajero(Scanner sn) {
		boolean salir = false;
		float dineroEnCuenta = 1000;
		System.out.println("Hacer un programa que simule un cajero automatico con un saldo inicial de 1000 dolares");
		while(!salir) {
			System.out.print("\n -- Ingrese una opcion del menu -- \n");
			System.out.print("\n1 - Ingresar dinero a la cuenta\n2 - Retirar dinero de la cuenta\n"
			+ "3 - Ver saldo\n4 - Salir\n");
			System.out.print("\nIngrese opcion: ");
			int opcion = sn.nextInt();
			switch(opcion) {
			case 1:{
				float cantDineroIngresado;
				System.out.print("\nIngrese la cantidad que desea ingresar: ");
				cantDineroIngresado = sn.nextFloat();
				dineroEnCuenta += cantDineroIngresado;
				System.out.print("\nDinero ingresado correctamente\n");
			}break;
			case 2:{
				float cantDineroRetirado;
				System.out.print("\nIngrese la cantidad que desa retirar (recuerde que no puede ser mayor al saldo actual):");
				cantDineroRetirado = sn.nextFloat();
				if((cantDineroRetirado <= dineroEnCuenta) && (cantDineroRetirado > 0)) {
					dineroEnCuenta -= cantDineroRetirado;
					System.out.print("\nDinero extraido correctamente\n");
				}
				else {
					System.out.print("\nEl dinero que intenta retirar excede el valor de su saldo actual o es cero\n");
				}
			}break;
			case 3:{
				System.out.print("\nSu saldo al dia 21/03/2021 es: " + dineroEnCuenta + "\n");
			}break;
			case 4:{
				salir = true;
			}break;
			default:{
				System.out.print("\nEl numero ingresado es incorrecto");
			}break;
			}
		}
	}
	//Ejercicio 14
	public void menuUnidadesDeMedidaDeMasa(Scanner sn) {
		float cantKilos,res = 0;
		int opcionUnidadDeMasa;
		System.out.println("Hacer un programa que pase de Kg a otra unidad de medida de masa");
		System.out.print("\n -- Elija una unidad de medida de masa --\n");
		System.out.print("\n1 - Pasar a Hectogramo\n2 - Pasar a Decagramo\n3 - Pasar a Gramo\n"
		+ "4 - Pasar a Decigramo\n5 - Pasar a Centigramo\n6 - Pasar a Miligramo\n");
		System.out.print("\nIngrese una opcion: ");
		opcionUnidadDeMasa = sn.nextInt();
		if(!(opcionUnidadDeMasa < 1 || opcionUnidadDeMasa > 6)) {
			System.out.print("\nIngrese la cantidad de Kg : ");
			cantKilos = sn.nextFloat();
			switch(opcionUnidadDeMasa) {
			case 1:{
				res = cantKilos*10;
			}break;
			case 2:{
				res = cantKilos*100;
			}break;
			case 3:{
				res = cantKilos*1000;
			}break;
			case 4:{
				res = cantKilos*10000;
			}break;
			case 5:{
				res = cantKilos*100000;
			}break;
			case 6:{
				res = cantKilos*1000000;
			}break;
			}
			System.out.print("\nEl resultado es: " + res + "\n");
		}
		else {
			System.out.print("\nEl numero ingresado es incorrecto\n");
		}
		
	}
}
