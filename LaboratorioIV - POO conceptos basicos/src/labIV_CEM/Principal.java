package labIV_CEM;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// VIDEO 1
		/*
		//USANDO LOS CONSTRUCTORES Y EL METODO GET
		ClaseJava art = new ClaseJava();
		System.out.println("ID: "+ art.getId() + " y Nombre: " +  art.getNombre());
		
		ClaseJava arti = new ClaseJava("Alonso",1); // Ahora le paso parametros en orden
		System.out.println("ID: "+ arti.getId() + " y Nombre: " +  arti.getNombre());
		
		//USANDO EL METODO SET y GET
		int numeroID = 2;
		String nombre = "Cristiano";
		ClaseJava artSet = new ClaseJava();
		artSet.setId(numeroID);
		artSet.setNombre(nombre);
		System.out.println("Numero ID: " + artSet.getId() + " y su Nombre es: " + artSet.getNombre());
		
		//USANDO EL METODO TOSTRING()
		System.out.println(artSet.toString());
		*/
		
		// VIDEO 2 
		/* Esta es una forma de agregar datos 
		ClaseJava art1 = new ClaseJava();
		art1.setNombre("Don Ramon");
		System.out.println(art1.toString());
		
		ClaseJava art2 = new ClaseJava();
		art2.setNombre("Señor Barriga");
		System.out.println(art2.toString());
		
		ClaseJava art3 = new ClaseJava();
		art3.setNombre("Jirafales");
		System.out.println(art3.toString());
		
		System.out.println("El proximo ID que se va a crear es: " + ClaseJava.proxID());
		
		*/
		
		/* Esta es otra forma */
		ClaseJava[] vArt = new ClaseJava[3]; //Por los 3 articulos que voy a agregar
		vArt[0] = new ClaseJava("Don Ramon");
		vArt[1] = new ClaseJava("Señor Barriga");
		vArt[2] = new ClaseJava("Jirafales");
		
		//Mostramos con un bucle for todos los elementos de array
		for(int x = 0;x < 3; x++) {
			System.out.println(vArt[x].toString());
		}
		System.out.println("El proximo ID que se va a crear es: " + ClaseJava.proxID());
		
	}

}
