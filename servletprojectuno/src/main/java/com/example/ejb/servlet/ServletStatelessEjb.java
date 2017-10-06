package com.example.ejb.servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.ejb.bussines.Figuras;


public class ServletStatelessEjb extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB //notación para inyectar una instacia sin constructor mediante Stateless
		 // Se crea un objeto de un pool de beans.
    private Figuras figuras;
    
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String tipo = request.getParameter("tipo");
		
		StringBuilder str = new StringBuilder();
		
		str.append("<html>");
		str.append("<head>");
		str.append("<title>Resultados de la Figura</title>");
		str.append("</head>");
		str.append("<body>");
		str.append("<h1>Resultados</h1>");
		
		
		
		if(tipo.equals("cilindro")){
			
			float h = Float.valueOf(request.getParameter("cilindroaltura"));
			float r = Float.valueOf(request.getParameter("cilindroradio"));
			str.append(figuras.getAreaCilindro(r, h));
			str.append("<br>");
			str.append(figuras.getVolumenCilindro(r, h));
		}
		
		
		if(tipo.equals("cono")){
			float h = Float.valueOf(request.getParameter("conoaltura"));
			float r = Float.valueOf(request.getParameter("conoradio"));
			str.append(figuras.getAreaCono(r, h));
			str.append("<br>");
			str.append(figuras.getVolumenCono(r, h));
		}
		
		if(tipo.equals("cubo")){
			float altura = Float.valueOf(request.getParameter("cuboaltura"));
			str.append(figuras.getAreaCubo(altura));
			str.append("<br>");
			str.append(figuras.getVolumenCubo(altura));
		}
		if(tipo.equals("esfera")){
			float r = Float.valueOf(request.getParameter("esferaradio"));
			str.append(figuras.getAreaEsfera(r));
			str.append("<br>");
			str.append(figuras.getVolumenEsfera(r));
		}
				
		response.setContentType("text/html");//interpreta y lo va a responder en html
		PrintWriter out = response.getWriter(); //Imprime a un archivo de salida
		
		out.println(str);
		
			out.println("</body>");
			
		out.println("</html>");	
		
	}
}
