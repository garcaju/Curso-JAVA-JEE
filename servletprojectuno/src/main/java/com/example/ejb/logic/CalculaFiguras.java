package com.example.ejb.logic;

public abstract class CalculaFiguras {
	
	private int lados;
	private int cara;
	private int vertice;

	public float calculaArea() {
		return 0;
	}
	public float calculaVolumen() {
		return 0;
	}
	public int getLados() {
		return lados;
	}
	public void setLados(int lados) {
		this.lados = lados;
	}
	public int getCara() {
		return cara;
	}
	public void setCara(int cara) {
		this.cara = cara;
	}
	public int getVertice() {
		return vertice;
	}
	public void setVertice(int vertice) {
		this.vertice = vertice;
	}
	
	
	
}
