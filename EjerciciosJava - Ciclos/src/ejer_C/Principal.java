package ejer_C;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		ClaseEjercicioCiclos cec = new ClaseEjercicioCiclos();
		boolean salir = false;
			
		while(!salir) {
			 int opcion = cec.menuPrincipalCiclos(sn);
			switch(opcion) {
			case 1:{
				cec.cicloCuadradoDeUnNumero(sn);
				System.out.print("\nEl ciclo termino porque ingresaste un numero negativo\n");
			}break;
			case 2:{
				cec.cicloPositivoNegativo(sn);
			}break;
			case 3:{
				cec.cicloParOImpar(sn);
			}break;
			case 4:{
				int cantNumeros = cec.cicloContadorDeNumeros(sn);
				System.out.print("\nLa cantidad de numeros ingresados fue de: " + cantNumeros + "\n");
			}break;
			case 5:{
				cec.juegoAdivinanza(sn);
			}break;
			case 6:{
				int sumNumeros = cec.devuelveLaCantidadDeIntentos(sn);
				System.out.print("\nLa suma de todos los numeros es de: " + sumNumeros + "\n");
			}break;
			case 7:{
				cec.calculoMediaDeNumeros(sn);
			}break;
			case 8:{
				cec.mostrarNNumeros(sn);
			}break;
			case 9:{
				cec.mostrarNumerosDeA7(sn);
			}break;
			case 10:{
				float sumaTotal = cec.devuelveSumaTotal(sn);
				System.out.print("\nLa suma total de todos los numeros ingresados es: " + sumaTotal + "\n");
			}break;
			case 11:{
				int productoTotal = cec.devuelveProducto(sn);
				System.out.print("\nEl producto total de los 10 primeros impares es: " + productoTotal + "\n");
			}break;
			case 12:{
				int factorial = cec.devuelveFactorialDeUnNumero(sn);
				System.out.print("\nEl factorial de un numero es: " + factorial + "\n");
			}break;
			case 13:{
				cec.mostrarMediaPositivosNegativosYCeros(sn);
			}break;
			case 14:{
				cec.mostrarSumaSueldosYCantdidad(sn);
			}break;
			case 15:{
				cec.edadAlturaDeAlumnos(sn);
			}break;
			case 16:{
				cec.muestraTablaMultiplicar(sn);
			}break;
			case 17:{
				cec.empresaDesinfectantes(sn);
			}break;
			case 18:{
				cec.empresaDesinfectantesModificado(sn);
			}break;
			case 19:{
				cec.muestraAlumnosAprobadosCondicionadosSuspensos(sn);
			}break;
			case 20:{
				cec.mostrarMaximoDeNSueldos(sn);
			}break;
			case 21:{
				cec.mostrarNumerosNegativos(sn);
			}break;
			case 22:{
				cec.muestraSuspensosDeAlumnos(sn);
			}break;
			case 23:{
				salir = true;
			}break;
			}
		}
		
		
	}

}
