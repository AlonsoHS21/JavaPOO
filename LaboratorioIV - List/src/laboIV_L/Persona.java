package laboIV_L;

public class Persona {
	
	//Atributos
	private String nombre;
	private String apellido;
	private int id;
	private static int cont = 0;
	
	//Contructores
	public Persona() {
		cont++;
		nombre = "Sin Nombre";
		apellido = "Sin Apellido";
		id = cont;
	}
	public Persona(String nombre,String apellido) {
		cont++;
		this.nombre = nombre;
		this.apellido = apellido;
		id = cont;
	}
	
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getID() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}
	
	//Metodo ToString();
	@Override
	public String toString() {
		return "Nombre = " + nombre + ", Apellido = " + apellido + ", ID = " + id;
	}
	
	
	
	
	
	
}
