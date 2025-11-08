package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf=new Telefono("movi","09941234123",10);
		
		// impresion en consola de la informacion del telefono
		
		System.out.println("OPERADORA: "+telf.getOperadora());
		System.out.println("NUMERO: "+telf.getNumero());
		System.out.println("CODIGO: "+telf.getCodigo());
	}

}
