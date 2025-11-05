package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto productoA=new Producto("hola1","hola2",12.56f,2);
		Producto productoB =new Producto("hola3","hola4",12.36f,3);
		Producto productoC=new Producto("hola5","hola6",0.23f,4);
		// modificcacion de atributos productoA
		
		//productoA.nombre="Paracetamol";
		productoA.setNombre("Paracetamol");
		//productoA.descripcion="Medicamento analguesico";
		productoA.setDescripcion("Medicamento analguesico");
		//productoA.precio=3.25f;
		productoA.setPrecio(3.25f);
		//productoA.stockActual=10;
		productoA.setStockActual(10);
		
		// modificcacion de atributos productoB
		
		//productoB.nombre="Loratadina";
		productoB.setNombre("Loratadina");
		//productoB.descripcion="Medicamento antihistaminico";
		productoB.setDescripcion("Medicamento antihistaminico");
		//productoB.precio=1.21f;
		productoB.setPrecio(1.21f);
		//productoB.stockActual=5;
		productoB.setStockActual(5);
		
		
		// modificcacion de atributos productoC
		
		//productoC.nombre="Alertex";
		productoC.setNombre("Alertex");
		//productoC.descripcion="Estimulante neuronal";
		productoC.setDescripcion("Estimulante neuronal");
		//productoC.precio=1.00f;
		productoC.setPrecio(1.00f);
		//productoC.stockActual=20;
		productoC.setStockActual(20);
		//imprimir en pantalla atributos productoA
		
		System.out.println("*-----Producto A ------*");
		//System.out.println("NOMBRE:"+productoA.nombre);
		System.out.println("NOMBRE:"+productoA.getNombre());
		//System.out.println("DESCRIPCION: "+productoA.descripcion);
		System.out.println("DESCRIPCION: "+productoA.getDescripcion());
		//System.out.println("PRECIO: "+productoA.precio);
		System.out.println("PRECIO: "+productoA.getPrecio());
		//System.out.println("STOCK: "+productoA.stockActual);
		System.out.println("STOCK: "+productoA.getStockActual());
		
		
		//imprimir en pantalla atributos productoB
		
		System.out.println("*-----Producto B ------*");
		//System.out.println("NOMBRE:"+productoB.nombre);
		System.out.println("NOMBRE:"+productoB.getNombre());
	//	System.out.println("DESCRIPCION: "+productoB.descripcion);
		System.out.println("DESCRIPCION: "+productoB.getDescripcion());
		//System.out.println("PRECIO: "+productoB.precio);
		System.out.println("PRECIO: "+productoB.getPrecio());
	//	System.out.println("STOCK: "+productoB.stockActual);
		System.out.println("STOCK: "+productoB.getStockActual());
		
		//imprimir en pantalla atributos productoC
		
		System.out.println("*-----Producto C ------*");	
		//System.out.println("NOMBRE:"+productoC.nombre);
		System.out.println("NOMBRE:"+productoC.getNombre());
		//System.out.println("DESCRIPCION: "+productoC.descripcion);
		System.out.println("DESCRIPCION: "+productoC.getDescripcion());
		//System.out.println("PRECIO: "+productoC.precio);
		System.out.println("PRECIO: "+productoC.getPrecio());
		//System.out.println("STOCK: "+productoC.stockActual);
		System.out.println("STOCK: "+productoC.getStockActual());
		
		
	}

}
