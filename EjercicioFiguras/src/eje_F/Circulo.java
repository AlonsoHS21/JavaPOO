package eje_F;

public class Circulo implements ICalculo {
	
	//Atributos de la clase Circulo
	private double radio;
	private static double pi = 3.14f;
	private double res;
	
	
	//Gets and Sets de Radio
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	//Metodos de la clase implementada
	public double calcularArea() {
		res = pi*(Math.pow(radio,2));
		return res;
	}
	public double calcularPerimetro() {
		res = 2*pi*radio;
		return res;
	}
	
}
