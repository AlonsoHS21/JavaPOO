package ejer_C;

import java.util.Scanner;

public class ClaseEjerCondicionales {
	
	//Metodo para mostrar el Menu Principal
	public int mostrarMenu(Scanner sn) {
		int opcion;
		System.out.println("\n - Menu Principal - \n");
		System.out.print(" 1 - Ejercicio 1 \n 2 - Ejercicio 2 \n 3 - Ejercicio 3\n"
		+ " 4 - Ejercicio 4\n 5 - Ejercicio 5\n 6 - Ejercicio 6\n" );
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
}
