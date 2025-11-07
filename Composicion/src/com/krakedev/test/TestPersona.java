package com.krakedev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1=new Persona();
		p1.setNombre("Marcelo");
		p1.setApellido("Salcedo");

		
		Direccion d2=new Direccion();// creamos un dato tipo direccion para usae el setDireccion 
		d2.setCallePrincipal("calle L");
		d2.setCalleSecundaria("calle K");
		d2.setNumero("n-35");
		p1.setDireccion(d2);// requiere un dato de tipo direccion
		
		
		
		String nombre=p1.getNombre();
		Direccion d1=p1.getDireccion();
		System.out.println(nombre);
		// d1 esta null, y trato de invocar a un metodo con esa variable
		System.out.println(d1.getCallePrincipal());
		//null.algunMetodo();
		p1.imprimir();
		
		
		//que suecede si...
		Persona p2=new Persona();
		p2.setNombre("luis");
		p2.imprimir();
		
		// la escepcion especifica la linea que genera el error, se debe analizar dicha linea
	}

}
