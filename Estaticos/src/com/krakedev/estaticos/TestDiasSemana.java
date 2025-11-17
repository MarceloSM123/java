package com.krakedev.estaticos;

public class TestDiasSemana {

	public static void main(String[] args) {
		
		// acceso a la variable con final
	/*	DiasSemana diasSemana=new DiasSemana();
		int dia=diasSemana.LUNES;
		System.out.println(dia);*/
		
		// acceso al la variable con static final
		int dia=DiasSemana.LUNES;
		System.out.println(dia);
	}

}
