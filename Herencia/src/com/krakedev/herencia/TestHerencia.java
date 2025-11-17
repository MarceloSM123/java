package com.krakedev.herencia;

public class TestHerencia {

	public static void main(String[] args) {
		Perro p =new Perro();
		p.dormir();
		Animal a =new Animal();
		System.out.println(a.hashCode());// es un metodo de object 
		// animal hereda este metodo de object 
		// object es una clase padre para todas las clases
		// al colocar p. se depliegan metodos de la clase objeto, clase perro, clase animal
	p.dormir();// p es clase perro y hereda de animal, 
	// el metodo dormir original esta en animal, el sobreescrito esta en Perro
	}

}
