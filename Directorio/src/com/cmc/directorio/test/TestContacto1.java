package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telf = new Telefono("movi", "0201212",14);
		Contacto c = new Contacto("Salcedo",telf, 98);
		// INFORMACION DEL CONTACTO
		
		System.out.println("Apellido: "+c.getApellido());
		System.out.println("Operadora: "+telf.getOperadora());
		System.out.println("Numero: "+telf.getNumero());
		System.out.println("Peso: "+c.getPeso());
		
	}

}
