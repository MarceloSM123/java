package com.krakedev.pesistencia.entidades;

import java.math.BigDecimal;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;

// la Entidad contiene el contenido de la fila para la 
//tabla sql 

//nos permite transportar informacion

// solo contiene getters y setters
public class Persona {
	//insert into transacciones (codigo,numero_cuenta,monto,tipo,fecha,hora)
	//	values (1,'12345',12.12,'D','12/01/1999','12:12:12')
private int codigo;
private String numero_cuenta;
private BigDecimal monto; // se lo utiliza para el tipo money 
private String tipo;
private Date fecha; // es date de utils: java.util.Date;
private Time hora;// es date de utils: java.util.Date;
public Persona(int codigo, String numero_cuenta, double monto, String tipo, String fecha, String hora) {
	super();
	this.codigo = codigo;
	this.numero_cuenta = numero_cuenta;
	this.monto = new BigDecimal(monto);
	this.tipo = tipo;
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
	try {
		java.util.Date fechaUtil = formato.parse(fecha);
		this.fecha = new Date(fechaUtil.getTime());
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("ingrese en el formato: dd/MM/yyyy");
	}
	
	
	SimpleDateFormat formato1 = new SimpleDateFormat("HH:mm:ss");
	try {
		java.util.Date horaUtil = formato1.parse(hora);
        this.hora = new Time(horaUtil.getTime());
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("ingrese en el formato: HH:mm:ss");
	}
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public String getNumero_cuenta() {
	return numero_cuenta;
}
public void setNumero_cuenta(String numero_cuenta) {
	this.numero_cuenta = numero_cuenta;
}
public BigDecimal getMonto() {
	return monto;
}
public void setMonto(BigDecimal monto) {
	this.monto = monto;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public Date getFecha() {
	return fecha;
}
public void setFecha(Date fecha) {
	this.fecha = fecha;
}
public Time getHora() {
	return hora;
}
public void setHora(Time hora) {
	this.hora = hora;
}




}
