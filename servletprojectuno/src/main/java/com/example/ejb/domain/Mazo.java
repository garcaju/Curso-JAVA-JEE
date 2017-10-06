package com.example.ejb.domain;

import java.util.ArrayList;
import java.util.Random;

public class Mazo {
	
	
	private ArrayList<ArrayList<Carta>> mesa;
	private int status; 

	/*Separará la baraja de 21 cartas en 3 mazos
	 * y comprobará en qué mazo está la carta elegida
	 */
	
	
	public   ArrayList< ArrayList<Carta>> startGame(){	
		status = 1; 
		         ArrayList<Carta> baraja21 = creaBaraja(); 
		         mesa = barajaToMesa(baraja21); 
		return mesa; 
	}
	
	
	public   ArrayList< ArrayList<Carta>> nextTable(int selected){	
		
		
	}
	
	
	private   static ArrayList< ArrayList<Carta>> barajaToMesa( ArrayList<Carta> baraja){
		ArrayList< ArrayList<Carta>> mesa= new ArrayList< ArrayList<Carta>>(); 		
		mesa.add(creaMazoIzq(baraja)); 
		mesa.add(creaMazoCentro(baraja)); 
		mesa.add(creaMazoDerecho(baraja)); 		
		return mesa; 
	}
	
	private static ArrayList<Carta> mesaToBaraja(ArrayList< ArrayList<Carta>> mesa, int select){
		ArrayList<Carta> baraja21 = ArrayList<Carta>(); 
		
		if(select==0){
			baraja21.addAll(mesa.get(1)); 
			baraja21.addAll(mesa.get(0)); 
			baraja21.addAll(mesa.get(2)); 	
		}else if(select==1){
			
			
		}else if(select==2){
			
			
		}
	}
	
	
	
	//Determina en quá mazo está la carta elegida
	public int locateElegidaIndex(ArrayList<Carta> mazoIzquierdo,
								ArrayList<Carta> mazoCentro, Carta elegida){
		
		if (mazoIzquierdo.contains(elegida)){
			return 0;
		}else if(mazoCentro.contains(elegida)){
			return 1;
		}else{
			return 2;
		}
	}
	

	
	
	
	public static ArrayList<Carta> creaMazoIzq(ArrayList<Carta> baraja){
		ArrayList<Carta> mazoIzquierdo = new ArrayList<>();
		int i = 0;		
		while (i < 21){
			mazoIzquierdo.add(baraja.get(i));
			i+=3;
		}		
		return mazoIzquierdo;	
	}
	
	public static ArrayList<Carta> creaMazoCentro(ArrayList<Carta> baraja){
		ArrayList<Carta> mazoCentro = new ArrayList<>();
		int i = 1;		
		while (i < 21){
			mazoCentro.add(baraja.get(i));
			i+=3;
		}
		return mazoCentro;	
	}
	
	public static ArrayList<Carta> creaMazoDerecho(ArrayList<Carta> baraja){
		ArrayList<Carta> mazoDerecho = new ArrayList<>();
		int i = 2;
		
		while (i < 21){
			mazoDerecho.add(baraja.get(i));
			i+=3;
		}
		
		return mazoDerecho;	
	}	
	
	
	
	
	
	
	//Crea una baraja de 21 cartas al azar
		public ArrayList<Carta> creaBaraja(){	
			ArrayList<Carta> baraja = new ArrayList<>();
			Random random = new Random();
			for (int i = 1 ; i < Carta.MAX_CARTAS ; i++){
				int randomNumero = (int) (random.nextInt(Carta.MAX_BARAJA));
				Carta carta = new Carta(Carta.palo, randomNumero);
				
				if (!baraja.contains(carta)){			
				baraja.add(carta);
				}
			}
			return baraja;
		}
		
		//Elige una carta al azar
		public Carta cartaElegida(ArrayList<Carta> baraja){
			Random random = new Random();
			int index = (random.nextInt(Carta.MAX_CARTAS));
			Carta elegida = null;
			
			for (int i = 0 ; i < Carta.MAX_CARTAS ; i++){
				elegida = (baraja.get(index));
			}
			return elegida;
		}
		
	
}