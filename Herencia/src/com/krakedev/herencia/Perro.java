package com.krakedev.herencia;

public class Perro extends Animal{// perro hereda de animal
	public void ladrar() {
		System.out.println("perro ladrando");
	}
	
	@Override
	public void dormir() {
		System.out.println("Perro durmiendo");
	}
}
