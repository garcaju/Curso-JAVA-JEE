package com.example.ejb.logic;

public class Cono extends CalculaFiguras {
	
	private static final float PI = 3.1416f;
	private float h;
	private float r;
	private float g;
	
	public Cono(float r, float h) {
		super();
		this.h = h;
		this.r = r;
		this.g = (float) (Math.sqrt((Math.pow(h, 2) + (Math.pow(r, 2)))));
		this.setLados(Integer.MAX_VALUE);
		this.setCara(1);
		this.setVertice(1);
	}
	
	public float calculaArea(){
		float resultado;
		
			resultado = (float) ((PI*(Math.pow(r, 2)) + (PI*r*g)));

		return resultado;
	}
	
	public float calculaVolumen(){
		float resultado;
		
			resultado = (float) ((PI*(Math.pow(r, 2))*h)/3);
		
		return resultado;
	}
	
}
