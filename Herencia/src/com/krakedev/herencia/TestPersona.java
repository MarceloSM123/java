package com.krakedev.herencia;

public class TestPersona {

	public static void main(String[] args) {
		Persona p=new Persona("1212","Marcelo");
	System.out.println(p.toString()); // si no esta sobreescrito este metodo se selecciona
	// de la clase toObject
	
	// Si el metodo esta sobreescrito entonces se ejecuta el sobreescrito en la clase instanciada
	

	}

}
