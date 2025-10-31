package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado c1= new Cuadrado();
		Cuadrado c2= new Cuadrado();
		Cuadrado c3= new Cuadrado();
		System.out.println("*-----CUADRADO 1----");
		c1.lado=10.25;
		System.out.println("Lado: "+c1.lado);
		System.out.println("Area: "+c1.calcularArea());
		System.out.println("Perimetro: "+c1.calcularPerimetro());
		
		System.out.println("*-----CUADRADO 2----");
		c2.lado=5.69;
		System.out.println("Lado: "+c2.lado);
		System.out.println("Area: "+c2.calcularArea());
		System.out.println("Perimetro: "+c2.calcularPerimetro());
		
		System.out.println("*-----CUADRADO 1----");
		c3.lado=10.25;
		System.out.println("Lado: "+c3.lado);
		System.out.println("Area: "+c3.calcularArea());
		System.out.println("Perimetro: "+c3.calcularPerimetro());
		
	}

}
