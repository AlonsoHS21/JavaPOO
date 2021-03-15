package labIv_E;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona per = new Persona();
		//Como llamo a el contructor que no recibe parametros entonces
		//el resultado deberian ser los valores por defecto
		System.out.println(per.toString());
		//Efectivamente
		
		Persona per1 = new Persona();
		per1.setDni("123456");
		per1.setNombre("Timon");
		per1.setApellido("Florentino");
		
		Persona per2 = new Persona();
		per2.setDni("123456");
		per2.setNombre("Timon");
		per2.setApellido("Florentino");
		
		//El == no sirve para comparar objetos (per1 o per2) ya que va a comparar
		//las direcciones de memoria por lo tanto en este caso va a ir por el false
		/*if(per1 == per2) {
			System.out.println("Coinciden los datos");
		}*/
		
		//Cuando se tiene objetos la forma de comparar es el equals
		//OJO que antes debemos generar el hashcode y el equals para que funcione en la clase Persona
		if(per1.equals(per2)) {
			System.out.println("Coinciden los datos");
		}
		else {
			System.out.println("No coinciden los datos");
		}
		
		
	}

}
