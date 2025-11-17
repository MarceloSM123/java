package com.krakedev.Ddemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Admin {
	//añadimos static para no añadir un logger por cada objeto
	//sino por acada clase
	private static Logger logger =LogManager.getLogger(Admin.class); // es el nombre de la clase actual
	
	public void agregar() {
	logger.warn("ingresar a agregar");
	logger.info("ingresar a agregar");
	logger.debug("ingresar a agregar");
	logger.trace("ingresar a agregar");
	
	logger.error("ingresar a agregar");
	}
}
