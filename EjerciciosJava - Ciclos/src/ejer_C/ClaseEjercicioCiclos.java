package ejer_C;

import java.util.Scanner;

public class ClaseEjercicioCiclos {

	public int menuPrincipalCiclos(Scanner sn) {
		boolean salirValidacionOpciones = false;
		int opcion=1;
		
		while(!salirValidacionOpciones) {
			System.out.println("\n -- Menu Principal -- ");
			System.out.print("\n1 - Ejercicio 1\n2 - Ejercicio 2\n3 - Ejercicio 4\n"
			+ "5 - Ejercicio 5\n6 - Ejercicio 6\n7 - Ejercicio 7\n8 - Ejercicio 8\n"
			+ "9 - Ejercicio 9\n10 - Ejercicio 10\n11 - Ejercicio 11\n12 - Ejercicio 12\n"
			+ "13 - Ejercicio 13\n14 - Ejercicio 14\n15 - Ejercicio 15\n16 - Ejercicio 16\n"
			+ "17 - Ejercicio 17\n18 - Ejercicio 18\n19 - Ejercicio 19\n20 - Ejercicio 20\n"
			+ "21 - Ejercicio 21\n22 - Ejercicio 22\n23 - Salir del Programa\n");
			
			System.out.print("\nIngrese una opcion: ");
			opcion = sn.nextInt();
			if(opcion < 1 || opcion > 22) {
				System.out.print("\nEl numero ingresado no es valido, intentelo de nuevo\n");
			}
			else {
				salirValidacionOpciones = true;
			}
		}
		return opcion;
	}
	public void cicloCuadradoDeUnNumero(Scanner sn) {
		System.out.println("Pedir un numero y mostrar su cuadrado repetir el ciclo hasta ingresar un negativo");
		int  num;
		while(true) {
			System.out.print("\nIngrese un numero: ");
			num = sn.nextInt();
			if(num < 0 ) {
				return;
			}
			System.out.print("\nEl cuadrado del numero " + num + " es: " + Math.pow(num,2) + "\n");
			//Muestro el cuadrado usando Math.pow()
		}
	}
	public void cicloPositivoNegativo(Scanner sn) {
		System.out.println("Pedir un numero e indicar si es positivo o negativo");
		float numIngresado;
		boolean salir = false;
		while(!salir) {
			System.out.print("\nIngrese un numero: ");
			numIngresado = sn.nextFloat();
			if(numIngresado > 0) {
				System.out.print("\nEl numero ingresado es positivo\n");
			}
			else if(numIngresado < 0) {
				System.out.print("\nEl numero ingresado es negativo\n");
			}
			else {
				System.out.print("\nTermino el programa\n");
				salir = true;
			}
		}
	}
	public void cicloParOImpar(Scanner sn) {
		System.out.println("Pedir un numero e indicar si es par o impar");
		int numIngresado;
		boolean salir = false;
		while(!salir) {
			System.out.print("\nIngrese un numero: ");
			numIngresado = sn.nextInt();
			if(numIngresado == 0) {
				System.out.print("\nTermino el programa\n");
				return;
			}
			if(numIngresado%2 == 0) {
				System.out.print("\nEl numero ingresado es par\n");
			}
			else {
				System.out.print("\nEl numero ingresado es impar\n");
			}
		}
	
	}
	//Ejercicio 4
	public int cicloContadorDeNumeros(Scanner sn) {
		System.out.println("Pedir un numeros hasta que se teclee uno negativo");
		int numIngresado,cont=0;
		boolean salir = false;
		while(!salir) {
			System.out.print("\nIngrese un numero: ");
			numIngresado = sn.nextInt();
			//No cuenta el ingresado de numeros negativos
			if(numIngresado < 0) {
				return cont;
			}
			cont = cont+1;
		
		}
		return cont;
	}
	
	//Ejercicio 5
	public void juegoAdivinanza(Scanner sn) {
		System.out.print("Realizar un juego donde se pida un numero e indicar si el numero aleatorio es mayor, menor o en caso de ser igual terminar el juego");
		boolean salir = false;
		int numIngresado,cont = 0;
		int valorAleatorio = (int)Math.floor(Math.random()*100 );//el + 1 es para que empiece a contar desde 1
		while(!salir) {
			System.out.print("\nIngrese un numero entero entre 0 y 100: ");
			numIngresado = sn.nextInt();
			cont = cont+1;
			if(numIngresado > valorAleatorio) {
				System.out.print("\nEl numero ingresado es mayor al numero aleatorio\n");
			}
			else if(numIngresado < valorAleatorio) {
				System.out.print("\nEl numero ingresado es menor al numero aleatorio\n");
			}
			else {
				System.out.print("\nEl numero ingresado es igual al numero aleatorio\n"
						+ "El numero de intento fue de: "+ cont + "\nFin del programa :)\n");
				return;
			}
		}
	}
	//Ejercicio 6
	public int devuelveLaCantidadDeIntentos(Scanner sn) {
		boolean salir = false;
		int numIngresado,acu = 0;
		System.out.println("Pedir numero hasta que se teclee un 0, mostrar la suma de todos los numeros");
		while(!salir) {
			System.out.print("\nIngrese un numero: ");
			numIngresado = sn.nextInt();
			acu += numIngresado;
			if(numIngresado == 0) {
				return acu;
			}
		}
		return acu;
	}
	//Ejercicio 7
	public void calculoMediaDeNumeros(Scanner sn) {
		boolean salir = false;
		int numIngresado,acu = 0,cont = 0;
		float media;
		System.out.println("Pedir numero hasta que se teclee un negativo y mostrar la media");
		while(!salir) {
			System.out.print("\nIngrese un numero: ");
			numIngresado = sn.nextInt();
			if(numIngresado < 0) {
				media = acu/cont;
				System.out.print("\nSe ingreso un negativo, la media es de: " + media + "\n");
				return;
			}
			//El numero negativo ingresado no suma
			acu += numIngresado;
			cont = cont+1;
			//Da como resultado un numero entero deberia ser con coma
		}
	}
	//Ejercicio 8
	public void mostrarNNumeros(Scanner sn) {
		int numIngresado;
		System.out.println("Pedir un numero N, y mostrar todos los numeros del 1 al N");
		System.out.print("\nIngrese un numero: ");
		numIngresado = sn.nextInt();
		for(int x = 1; x <= numIngresado;x++) {
			System.out.print("\n" + x + "\n");
		}
	}
	//Ejercicio 9
	public void mostrarNumerosDeA7(Scanner sn) {
		System.out.println("Escribir todos los numeros del 100 al 0 de 7 en 7");
		for(int x = 100;x > 0;x -= 7) {
			System.out.println(x);
		}
	}
	//Ejercicio 10
	public float devuelveSumaTotal(Scanner sn) {
		int cont = 0;
		float numIngresado,sumaTotal = 0;
		System.out.println("Pedir 10 numero y escribir la suma total");
		while(cont < 10) {
			System.out.print("\nIngrese un numero: ");
			numIngresado = sn.nextFloat();
			sumaTotal += numIngresado;
			cont += 1;
		}
		return sumaTotal;
	}
	//Ejercicio 11
	 public int devuelveProducto(Scanner sn) {
		 int productoTotal = 1;
		 System.out.println("Diseñar un programa que muestre el producto de los 10 primeros numero impares");
		 for(int x = 1;x <= 20;x += 2) {
			 if(x%2 == 1) {
				   productoTotal *= x;
			 }
		 }
		 return productoTotal;
	 }
	//Ejercicio 12
	 public int devuelveFactorialDeUnNumero(Scanner sn) {
		 int numIngresado,producto = 1;
		 System.out.println("Pedir un numero y calcular su factorial");
		 System.out.print("\nIngrese un numero: ");
		 numIngresado = sn.nextInt();
		 for(int x = 1; x <= numIngresado; x++) {
			 producto *= x;
		 }
		 return producto;
	 }
	
	//Ejercicio 13
	 public void mostrarMediaPositivosNegativosYCeros(Scanner sn) {
		 float numIngresado,acuPos=0,acuNeg=0;
		 int contPos=0,contNeg=0,contCer=0;
		 System.out.println("Pedir 10 numeros y mostrar la media de Positivos,Negativos y ceros");
		 for(int x = 0; x < 10; x++) {
			 System.out.print("\nIngrese un numero: ");
			 numIngresado = sn.nextInt();
			 if(numIngresado > 0) {
				 acuPos += numIngresado;
				 contPos += 1;
			 }
			 else if(numIngresado < 0) {
				 acuNeg += numIngresado;
				 contNeg += 1;
			 }
			 else if(numIngresado == 0) {
				 contCer += 1;
			 }
		 }
		if(contPos == 0) {
			System.out.print("El contador de positivos es cero");
		}
		else {
			System.out.println("La media de positivos es: " + acuPos/contPos + "\n");
		}
		if(contNeg == 0) {
			System.out.print("El contador de negativos es cero");
		}
		else {
			System.out.println("La media de positivos es: " + acuNeg/contNeg + "\n");
		}
		System.out.println("La cantidad de ceros es: " + contCer + "\n");
	 }
	//Ejercicio 14
	 public void mostrarSumaSueldosYCantdidad(Scanner sn) {
		 float sueldo,sumaSueldos=0;
		 int contSueldos=0;
		 System.out.println("Pedir 10 sueldos, mostrar su suma y cuantos sueldos son mayores a 1000");
		 for(int x = 0; x < 10; x++) {
			 System.out.print("\nIngrese su sueldo: ");
			 sueldo = sn.nextFloat();
			 sumaSueldos += sueldo;
			 if(sueldo > 1000) {
				 contSueldos += 1;
			 }
		 }
		 System.out.print("\nLa suma de todos los sueldos es: " + sumaSueldos + " y hay " + contSueldos + " sueldo/s mayores a 1000$");
	 }
	//Ejercicio 15
	 public void edadAlturaDeAlumnos(Scanner sn) {
		 int contMayores18=0,contAltura=0;
		 float edadAl,alturaAl,mediaEdad=0,mediaAltura=0;
		 for(int x = 0; x < 5; x++) {
			 System.out.print("\nIngrese la edad del alumno: ");
			 edadAl = sn.nextInt();
			 System.out.print("\nIngrese la altura del alumno: ");
			 alturaAl = sn.nextFloat();
			 mediaEdad += edadAl;
			 mediaAltura += alturaAl;
			 if(edadAl > 18) {
				 contMayores18 += 1;
			 }
			 if(contAltura > 1.75) {
				 contAltura += 1;
			 }
		 }
		 System.out.print("\nLa media de Edad es : " + mediaEdad/5 + " media altura: " + mediaAltura/5 + "\n");
		 System.out.print("\nHay " + contMayores18 + " mayores a 18 años y " + contAltura + " mayores a 1.75 de altura\n");
		 //No cuenta la altura de alumnos mayores a 1.75
	 }
	//Ejercicio 16
	 public void muestraTablaMultiplicar(Scanner sn) {
		 int numIngresado;
		 System.out.println("Pide un numero entre 0 y 10 y mostrar la tabla de multiplicar de dicho numero");
		 System.out.print("\nIngrese un numero: ");
		 numIngresado = sn.nextInt();
		 for(int x = 1; x <= 10; x++) {
			 System.out.print(x + " * " + numIngresado + " = " + numIngresado*x + "\n");
		 }
	 }
	//Ejercicio 17
	 public void empresaDesinfectantes(Scanner sn) {
		 int codArt;
		 float precioLitro,factTotal=0,cantLitros,contCantLitros=0,contFacturas=0;
		 for(int x = 0; x < 5;x++) {
			 System.out.print("\nIngrese el codigo del articulo : ");
			 codArt = sn.nextInt();
			 System.out.print("\nIngrese la cantidad de litros vendido: ");
			 cantLitros = sn.nextInt();
			 System.out.print("\nIngrese el precio por litro: ");
			 precioLitro = sn.nextFloat();
			 factTotal += cantLitros*precioLitro;
			 
			 if(codArt == 1) {
				 contCantLitros += cantLitros;
			 }
			 if(factTotal > 600) {
				 contFacturas += 1;
			 }
		 }
		 System.out.print("La facturacion total es: " + factTotal + "\n");
		 System.out.print("Cantidad de litros vendidos del articulo 1: " + contCantLitros + "\n");
		 System.out.print("Se emitieron " + contFacturas + " facturas de mas de 600\n");
	 }
	//Ejercicio 18
	 public void empresaDesinfectantesModificado(Scanner sn) {
		 int codArt;
		 float factTotal=0,cantLitros,contCantLitros=0,contFacturas=0;
		 for(int x = 0; x < 5;x++) {
			 System.out.print("\nIngrese el codigo del articulo (1-2-3) : ");
			 codArt = sn.nextInt();
			 System.out.print("\nIngrese la cantidad de litros vendido: ");
			 cantLitros = sn.nextInt();
			 switch(codArt) {
			 	case 1:{
				 	contCantLitros += cantLitros;
				 	factTotal += cantLitros*0.6;
			 	}break;
			 	case 2:{
				 	factTotal += cantLitros*3;
			 	}break;
			 	case 3:{
			 		factTotal += cantLitros*1.25;
			 	}break;
			 	default:{
			 		System.out.print("\nCodigo de articulo no valido , termina el programa\n");
			 		return;
			 	}
			 }
			 if(factTotal > 600) {
				 contFacturas += 1;
			 }
		 }
		 System.out.print("La facturacion total es: " + factTotal + "\n");
		 System.out.print("Cantidad de litros vendidos del articulo 1: " + contCantLitros + "\n");
		 System.out.print("Se emitieron " + contFacturas + " facturas de mas de 600\n");
	 }
	//Ejercicio 19
	 public void muestraAlumnosAprobadosCondicionadosSuspensos(Scanner sn) {
		 float notaAlumno;
		 int contAprobados=0,contCondicionados=0,contSuspensos=0;
		 System.out.println("Dadas 6 notas, escribir la cantidad de alumnos aprobados,condicionados y suspensos");
		 for(int x = 0;x < 6;x++) {
			 do {
				 System.out.print("\nIngrese la nota del Alumno : ");
				 notaAlumno = sn.nextFloat();
			 }
			while(notaAlumno > 0 || notaAlumno <= 10 );
			if(notaAlumno == 4) {
				contCondicionados += 1;
			}
			else if(notaAlumno >= 5) {
				contAprobados += 1;
			}
			else {
				contSuspensos += 1;
			}
		 }
		 System.out.print("Cantidad de alumnos aprobados: " + contAprobados + "\n");
		 System.out.print("Cantidad de alumnos condicionados: " + contCondicionados + "\n");
		 System.out.print("Cantidad de alumnos con suspenso: " + contSuspensos + "\n");
	 }
	//Ejercicio 20
	 public void mostrarMaximoDeNSueldos(Scanner sn) {
		 int numeroIngresado;
		 float sueldo,sueldoMayor=0;
		 boolean bandera = false;
		 System.out.println("Pedir un numero N, introducir N sueldos y mostrar sueldos maximos");
		 System.out.print("\nIngrese un numero: ");
		 numeroIngresado = sn.nextInt();
		 for(int x = 0; x < numeroIngresado; x++) {
			 System.out.print("Ingrese un sueldo: ");
			 sueldo = sn.nextFloat();
			 if(bandera == false || sueldo > sueldoMayor) {
				 bandera = true;
				 sueldoMayor = sueldo;
			 }
		 }
		 System.out.print("\nEl sueldo maximo de los "+ numeroIngresado +" ingresados es: " + sueldoMayor + "\n");
	 }
	//Ejercicio 21
	 public void mostrarNumerosNegativos(Scanner sn) {
		 boolean numNegativo = false;
		 float numIngresado;
		 int contNegativos=0;
		 System.out.println("Pide 10 numero y muestra si se introduccion algun negativo");
		 for(int x = 0; x < 10; x++) {
			 System.out.print("\nIngrese un numero : ");
			 numIngresado = sn.nextFloat();
			 if(numIngresado < 0) {
				 numNegativo = true;
				 contNegativos += 1;
			 }
		 }
		 if(numNegativo == true) {
			 System.out.print("\nSe introdujeron " + contNegativos + " negativo\\s \n");
		 }
		 else {
			 System.out.print("\nNo se introdujo ningun negativo\n");
		 }
	 }
	//Ejercicio 22
	 public void muestraSuspensosDeAlumnos(Scanner sn) {
		 //Pequeña vuelta de rosca de la cosigna original
		 System.out.println("Pedir 5 calificaciones y mostrar si hay algun suspenso");
		 float calificacionAl;
		 String arrayNombreAlumnos[];
		 arrayNombreAlumnos = new String[5];
		 float arrayCalificacionAlumnos[];
		 arrayCalificacionAlumnos = new float[5];
		 String nombreAlumno;
		 for(int x = 0; x < 5; x++) {
			 System.out.println("\nIngrese el nombre del alumno: ");
			 nombreAlumno = sn.next();
			 System.out.print("\nIngrese la calificacion del alumno " + nombreAlumno + ": ");
			 calificacionAl = sn.nextFloat();
			 
			 arrayNombreAlumnos[x] = nombreAlumno;
			 arrayCalificacionAlumnos[x] = calificacionAl;
			 
		 }
		 motrarAlumnos(arrayNombreAlumnos,arrayCalificacionAlumnos);
	 }
	 public void motrarAlumnos(String[] nombres,float[] calificaciones) {
		 for(int x = 0; x < nombres.length; x++ ) {
			 if(calificaciones[x] < 4) {
				 System.out.print("\nEl alumno " + nombres[x] + " saco una calificacion de " + calificaciones[x] + " esta suspendido/a\n");
			 }
			 else
			 {
				 System.out.print("\nEl alumno " + nombres[x] + " saco una calificacion de " + calificaciones[x] + " esta aprobado/a\n");
			 }
			
		 }
	 }
}
