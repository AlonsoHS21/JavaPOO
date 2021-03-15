package labIV_HP;

public class ArticuloGimnasio extends Articulo {
		
	private int peso;
	
	//Constructor
	public ArticuloGimnasio(){
		super(); //Llama al constructor del padre
	}
	public ArticuloGimnasio(String nombre,int peso) {
		super(nombre);
		this.peso = peso;
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
