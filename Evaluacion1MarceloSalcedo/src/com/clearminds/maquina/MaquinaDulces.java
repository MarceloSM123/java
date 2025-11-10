package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;

public class MaquinaDulces {
	private ArrayList<Celda> celdas=new ArrayList<Celda>();
	private double saldo;
	public ArrayList<Celda> getCeldas() {
		return celdas;
	}
	public void setCeldas(ArrayList<Celda> celdas) {
		this.celdas = celdas;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void agregarCelda(Celda c) {
		//Celda c=new Celda(codigo);
		celdas.add(c);
	}
	
	public void mostrarConfiguracion() {
		for(int i=0;i<celdas.size();i++) {
			Celda c1=celdas.get(i);
		System.out.println("Celda "+(i+1)+": "+c1.getCodigo());
		}
	}
	
	public Celda buscarCelda (String codigo) {
		Celda c1;
		boolean a=false;
		for(int i=0;i<celdas.size();i++) {
			 c1=celdas.get(i);
		if(c1.getCodigo().equals(codigo)) {
			return c1;
		}
		
		}
		return null;
	}
}
