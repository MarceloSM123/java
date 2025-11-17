package com.krakedev.ejercicios;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Admin {
	//añadimos static para no añadir un logger por cada objeto
	//sino por acada clase
	private static Logger logger =LogManager.getLogger(Admin.class); // es el nombre de la clase actual
	
	public void agregar() {
	logger.info("ingresar a agregar");
	}
}
