package eje_F;

public class Cuadrado implements ICalculo {
	
	//Atributos
	private double lado;
	private double res;
	
	//G and S de lado
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double calcularArea() {
		res = lado*lado;
		return res;
	}
	public double calcularPerimetro() {
		res = lado + lado + lado + lado;
		return res;
	}
	
	
	
}
