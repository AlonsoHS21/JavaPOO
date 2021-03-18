package laboIV_I;

public class Libro {
	
	private  int id;
	private String nombre;
	private String apellido;
	private static int cont = 0;
	
	//Contructores
	public Libro() {
		cont++;
		id = cont;
		nombre = "Sin nombre";
		apellido = "Sin apellido";
	}
	public Libro(String nombre,String apellido) {
		cont++;
		id = cont;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	//Getter and Setters
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
	
	
	//Metodo ToString()
	@Override
	public String toString() {
		return "id = " + id + ", nombre = " + nombre + ", apellido = " + apellido;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + cont;
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	
	//Metodo equals y hashcode
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	
}
