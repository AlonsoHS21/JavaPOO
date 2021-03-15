package labIV_PA;

public class Perro extends Animal {
	
	private String raza;
	
	
	public Perro() {
		super();
		raza = "Sin raza";
	}
	public Perro(String nombre,String raza) {
		super(nombre);
		this.raza = raza;
	}
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Es un perro, se llama " + super.getNombre() + " y es de raza: " + getRaza();
	}
	@Override
	public String habilidades() {
		// TODO Auto-generated method stub
		return "Los perros pueden localizar y separar olores";
	}
	
	
	
}
