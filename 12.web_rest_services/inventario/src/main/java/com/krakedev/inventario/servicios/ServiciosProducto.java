package com.krakedev.inventario.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.krakedev.inventario.entidades.Categoria;
import com.krakedev.inventario.entidades.Producto;
@Path("productos")
public class ServiciosProducto {
	@Path("insertar")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public void insertar(Producto producto) {
		System.out.println(">>>>>>>>"+producto);
	}
	@Path("actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizar(Producto producto) {
		System.out.println("ACTUALIZANDO CLIENTE >>>>>"+producto);
	}
	@Path("consultar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Producto> recuperaTodos() {
		ArrayList<Producto> a =new ArrayList();
		a.add(new Producto("1","Marcelo", new Categoria(1,"A1"),50.25,50));
		a.add(new Producto("2","Luis", new Categoria(3,"A2"),10.10,60));
		a.add(new Producto("3","Lenin", new Categoria(5,"A3"),20.20,30));
		return a;
	}
	
	
}
