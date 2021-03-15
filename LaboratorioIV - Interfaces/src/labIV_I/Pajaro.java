package labIV_I;

public class Pajaro implements ICantar {
	
	private int edad;
	
	public Pajaro() {
		edad = 0;
	}
	public Pajaro(int edad) {
		super();
		this.edad = edad;
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Pajaro [edad=" + edad + "]";
	}
	
	//Interfaz de ICantar
	public void cantar() {
		System.out.println("IIII");
	}
	
	
}
