package labIV_I;

public class Cantante extends Persona implements ICantar{

	private boolean estudios;
	
	public Cantante() {
		estudios = false;
	}
	public Cantante(String nombre,String apellido,boolean estudios) {
		super(nombre,apellido);
		this.estudios = estudios;
	}
	
	public boolean isEstudios() {
		return estudios;
	}
	public void setEstudios(boolean estudios) {
		this.estudios = estudios;
	}
	
	@Override
	public String toString() {
		return "Cantante [estudios=" + estudios + "]";
	}
	
	//Interfaz de ICantar
	public void cantar() {
		System.out.println("LALALA");
	}
	
}
