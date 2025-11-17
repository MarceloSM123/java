package com.krakedev.herencia;

public class Persona {
 private String cedula;
 private String nombre;
 
 
  public Persona(String cedula, String nombre) {
	super(); // la palabra super significa que usa por defecto el constructor vacio 
	// de la clase toObject
	this.cedula = cedula;
	this.nombre = nombre;
}
 public String getCedula() {
	return cedula;
 }
 public void setCedula(String cedula) {
	this.cedula = cedula;
 }
 public String getNombre() {
	return nombre;
 }
 public void setNombre(String nombre) {
	this.nombre = nombre;
 }
 @Override // Le indica al programa que estamos sobreescribiendo 
 //un metodo de la clase padre 
 public String toString() {
	return " Nombre: "+nombre+" Apellido: "+cedula;
 }
 
 
 
}
