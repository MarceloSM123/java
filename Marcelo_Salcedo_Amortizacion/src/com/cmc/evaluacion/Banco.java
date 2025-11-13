package com.cmc.evaluacion;

import java.util.ArrayList;

public class Banco {
	private ArrayList<Prestamo> prestamos= new ArrayList();
	private ArrayList<Cliente> clientes= new ArrayList();
	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}
	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public Cliente buscarCliente(String cedula) {
		
		 for(int i=0;i<clientes.size();i++) {
			 if(cedula.equals(clientes.get(i).getCedula())) {
				 return clientes.get(i);
			 }
			 			 	 
			  }
		 return null;
		
	}
	
	public void registrarCliente(Cliente cliente) {
		if(buscarCliente(cliente.getCedula())==null) {
			clientes.add(cliente);
		}else {System.out.println("El cliente ya existe: "+cliente.getCedula());}
		
	}
	
}
