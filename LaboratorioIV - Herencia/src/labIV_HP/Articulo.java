package labIV_HP;

public class Articulo {
	
	private int id;
	private String nombre;
	
	private static int cont = 0;
	
	public static int proxID() {
		return cont+1;
	}
	
	public Articulo() {
		cont++;
		this.id = cont;
		this.nombre = "Sin nombre";
	}
	public Articulo(String nombre) {
		cont++;
		this.id = cont;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Articulo id = " + id + ", nombre = " + nombre;
	}
	
	
}
