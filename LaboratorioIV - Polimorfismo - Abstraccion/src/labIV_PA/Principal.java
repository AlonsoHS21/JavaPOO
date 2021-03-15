package labIV_PA;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Esta es una manera 
		 * 
		Animal ani = new Animal("Tigre");
		Gato gat = new Gato("Pepita");
		Perro pe = new Perro("Cindy","Cocker");
		
		System.out.println(ani.toString());
		System.out.println(gat.toString());
		System.out.println(pe.toString());
		
		*/
		
		/* Esta es otra manera */
		//Animal ani = new Animal("Leon");
		//Animal gat = new Gato("Pepita");
		//Animal pe = new Perro("Cindy","Ninguna");
		
		//System.out.println(ani.toString());
		//System.out.println(gat.toString());
		//System.out.println(pe.toString());d
		
		// Manera con array
		/*
		Animal[] animales = new Animal[2];
		//animales[0] = ani;
		animales[0] = gat;
		animales[1] = pe;
		
		//Hago un for para recorrer el array de animales
		for(int x = 0; x < 2; x++) {
			System.out.println(animales[x].toString());
		}*/
		//Esto pasa porque las clases gato y perro son hijas de la Clase Animal
	
		Gato gat = new Gato("Pepita");
		Perro pe = new Perro("Cindy","Ninguna");
		
		System.out.println(gat.toString() + " " + gat.habilidades());
		System.out.println(pe.toString() + " " + pe.habilidades());
	}

}
