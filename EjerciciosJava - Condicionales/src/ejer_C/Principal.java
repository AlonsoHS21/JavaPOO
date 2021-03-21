package ejer_C;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		ClaseEjerCondicionales cec = new ClaseEjerCondicionales();
		boolean salir = false;
		
		while(!salir) {
			int opcion = cec.mostrarMenu(sn);
			switch(opcion) {
			case 1:{
				cec.muestraBooleanoMultiploDe10(sn);
			}break;
			case 2:{
				cec.esMayorOIgual(sn);
			}break;
			case 3:{
				cec.esMayusculaOMinuscula(sn);
			}break;
			case 4:{
				float precioAPagar = cec.devuelvePrecioAPagar(sn);
				System.out.print("El precio a pagar es: " + precioAPagar + "\n");
			}break;
			case 5:{
				cec.mostrarSalarioSemanalObrero(sn);
			}break;
			case 6:{
				cec.mostrarParOImpar(sn);
			}break;
			default:{
				System.out.println("Opcion no valida");
			}
		}
		}
		System.out.println("Fin del programa :)");
	}

}
