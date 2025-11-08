package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono t1=new Telefono ("movi", "0201212",14);
		Telefono t2=new Telefono ("claro", "45645",11);
		Telefono t3=new Telefono ("movi", "678678",16);
		Telefono t4=new Telefono ("claro", "1231233",18);
		
		AdminTelefono a1=new AdminTelefono();
		
		int contarClaro1;
		contarClaro1=a1.ContarClaro(t1, t2, t3, t4);
		System.out.println(contarClaro1);
	}

}
