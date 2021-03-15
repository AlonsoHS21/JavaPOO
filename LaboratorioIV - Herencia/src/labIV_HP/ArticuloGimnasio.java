package labIV_HP;

public class ArticuloGimnasio extends Articulo {
		
	private int peso;
	private static final int gramos = 1000;
	//static para que sea una variable de la clase y no de cada objeto creado
	//final para que su valor no se pueda cambiar
	
	//Constructor
	public ArticuloGimnasio(){
		super(); //Llama al constructor del padre
	}
	public ArticuloGimnasio(String nombre,int peso) {
		super(nombre);
		this.peso = peso;
	}
	
	public int convierteKilosAGramos() {
		return peso*gramos;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return super.toString() + " y peso = " + peso;
	} 
	
	
	
}
