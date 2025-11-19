package com.krakedev.excepciones;

public class Ejercicio1 {
	public static void main(String[] args) {
		System.out.println("inicio");
		// String a=null; // genera una excepcion que activa al bloque catch
		String a="xxxss";
		//si no hay excepciones entra al bloque try
		try {
			a.substring(3);
			System.out.println("fin");
		//si sucede una excepcion salta al bloque catch
		// impide que el programa se detenga por escepciones 
		}catch(Exception ex){
		System.out.println("Entra en el catch");
		}finally {
			System.out.println("ingresa al finally");
			//el bloque se ejecuta se ejecute o no el try o el catch
		}
		System.out.println("fuera del catch");
	}
	
}
