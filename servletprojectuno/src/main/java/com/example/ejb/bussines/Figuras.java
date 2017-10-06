package com.example.ejb.bussines;

import com.example.ejb.logic.*;

import java.util.Date;

import javax.ejb.Stateless;

@Stateless
public class Figuras {

	public Figuras(){
		System.out.println("Creando figura...Figura construida!");
	}
	
	/*
	 * Crear objeto Cilindro y levanta metodo de clase que efectua el cálculo
	 */
	public float getAreaCilindro(float r, float h){
		Cilindro cilindro = new Cilindro(r, h);
		return cilindro.calculaArea();		
	}		
	
	public float getVolumenCilindro(float r, float h){
		Cilindro cilindro = new Cilindro(r, h);
		return cilindro.calculaVolumen();	
	}
	
	/*
	 * Crear objeto Cono y levanta metodo de clase que efectua el cálculo
	 */
	public float getAreaCono(float r, float h){
		Cono cono = new Cono(r, h);
		return cono.calculaArea();		
	}		
	
	public float getVolumenCono(float r, float h){
		Cono cono = new Cono(r, h);
		return cono.calculaVolumen();		
	}
	
	/*
	 * Crear objeto Cubo y levanta metodo de clase que efectua el cálculo
	 */
	public float getAreaCubo(float a){
		Cubo cubo = new Cubo(a);
		return cubo.calculaArea();		
	}		
	
	public float getVolumenCubo(float a){
		Cubo cubo = new Cubo(a);
		return cubo.calculaVolumen();		
	}	
	
	/*
	 * Crear objeto Esfera y levanta metodo de clase que efectua el cálculo
	 */
	public float getAreaEsfera(float a){
		Esfera esfera = new Esfera(a);
		return esfera.calculaArea();		
	}		
	
	public float getVolumenEsfera(float a){
		Esfera esfera = new Esfera(a);
		return esfera.calculaVolumen();		
	}	
	
}
