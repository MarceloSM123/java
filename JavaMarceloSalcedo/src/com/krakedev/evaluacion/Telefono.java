package com.krakedev.evaluacion;

public class Telefono {
	private String numero;
	private String tipo;
	private String estado;
	
	
	
	public Telefono(String numero, String tipo) {
	//	super();
		this.numero = numero;
		this.tipo = tipo;
		if(numero!=null && tipo!=null && ((tipo.equalsIgnoreCase("Movil") && numero.length()==10) ||(tipo.equalsIgnoreCase("Convencional") && numero.length()==7) )){
			estado="C";
		}else {
			estado="E";
		}
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
}
