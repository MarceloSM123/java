package com.cmc.evaluacion;

public class Cuota {
private int numero;
private double cuota;
private double capital;
private double inicio;
private double interes;
private double abonoCapital;
private double saldo;

// CONSTRUCTOR

public Cuota(int numero) {
	//super();
	this.numero = numero;
}


public double getCuota() {
	return cuota;
}
public void setCuota(double cuota) {
	this.cuota = cuota;
}
public double getCapital() {
	return capital;
}
public void setCapital(double capital) {
	this.capital = capital;
}
public double getInicio() {
	return inicio;
}
public void setInicio(double inicio) {
	this.inicio = inicio;
}
public double getInteres() {
	return interes;
}
public void setInteres(double interes) {
	this.interes = interes;
}
public double getAbonoCapital() {
	return abonoCapital;
}
public void setAbonoCapital(double abonoCapital) {
	this.abonoCapital = abonoCapital;
}
public double getSaldo() {
	return saldo;
}
public void setSaldo(double saldo) {
	this.saldo = saldo;
}



public void mostrarPrestamo() {
	Utilitario u= new Utilitario();

 for(int i=0;i<numero;i++) {
/*	 interes=inicio*0.01;
	 capital=cuota-interes;
	 saldo=inicio-interes;
	 inicio=saldo;*/

	 
 }
 System.out.println(u.redondear( numero)+" | "+u.redondear(cuota)+" | "+ u.redondear(inicio)+" | "+u.redondear(interes)+" | "+ u.redondear(abonoCapital)+" | "+ u.redondear(saldo));
}




}
