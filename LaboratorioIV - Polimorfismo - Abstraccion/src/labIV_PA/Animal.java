package labIV_PA;

public abstract class Animal {
	//Atributos
	private String nombre;
	
	//Constructores
	public Animal() {
		this.nombre = "Sin nombre";
	}
	public Animal(String nombre) {
		this.nombre = nombre;
	}
	
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Es un animal, su nombre es: " + nombre;
	}
	
	public abstract String habilidades();
	//Con abstract quiero decir que este metodo forma parte de la clase animal
	//pero el desarrollo del metodo que a cargo de las clases hijas en este caso
	//perro y gato
	
}
