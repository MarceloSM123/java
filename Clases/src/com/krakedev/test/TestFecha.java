package com.krakedev.test;

import com.krakedev.Fecha;

public class TestFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha fecha1=new Fecha(2000,12,12); 
		// fecha1.anio=2000; no es posible si la variable esta en privado
		// usamos el metodo setAnio
		fecha1.setAnio(1000);// nos permite modificar
		// para obtener el valor de la variable usamos el metodo get
		System.out.println(fecha1.getAnio());
		
		// fecha1.dia=10; no es posible si el accesi a ka variable es private
		// usamos el metodo set
		fecha1.setDia(25);
		//para recuparar el dato de la variable dia usamo get
		System.out.println(fecha1.getDia());
		// fecha1.mes=10; no es posible si la variable es privada en el metodo
		// para modificarla usamos set
		fecha1.setMes(10);
		// para recuperar el dato usamos el metodo getMes
		System.out.println(fecha1.getMes());
	}

}
