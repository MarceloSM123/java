package com.krakedev.colecciones;

public class TestAdminPersonas {

	public static void main(String[] args) {
		AdminPersonas admin=new AdminPersonas();
		//admin.agregar(new ("","",));
		admin.agregar(new Persona("Marcelo","Salcedo",33));
		admin.agregar(new Persona("Tito","Salazar",10));
		admin.agregar(new Persona("Carlos","Loma",40));
		
		admin.imprimir();

	}

}
