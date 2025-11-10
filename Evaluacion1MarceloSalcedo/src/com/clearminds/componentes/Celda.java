package com.clearminds.componentes;

public class Celda {
	private Producto Producto;
	private int Stock;
	private String Codigo;
	public Celda(String codigo) {
		//super();
		Codigo = codigo;
	}
	public Producto getProducto() {
		return Producto;
	}
	public void setProducto(Producto producto) {
		Producto = producto;
	}
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		Stock = stock;
	}
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	
	//INGRESAT PRODUCTO 
	
	public void ingresarProducto(Producto p1, int StockI) {
		if(p1!=null) {
		Producto=p1;
		Stock=StockI;
		}else {Stock=StockI;}
	}
	
	
}
