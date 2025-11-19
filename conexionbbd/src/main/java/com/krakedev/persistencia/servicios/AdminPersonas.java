package com.krakedev.persistencia.servicios;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.utils.ConexionBDD;
import com.krakedev.pesistencia.entidades.Persona;

public class AdminPersonas {
	private static final Logger LOGGER=LogManager.getLogger(AdminPersonas.class);
	
	public static void insertar(Persona persona){// throws Exception{	
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
			//System.out.println(e.getMessage());
			//loggear el error
			LOGGER.error("Error insertar",e);
			e.printStackTrace();
			//throw e;
		}finally {
			//cerrar conexion 
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace(); en lugar va un logger
				LOGGER.error("\"Error con la base de datos\"", e);
			//sino usa logger usar esto	throw new Exception("Error con la base de datos");
				//System.out.println("ERROR INFRAESTRUCTURA");
			}
		}
	}
	
	public static void actualizar(Persona persona) {
		Connection con=null;
		PreparedStatement ps=null;
	try {
		 con=ConexionBDD.conectar();// SI SE DECLARA DENTRO DEL TRY SOLO SIRVE EN EL TRY 
		//System.out.println("INSERTAR");
		 ps=con.prepareStatement("UPDATE transacciones SET numero_cuenta=?, monto=?, tipo=?, fecha=?, hora=? WHERE codigo=?");
				//ingresamos los datos
		 ps.setString(1, persona.getNumero_cuenta());
	        ps.setBigDecimal(2, persona.getMonto());
	        ps.setString(3, persona.getTipo());
	        ps.setDate(4, persona.getFecha());
	        ps.setTime(5, persona.getHora());
	        LOGGER.debug(persona.getHora());
	        ps.setInt(6, persona.getCodigo()); 
	        ps.executeUpdate();
	}catch(Exception e) {
		//mostrar el error al usuario
		//System.out.println(e.getMessage());
		//loggear el error
		LOGGER.error("Error al actualizar",e);
		e.printStackTrace();
		//throw e;
	}finally {
		//cerrar conexion 
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace(); en lugar va un logger
			LOGGER.error("Error cerrando conexion", e);
		//sino usa logger usar esto	throw new Exception("Error con la base de datos");
			//System.out.println("ERROR INFRAESTRUCTURA");
		}
	}
	}
	
	public static void eliminar(int codigo) {
		Connection con=null;
		PreparedStatement ps=null;
	try {
		 con=ConexionBDD.conectar();// SI SE DECLARA DENTRO DEL TRY SOLO SIRVE EN EL TRY 
		//System.out.println("INSERTAR");
		 ps=con.prepareStatement("DELETE FROM transacciones WHERE codigo = ?");
				//ingresamos los datos
					ps.setInt(1, codigo);
				
					ps.executeUpdate();
	}catch(Exception e) {
		//mostrar el error al usuario
		//System.out.println(e.getMessage());
		//loggear el error
		LOGGER.error("Error Eliminar",e);
		e.printStackTrace();
		//throw e;
	}finally {
		//cerrar conexion 
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace(); en lugar va un logger
			LOGGER.error("\"Error con la base de datos\"", e);
		//sino usa logger usar esto	throw new Exception("Error con la base de datos");
			//System.out.println("ERROR INFRAESTRUCTURA");
		}
	}
	}
	
	}

