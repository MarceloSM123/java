package com.entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles= new ArrayList();
	private ArrayList<Carta> cartas = new ArrayList();
	
	
	
	
	public Naipe() {
		//super();
		
		numerosPosibles.add(new Numero("A",11));
		numerosPosibles.add(new Numero("2",2));
		numerosPosibles.add(new Numero("3",3));
		numerosPosibles.add(new Numero("4",4));
		numerosPosibles.add(new Numero("5",5));
		numerosPosibles.add(new Numero("6",6));
		numerosPosibles.add(new Numero("7",7));
		numerosPosibles.add(new Numero("8",8));
		numerosPosibles.add(new Numero("9",9));
		numerosPosibles.add(new Numero("10",10));
		numerosPosibles.add(new Numero("J",10));
		numerosPosibles.add(new Numero("Q",10));
		numerosPosibles.add(new Numero("K",10));
		
		for(int i=0;i<13;i++) {
			cartas.add(new Carta(numerosPosibles.get(i),"CR"));
		}
		for(int i=0;i<13;i++) {
			cartas.add(new Carta(numerosPosibles.get(i),"CN"));
		}
		for(int i=0;i<13;i++) {
			cartas.add(new Carta(numerosPosibles.get(i),"DI"));
		}
		for(int i=0;i<13;i++) {
			cartas.add(new Carta(numerosPosibles.get(i),"TR"));
		}

	}




	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	
	public ArrayList<Carta> barajar(){
		ArrayList<Carta> auxiliar = new ArrayList();
		Random a=new Random();
		for(int i=1;i<101;i++) {
			int num=a.obtenerPosicion();
			if(cartas.get(num).getEstado().equals("N")){
				auxiliar.add(cartas.get(num));
				cartas.get(num).setEstado("C");
			}
		}
		
		if(auxiliar.size()!=52) {
			
			for(int i=1;i<cartas.size();i++) {
				
				if(cartas.get(i).getEstado().equals("N")){
					auxiliar.add(cartas.get(i));
					cartas.get(i).setEstado("C");
				}
			
		}
		
		
		//return auxiliar;
	}
		return auxiliar;
}}
