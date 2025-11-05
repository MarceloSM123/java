package com.krakedev.test;

import com.krakedev.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calc=new Calculadora();
		int a=calc.suma(5, 6);
		System.out.println("SUMA: "+a);
		int resta=calc.restar(8, 9);
		System.out.println("RESTA: "+resta);
		//multiplicacion
	    double multiplicar=calc.multiplicar(2.5, 4.5);
	    System.out.println("MULTIPLICACION: "+multiplicar);
	    //dividir
	    double dividir=calc.dividir(1.5,1.85);
	    System.out.println("DIVIDIR: "+dividir);
	  //PROMEDIAR
	    double promediar=calc.promediar(1, 2, 3);
	    System.out.println("PROMEDIO: "+promediar);
	    //mostrar Resultado
		   calc.mostrarResultado();
	
	
	}

}
