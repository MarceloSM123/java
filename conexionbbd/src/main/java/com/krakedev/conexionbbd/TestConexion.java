package com.krakedev.conexionbbd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {
		PreparedStatement ps=null;
		// CONEXION CON POSTGRESQL
		Connection connection =null;
		try {
			Class.forName("org.postgresql.Driver");
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/ejercicios","postgres","123MARCE#");
			System.out.println("conexion exitosa");

			//insert into estudiantes (cedula, nombre, apellido, email,fecha_nacimiento)
		//	values ('1234567890','Marcelo', 'Salcedo', 'asd@gmail.com','23/05/1992')
			
		// prepara el insert 
			ps=connection.prepareStatement("insert into estudiantes (cedula, nombre, apellido, email,fecha_nacimiento)"
			+"values (?,?,?,?,?)");
		//ingresamos los datos
			ps.setString(1, "1234567890");
			ps.setString(2, "Marcelo");
			ps.setString(3, "Salcedo");
			ps.setString(4, "asd@gmail.com");
			//para ingresar date:  java.util.Date
			//para ingresar date:  java.sql.Date
			//     ps.setDate(5, java.sql.Date.valueOf("1992-05-23"));
			//ps.setDate(4,"23/05/1992");
			// si queremos cambiar el formato buscamos SimpleDateFormat para saber el uso de cada letra
			//SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
			SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
			String fechaStr="23/05/1992  10:10:10";
			//ps.setDate(5, 
			try {
				Date fecha=sdf.parse(fechaStr);
				System.out.println(fecha);
				long fechaMilis=fecha.getTime();
				System.out.println(fechaMilis);
				// crea yb java.sqlDate, partiendo de un java.util.Date
				java.sql.Date fechaSQL=new java.sql.Date(fechaMilis);
				System.out.println(fechaSQL);
				ps.setDate(5, fechaSQL);
				// para la hora 
				Time timeSQL=new Time(fechaMilis);
				System.out.println(timeSQL);
			
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ps.executeUpdate();
			
			//SEGUNDA TABLA 
			//insert into transacciones (codigo,numero_cuenta,monto,tipo,fecha,hora)
			//	values (1,'12345',12.12,'D','12/01/1999','12:12:12')
			// prepara el insert 
				ps=connection.prepareStatement("insert into transacciones (codigo,numero_cuenta,monto,tipo,fecha,hora)"
				+"values (?,?,?,?,?,?)");
			//ingresamos los datos
				ps.setInt(1, 1);
				ps.setString(2, "12345");
				BigDecimal precio = new BigDecimal("12.12");
				ps.setBigDecimal(3, precio);
				ps.setString(4, "D");
				ps.setDate(5, java.sql.Date.valueOf("1999-01-12"));
				ps.setTime(6, java.sql.Time.valueOf("12:12:12"));
				ps.executeUpdate();
				//para ingresar date:  java.util.Date
				//para ingresar date:  java.sql.Date
				//     ps.setDate(5, java.sql.Date.valueOf("1992-05-23"));
				//ps.setDate(4,"23/05/1992");
				// si queremos cambiar el formato buscamos SimpleDateFormat para saber el uso de cada letra
				//SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// SEGUNDA TABLA 
		
		

	}

}
