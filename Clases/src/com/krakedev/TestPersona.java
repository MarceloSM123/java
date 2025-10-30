package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p; // 1. declaro una variable p de tipo persona
		p=new Persona();//2: intanciar un objeto persona, referenciado
		Persona p1=new Persona();
		
		// 3. acceso a los atributos
		
		System.out.println("NOMBRE: "+p.nombre);
		System.out.println("EDAD: "+p.edadPersona);
		System.out.println("ESTATURA: "+p.estatura);
		
		// 4. Accedo a los atributos
		
		p.nombre="Marcelo";
		p.edadPersona=33;
		p.estatura=1.55;
		
		//5. accedo a los atributos
		
		System.out.println("NOMBRE: "+p.nombre);
		System.out.println("EDAD: "+p.edadPersona);
		System.out.println("ESTATURA: "+p.estatura);
		
		p1.nombre="Angelina";
		System.out.println("*****************");
		System.out.println("p.nombre: "+p.nombre);
		System.out.println("p1.nombre: "+p1.nombre);
		
	}

}
