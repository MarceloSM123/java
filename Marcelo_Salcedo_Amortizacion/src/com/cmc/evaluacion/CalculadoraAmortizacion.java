package com.cmc.evaluacion;

public class CalculadoraAmortizacion {
	public double calcularCuota(Prestamo prestamo) {
		double interes=(prestamo.getInteres()/12)/100.0;
		System.out.println("interes: "+interes);
		double monto=prestamo.getMonto();
		System.out.println("monto: "+monto);
		int plazo=prestamo.getPlazo();
		System.out.println("plazo: "+plazo);
		return (monto*interes)/(1-Math.pow(1+interes,-plazo));
	}
	
}
