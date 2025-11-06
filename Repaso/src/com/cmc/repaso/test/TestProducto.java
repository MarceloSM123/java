package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto producto = new Producto("Microfono", -50.25);
		producto.setPrecio(-20);
		System.out.println("Precio: "+producto.getPrecio());
		System.out.println("Precio con 20% DSCto.: "+producto.CalcularPrecioPomo(20));
	}

}
