package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.pesistencia.entidades.Persona;

public class TestAdminPersona {
	public static void main(String[] args) {
	//	values (1,'12345',12.12,'D','12/01/1999','12:12:12')

		//AdminPersonas.insertar(new Persona(1,"12345",12.12,"D","12/01/1999","12:12:12"));
	//	AdminPersonas.insertar(new Persona(2,"22222",10000.12,"D","18/11/2025","22:04:12"));
		AdminPersonas.actualizar(new Persona(2,"22222",999999.12,"D","18/11/2025","00:00:00"));
	}

}
