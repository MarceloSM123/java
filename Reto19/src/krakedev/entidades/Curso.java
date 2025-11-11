package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiante=new ArrayList();

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiante;
	}

	public void setEstudiante(ArrayList<Estudiante> estudiante) {
		this.estudiante = estudiante;
	}
	
	public Estudiante buscarEstudiantePorCedula(Estudiante est ) {
		Estudiante e=new Estudiante();
		for(int i=0;i<estudiante.size();i++) {
			e=estudiante.get(i);
			if(e.getCedula().equals(est.getCedula())) {
				System.out.println("Estudiante matriculado");
				return e;
			}

			}
		return null;
		
	}
	
	public void matricularEstudiante(Estudiante estud) {
		if(buscarEstudiantePorCedula(estud)==null)
		{
			estudiante.add(estud);
		}
	}
	
	public double calcularPromedioCurso() {
		Estudiante e=new Estudiante();
		double sumatorio=0;
		double promedioCurso;
		for(int i=0;i<estudiante.size();i++) {
			e=estudiante.get(i);
			sumatorio=sumatorio+e.calcularPromedioNotasEstudiante();
			}
		promedioCurso=sumatorio/estudiante.size();
		return promedioCurso;
		
	}
	
	public void mostrar() {
		String mensaje1="[ Curso [";
		String mensaje2="";
		Estudiante e=new Estudiante();
		for(int i=0;i<estudiante.size();i++) {
			e=estudiante.get(i);
			mensaje2=mensaje2+"Nombre="+e.getNombre()+ ", Apellido ="+e.getApellido()+", Cedula ="+e.getCedula();
			}
		System.out.println(mensaje1+mensaje2+"]");
		
	}
	
}
