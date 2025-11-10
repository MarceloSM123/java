package com.krakedev.colecciones;

import java.util.ArrayList;

public class AdminPersonas {
	private ArrayList<Persona> personas; // se debe instanciar
	
	public AdminPersonas(){
			personas = new ArrayList<Persona>();// instanciamos en el constructor
	}
	
	public void agregar(Persona persona)
	{
		personas.add(persona);
	}
	
	public void imprimir() {
		Persona elementoPersona;
		for(int i=0;i<personas.size();i++){
			elementoPersona=personas.get(i);
			System.out.println("Persona: "+elementoPersona.getNombre()+" "+elementoPersona.getApellio()+" Edad: "+elementoPersona.getEdad());
		}
	
	}
}
