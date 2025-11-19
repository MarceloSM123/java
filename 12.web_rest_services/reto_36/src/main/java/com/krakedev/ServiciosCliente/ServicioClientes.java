package com.krakedev.ServiciosCliente;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("customers")
public class ServicioClientes {
	@Path("m1")
	@GET
	public String saludar() {
		return "RETO 36--COMPLETO---";
	} 
}
