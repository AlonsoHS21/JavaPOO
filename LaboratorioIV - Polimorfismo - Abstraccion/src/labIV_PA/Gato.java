package labIV_PA;

public class Gato extends Animal {
	
	public Gato() {
		super();
	}
	public Gato(String nombre) {
		super(nombre);
	}
	@Override
	public String toString() {
		return "Es un gato, se llama: " + getNombre();
	}
	@Override
	public String habilidades() {
		// TODO Auto-generated method stub
		return "Los gatos son flexibles y elasticos";
	}
	
}
