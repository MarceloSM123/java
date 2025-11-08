package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono t1=new Telefono ("movi", "0201212",14);
		Telefono t2=new Telefono ("claro", "45645",11);
		Telefono t3=new Telefono ("movi", "678678",16);
		
		AdminTelefono a1=new AdminTelefono();
		
		int contadorMovi;
		contadorMovi=a1.contarMovi(t1, t2, t3);
		System.out.println(contadorMovi);
		
			

	}

}
