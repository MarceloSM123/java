package com.krakedev.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.krakedev.entidades.Cliente;
import com.krakedev.excepciones.KrakeDevException;
import com.krakedev.utils.ConexionBDD;

public class ClientesBDD {
	public void insertar(Cliente cliente) throws KrakeDevException{
		Connection con=null;
	/*	if(con!=null) {
			System.out.println("CONECTADO");
		}else {
			System.out.println("ERROR AL OBTENER CONEXION");
		} // COECCION A TRAVEZ DE UN DATASOURSE */
		
		try {
			con=ConexionBDD.obtenerConexion();
			PreparedStatement ps=
					con.prepareStatement("insert into clientes(cedula,nombre,numeroHijos) values(?,?,?)");
			ps.setString(1, cliente.getCedula());
			ps.setString(2, cliente.getNombre());
			ps.setInt(3, cliente.getNumeroHijos());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new KrakeDevException("Error al insertar cliente. Detalle: "+ e.getMessage());
		} catch (KrakeDevException e) {
			// TODO Auto-generated catch block
			throw e;
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public void actualizart(Cliente cliente) throws KrakeDevException{
		Connection con=null;
	/*	if(con!=null) {
			System.out.println("CONECTADO");
		}else {
			System.out.println("ERROR AL OBTENER CONEXION");
		} // COECCION A TRAVEZ DE UN DATASOURSE */
		
		try {
			con=ConexionBDD.obtenerConexion();
			PreparedStatement ps=
					con.prepareStatement(" UPDATE clientes SET nombre = ?, numeroHijos = ? WHERE cedula = ?");
			ps.setString(1, cliente.getNombre());
			ps.setInt(2, cliente.getNumeroHijos());
			ps.setString(3, cliente.getCedula());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new KrakeDevException("No existe un cliente con esa cedula . Detalle:"+ e.getMessage());
		} catch (KrakeDevException e) {
			// TODO Auto-generated catch block
			throw e;
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public ArrayList<Cliente> recuperarTodos() throws KrakeDevException{
		ArrayList<Cliente> clientes =new ArrayList();
		Connection con=null;
		ResultSet rs=null;
		Cliente cliente=null;
		try {
			con=ConexionBDD.obtenerConexion();
			PreparedStatement ps=
					con.prepareStatement("select cedula,nombre,numeroHijos from clientes");
			rs=ps.executeQuery();
			
			while(rs.next()) {
				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				int numeroHijos = rs.getInt("numeroHijos");
				cliente = new Cliente(cedula,nombre,numeroHijos);
				clientes.add(cliente);
			}
		} catch (KrakeDevException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new KrakeDevException("Error al consultar. Detalle: "+e.getMessage());
		}
		
		return clientes;
	}
	
	
}
