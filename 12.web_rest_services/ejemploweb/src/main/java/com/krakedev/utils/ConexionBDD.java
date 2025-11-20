package com.krakedev.utils;

import java.sql.Connection;// IMPORTANTE DEBE SER CONECCION SQL
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConexionBDD {
	public static Connection obtenerConexion() {
		Context ctx=null;
		DataSource ds=null;
		Connection con=null;
			try {
				ctx = new InitialContext();
				//JNDI 
				ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/PgDB");// jdbc/PgDB se ubica en server.xml de config en tomcat
				con = ds.getConnection();
			} catch (NamingException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			return con;
}
}