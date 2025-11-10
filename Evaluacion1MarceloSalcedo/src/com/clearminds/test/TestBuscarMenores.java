package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda(new Celda("A1"));
		maquina.agregarCelda(new Celda("A2"));
		maquina.agregarCelda(new Celda("A3"));
		maquina.agregarCelda(new Celda("A4"));
		maquina.agregarCelda(new Celda("A5"));
		maquina.agregarCelda(new Celda("A6"));

		
		Producto producto1=new Producto("KE31","Papitas",0.85);
		maquina.cargarProducto(producto1, "A1", 4);

		Producto producto2=new Producto("KE32","Doritos",0.5);
		maquina.cargarProducto(producto2, "A2", 6);
		
		Producto producto3=new Producto("KE33","Jet",0.25);
		maquina.cargarProducto(producto3, "A3", 7);
		
		Producto producto4=new Producto("KE34","Manicho",0.75);
		maquina.cargarProducto(producto4, "A4", 8);
		
		Producto producto5=new Producto("KE35","Kchitos",0.55);
		maquina.cargarProducto(producto5, "A5", 9);
		
		Producto producto6=new Producto("KE36","Gelatina",1.85);
		maquina.cargarProducto(producto6, "A6", 10);
		
		//maquina.buscarMenores(1.0);
		ArrayList<Producto> c=maquina.buscarMenores(0.75);
		System.out.println("Productos Menores: "+maquina.buscarMenores(0.75).size());
		for(int i=0;i<maquina.buscarMenores(0.75).size();i++) {
			//c.get(i);
			System.out.println("Nombre: "+c.get(i).getNombre()+" Precio; "+c.get(i).getPrecio());
		}
		//System.out.println(maquina.buscarMenores(0.75).size());
		
		
		

	}

}
