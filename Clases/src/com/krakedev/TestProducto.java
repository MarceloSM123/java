package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto productoA=new Producto();
		Producto productoB =new Producto();
		Producto productoC=new Producto();
		// modificcacion de atributos productoA
		
		productoA.nombre="Paracetamol";
		productoA.descripcion="Medicamento analguesico";
		productoA.precio=3.25f;
		productoA.stockActual=10;
		
		// modificcacion de atributos productoB
		
		productoB.nombre="Loratadina";
		productoB.descripcion="Medicamento antihistaminico";
		productoB.precio=1.21f;
		productoB.stockActual=5;
		
		
		// modificcacion de atributos productoC
		
		productoC.nombre="Alertex";
		productoC.descripcion="Estimulante neuronal";
		productoC.precio=1.00f;
		productoC.stockActual=20;
		
		//imprimir en pantalla atributos productoA
		
		System.out.println("*-----Producto A ------*");
		System.out.println("NOMBRE:"+productoA.nombre);
		System.out.println("DESCRIPCION: "+productoA.descripcion);
		System.out.println("PRECIO: "+productoA.precio);
		System.out.println("STOCK: "+productoA.stockActual);
		
		
		//imprimir en pantalla atributos productoB
		
		System.out.println("*-----Producto B ------*");
		System.out.println("NOMBRE:"+productoB.nombre);
		System.out.println("DESCRIPCION: "+productoB.descripcion);
		System.out.println("PRECIO: "+productoB.precio);
		System.out.println("STOCK: "+productoB.stockActual);
		
		//imprimir en pantalla atributos productoC
		
		System.out.println("*-----Producto C ------*");	
		System.out.println("NOMBRE:"+productoC.nombre);
		System.out.println("DESCRIPCION: "+productoC.descripcion);
		System.out.println("PRECIO: "+productoC.precio);
		System.out.println("STOCK: "+productoC.stockActual);
		
		
	}

}
