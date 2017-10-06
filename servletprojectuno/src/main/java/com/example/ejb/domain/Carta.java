package com.example.ejb.domain;

import java.util.ArrayList;
import java.util.Random;

public class Carta {
	public static final int MAX_BARAJA = 12;
	public static final int MAX_CARTAS = 21;
	private String[] image;
	private int numero;
	static String palo;
	
	public Carta(String palo, int numero) {
		Carta.palo = selectPalo();
		this.numero = MAX_BARAJA;
	}
	
	public String selectPalo(){
		ArrayList palos = new ArrayList<String>();
		Random random = new Random();
		String palo = null;
		int i;
		int index = (random.nextInt(4));
		
		for(i = 0; i < 4; i++){
			palos.add("Corazones");
			palos.add("Picas");
			palos.add("Dimantes");
			palos.add("Trébol");
		}
		
		for(i = 0; i < 4; i++){
			palo = (String) (palos.get(index));
		}
		
		return palo;
	}
	
	public String[] getImage() {
		return image;
	}

	public void setImage(String[] image) {
		this.image = image;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}

