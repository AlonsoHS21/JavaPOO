package laboIV_I;

import java.util.ArrayList;
import java.util.ListIterator;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* ITERATORS */
		// ListIterator funcionan solo con las colecciones de tipo List
		// Iterator funcionan solo con colecciones de tipo Set
		
		ArrayList<Libro> lib = new ArrayList<Libro>();
		
		lib.add(new Libro("Alonso","Huarcaya"));
		lib.add(new Libro("Tito","Bambino"));
		
		ListIterator<Libro> it = lib.listIterator();
		
		while(it.hasNext()) {
			Libro l = it.next();
			System.out.println(l.toString());
		}
	}

}
