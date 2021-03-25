package labIV_HP;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Video 4 
		ArticuloGimnasio artG = new ArticuloGimnasio();
		artG.setNombre("Alonso");
		artG.setPeso(100);
		
		System.out.println(artG.toString());
		*/
		
		/* Video 5 */
		ArticuloGimnasio artG = new ArticuloGimnasio();
		artG.setNombre("Mancuerna");
		artG.setPeso(100);
		System.out.println(Articulo.proxID());
		
		System.out.println(artG.toString());
		System.out.println(artG.convierteKilosAGramos());
	
	}

}
