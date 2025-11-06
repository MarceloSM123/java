package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class ItemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item producto=new Item();
		producto.setProductosActuales(20);
// VALORES INICIALES
		System.out.println("-----INICIALES----");
		producto.imprimir();
//MODIFICAMOS LOS VALORES
		producto.vender(10);
		producto.devolver(5);
// VALORES ACTUALES 
		System.out.println("-----MODIFICADO----");
		producto.imprimir();
		
		// SERGUNDO PRODUCTO
		
		Item producto1=new Item();
		producto1.setProductosActuales(100);
// VALORES INICIALES
		System.out.println("-----INICIALES----");
		producto1.imprimir();
//MODIFICAMOS LOS VALORES
		producto1.vender(50);
		producto1.devolver(15);
// VALORES ACTUALES 
		System.out.println("-----MODIFICADO----");
		producto1.imprimir();
		
		
	}

}
