package com.krakedev.persistencia.servicios;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.krakedev.persistencia.utils.ConexionBDD;
import com.krakedev.pesistencia.entidades.Persona;

public class AdminPersonas {
	public static void insertar(Persona persona) {	
			Connection con=null;
			PreparedStatement ps=null;
		try {
			 con=ConexionBDD.conectar();// SI SE DECLARA DENTRO DEL TRY SOLO SIRVE EN EL TRY 
			//System.out.println("INSERTAR");
			 ps=con.prepareStatement("insert into transacciones (codigo,numero_cuenta,monto,tipo,fecha,hora)"
						+"values (?,?,?,?,?,?)");
					//ingresamos los datos
						ps.setInt(1, persona.getCodigo());
						ps.setString(2, persona.getNumero_cuenta());
						ps.setBigDecimal(3,persona.getMonto());
						ps.setString(4, persona.getTipo());
						ps.setDate(5, persona.getFecha());
						ps.setTime(6, persona.getHora());
						ps.executeUpdate();
		}catch(Exception e) {
			//mostrar el error al usuario
			System.out.println(e.getMessage());
			//loggear el error
			e.printStackTrace();
		}finally {
			//cerrar conexion 
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("ERROR INFRAESTRUCTURA");
			}
		}
	}
	}

