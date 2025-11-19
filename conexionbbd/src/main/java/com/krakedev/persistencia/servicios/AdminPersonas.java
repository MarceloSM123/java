package com.krakedev.persistencia.servicios;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

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
	
	public static ArrayList<Persona> buscarPorCodigo(int codigo) throws Exception{
		 ArrayList<Persona> personas=new ArrayList();
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;// extrae la tabla resultante de la busqueda
		try {
			 con=ConexionBDD.conectar();// SI SE DECLARA DENTRO DEL TRY SOLO SIRVE EN EL TRY 
			//System.out.println("INSERTAR");
			 ps=con.prepareStatement("select * from transacciones where codigo=?");
					//ingresamos los datos
						ps.setInt(1, codigo);
						rs=ps.executeQuery();// se usa para consultas
						while(rs.next()) {//identifica si existe una fila, despues del encabezado de la tabla 
							//insert into transacciones (codigo,numero_cuenta,monto,tipo,fecha,hora)
							//	values (1,'12345',12.12,'D','12/01/1999','12:12:12')
		
							String numero_cuenta=rs.getString("numero_cuenta");
							//double monto=Double.valueOf(rs.getBigDecimal("monto").toString().replace(".", ",")); 
							BigDecimal monto=new BigDecimal("0.0");
							//LOGGER.debug(rs.getBigDecimal("monto").toString().replace(".", ","));
							String tipo=rs.getString("tipo");
							Date fecha=rs.getDate("fecha");
							//LOGGER.debug(fecha);
							Time hora=rs.getTime("hora");
							Persona p=new Persona(codigo,numero_cuenta,monto,tipo,fecha,hora);
							personas.add(p);
						}
						
						//return personas;
		}catch(Exception e) {
			//mostrar el error al usuario
			//System.out.println(e.getMessage());
			//loggear el error
			LOGGER.error("Error Busqueda",e);
			e.printStackTrace();
			throw e;
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
			return personas;
		}
		 
		 
		 // fffff
	}
	
	public static String buscarCuentaPorCodigo(int codigo) throws Exception{
		 String personas="";
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;// extrae la tabla resultante de la busqueda
		try {
			 con=ConexionBDD.conectar();// SI SE DECLARA DENTRO DEL TRY SOLO SIRVE EN EL TRY 
			//System.out.println("INSERTAR");
			 ps=con.prepareStatement("select numero_cuenta from transacciones where codigo=?");
					//ingresamos los datos
						ps.setInt(1, codigo);
						rs=ps.executeQuery();// se usa para consultas
						while(rs.next()) {//identifica si existe una fila, despues del encabezado de la tabla 
							//insert into transacciones (codigo,numero_cuenta,monto,tipo,fecha,hora)
							//	values (1,'12345',12.12,'D','12/01/1999','12:12:12')
		
							String numero_cuenta=rs.getString("numero_cuenta");
							personas=numero_cuenta;
						}
						
						//return personas;
		}catch(Exception e) {
			//mostrar el error al usuario
			//System.out.println(e.getMessage());
			//loggear el error
			LOGGER.error("Error Busqueda",e);
			e.printStackTrace();
			throw e;
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
			return personas;
		}
		 
		 
		 // fffff
	}
	
	}

