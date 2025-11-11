package com.krakedev.evaluacion;

import java.util.ArrayList;
import java.util.Date;

public class Directorio {
 private ArrayList<Contacto> contactos=new ArrayList();
 private Date fechaModificacion;
 
 
 
 public Directorio() {
	//super();
	// if()
	 
}
 public ArrayList<Contacto> getContactos() {
	return contactos;
 }
 public void setContactos(ArrayList<Contacto> contactos) {
	this.contactos = contactos;
 }
 public Date getFechaModificacion() {
	return fechaModificacion;
 }
 public void setFechaModificacion(Date fechaModificacion) {
	this.fechaModificacion = fechaModificacion;
 }
 
 public boolean agregarContacto(Contacto contacto) {
	 if(buscarPorCedula(contacto.getCedula())==null) {
		 contactos.add(contacto);
		 return true;
	 }else {return false;}
	 
	 
	 // contactos.add(contacto);
	// return true;
 }
 
 public Contacto buscarPorCedula(String cedula) {
	 Contacto c;
	 for(int i=0;i<contactos.size();i++) {
		 c=contactos.get(i);
		 if(c.getCedula().equals(cedula)) {
			 return c;
		 }
	 }
	 return null;
 }
 
 
}
