package com.example.ejb.logic;

public class Cubo extends CalculaFiguras{

	private float a;

	public Cubo(float a) {
		this.a = a;
		this.setLados(6);
		this.setCara(6);
		this.setVertice(8);
	}
	
	public float calculaArea() {
		float resultado;
							resultado = (float) (6*(Math.pow(a,2)));
		return resultado;
	}

	public float calculaVolumen() {
		float resultado;
							resultado = (float) (Math.pow(a, 3));
		return resultado;
	}
	
}
