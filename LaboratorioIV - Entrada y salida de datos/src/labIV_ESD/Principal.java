package labIV_ESD;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pedimos datos de cada tipo para practicar como pedir, recibir y mostrar
		Scanner entrada = new Scanner(System.in);
		int numEntero;
		float numFlotante;
		char caracter;
		String cadena;
		
		System.out.print("Ingrese un numero entero: ");
		numEntero = entrada.nextInt();
		System.out.println("El numero ingresado es: " + numEntero);
		
		System.out.print("Ingrese un numero float: ");
		numFlotante = entrada.nextFloat();
		System.out.println("El numero ingresado es: " + numFlotante);
		
		//CharaAt con indice 0 hace que el primer caracter ingresado sea 
		//el que se va a guardar
		System.out.print("Ingrese un caracter: ");
		caracter = entrada.next().charAt(0); 
		System.out.println("El numero ingresado es: " + caracter);
		
		System.out.print("Ingrese una cadena: ");
		cadena = entrada.next();
		System.out.println("El numero ingresado es: " + cadena);
		
		
		
	}	

}
