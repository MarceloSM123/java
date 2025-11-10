package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Persona> personas=new ArrayList<Persona>();
		Persona p1=new Persona("Mareclo","Salcedo");// antes de ingresar al array creamos los objetos segun la clase
		//OPCION 1
		personas.add(p1); //agregamos el objeto declarado e instanciado
		//OPCION 2
		personas.add(new Persona("Luis","Lopez"));
		personas.add(new Persona("Marco","Chavez"));
		personas.add(new Persona("Vinicio","Duran"));
		
		System.out.println("Tamaño: "+personas.size());
		
		Persona elementoPersonas;// declaramos la variable segun este declarado el Arraylist
		
		for(int i=0;i<personas.size();i++) { // cuidado con el punto de inicio del conteo
			elementoPersonas=personas.get(i);
			System.out.println(elementoPersonas.getNombre()+" "+elementoPersonas.getApellio());
		}
		
	}

}
