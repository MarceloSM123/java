package krakedev.entidades;

public class Nota {

		private Materia materia;
		private double calificacion;
		
		//Nota(sociales, 10.0)
		
		public Nota() {

		}
		public Nota(Materia materia, double calificacion) {
			//super();
			this.materia = materia;
			this.calificacion = calificacion;
		}

		
		public Materia getMateria() {
			return materia;
		}

		public void setMateria(Materia materia) {
			this.materia = materia;
		}




		public double getCalificacion() {
			return calificacion;
		}




		public void setCalificacion(double calificacion) {
			this.calificacion = calificacion;
		}




		public void mostrar() {
			System.out.println("[Nota [Codigo=" + materia.getCodigo() + ", Nombre=" + materia.getNombre()+", Calificacion: "+calificacion+"]");
		}
		
		
}
