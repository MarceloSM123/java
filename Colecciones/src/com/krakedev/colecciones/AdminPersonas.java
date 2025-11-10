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
	
	public Persona buscarPorNombre(String Nombre) {
		Persona elementoPersona=null;
		Persona personaEncontrada=null;
		
		for(int i=0;i<personas.size();i++) {
			elementoPersona=personas.get(i);
			if(Nombre.equals(elementoPersona.getNombre())) { //al comparar Strings usar el metodo .equals
				personaEncontrada=elementoPersona;
			}
			
		}
		
		return personaEncontrada;
	}
	
	public ArrayList<Persona> buscarMayores(int edad){
		ArrayList<Persona> mayores = new ArrayList<Persona>();
		Persona elementoPersona=null;
		for(int i=0;i<personas.size();i++) {
			elementoPersona=personas.get(i);
			if(elementoPersona.getEdad()>edad) {
				mayores.add(elementoPersona);
			}
		}
		return mayores;
		
	}
}
