package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {
		ArrayList<String> cadenas;
		String valorRecuperado;
		cadenas=new ArrayList<String>();
		System.out.println(cadenas.size());// determina el tamaño del arraylist
		cadenas.add("uno");//ingresa elementos al arraylist EN LA POSICION 0
		cadenas.add("dos");//ingresa elementos al arraylist EN LA POSICION 1
		System.out.println(cadenas.size());
		// hallar el valor de un dato del array segun du posicion
		
		//valorRecuperado=cadenas.get(3); // el tratar de acceder a un indice que no existe genera una escepcion
		valorRecuperado=cadenas.get(1);// el conteo inicia desde 0
		System.out.println("valor recuperado: "+valorRecuperado);
	
		//SENTENCIA FOR
		String cadena;
		for(int i=0;i<cadenas.size();i++) { // el contador inicia con un int, contador entero
			cadena = cadenas.get(i);
			System.out.println("cadena: "+cadena);
		}
	
	}

}
