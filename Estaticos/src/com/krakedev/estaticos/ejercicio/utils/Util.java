package com.krakedev.estaticos.ejercicio.utils;

public class Util {
	public static String formatearHora(int numero) {
		String valor=numero+"";
		if(valor.length()==1) {
			valor="0"+numero+"";
			return valor;
		}
		return valor;
	}
	
	public static String formatearDia(int numero) {
		if(numero==0) {return "LUNES";}
		if(numero==1) {return "MARTES";}
		if(numero==2) {return "MIERCOLES";}
		if(numero==3) {return "JUEVES";}
		if(numero==4) {return "VIERNES";}
		if(numero==5) {return "SABADO";}
		if(numero==6) {return "DOMINGO";}
		return null;
	}
}
