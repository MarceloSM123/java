package com.krakedev.servicios;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.krakedev.entidades.Cliente;

@Path("customers")// como se encadena la direccion
public class ServicioClientes {
	@Path("m1") // se encadena la direccion 
	@GET
	public String saludar() {
		return "HOLA MUNDO REST WEB SERVICES";
	}
	@Path("buscar")// generalmente tiene el mismo nombre del metodo
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Cliente buscar() {
		Cliente cliente = new Cliente("173333","Marcelo");
		return cliente;
	}
	@Path("insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Cliente cliente) {
		System.out.println(">>>>>>>"+cliente);
	}
	
	@Path("act")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizar(Cliente cliente) {
		System.out.println("ACTUALIZANDO CLIENTE>>>>>>>"+cliente);
	}
}
