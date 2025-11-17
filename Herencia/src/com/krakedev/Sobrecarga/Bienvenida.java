package com.krakedev.Sobrecarga;

public class Bienvenida {
	public void bienvenida(String nombre ) {
		System.out.println("HOLA: "+nombre);
	}
	
	public void bienvenida(String nombre, String apellido ) {
		System.out.println("HOLA: "+nombre + " "+apellido);
	}
	
	// La sobrecarga se da si se tiene un metodo con el mismo nombre pero
	//con diferentes atributos
}
