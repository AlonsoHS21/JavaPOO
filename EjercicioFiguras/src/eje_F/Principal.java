package eje_F;

import java.util.Scanner;

public class Principal {
	
	private static final int PAGE_SIZE = 4;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion;
		int opcionFigu;
		double radioCirculo;
		double ladoCuadrado;
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println(" \n 1 - Circulo \n 2 - Cuadrado \n 3 - Salir \n");
		System.out.print("Ingrese un numero: ");
		opcion = entrada.nextInt();
		
		while(opcion != 3) {
			 clearScreen();
			if(opcion == 1) {
				Circulo ci = new Circulo();
				System.out.println("\n 1 - Calcular Area \n 2 - Calcular Perimetro");
				System.out.print("Ingrese un numero: ");
				opcionFigu = entrada.nextInt();
				if(opcionFigu == 1) {
					System.out.print("Ingrese el radio del Circulo: ");
					radioCirculo = entrada.nextDouble();
					ci.setRadio(radioCirculo);
					System.out.print("El area del circulo es : " + ci.calcularArea());
				}
				if(opcionFigu == 2) {
					System.out.print("Ingrese el radio del Circulo: ");
					radioCirculo = entrada.nextDouble();
					ci.setRadio(radioCirculo);
					System.out.print("El perimetro del circulo es : " + ci.calcularPerimetro());
				}
				
			}
			else{
				Cuadrado cu = new Cuadrado();
				System.out.println("\n 1 - Calcular Area \n 2 - Calcular Perimetro \n");
				System.out.print("Ingrese un numero: ");
				opcionFigu = entrada.nextInt();
				if(opcionFigu == 1) {
					System.out.print("Ingrese el lado del cuadrado: ");
					ladoCuadrado = entrada.nextDouble();
					cu.setLado(ladoCuadrado);
					System.out.println("El area del cuadrado es: " + cu.calcularArea() + " cm2");
				}
				if(opcionFigu == 2) {
					System.out.print("Ingrese el lado del cuadrado: ");
					ladoCuadrado = entrada.nextDouble();
					cu.setLado(ladoCuadrado);
					System.out.println("El perimetro del cuadrado es: " + cu.calcularPerimetro());
				}
			}
			System.out.println(" \n 1 - Circulo \n 2 - Cuadrado \n 3 - Salir \n");
			System.out.print("Ingrese un numero: ");
			opcion = entrada.nextInt();
		}
		System.out.print("El programa termino :) ");
		
		
		
	}
	private static void clearScreen() {
	    for (int i = 0; i < PAGE_SIZE; ++i) {
	        System.out.println();
	    }
	}

}
