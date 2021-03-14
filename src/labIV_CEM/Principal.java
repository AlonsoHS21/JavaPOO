package labIV_CEM;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//USANDO LOS CONSTRUCTORES Y EL METODO GET
		ClaseJava art = new ClaseJava();
		System.out.println("ID: "+ art.getId() + " y Nombre: " +  art.getNombre());
		
		ClaseJava art2 = new ClaseJava("Alonso",1); // Ahora le paso parametros en orden
		System.out.println("ID: "+ art2.getId() + " y Nombre: " +  art2.getNombre());
		
		//USANDO EL METODO SET y GET
		int numeroID = 2;
		String nombre = "Cristiano";
		ClaseJava artSet = new ClaseJava();
		artSet.setId(numeroID);
		artSet.setNombre(nombre);
		System.out.println("Numero ID: " + artSet.getId() + " y su Nombre es: " + artSet.getNombre());
		
		//USANDO EL METODO TOSTRING()
		System.out.println(artSet.toString());
	}

}
