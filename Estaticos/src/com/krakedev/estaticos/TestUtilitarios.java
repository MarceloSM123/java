package com.krakedev.estaticos;

public class TestUtilitarios {

	public static void main(String[] args) {
		
		// forma no estatica de acceso al metodo validar rango
		/*Utilitarios variable =new Utilitarios();
		boolean a=variable.validarRango(5);*/
		
		// forma estatica de acceso del metodo validar rango
		
		boolean b=Utilitarios.validarRango(5);
		System.out.println(b);
	}

}
