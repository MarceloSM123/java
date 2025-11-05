package com.krakedev;

public class Cuadrado {
	private double lado;
	public double calcularArea() {
		return lado*lado; 
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double calcularPerimetro() {
		return 4*lado;
	}
}
