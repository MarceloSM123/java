package com.krakedev.estaticos;

public class Calculos {
	private final double IVA=12; // final combierte la variable en constante, iva no puede ser modificado
	// LAS CONSTANTES SE ESCRIBEN EN MAYUSCULAS
	
	public double calcularIva(double monto ) {
		return monto*IVA/100;
	}
}
