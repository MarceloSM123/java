package com.krakedev.estaticos;

public class Utilitarios {
	/*   Metodo no estatico
	public boolean validarRango(int valor) {
		if(valor>=0 && valor<=0) {
			return true;
		}else {
			return false;
		}
	}*/
	// El mismo metodo pero estatico
	public static boolean validarRango(int valor) {
		if(valor>=0 && valor<=0) {
			return true;
		}else {
			return false;
		}
		}
	}
