package com.krakedev.persistencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionBDD {
	private final static String DRIVER="org.postgresql.Driver";
	private final static String URL="jdbc:postgresql://localhost:5432/ejercicios";// /ejercicios en esta parte se puede sustituir por la base requerida
	private final static String USUARIO ="postgres";
	private final static String CLAVE="123MARCE#";
	
	
	public static Connection conectar() throws Exception{// en este caso vamos a propagar la excepcion 
		Connection connection=null;
		try {
			Class.forName(DRIVER);
			connection=DriverManager.getConnection(URL,USUARIO,CLAVE);
			System.out.println("conexion exitosa");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		throw new Exception("error en la infraestructura");
	}catch(SQLException e){
		e.printStackTrace();
		throw new Exception("error en la infraestructura, revise usuario y clave");
	}
		return connection;
	}
	}
