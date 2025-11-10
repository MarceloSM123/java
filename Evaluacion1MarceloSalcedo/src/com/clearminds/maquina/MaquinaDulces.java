package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas=new ArrayList<Celda>();
	private double saldo;
	public ArrayList<Celda> getCeldas() {
		return celdas;
	}
	public void setCeldas(ArrayList<Celda> celdas) {
		this.celdas = celdas;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void agregarCelda(Celda c) {
		//Celda c=new Celda(codigo);
		celdas.add(c);
	}
	
	public void mostrarConfiguracion() {
		for(int i=0;i<celdas.size();i++) {
			Celda c1=celdas.get(i);
		System.out.println("Celda "+(i+1)+": "+c1.getCodigo());
		}
	}
	
	public Celda buscarCelda (String codigo) {
		Celda c1;
		//boolean a=false;
		for(int i=0;i<celdas.size();i++) {
			 c1=celdas.get(i);
		if(c1.getCodigo().equals(codigo)) {
			return c1;
		}
		
		}
		return null;
	}
	
	public void cargarProducto(Producto p1, String codigo, int cantidadItems) {
		Celda celdaRecuperada=buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(p1,cantidadItems);
	}
	
	public void mostrarProductos() {
		Celda c1;
		for(int i=0;i<celdas.size();i++) {
			 c1=celdas.get(i);
		if(c1.getProducto()!=null) {
			System.out.println("Codigo: "+c1.getCodigo());
			System.out.println("Stock: "+c1.getStock());
			System.out.println("Nombre: "+c1.getProducto().getCodigo());
			System.out.println("Precio: "+c1.getProducto().getPrecio());
			
		}else {
			System.out.println("Codigo: "+c1.getCodigo());
			System.out.println("Stock: "+c1.getStock());
			System.out.println("Sin producto asignado");
		}
		}
		
		}
	
	public Producto buscarProductoEnCelda(String codigo){
		Celda c1;
		//boolean a=false;
		for(int i=0;i<celdas.size();i++) {
			 c1=celdas.get(i);
		if(c1.getCodigo().equals(codigo)) {
			return c1.getProducto();
		}
		
		}
		return null;
	}
	
	public double consultarPrecio(String codigo) {
		Celda c1;
		//boolean a=false;
		for(int i=0;i<celdas.size();i++) {
			 c1=celdas.get(i);
		if(c1.getCodigo().equals(codigo)) {
			return c1.getProducto().getPrecio();
		}
		
		}
		return 0.0;
	}
	
	public Celda buscarCeldaProducto(String codigo){
		Celda c1;
		//boolean a=false;
		for(int i=0;i<celdas.size();i++) {
			 c1=celdas.get(i);
	//	if(c1.getProducto().getCodigo().equals(codigo)) {
			 if(c1.getProducto()!=null) {
			 if(codigo.equals(c1.getProducto().getCodigo())) {
				 return c1;
		}}
		
		}
		return null;
	}
	
	public void incrementarProductos(String codigo, int cantidadItems) {
		Celda celdaEncontrada=buscarCeldaProducto(codigo);
	    celdaEncontrada.setStock(celdaEncontrada.getStock()+cantidadItems);
	}
	
	}
//}
