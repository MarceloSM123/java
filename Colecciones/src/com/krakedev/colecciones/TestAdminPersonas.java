package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		AdminPersonas admin=new AdminPersonas();
		//admin.agregar(new ("","",));
		admin.agregar(new Persona("Marcelo","Salcedo",33));
		admin.agregar(new Persona("Tito","Salazar",10));
		admin.agregar(new Persona("Carlos","Loma",40));
		
		admin.imprimir();
		//Persona p1=admin.buscarPorNombre("Marcelo");
		Persona p1=admin.buscarPorNombre("dIAZ");
		if(p1!=null) {
		System.out.println("ENCONTRADO  Apellido: "+p1.getApellio()+" Edad: "+p1.getEdad());}
		else { System.out.println("No encontrado");}
		
		ArrayList<Persona> PersonasMayores=admin.buscarMayores(10);
		System.out.println("PERSONAS MAYORES: "+PersonasMayores.size());
	}

}
