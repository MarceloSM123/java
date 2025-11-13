package com.cmc.evaluacion;

import java.util.ArrayList;

public class CalculadoraAmortizacion {
	public double calcularCuota(Prestamo prestamo) {
		double interes=(prestamo.getInteres()/12)/100.0;
	//	System.out.println("interes: "+interes);
		double monto=prestamo.getMonto();
	//	System.out.println("monto: "+monto);
		int plazo=prestamo.getPlazo();
	//	System.out.println("plazo: "+plazo);
		return (monto*interes)/(1-Math.pow(1+interes,-plazo));
	}
	
	public void generarTabla(Prestamo prestamo) {
		double cuota=calcularCuota(prestamo);
		ArrayList<Cuota> b=prestamo.getCuotas();
		Cuota c= new Cuota(1);
		
		c.setCuota(cuota);
		//prestamo.getCuotas().add(c);
		c.setInicio(prestamo.getMonto());// es igual al monto total del prestamo 
		c.setInteres(((prestamo.getInteres()/prestamo.getPlazo())/100.0)*c.getInicio());
		c.setAbonoCapital(cuota-c.getInteres());
		c.setSaldo(c.getInicio()-c.getAbonoCapital());
		
		
		b.add(c);
		double interes;
		for(int i=1;i<prestamo.getPlazo()-1;i++) {
			b.add(new Cuota(i+1));
			b.get(i).setCuota(cuota);
			b.get(i).setInicio(b.get(i-1).getSaldo());
			interes=((prestamo.getInteres()/prestamo.getPlazo())/100.0)*b.get(i).getInicio();
			calcularValoresCuota(interes,b.get(i));
			}
		b.add(new Cuota(prestamo.getPlazo()));
		//calcularValoresCuota(prestamo.getInteres(),b.get(prestamo.getPlazo()));
	//	b.get(prestamo.getPlazo()).setCuota(0);
	}
	
	public void calcularValoresCuota(double InteresDelPrestamo, Cuota cuota) {
		
		cuota.setInteres(InteresDelPrestamo);
		cuota.setAbonoCapital(cuota.getCuota()-cuota.getInteres());
		cuota.setSaldo(cuota.getInicio()-cuota.getAbonoCapital());
		/*
		 c.setCuota(cuota);
		//prestamo.getCuotas().add(c);
		c.setInicio(prestamo.getMonto());// es igual al monto total del prestamo 
		c.setInteres(((prestamo.getInteres()/prestamo.getPlazo())/100.0)*c.getInicio());
		c.setAbonoCapital(cuota-c.getInteres());
		c.setSaldo(c.getInicio()-c.getCapital());
		 */
		
	}
	
	public void mostrarTabla(Prestamo prestamo) {
		ArrayList<Cuota> b=prestamo.getCuotas();
		for(int i=0;i<prestamo.getPlazo()-1;i++) {
			b.get(i).mostrarPrestamo();
			}
	}
}
