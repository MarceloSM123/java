package com.krakedev.controlflujo.test;

import com.krakedev.controlflujo.Validar;

public class TestValidador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validar validador =new Validar();
		validador.ValidarEdad(18);
		validador.ValidarEdad(20);
		validador.ValidarEdad(10);
	}

}
