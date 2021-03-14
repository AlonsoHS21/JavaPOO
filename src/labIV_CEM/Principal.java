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
		ClaseJava art1 = new ClaseJava();
		//art1.setId(1);
		art1.setNombre("Don Ramon");
		System.out.println(art1.toString());
		
		ClaseJava art2 = new ClaseJava();
		//art2.setId(2);
		art2.setNombre("Señor Barriga");
		System.out.println(art2.toString());
		
		ClaseJava art3 = new ClaseJava();
		//art3.setId(3);
		art3.setNombre("Jirafales");
		System.out.println(art3.toString());
		
	}

}
