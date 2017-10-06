package com.test.servletprojectuno;

import org.junit.Assert;
import org.junit.Test;

import com.example.ejb.logic.Cilindro;
import com.example.ejb.logic.Cono;
import com.example.ejb.logic.Cubo;
import com.example.ejb.logic.Esfera;

public class TestFiguras {

	@Test
	public void testCilindro(){
		Cilindro cilindro = new Cilindro (3, 4);
		float area = cilindro.calculaArea();
		
		Assert.assertEquals(131.95, area, 0.1);//Testea Area
		
		float volumen = cilindro.calculaVolumen();
		
		Assert.assertEquals(113.1, volumen, 0.1);// Testea Volumen
	}
	
	@Test
	public void testCono(){
		Cono cono = new Cono (2, 3);
		float area = cono.calculaArea();
		
		Assert.assertEquals(35.22, area, 0.1);//Testea Area
		
		float volumen = cono.calculaVolumen();
		
		Assert.assertEquals(12.57, volumen, 0.1);// Testea Volumen
	}
	
	@Test
	public void testCubo(){
		Cubo cubo = new Cubo (3);
		float area = cubo.calculaArea();
		
		Assert.assertEquals(54, area, 0.1);//Testea Area
		
		float volumen = cubo.calculaVolumen();
		
		Assert.assertEquals(27, volumen, 0.1);// Testea Volumen
	}
	
	@Test
	public void testEsfera(){
		Esfera esfera = new Esfera (3);
		float area = esfera.calculaArea();
		
		Assert.assertEquals(113.09, area, 0.1);//Testea Area
		
		float volumen = esfera.calculaVolumen();
		
		Assert.assertEquals(113.1, volumen, 0.1);// Testea Volumen
	}
	
	
}
