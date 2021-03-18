package labIV_E;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* ERRORES */
		
		//Existen 2 tipos de errores:
		
		// 1 - Errores en tiempo de compilacion (Sintaxis)
		/*
		String nombre;
		nombre = 123;
		*/
		// 2 - Errores en tiempo de ejecucion (Excepciones)
		
		/*
		int num1 = 9;
		int num2 = 0;
		int res = num1 / num2;
		*/
		//No me da error hasta que compile y ejecute
		
		/* TIPOS DE EXCEPCIONES */
		int num1 = 9;
		int num2 = 0;
		
		try{
			int res = num1 / num2;
			System.out.println(res);
		}
		catch(Exception e) {
			System.out.println("El mensaje de error es el siguiente: " + e.toString());
		}
  }
}
