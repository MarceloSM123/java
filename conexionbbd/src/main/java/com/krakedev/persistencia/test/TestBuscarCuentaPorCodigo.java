package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestBuscarCuentaPorCodigo {

	public static void main(String[] args) {
		try {
			String a=AdminPersonas.buscarCuentaPorCodigo(1);
			System.out.println("Cuenta:"+a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
}
