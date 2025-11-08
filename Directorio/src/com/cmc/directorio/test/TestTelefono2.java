package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf=new Telefono("movi","098234234",20);
		AdminTelefono at=new AdminTelefono();
		at.ActivarMensajeria(telf);
		
		// impresion de datos de telf
		
		System.out.println("OPERADORA: "+telf.getOperadora());
		System.out.println("NUMERO: "+telf.getNumero());
		System.out.println("CODIGO: "+telf.getCodigo());
		System.out.println("Tiene Whats: "+telf.isTieneWhatapp());

	}

}
