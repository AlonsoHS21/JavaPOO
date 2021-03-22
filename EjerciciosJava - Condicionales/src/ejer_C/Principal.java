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
			case 7:{
				cec.mostrarMayorAMenor(sn);
			}break;
			case 8:{
				int cantidadDeCifras = cec.devuelveCifrasNumero(sn);
				if(cantidadDeCifras != 0) {
					System.out.print("El numero ingresado tiene: " + cantidadDeCifras + " cifras\n");
				}
				else{
					System.out.print("\nEl numero ingresado no esta dentro del rango que se pide\n");
				}
			}break;
			case 9:{
				boolean fechaCorrecta = cec.determinaLafechaCorrecta(sn);
				if(fechaCorrecta) {
					System.out.print("\nLa fecha ingresada es correcta\n");
				}
				else {
					System.out.print("\nLa fecha ingresada no es correcta\n");
				}
			}break;
			case 10:{
				boolean fechaCorrecta = cec.determinaLafechaCorrecta(sn);
				if(fechaCorrecta) {
					System.out.print("\nLa fecha ingresada es correcta\n");
				}
				else {
					System.out.print("\nLa fecha ingresada no es correcta\n");
				}
			}break;
			case 11:{
				float resultado = cec.calculadora(sn);
				System.out.print("\nEl resultado es: " + resultado + "\n");
			}break;
			case 12:{
				cec.clasificadorDeNotas(sn);
			}break;
			case 13:{
				cec.menuCajero(sn);
			}break;
			case 14:{
				cec.menuUnidadesDeMedidaDeMasa(sn);
			}break;
			default:{
				System.out.println("Opcion no valida");
			}
		 }
		}
		System.out.println("Fin del programa :)");
	}

}
