package com.krakedev.test;

import com.krakedev.Rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1=new Rectangulo();// declaracion y instancia de la variable
		Rectangulo r2=new Rectangulo();
		System.out.println("*------------AREA 1-------*");
		System.out.println(r1.CalcularArea());
		//r1.altura=10;
		r1.setAltura(10);
        //r1.base=5;
		r1.setBase(5);
		System.out.println("AREA 1:"+r1.CalcularArea());
		System.out.println("PERIMETRO 1: "+r1.calcularPerimetro());
		
	System.out.println("*------------AREA 2-------*");
	System.out.println("AREA 2: "+r2.CalcularArea());
	//r2.altura=2;
	r2.setAltura(2);
	//r2.base=9;
	r2.setBase(9);
	System.out.println("AREA 2: "+r2.CalcularArea());
	System.out.println("PERIMETRO 2: "+r2.calcularPerimetro());
	}

}
