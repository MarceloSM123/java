package com.krakedev.test;

import com.krakedev.composicion.AdminProducto;
import com.krakedev.composicion.Producto;

public class TestAdminProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminProducto admin = new AdminProducto();
		Producto productoA =new Producto("Doritos",0.60);
		Producto productoB =new Producto("papitas",0.60);
		Producto mc=admin.buscarMasCaro(productoA, productoB);
		// usamos if para evitar alcanzar la escepcion--controlar la axcepcion
		if(mc==null) {
			System.out.println("Son iguales");
		}else {
		System.out.println("El mas caro es: "+mc.getNombre());}
	// se genera una excepcion si es null 
	}

}
