package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double  saldo;
	
	public Celda getCelda1() {
		return celda1;
	}
	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}
	public Celda getCelda2() {
		return celda2;
	}
	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}
	public Celda getCelda3() {
		return celda3;
	}
	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}
	public Celda getCelda4() {
		return celda4;
	}
	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	// METODOS
	
	//CONFIGURAR MAQUINA
	
	public void configurarMaquina(String c1, String c2, String c3, String c4) {
		celda1=new Celda(c1);
		celda2=new Celda(c2);
		celda3=new Celda(c3);
		celda4=new Celda(c4);
		
		
		
		
	}
	
	//MOSTRAR CONFIGURACION
	
	public void mostrarConfiguracion() {
		System.out.println("Codigo 1: "+celda1.getCodigo());
		System.out.println("Codigo 2: "+celda2.getCodigo());
		System.out.println("Codigo 3: "+celda3.getCodigo());
		System.out.println("Codigo 4: "+celda4.getCodigo());
	}
	
	// BUSCAR CELDA
	public Celda buscarCelda(String codigo) {
	/*	if(codigo==celda1.getCodigo()||codigo==celda2.getCodigo() ||codigo==celda3.getCodigo() ||codigo==celda4.getCodigo()) {
			if(codigo==celda1.getCodigo()) {
				return celda1;
			};
			if(codigo==celda2.getCodigo()) {
				return celda2;
			};
			if(codigo==celda3.getCodigo()) {
				return celda3;
			}
			if(codigo==celda4.getCodigo()) {
				return celda4;
			};
			
		}else {return null;};
		
	}*/
		
		if(codigo==celda1.getCodigo()) {
			return celda1;
		}
		else if(codigo==celda2.getCodigo()) {
			return celda2;
		}
		else if(codigo==celda3.getCodigo()) {
			return celda3;
		}
		else if(codigo==celda4.getCodigo()) {
			return celda4;
		}else{return null;}
	}
	
	// NO CONSIDERAR
	
	/*public void buscarCelda(Producto p1,String codigo, int stock) {
		Celda celdaRecuperada=buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(p1,stock);
	}
	*/
	// CARGAR PRODUCTO----PENDIENTE
	public void cargarProducto(Producto p1,String codigo, int stock) {
		Celda celdaRecuperada=buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(p1,stock);
	}
	
	//MOSTRAR PRODUCTOS
	public void mostrarProductos() {
		// celda1
		System.out.println("------------------------------");
		Producto p1=celda1.getProducto();
		System.out.println("Codigo celda: "+celda1.getCodigo());
		System.out.println("stock actual: "+celda1.getStock());
		if(p1==null) {
			System.out.println("La celda no tiene producto !!!");
			}else {
		System.out.println("Nombre Productoa: "+p1.getNombre());
		System.out.println("Precio producto: "+p1.getPrecio());
	      }
		//celda 2
		System.out.println("------------------------------");
		Producto p2=celda2.getProducto();
		System.out.println("Codigo celda: "+celda2.getCodigo());
		System.out.println("stock actual: "+celda2.getStock());
		if(p2==null) {
			System.out.println("La celda no tiene producto !!!");
			}else {
		System.out.println("Nombre Productoa: "+p2.getNombre());
		System.out.println("Precio producto: "+p2.getPrecio());
	      }
		
		//celda 3
		System.out.println("------------------------------");
		Producto p3=celda3.getProducto();
		System.out.println("Codigo celda: "+celda3.getCodigo());
		System.out.println("stock actual: "+celda3.getStock());
		if(p3==null) {
			System.out.println("La celda no tiene producto !!!");
			}else {
		System.out.println("Nombre Productoa: "+p3.getNombre());
		System.out.println("Precio producto: "+p3.getPrecio());
	      }
		
		//celda 4
		System.out.println("------------------------------");
		Producto p4=celda4.getProducto();
		System.out.println("Codigo celda: "+celda4.getCodigo());
		System.out.println("stock actual: "+celda4.getStock());
		if(p4==null) {
			System.out.println("La celda no tiene producto !!!");
			}else {
		System.out.println("Nombre Productoa: "+p4.getNombre());
		System.out.println("Precio producto: "+p4.getPrecio());
	      }
		
	}
	
	//BUSCAR PRODUCTO EN CELDA
	
	public Producto buscarProductoEnCelda(String codigo) {
		if(codigo==celda1.getCodigo()) {
			return celda1.getProducto();
		}
		else if(codigo==celda2.getCodigo()) {
			return celda2.getProducto();
		}
		else if(codigo==celda3.getCodigo()) {
			return celda3.getProducto();
		}
		else if(codigo==celda4.getCodigo()) {
			return celda4.getProducto();
		}else{return null;}
			
	}
	
	//CONSULTAR PRECIO
	public double consultarPrecio(String codigo) {
		if(codigo==celda1.getCodigo()) {
			Producto p=celda1.getProducto();
			return p.getPrecio();
		}
		else if(codigo==celda2.getCodigo()) {
			Producto p=celda2.getProducto();
			return p.getPrecio();
		}
		else if(codigo==celda3.getCodigo()) {
			Producto p=celda3.getProducto();
			return p.getPrecio();
		}
		else if(codigo==celda4.getCodigo()) {
			Producto p=celda4.getProducto();
			return p.getPrecio();
		}else {return 0.0;}// revisar
	}
	
	// BUSACAR CELDA PRODUCTO
	public Celda bucarCeldaProducto(String codigo) {
		Producto p1=celda1.getProducto();
		Producto p2=celda2.getProducto();
		Producto p3=celda3.getProducto();
		Producto p4=celda4.getProducto();
		
		if(codigo==p1.getCodigo()) {
			return celda1;
		}
		else if(codigo==p2.getCodigo()) {
			return celda2;
		}
		else if(codigo==p3.getCodigo()) {
			return celda3;
		}
		else if(codigo==p4.getCodigo()) {
			return celda4;
		}else{return null;}
	}
	
	// METOO INCREMENTAR PRODUCTOS
	
	public void incrementarProductos(String codigo,int ItemsNuevos) {
		Celda celdaEncontrada=bucarCeldaProducto(codigo);
		int nuevo=celdaEncontrada.getStock();
		celdaEncontrada.setStock(ItemsNuevos+nuevo);
		
	}
	
	public void vender(String codigo) {
		if(codigo==celda1.getCodigo()) {
			Producto p=celda1.getProducto();
			int stockActual=celda1.getStock();
			 celda1.setStock(stockActual-1);
			 saldo=p.getPrecio()+saldo;
			 mostrarProductos();
			 
		}
		else if(codigo==celda2.getCodigo()) {
			Producto p=celda2.getProducto();
			int stockActual=celda2.getStock();
			 celda2.setStock(stockActual-1);
			 saldo=p.getPrecio()+saldo;
			 mostrarProductos();
		}
		else if(codigo==celda3.getCodigo()) {
			Producto p=celda3.getProducto();
			int stockActual=celda3.getStock();
			 celda3.setStock(stockActual-1);
			 saldo=p.getPrecio()+saldo;
			 mostrarProductos();
		}
		else if(codigo==celda4.getCodigo()) {
			Producto p=celda4.getProducto();
			int stockActual=celda4.getStock();
			 celda4.setStock(stockActual-1);
			 saldo=p.getPrecio()+saldo;
			 mostrarProductos();
		}else {System.out.println(" ");}// revisar
		
	}
	
	//VENDER CON CAMBIO
	
	public double venderConCambio(String codigo, double pago) {
		if(codigo==celda1.getCodigo()) {
			Producto p=celda1.getProducto();
			int stockActual=celda1.getStock();
			 celda1.setStock(stockActual-1);
			 double precio=p.getPrecio();
			 return pago-precio;
		}
		else if(codigo==celda2.getCodigo()) {
			Producto p=celda2.getProducto();
			int stockActual=celda2.getStock();
			 celda2.setStock(stockActual-1);
			 double precio=p.getPrecio();
			 return pago-precio;
		}
		else if(codigo==celda3.getCodigo()) {
			Producto p=celda3.getProducto();
			int stockActual=celda3.getStock();
			 celda3.setStock(stockActual-1);
			 double precio=p.getPrecio();
			 return pago-precio;
		}
		else if(codigo==celda4.getCodigo()) {
			Producto p=celda4.getProducto();
			int stockActual=celda4.getStock();
			 celda4.setStock(stockActual-1);
			 double precio=p.getPrecio();
			 return pago-precio;
		}else{return 0.0;}
	}
	
	
	
}
