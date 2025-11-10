package com.krakedev.colecciones;

public class Persona {
	private String nombre;
	private String apellio;
	
	
	
	public Persona(String nombre, String apellio) {
		//super();
		this.nombre = nombre;
		this.apellio = apellio;
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
	
}
