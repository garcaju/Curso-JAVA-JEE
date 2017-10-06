package com.test.servletprojectuno;

import java.util.ArrayList;
import java.util.Random;


import org.junit.Assert;
import org.junit.Test;

import com.example.ejb.domain.Carta;
import com.example.ejb.domain.Mazo;

public class TestCartas {

	
	@Test
	public void testCreaBaraja(){
		Random random = new Random();
		Mazo mazo = new Mazo();
		ArrayList<Carta> baraja = mazo.creaBaraja();
		boolean test = true;
		
		Assert.assertEquals(true, test);
		
		for (int i = 0; i < 1; i++){
			int randomNumero = (int) (random.nextInt(Carta.MAX_BARAJA));
			int select = random.nextInt(Carta.PALOS.length);
			Carta carta = new Carta(Carta.PALOS[select], randomNumero);
			if (!baraja.contains(carta)){			
				baraja.add(carta);
				test=true;
			}else{
				test=false;
			}
		}
	}
	
	@Test
	public void testMazoIzquierdo(){
		ArrayList<Carta> mazoIzquierdo = new ArrayList<>();
		ArrayList<Carta> baraja = new ArrayList<>();
		Random random = new Random();
		int j = 0;
		boolean test = true;
		
		for (int i = 1 ; i < Carta.MAX_CARTAS ; i++){
			int randomNumero = (int) (random.nextInt(Carta.MAX_BARAJA));
			int select = random.nextInt(Carta.PALOS.length);
			Carta carta = new Carta(Carta.PALOS[select], randomNumero);
			
			if (!baraja.contains(carta)){			
			baraja.add(carta);
			}
		}
		
		while (j < 21){
			mazoIzquierdo.add(baraja.get(j));
			j+=3;
			
			}
		if(mazoIzquierdo.size()>=7){
			test = true;
		}else{
			test = false;
		}
		Assert.assertEquals(true, test);
	}
	
	@Test
	public void testMazoCentral(){
		ArrayList<Carta> mazoCentral = new ArrayList<>();
		ArrayList<Carta> baraja = new ArrayList<>();
		Random random = new Random();
		int j = 0;
		boolean test = true;
		
		for (int i = 1 ; i < Carta.MAX_CARTAS ; i++){
			int randomNumero = (int) (random.nextInt(Carta.MAX_BARAJA));
			int select = random.nextInt(Carta.PALOS.length);
			Carta carta = new Carta(Carta.PALOS[select], randomNumero);
			
			if (!baraja.contains(carta)){			
			baraja.add(carta);
			}
		}
		
		while (j < 21){
			mazoCentral.add(baraja.get(j));
			j+=3;
			
			}
		if(mazoCentral.size()>=7){
			test = true;
		}else{
			test = false;
		}
		Assert.assertEquals(true, test);
	}
	
	@Test
	public void testMazoDerecho(){
		ArrayList<Carta> mazoDerecho = new ArrayList<>();
		ArrayList<Carta> baraja = new ArrayList<>();
		Random random = new Random();
		int j = 0;
		boolean test = true;
		
		for (int i = 1 ; i < Carta.MAX_CARTAS ; i++){
			int randomNumero = (int) (random.nextInt(Carta.MAX_BARAJA));
			int select = random.nextInt(Carta.PALOS.length);
			Carta carta = new Carta(Carta.PALOS[select], randomNumero);
			
			if (!baraja.contains(carta)){			
			baraja.add(carta);
			}
		}
		
		while (j < 21){
			mazoDerecho.add(baraja.get(j));
			j+=3;
			
			}
		if(mazoDerecho.size()>=7){
			test = true;
		}else{
			test = false;
		}
		Assert.assertEquals(true, test);
	}
}

