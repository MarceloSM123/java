package com.krakedev.excepciones;

public class Ejercicio1 {
	public static void main(String[] args) {
		System.out.println("inicio");
		String a=null;
		try {
			a.substring(3);
			System.out.println("fin");
		}catch(Exception ex){
		System.out.println("Entra en el catch");
		}
		System.out.println("fuera del catch");
	}
	
}
