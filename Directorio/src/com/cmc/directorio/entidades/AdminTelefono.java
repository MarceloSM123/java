package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void ActivarMensajeria(Telefono telefono) {
		if(telefono.getOperadora()=="movi") {
			telefono.setTieneWhatapp(true);
		}
	}
}
