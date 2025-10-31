package com.krakedev;

public class Calculadora {
	public int suma (int a, int b) {
		int resultado;
		resultado=a+b;
		return resultado;
	}
	
	public int restar (int a, int b) {
		int resultado;
		resultado=a-b;
		return resultado;
	}
	
	public double multiplicar (double valor1, double valor2) {
		return valor1*valor2;
	}
	
	public double dividir(double numerador, double denominador) {
		return numerador/denominador;
	}
	
	public double promediar (double valor1, double valor2, double valor3) {
		return (valor1+valor2+valor3)/3;
	}
	
	public void mostrarResultado() {
		System.out.println("Ahorita no joven, sali al almuerzo. Regreso en 15 min");
	}
}
