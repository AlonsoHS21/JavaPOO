package laboIV_L;

import java.util.ArrayList;
import java.util.LinkedList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Trabajando con ArrayList */
		
		//Creamos un array de Lista de Personas
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>(5);
		
		//Agregamos personas
		listaPersonas.add(new Persona()); //Hacemos que pase por el contructor vacio de prueba
		listaPersonas.add(new Persona("Alonso","Huarcaya"));
		listaPersonas.add(new Persona("Homero","Simpson"));
		
		//Ejemplo para remover una Persona de una lista
		//listaPersonas.remove(0);
		
		//Recorremos la lista
		for(Persona x : listaPersonas) {
			System.out.println(x);
		}
		
		/* Trabajando con LinkedList */
		LinkedList<Persona> listLPersonas = new LinkedList<Persona>();
		
		//Agregamos una persona a la LinkedList
		listLPersonas.add(new Persona());
		listLPersonas.add(new Persona("Alonso","Huarcaya"));
		listLPersonas.add(new Persona("Homero","Simpson"));
		
		
	}

}
