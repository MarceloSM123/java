package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1 = new Auto(); //auto1 referenciado e instanciado
		Auto auto2=new Auto();//auto2 referenciado e instanciado
		// modificacion de valores auto1
		auto1.marca="Toyota";
		auto1.anio=2025;
		auto1.precio=50000.00;
		//modificacion de valores auto2
		auto2.marca="Tesla";
		auto2.anio=2025;
		auto2.precio=25000.00;
		// imprimir valores de atributos de auto1
		System.out.println("-------AUTO1------");
		System.out.println("MARCA: "+auto1.marca);
		System.out.println("AÑO: "+auto1.anio);
		System.out.println("PRECIO: "+auto1.precio);
		// imprimir valores de atributos auto2
		System.out.println("-------AUTO2------");
		System.out.println("MARCA: "+auto2.marca);
		System.out.println("AÑO: "+auto2.anio);
		System.out.println("PRECIO: "+auto2.precio);
		
	}

}
