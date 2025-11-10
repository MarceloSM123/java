package com.krakedev.colecciones;

public class Persona {
	private String nombre;
	private String apellio;
	private int edad;
	
	
	
	public Persona(String nombre, String apellio) {
		//super();
		this.nombre = nombre;
		this.apellio = apellio;
	}
	
	
	
	public Persona(String nombre, String apellio, int edad) {
		//super();
		this.nombre = nombre;
		this.apellio = apellio;
		this.edad = edad;
	}



	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellio() {
		return apellio;
	}
	public void setApellio(String apellio) {
		this.apellio = apellio;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
