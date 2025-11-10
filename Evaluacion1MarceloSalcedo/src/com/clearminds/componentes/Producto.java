package com.clearminds.componentes;

public class Producto {
	private String Nombre;
	private double Precio;
	private String codigo;
	public Producto(String codigo,String nombre, double precio) {
		//super();
		Nombre = nombre;
		Precio = precio;
		this.codigo = codigo;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	// METODO INCREMENTAR PRECIO
	
	public void incrementarPrecio(int porcentaje) {
		Precio=Precio*(1+porcentaje/100.0);
	}
	
	public void disminuirPrecio(double descuento) {
		Precio=Precio-descuento;
	}
	
}
