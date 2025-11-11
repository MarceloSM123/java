package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
 private ArrayList<Contacto> contactos=new ArrayList();
 private Date fechaModificacion;
 
 private ArrayList<Contacto> correctos=new ArrayList();
 private ArrayList<Contacto> incorrectos=new ArrayList();
 
 
 public Directorio() {
	//super();
	// fechaModificacion = new Date();
	 
}
 
 
 
 public ArrayList<Contacto> getCorrectos() {
	return correctos;
}



 public void setCorrectos(ArrayList<Contacto> correctos) {
	this.correctos = correctos;
 }



 public ArrayList<Contacto> getIncorrectos() {
	return incorrectos;
 }



 public void setIncorrectos(ArrayList<Contacto> incorrectos) {
	this.incorrectos = incorrectos;
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
		 fechaModificacion = new Date();
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
 
 public String consultarUltimaModificacion() {
	 SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	 return s.format(fechaModificacion);
 }
 
 public int contarPerdidos() {
	 Contacto c;
	 int contador=0;
	 for(int i=0;i<contactos.size();i++) {
		 c=contactos.get(i);
		 if(c.getDireccion()==null) {
			 contador++;
		 }
		 }
	 return contador;
	 }
 
 	public int contarFijos() {
 		Contacto c;
 	//	ArrayList<Telefono> telefonos =new ArrayList();
 		ArrayList<Telefono> telefono;
 		Telefono t;
 		 int contador=0;
 		 for(int i=0;i<contactos.size();i++) {
 			 c=contactos.get(i);
 			telefono=c.getTelefonos();
 			for(int j=0;j<telefono.size();j++) {
 				t=telefono.get(i);
 				if(t!=null && t.getTipo().equalsIgnoreCase("Convencional") && t.getEstado().equals("C")) {
 					contador++;
 				}
 				
 			}
 			 }
 		 return contador;
 	}
 	
 	public void depurar() {
 		Contacto c;
 		 for(int i=0;i<contactos.size();i++) {
 			 c=contactos.get(i);
 			 if(c.getDireccion()==null) {
 				 incorrectos.add(c);
 			 }else {
 				 correctos.add(c);
 			 }
 			 }
 	}
 }
 
//}
