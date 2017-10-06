package com.example.ejb.logic;

public class Esfera extends CalculaFiguras {

	private static final float PI = 3.1416f;
	private float r;
	
	
	public Esfera  (float r){
		this.r = r;
		this.setLados(0);
		this.setCara(0);
		this.setVertice(Integer.MAX_VALUE);
	}
	
	@Override
	public float calculaArea() {
		float resultado;
								resultado = (float) ((4*PI)*(Math.pow(r, 2)));
		return resultado;
	}

	@Override
	public float calculaVolumen() {
		float resultado;
								resultado = (float) ((4*PI*(Math.pow(r, 3))/3));
		return resultado;
	}

}
