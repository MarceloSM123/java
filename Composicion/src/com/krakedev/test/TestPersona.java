package com.krakedev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1=new Persona();
		String nombre=p1.getNombre();
		Direccion d1=p1.getDireccion();
		System.out.println(nombre);
		// d1 esta null, y trato de invocar a un metodo con esa variable
		System.out.println(d1.getCallePrincipal());
		//null.algunMetodo();
	}

}
