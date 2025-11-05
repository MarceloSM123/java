package com.krakedev;

public class Fecha {
	private int anio;
	private int mes; 
	private int dia;
	
	//acceso
	
	public int getAnio() { 
	/* tipo de aceso: publico --
	 tipo dato deretorno =int el mismo de la variable  
	nombre:get seguido por el noombre de la variable*/
		return anio;
	}
	
	public int getMes() {
		/* tipo de acceso: public
		 * tipo de retorno: entero al igual que la variable
		 * nombre: get seguido por el nombre de la variable m es
		 */
		return mes;
	}
	
	public int getDia() {
		/* tipo de acceso: publico
		 * tipo de retorno; entero al igual que la variable
		 * nombre: get seguido por el nomebre de la variable dia
		 */
		
		return dia;
	}
	
	public void setAnio(int nuevoAnio) {
		/* tipo de accedo publico
		 * tipo de retorno: void no hay retorno, esta funcion modifica el valor de la variable
		 * nombre: set seguio por el nombre de la variable a modifica
		 *LA FUNCION RECIBE PARAMETROS DEL MISMO TIPO DE LA VARIABLE A MODIFICAR POR ESO AMBAS SON INT
		 */
		anio=nuevoAnio;
	}
	
	public void setMes(int nuevoMes) {
		/* tipo de acceso: publico
		 * tipo de retorno: no hay retorno asi usamos void
		 * nombre: set seguido por el nombre de la variable a modificar
		 * el tipo de dato de la variable de ingreso el el mismo de la variable a modificar
		 */
		mes=nuevoMes;
	}
	
	public void setDia(int nuevoDia) {
		/* tipo de acceso: publicp
		 * tipo de retorno: no hay retorno asi usamos void
		 * nombre: set seguido por el nombre de la variable a modificar
		 * el tipo de la variable de ingreso es int al igual que el tipo de la variable a modificar
		 */
		dia=nuevoDia;
	}
	
}


