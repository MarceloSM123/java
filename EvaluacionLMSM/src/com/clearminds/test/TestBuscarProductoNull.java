package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarProductoNull {
	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B1", 4);
		
		Producto prod=maquina.buscarProductoEnCelda("A1");
		System.out.println("Producto encontrado:"+prod.getNombre());
		
		//  el error se da en la linea 14, al buscar "A1" no se encuantra ya que para la variable Celda correspondiente ,La varable persona no esta declarada y retorna un null
		// en la linea 15 prod es null y no se puede imprimir en consola lo que genera la excepcion.
		
	}
}
