package com.Servicios;

import java.util.ArrayList;

import com.entidades.Carta;
import com.entidades.Naipe;

public class Juego {
	private Naipe naipe;
	private ArrayList<ArrayList<Carta>> cartasJugadores=new ArrayList();
	 ArrayList<Carta> naipeBarajado;
	 ArrayList<String> lista=new ArrayList();
	//CONSTRUCTOR
	
	public Juego(ArrayList idsJugadores) {
		lista=idsJugadores;
		for (int i=0;i<idsJugadores.size();i++) {
			cartasJugadores.add(new ArrayList());
			// revisar
			naipe=new Naipe();
			//ArrayList<Carta> naipeBarajado=naipe.barajar();
			naipeBarajado=naipe.barajar();
		}
			
	}
	
	

	public Juego() {
		naipe=new Naipe();
		//ArrayList<Carta> naipeBarajado=naipe.barajar();
		naipeBarajado=naipe.barajar();
	}



	public ArrayList<ArrayList<Carta>> getCartasJugadores() {
		return cartasJugadores;
	}

	
	public void entregarCartas(int cartasPorJugador){
		ArrayList<Carta> c= new ArrayList();
		int posicion=0;
	for(int i=0;i<cartasJugadores.size();i++) {
			c=cartasJugadores.get(i);
			
			for(int j=0;j<=cartasPorJugador-1;j++) {

			    posicion++;
				c.add(naipeBarajado.get(posicion));
			}
		}
	}
	
	//public int devolverTotal(String id) {
	public int devolverTotal(int id) {
		String s=String.valueOf(id);
		int contador=0;
		for(int j=0;j<lista.size();j++) {
			//if(id.equals(lista.get(j))) {
			if(s.equals(lista.get(j))) {
				for(int i=0;i<cartasJugadores.get(j).size();i++) {
					contador = contador + cartasJugadores.get(j).get(i).getNumero().getValor();
				}
				
			//	cartasJugadores.get(j).size()
			}
		}
		return contador;
	}
	
	public String determinarGanador() {
		 String idGanador;
		 int sumaGanador;
		 ArrayList<Integer> l=new ArrayList();
			for(int j=0;j<cartasJugadores.size();j++) {
				l.add(devolverTotal(j));
			}
			
			return "jugador"+2;
		 
		 
		 
	}
}
