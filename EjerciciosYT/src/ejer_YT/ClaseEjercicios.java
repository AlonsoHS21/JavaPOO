package ejer_YT;

import java.util.Scanner;

public class ClaseEjercicios {
	//Metodo para mostrar el Menu Principal
		public int menuOpciones(Scanner sn) {
			int opcion;
			System.out.println("\n 1 - Ejercicio 1 \n 2 - Ejercicio 2 \n "
			+ "3 - Ejercicio 3 \n 4 - Ejercicio 4 \n 5 - Ejercicio 5 "
			+ "\n 6 - Ejercicio 6 \n 7 - Ejercicio 7 \n 8 - Ejercicio 8 \n 9 - Salir");
			System.out.print("\n Ingrese un numero: ");
			opcion = sn.nextInt();
			return opcion;
		}
		//Metodo para el ejercicio 1 que suma 3 calificaciones
		public float sumaCalificaciones(Scanner sn) {
			float calificacion;
			System.out.println("Hacer un programa que calcule e imprima la suma de tres calificaciones");
			System.out.print("Ingrese la primera calificacion: ");
			calificacion = sn.nextFloat();
			System.out.print("\nIngrese la segunda calificacion: ");
			calificacion += sn.nextFloat();
			System.out.print("\nIngrese la tercera calificacion: ");
			calificacion += sn.nextFloat();
			return calificacion;
		}
		//Metodo para calcular el salario de un empleado por semana
		public float calculoSalario(Scanner sn) {
			float salario;
			System.out.println("Hacer un programa que calcule el salario de un empleado por semana");
			System.out.print("Ingrese las horas trabajadas esta semana: ");
			salario = sn.nextFloat();
			System.out.print("Ingrese su salario por hora: ");
			salario *= sn.nextFloat();
			return salario;
		}
		public void calculoCantidadDeDinero(Scanner sn) {
			float dinero;
			System.out.println("Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los 3");
			System.out.print("Ingrese la cantidad de dolares que posee: ");
			dinero = sn.nextFloat();
			System.out.print("\nSi Guillermo tiene " + dinero + " dolares " + "entonces Luis tiene " + dinero/2 + " y Juan tiene " + (dinero+dinero/2)/2 + "\n");
		}
		public float calculoSalarioMensual(Scanner sn) {
			float salarioFinal;
			final int salarioMensual = 1000;
			System.out.println("Hacer un programa que calcule e imprima el salario mensual de un vendedor dado");
			System.out.print("Cantidad de autos vendidos: ");
			salarioFinal = sn.nextFloat();
			salarioFinal = (salarioFinal * 150) + salarioMensual; 
			return salarioFinal;
		}
		public float calculoCalificacionEstudiante(Scanner sn) {
			float participacion,primerParcial,segundoParcial,examenFinal,calificacionFinal;
			String nombreEstudiante;
			System.out.println("Hacer un programa que calcule e imprima  la calificacion final obtenida por un estudiante");
			System.out.print("Ingrese el nombre del estudiante: ");
			nombreEstudiante = sn.next();
			System.out.print("\nIngrese la nota de la participacion del alumno " + nombreEstudiante + ": ");
			participacion = sn.nextFloat();
			System.out.print("\nIngrese la nota del primer parcial del alumno " + nombreEstudiante + ": ");
			primerParcial = sn.nextFloat();
			System.out.print("\nIngrese la nota del segundo parcial del alumno " + nombreEstudiante + ": ");
			segundoParcial = sn.nextFloat();
			System.out.print("\nIngrese la nota del examen final del alumno " + nombreEstudiante + ": ");
			examenFinal = sn.nextFloat();
			
			calificacionFinal = (participacion*0.1f) + (primerParcial*0.25f) + (segundoParcial*0.25f) + (examenFinal*0.40f);
			
			return calificacionFinal;
		}
		public float calculoCuadradoDeSuma(Scanner sn) {
			float resultado;
			System.out.println("Hacer un programa que calcule el cuadrado de una suma");
			System.out.print("Ingrese un numero: ");
			resultado = sn.nextFloat();
			System.out.print("\nIngrese otro numero :");
			resultado += sn.nextFloat();
			//Casteo a tipo float
			//(a+b)2 = a2 + b2 + 2*a*b
			resultado = (float) Math.pow(resultado,2);
			return resultado;
		}
		public void muestraCantidadDeSemanasDiasHoras(Scanner sn) {
			int semana,dia,hora;
			String nombreEmpleado;
			System.out.println("Construir un programa que, dado un numero total de horas, devuelve el numero de semanas,dias y horas equivalentes");
			System.out.print("Ingrese el nombre del empleado: ");
			nombreEmpleado = sn.next();
			System.out.print("\nIngrese la cantidad de horas trabajadas por el empleado " + nombreEmpleado + " : ");
			hora = sn.nextInt();
			semana = hora/168;
			dia = (hora - (semana*168))/24;
			hora = hora - ((semana*168) + (dia*24));
			//840 + 144 = 984
			System.out.print("\nEl empleado " + nombreEmpleado + " trabajo " + semana + " semanas, " + dia + " dias, " + hora + " hora/s ");
		}
		public void devuelveRaizDeLasEcuacionesDeSegundoGrado(Scanner sn) {
			float a,b,c,incognita1,incognita2;
			System.out.println("Construir un programa que calcule y muestre por pantalla las raices de la ecuacion de segundo grado de coeficientes reales");
			System.out.print("Ingrese a: ");
			a = sn.nextFloat();
			System.out.print("\nIngrese b: ");
			b = sn.nextFloat();
			System.out.print("\nIngrese c: ");
			c = sn.nextFloat();
			
			incognita1 = (float) ((-(b) + (Math.sqrt((Math.pow(b,2) - (4*a*c))))) / (2*a));
			incognita2 = (float) ((-(b) - (Math.sqrt((Math.pow(b,2) - (4*a*c))))) / (2*a));
			System.out.print("El valor de la incognita X1 es : " + incognita1 + "y de la incognita X2 es: " + incognita2);
		}
}
