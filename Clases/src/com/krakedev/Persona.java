package com.krakedev;

public class Persona {
private String nombre;
private int edadPersona;
private double estatura;

// CONSTRUCTORES
public Persona() {// CONSTRUCTOR 1
	// Constructor por defecto
	// se puede elimimar
}

public Persona(String nombre) { // CONSTRUCTOR 2
	this.nombre=nombre;
	// constructor con parametros iniciales
}

public Persona(String nombre,int edadPersona, double estatura) { // CONSTRUCTOR 3
	this.nombre=nombre;
	this.edadPersona=edadPersona;
	this.estatura=estatura;
}

// PUEDE EXISTIR VARIOS SONTRUCTORES CON EL MISMO NOMBRE, EN LA EJECUCION EL PROGRAMA DECIDE CUAL UTILIZAR DEPENDEINDO COMO SE INSTANCIE LA VARIABLE


public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getEdadPersona() {
	return edadPersona;
}
public void setEdadPersona(int edadPersona) {
	this.edadPersona = edadPersona;
}
public double getEstatura() {
	return estatura;
}
public void setEstatura(double estatura) {
	this.estatura = estatura;
}

}
