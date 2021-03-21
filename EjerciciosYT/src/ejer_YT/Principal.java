package ejer_YT;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sn = new Scanner(System.in);
		ClaseEjercicios ce = new ClaseEjercicios();
		boolean salir = false;
		
		while(!salir) {
			try {
				
				int opcion;
				opcion = ce.menuOpciones(sn);
				
			switch(opcion) {
				case 1:{
					float calificacionFinal = ce.sumaCalificaciones(sn);
					System.out.print("\nLa suma de las 3 calificaciones es: " + calificacionFinal + "\n");
				}break;
				case 2:{
					float salarioSemanal = ce.calculoSalario(sn);
					System.out.print("\nEl salario semanal del empleado es: " + salarioSemanal + "\n");
				}break;
				case 3:{
					ce.calculoCantidadDeDinero(sn);
				}break;
				case 4:{
					//Lo hice sin el 5% por cada auto porque no entendi la consigna
					float salarioFinal = ce.calculoSalarioMensual(sn);
					System.out.print("\nEl salario del empleado es: " + salarioFinal + "\n");
				}
				case 5:{
					float calificacionEstudiante = ce.calculoCalificacionEstudiante(sn);
					System.out.print("\nLa calificacion final del estudiante es: " + calificacionEstudiante + "\n");
				}break;
				case 6:{
					float resultadoFinal = ce.calculoCuadradoDeSuma(sn);
					System.out.print("\nEl resultado es: " + resultadoFinal + "\n");
				}break;
				case 7:{
					ce.muestraCantidadDeSemanasDiasHoras(sn);
				}break;
				case 8:{
					ce.devuelveRaizDeLasEcuacionesDeSegundoGrado(sn);
				}break;
				case 9:{
					salir = true;
				}break;
				default: {
					System.out.println("\nNo es una opcion valida");
				}
			  }
			}
			catch(Exception e){
				System.out.println("Debes introducir un numero");
				sn.next();
			}
		}
		System.out.println("\n Fin del Programa :)");
	}
}

