package com.krakedev.servicios;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("customers")// como se encadena la direccion
public class ServicioClientes {
	@Path("m1") // se encadena la direccion 
	@GET
	public String saludar() {
		return "HOLA MUNDO REST WEB SERVICES";
	}
}
