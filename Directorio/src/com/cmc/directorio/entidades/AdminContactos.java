package com.cmc.directorio.entidades;

public class AdminContactos {
	
	public Contacto BuscarMasPesado(Contacto c1,Contacto c2) {
		if(c1.getPeso()>c2.getPeso()) {
			return c1;
		}else if (c2.getPeso()>c1.getPeso()) {
			return c2;
		}else {
			return null;
		}
	}
	
	public boolean CompararOperadoras(Contacto c1,Contacto c2) {
		Telefono t1=c1.getTelefono();
		Telefono t2=c2.getTelefono();
		
		if(t1.getOperadora()==t2.getOperadora()){
			return true;
		}else {
			return false;
		}
		
	}
	
	public void ActivarUsuario(Contacto c1) {
		Telefono t1=c1.getTelefono();
		if(t1.isTieneWhatapp()==true) {
			c1.setActivo(true);
		}
	}
	
	
}
