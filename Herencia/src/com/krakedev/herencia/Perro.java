package com.krakedev.herencia;

public class Perro extends Animal{// perro hereda de animal
	public void ladrar() {
		System.out.println("perro ladrando");
	}
	
	@Override
	public void dormir() {
		super.dormir(); //con super. usa la funcion de la clase padre 
		System.out.println("Perro durmiendo");
	}
}
