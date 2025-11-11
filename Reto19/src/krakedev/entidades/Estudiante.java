package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String Nombre;
	private String Apellido;
	private String Cedula;
	private ArrayList<Nota> notas=new ArrayList();
	
	
	
	
	//Estudiante("1234567890", "Juan", "Perez")
	public Estudiante() {

	}
	
	public Estudiante(String cedula,String nombre, String apellido) {
		//super();
		Nombre = nombre;
		Apellido = apellido;
		Cedula = cedula;
	}




	public String getNombre() {
		return Nombre;
	}




	public void setNombre(String nombre) {
		Nombre = nombre;
	}




	public String getApellido() {
		return Apellido;
	}




	public void setApellido(String apellido) {
		Apellido = apellido;
	}




	public String getCedula() {
		return Cedula;
	}




	public void setCedula(String cedula) {
		Cedula = cedula;
	}




	public ArrayList<Nota> getNotas() {
		return notas;
	}




	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}




	public void agregarNota(Nota nuevaNota) {
		Nota n=new Nota();
		int l=0;
		for(int i=0;i<notas.size();i++) {
			n=notas.get(i);
			if(n.getMateria().getCodigo().equals(nuevaNota.getMateria().getCodigo()) && nuevaNota.getCalificacion()>=0 && nuevaNota.getCalificacion()<=10) {
				l++;
				
			}
			}
		if(l==0) {
			notas.add(nuevaNota);
		}else {
			System.out.println("LA MATERIA YA EXISTE");
		}
		}
	
	public void modificarNota(String codigo, double calificacion) {
		Nota n=new Nota();
		for(int i=0;i<notas.size();i++) {
			n=notas.get(i);
			if(n.getMateria().getCodigo().equals(codigo) && calificacion>=0 && calificacion<=10) {
				n.setCalificacion(calificacion);
				
			}
			}
		
	}
	
	public double calcularPromedioNotasEstudiante(){
		Nota n=new Nota();
		double sumatorio=0;
		double promedio;
		for(int i=0;i<notas.size();i++) {
			n=notas.get(i);
			sumatorio=sumatorio+n.getCalificacion();

			}
		promedio=sumatorio/notas.size();
		return promedio;
	}
	
	public void mostrar(){
		String mensaje1="[ Estudiante [Nombre=" + Nombre + ", Apellido =" + Apellido+", Cedula ="+Cedula;
		String mensaje2="";
		Nota n=new Nota();
		for(int i=0;i<notas.size();i++) {
			n=notas.get(i);
			mensaje2=mensaje2+", Materia: "+n.getMateria().getNombre()+", codigo: "+n.getMateria().getCodigo()+", calificacion: "+n.getCalificacion();
			}
		System.out.println(mensaje1+mensaje2+"]");
	}
	

	
	}
//}
