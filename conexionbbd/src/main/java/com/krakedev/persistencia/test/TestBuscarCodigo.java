package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.pesistencia.entidades.Persona;

public class TestBuscarCodigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	ArrayList<Persona> p=AdminPersonas.buscarPorCodigo(1);
	System.out.println(p);
} catch (Exception e) {
	// TODO Auto-generated catch block
	System.out.println(e.getMessage());
	e.printStackTrace();
}

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
