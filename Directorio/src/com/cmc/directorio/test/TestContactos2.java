package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("movi", "0201212",14);
		Telefono telf2 = new Telefono("movi", "1233232",13);
		
		Contacto c1=new Contacto("Sanchez",telf1,100);
		Contacto c2=new Contacto("Nuñez",telf2,100);
		
		AdminContactos a1 = new AdminContactos();
		
		if(a1.BuscarMasPesado(c1, c2)==null) {
			System.out.println("Pesan lo mismo");
		}else {
			Contacto c=a1.BuscarMasPesado(c1, c2);
			Telefono telf=c.getTelefono();
		
			System.out.println("Apellido: "+c.getApellido());
			System.out.println("Operadora: "+telf.getOperadora());
			System.out.println("Numero: "+telf.getNumero());
			System.out.println("Peso: "+c.getPeso());
			
		}
		
		// METODO COMPARAR OPERADORAS 
		
		System.out.println("Las operadoras son iguales: "+a1.CompararOperadoras(c1, c2));
		
		//

	}

}
