package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

public class TestAlrmas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alarma al1=new Alarma(DiasSemana.LUNES,14,25);
		Alarma al2=new Alarma(DiasSemana.MIERCOLES,14,25);
		Alarma al3=new Alarma(DiasSemana.JUEVES,14,25);
		
		AdminAlarmas a=new AdminAlarmas();
		
		a.agregarAlarma(al1);
		a.agregarAlarma(al2);
		a.agregarAlarma(al3);
		
		ArrayList<Alarma> alm=a.getAlarmas();
		
		System.out.println(alm.toString());
		
	}

}
