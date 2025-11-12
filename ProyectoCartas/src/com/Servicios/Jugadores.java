package com.Servicios;

import java.util.ArrayList;

import com.entidades.Carta;

public class Jugadores {
	
	//Juego juego;
	ArrayList<String> jugadores= new ArrayList();

	
	
	public ArrayList<String> getJugadores() {
		return jugadores;
	}



	public void setJugadores(ArrayList<String> jugadores) {
		this.jugadores = jugadores;
	}



	public void jugar() {
		//ArrayList<String> jugadores= new ArrayList();
		
		for(int j=1;j<=3;j++) {
			jugadores.add("jugador: "+j);
		}
		Juego juego =new Juego(jugadores);
		juego.entregarCartas(5);
	ArrayList<Carta> c=new ArrayList();
	int contador=0;
		//String resultado="";
		for(int j=0;j<juego.getCartasJugadores().size();j++) {
			c=juego.getCartasJugadores().get(j);
			//System.out.println("Jugador "+i+": ");
			for(int i=0;j<c.size();i++) {
				contador=contador+c.get(i).getNumero().getValor();
				
			}
			System.out.println("Jugador "+j+": "+contador);
		}
		
		
		/*for(int j=1;j<=3;j++) {
			jugadores.add("jugador_"+j);
		}
		
		juego=new Juego(jugadores);
		juego.entregarCartas(5);
		
		for(int j=1;j<=3;j++) {
			jugadores.add("jugador_"+j);
		}*/
	}
	

}
