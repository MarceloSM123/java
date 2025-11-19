package com.krakedev.excepciones;

import java.io.File;
import java.io.IOException;

public class Ejercicio2 {
	
	// EXISTEN 2 TIPOS DE EXCEPCION 
	public void metodo1() {
		String a=null;
		a.substring(0);
		//NPE UNCHEKED NO AVISA DE UNA POSIBLE EXCEPCION
		
	}
	public void metodo2() {
		File f=new File("archivo1.txt");
		//f.createNewFile();// CHEKED: AVISA DE UNA POSIBLE EXCEPCION
		//f.createNewFile();
	}
	
	// PARA MANEJAR LA ESCEPCION PIDEMOS USAR TRY/CATCH
	//solucion 1:
	public void metodo3() {
		File f=new File("archivo1.txt");
		//f.createNewFile();// CHEKED: AVISA DE UNA POSIBLE EXCEPCION
		try {
			f.createNewFile();// PUEDE GENERAR UNA EXCEPCION CHEKED
		} catch (IOException io) {// LA EXCEPCION ES DEL TIPO IOException
			System.out.println("error");
		}
	}
	
	//solucion 2:
	//throws IOException significa ue el metodo no hace nada si la detecta
	//el metodo se ejecuta y pasa la excepcion a otro metodo
	// es decir la propaga
	public void metodo4() throws IOException{
		File f=new File("archivo1.txt");
		f.createNewFile();
	}
	
	//solucion 3:
	public void metodo5() throws IOException{// se tomo la desicion de continuar propagandolo
		metodo4();// el metodo arrastrala excepcion, en este punto
		//se podria generar un try/catch para la excepcion 
		// o se podria continuar propagandolo
	}
	
}
