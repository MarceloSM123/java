package com.cmc.directorio.entidades;

public class AdminTelefono {
	
	
	public void ActivarMensajeria(Telefono telefono) {
		if(telefono.getOperadora()=="movi") {
			telefono.setTieneWhatapp(true);
		}	
	}
	
	public int contarMovi(Telefono telf1,Telefono telf2, Telefono telf3) {
		 int t1=0;
		 int t2=0;
		 int t3=0;
		 
		 ActivarMensajeria(telf1);
		 ActivarMensajeria(telf2);
		 ActivarMensajeria(telf3);
	
		if(telf1.isTieneWhatapp()==true) {
			 t1=1;
		}
		if(telf2.isTieneWhatapp()==true) {
			 t2=1;
		}
		if(telf3.isTieneWhatapp()==true) {
			 t3=1;
		}
		return t1+t2+t3;
		
	}
	
	public int ContarClaro(Telefono telf1,Telefono telf2, Telefono telf3,Telefono telf4) {
		 int t1=1;
		 int t2=1;
		 int t3=1;
		 int t4=1;
		 
		 ActivarMensajeria(telf1);
		 ActivarMensajeria(telf2);
		 ActivarMensajeria(telf3);
		 ActivarMensajeria(telf4);
	
		if(telf1.isTieneWhatapp()==true) {
			 t1=0;
		}
		if(telf2.isTieneWhatapp()==true) {
			 t2=0;
		}
		if(telf3.isTieneWhatapp()==true) {
			 t3=0;
		}
		if(telf4.isTieneWhatapp()==true) {
			 t4=0;
		}
		return t1+t2+t3+t4;
	}
}
