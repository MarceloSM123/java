package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("movi", "0201212", 14);
		Contacto c1 = new Contacto("Sanchez", telf1, 100);
		//telf1.setTieneWhatapp(true);
		System.out.println("Whatsapp :" + telf1.isTieneWhatapp());

		AdminContactos p1 = new AdminContactos();
		p1.ActivarUsuario(c1);
		System.out.println("Modo de usuario: "+c1.isActivo());
	}

}
