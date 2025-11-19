package com.krakedev.excepciones;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//DEPENDENCIAS LOG4J
/*<dependency>
<groupId>org.apache.logging.log4j</groupId>
<artifactId>log4j-api</artifactId>
<version>2.25.2</version>
</dependency>

<dependency>
<groupId>org.apache.logging.log4j</groupId>
<artifactId>log4j-core</artifactId>
<version>2.25.2</version>
</dependency>*/

public class Ejercicio3 {
	private static final Logger LOGGER=LogManager.getLogger(Ejercicio3.class);
		
	public void metodo1() {
		String a =null;
		try {
			a.substring(0);
		}catch(Exception io) {
			System.out.println("error");
			LOGGER.error("error al obtener subcadena",io);
			// adicional al mensaje de error, el ,io especifica la 
			//ubicacion exacta y el tipo de error 
		}
	}
	
	public static void main(String[] args) {
		Ejercicio3 ej3=new Ejercicio3();
		ej3.metodo1();
	}


}
