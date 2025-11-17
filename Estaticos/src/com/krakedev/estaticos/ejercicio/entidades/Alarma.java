package com.krakedev.estaticos.ejercicio.entidades;

import com.krakedev.estaticos.ejercicio.utils.Util;

public class Alarma {//extends Util
	private int dia;
	private int hora;
	private int minuto;
	
	
	
	public Alarma(int dia, int hora, int minuto) {
		super();
		this.dia = dia;
		this.hora = hora;
		this.minuto = minuto;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	
	// sobreescribir el metodo toString();
	@Override
	public String toString() {
		
		String dias=Util.formatearDia(dia);
		String horas=Util.formatearHora(hora);
		String minutos=Util.formatearHora(minuto);
		return dias+" , "+horas+ ":"+minutos;
	}
	
}
