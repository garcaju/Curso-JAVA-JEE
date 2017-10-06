package com.example.ejb.logic;

public class Cilindro extends CalculaFiguras {
	
	private static final float PI = 3.1416f;
	private float h;
	private float r;
	
	public Cilindro ( float r, float h){
		super();
		this.h = h;
		this.r = r;
		this.setLados(Integer.MAX_VALUE);
		this.setCara(2);
		this.setVertice(0);
	}

	@Override
	public float calculaArea() {
		float resultado;
							resultado = (2*(PI*r))*(h+r);
		return resultado;
	}

	@Override
	public float calculaVolumen() {
		float resultado;
							resultado = (float) (PI*(Math.pow(r, 2)) * h);
		return resultado;
	}
}
